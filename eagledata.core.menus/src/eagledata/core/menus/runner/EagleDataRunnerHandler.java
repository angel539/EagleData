 package eagledata.core.menus.runner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import eagledata.core.dsl.datadesc.dataDsl.DataDescription;
import eagledata.core.dsl.datadesc.dataDsl.DataModel;
import eagledata.core.dsl.datadesc.dataDsl.DataModelElement;
import eagledata.core.dsl.datadesc.dataDsl.Feed;
import eagledata.core.dsl.datadesc.dataDsl.PrimitiveNode;
import eagledata.core.dsl.pattern.streamingDsl.Phrase;
import eagledata.core.dsl.pattern.streamingDsl.StreamingModel;
import eagledata.core.dsl.rule.ruleDsl.Rule;
import eagledata.core.dsl.rule.ruleDsl.RuleDslPackage;
import eagledata.core.dsl.rule.ruleDsl.SetSelect;
import eagledata.core.extensions.AssistantManager;
import eagledata.core.extensions.IDataResourceAssistant;
import eagledata.core.extensions.streaming.IBasedOnStreamingDataAssistant;
import eagledata.core.dsl.rule.ruleDsl.Action;
import eagledata.core.menus.interpreter.DataDescModelInterpreter;
import eagledata.core.menus.interpreter.RuleModelInterpreter;
import eagledata.core.menus.interpreter.StreamingDataModelInterpreter;
import eagledata.core.nature.EagleDataProjectNature;
import java.util.Collection;

public class EagleDataRunnerHandler extends AbstractHandler {
	Map<EObject, Collection<Setting>> references;
	List<EObject> allModels = new ArrayList<EObject>();
	List<EObject> streamingModels = new ArrayList<EObject>();
	List<EObject> dataModels = new ArrayList<EObject>();
	List<EObject> ruleModels = new ArrayList<EObject>();
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		
		if (currentSelection instanceof IStructuredSelection) {
			Object firstElement = ((IStructuredSelection) currentSelection).getFirstElement();
			
			IAdapterManager adapterManager = Platform.getAdapterManager();
			IResource resourceAdapter = adapterManager.getAdapter(firstElement, IResource.class);
			
			if (resourceAdapter != null) {
				IResource resource = resourceAdapter;
				IProject project = resource.getProject();
				
				try {
					IProjectDescription description = project.getDescription();
					String[] natures = description.getNatureIds();
					
					boolean isEagleDataNature = false;
					for(String nature : natures){
						if(nature.equals(EagleDataProjectNature.NATURE_ID)){
							isEagleDataNature = true;
							break;
						}
					}
					
					if(isEagleDataNature){
						processContainer(project);
						connectClients();
						loadDataSets();
						startMatching();
						calculateReferences();
						executeRulesForPhrases();
					}
					
					return Status.OK_STATUS;
				} catch (CoreException e) {
					throw new ExecutionException(e.getMessage(), e);
				}
			}
		}
	    return Status.OK_STATUS;
	}

	boolean processContainer(IContainer container){
		IResource[] members;
		try {
			members = container.members();
			
			for(IResource member : members){
				if(member instanceof IContainer){
					processContainer((IContainer) member);
				}
				else{
					if(member instanceof IFile){
						EObject eObject;
						switch(member.getFileExtension()){
							case "streamd":
								eObject = StreamingDataModelInterpreter.getInstance().loadModel((IFile) member);
								allModels.add(eObject);
								break;
							case "datad":
								eObject = DataDescModelInterpreter.getInstance().loadModel((IFile) member);
								allModels.add(eObject);
								break;
							case "rd":
								eObject = RuleModelInterpreter.getInstance().loadModel((IFile) member);
								allModels.add(eObject);
							break;
							default:
								break;
						}
					}
				}
			}	
			return true;
		} catch (CoreException e) {
			return false;
		}
	}
	
	private void connectClients() {
		for(IDataResourceAssistant dataassistant : AssistantManager.getInstance().getAssistances()){
			if(dataassistant instanceof IBasedOnStreamingDataAssistant){
				((IBasedOnStreamingDataAssistant) dataassistant).connect();
			}
		}
	}
	

	private void loadDataSets() {
		for(EObject model : allModels){
			if(model instanceof DataModel){
				DataModel dataModel = (DataModel) model;
				
				for(DataModelElement dataModelElement : dataModel.getElements()){
					if(dataModelElement instanceof Feed){
						Feed feed = (Feed) dataModelElement;
						new Thread("matching " + feed.getName()){
					        public void run(){
								DataDescModelInterpreter.getInstance().processFeed((Feed) feed);
					        }
						}.start();
					}
				}
			}
		}
	}
	
	private void startMatching() {
		for(int i = 0; i < allModels.size(); i++){
			if(allModels.get(i) instanceof StreamingModel){
				StreamingModel streamingModel = (StreamingModel) allModels.get(i);
				
				for(int j = 0; j < streamingModel.getDescriptions().size(); j++){
					EObject streamingModelElement = streamingModel.getDescriptions().get(j);
					if(streamingModelElement instanceof Phrase){
						Phrase phrase = (Phrase) streamingModelElement;
						new Thread("matching " + i + j){
					        public void run(){
					        	StreamingDataModelInterpreter.getInstance().processPhrase(phrase);
					        }
						}.start();
					}
				}
			}
		}
	}
	
	private void calculateReferences() {
		references = EcoreUtil.UsageCrossReferencer.find(allModels);
	}
	
	void executeRulesForPhrases(){
		for(Entry<EObject, Collection<Setting>> entry : references.entrySet()){
			if(entry.getKey() instanceof Phrase){
				Collection<Setting> settings = entry.getValue();
				
				for (Iterator iter = settings.iterator(); iter.hasNext();){
					EStructuralFeature.Setting setting = (EStructuralFeature.Setting)iter.next();
					
					if (setting.getEStructuralFeature() == RuleDslPackage.eINSTANCE.getRule_Event()) {
						Rule rulePointer = (Rule) setting.getEObject();
						
						for(Action action : rulePointer.getActions()){
							RuleModelInterpreter.getInstance().processAction(action);
						}
					}
				}
			}
			
			if(entry.getKey() instanceof PrimitiveNode){
				Collection<Setting> settings = entry.getValue();
				
				for (Iterator iter = settings.iterator(); iter.hasNext();){
					EStructuralFeature.Setting setting = (EStructuralFeature.Setting)iter.next();
					
					if (setting.getEStructuralFeature() == RuleDslPackage.eINSTANCE.getSetSelect_Selector()) {
						SetSelect setSelect = (SetSelect) setting.getEObject();
						
						for(EObject reference : setSelect.eCrossReferences()){
							if(reference instanceof PrimitiveNode){
								EObject container = reference.eContainer();
								if(container instanceof DataDescription){

								}
							}
						}
					}
				}
			}	
		}
		
		/*for(EObject streamingModel : streamingModels){
			List<Phrase> phrases = StreamingDataModelInterpreter.getInstance().loadPhrases(streamingModel);
			for(Phrase phrase : phrases){
				actions.putIfAbsent(phrase, new ArrayList<Rule>());
			}
		}
		
		for(EObject ruleModel : ruleModels){
			//ruleModel.
			for(Entry<Phrase, List<Rule>> entryAction : actions.entrySet()){
				System.out.println("begin-for: " + entryAction);
				
				Collection<Setting> references = StreamingDataModelInterpreter.getInstance().getIncomingReferences(entryAction.getKey(), ruleModel.eResource().getResourceSet());
				
				for (Iterator iter = references.iterator(); iter.hasNext();){
					EStructuralFeature.Setting setting = (EStructuralFeature.Setting)iter.next();
					
					if (setting.getEStructuralFeature() == RuleDslPackage.eINSTANCE.getRule_Event()) {
						Rule rulePointer = (Rule) setting.getEObject();
						entryAction.getValue().add(rulePointer);
					}
				}
				
				System.out.println("end-for: " + entryAction);
			}	
		}*/
		
		/*for(EObject ruleModel : ruleModels){
			List<Rule> rules = RuleModelInterpreter.getInstance().loadRules(ruleModel);
			for(Rule rule : rules){
				actions.putIfAbsent(phrase, new ArrayList<Rule>());
			}
		}*/
		
		
		
		

		//	Collection<Setting> references = StreamingDataModelInterpreter.getInstance().getIncomingReferences(phrase, eObject.eResource().getResourceSet());
	
		//for(Phrase phrase : phrase)
		
								/*List<Rule> rules = RuleModelInterpreter.getInstance().loadRules((IFile) member);
								EObject eObject = RuleModelInterpreter.getInstance().loadRuleModel((IFile) member);
								for(Phrase phrase : actions.keySet()){
									System.out.println("......" + eObject.eResource().getResourceSet());
									Collection<Setting> references = StreamingDataModelInterpreter.getInstance().getIncomingReferences(phrase, eObject.eResource().getResourceSet());
									
									for (Iterator iter = references.iterator(); iter.hasNext();){
										EStructuralFeature.Setting setting = (EStructuralFeature.Setting)iter.next();
										
										if (setting.getEStructuralFeature() == RuleDslPackage.eINSTANCE.getRule_Event()) {
											Rule customer = (Rule) setting.getEObject();
											System.out.println(customer.toString());
										}
									}
								}
								for(Rule rule : rules){
									actions.computeIfPresent(rule.getEvent(), 
											(k,v) -> v == null ? rule.getActions() : 
												Stream.concat(v.stream(), rule.getActions().stream()).collect(Collectors.toList())
									);
								}*/
	}
}
