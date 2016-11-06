package eagledata.core.menus.interpreter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import com.jesusjlopezf.utils.eclipse.resources.IFileUtils;

import eagledata.core.dsl.pattern.PatternDslStandaloneSetup;
import eagledata.core.dsl.pattern.streamingDsl.Phrase;
import eagledata.core.dsl.pattern.streamingDsl.Region;
import eagledata.core.extensions.AssistantManager;
import eagledata.core.extensions.IDataResourceAssistant;
import eagledata.core.extensions.streaming.BasedOnStreamingDataAssistant;
import eagledata.core.extensions.streaming.IBasedOnStreamingDataAssistant;
import eagledata.ui.Activator;
import resourceset.*;

import java.util.Collection;

public class StreamingDataModelInterpreter {
	private static StreamingDataModelInterpreter INSTANCE = null;
	static List<IBasedOnStreamingDataAssistant> streamingAssistances = null;
	
	public EObject getEObject(){
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow window = workbench == null ? null : workbench.getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window == null ? null : window.getActivePage();

		IEditorPart editor = activePage == null ? null : activePage.getActiveEditor();
		IEditorInput input = editor == null ? null : editor.getEditorInput();
		IPath path = input instanceof FileEditorInput ? ((FileEditorInput)input).getPath(): null;
		
		if (path != null){
			String extension = "streamd";
		    if(path.getFileExtension().equals(extension)){
		    	EObject allXtextContents;
				try {
					allXtextContents = Activator.loadXtextFile(path.toFile(), new PatternDslStandaloneSetup(), extension);
					return allXtextContents;
				} catch (IOException e) {
					return null;
				}
		    }
		}
		return null;
	}
	
	public List<Phrase> loadPhrases(EObject eObject) {
		TreeIterator<EObject> iterator = eObject.eAllContents();
		List<Phrase> phrases = new ArrayList<Phrase>();
		while(iterator.hasNext()) {
			EObject element = iterator.next();
			if(element instanceof Phrase) phrases.add((Phrase) element);
		}
		return phrases;
	}
	
	public EObject loadModel(IFile member) {
		EObject allXtextContents;
		
		try {
			allXtextContents = Activator.loadXtextFile(IFileUtils.IFile2File(member), new PatternDslStandaloneSetup(), "streamd");
			return allXtextContents;
		}catch (IOException e) {
			return null;
		}
	}
	
	public void processPhrase(Phrase phrase){
		BasedOnStreamingDataResource dataresource = ResourcesetFactory.eINSTANCE.createBasedOnStreamingDataResource();
		dataresource.setDescription(phrase);
		
		MessageSet messageSet = ResourcesetFactory.eINSTANCE.createMessageSet();
		dataresource.setContent(messageSet);
		
		AssistantManager.getInstance().addDataResource(dataresource);
		
		for(IBasedOnStreamingDataAssistant assistant : streamingAssistances){
			assistant.setResource(dataresource);
			
			assistant.buildClient(phrase.getName());
			assistant.track(phrase.getFeatures());
			assistant.filter(phrase.getOptions());
			if(phrase.getInAGeo() instanceof Region) assistant.geolocate((Region) phrase.getInAGeo());
		}
	}
	
	private static void createInstance() {
	   	 if (INSTANCE == null) {
	            synchronized(StreamingDataModelInterpreter.class) {
	                if (INSTANCE == null) { 
	                    INSTANCE = new StreamingDataModelInterpreter();
	                }
	            }
	        }
	   }

	   public static StreamingDataModelInterpreter getInstance() {
	       if (INSTANCE == null){
	       	createInstance();
	        streamingAssistances = new ArrayList<IBasedOnStreamingDataAssistant>();
	       	
	       	BasedOnStreamingDataResource resourceSet = ResourcesetFactory.eINSTANCE.createBasedOnStreamingDataResource();
			for(IDataResourceAssistant dataresourceassistant : AssistantManager.getInstance().getAssistances()){
				if(dataresourceassistant instanceof IBasedOnStreamingDataAssistant){
					IBasedOnStreamingDataAssistant streamingDataAssistant = (IBasedOnStreamingDataAssistant)dataresourceassistant;
					
					String id = ((BasedOnStreamingDataAssistant)dataresourceassistant).getId();
					resourceSet.setAssistant(id);
					streamingDataAssistant.connect();
					streamingAssistances.add(streamingDataAssistant);
				}
			}
	       }
	       return INSTANCE;
	   }
	   
	   public Object clone() throws CloneNotSupportedException {
	   	throw new CloneNotSupportedException(); 
	   }
	   

	public Collection<Setting> getIncomingReferences(Phrase phrase) {
		Collection<Setting> references =
				  EcoreUtil.UsageCrossReferencer.find(phrase, Activator.getResourceSet());
		return references;
	}
}
