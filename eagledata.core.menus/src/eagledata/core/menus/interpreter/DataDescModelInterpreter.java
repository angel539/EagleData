package eagledata.core.menus.interpreter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
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

import eagledata.core.dsl.datadesc.DataDslStandaloneSetup;
import eagledata.core.dsl.datadesc.dataDsl.DataDescription;
import eagledata.core.dsl.datadesc.dataDsl.Feed;
import eagledata.core.dsl.datadesc.dataDsl.Fragment;
import eagledata.core.extensions.AssistantManager;
import eagledata.core.extensions.IDataResourceAssistant;
import eagledata.core.extensions.description.BasedOnDescriptionAssistant;
import eagledata.core.extensions.description.IBasedOnDescriptionAssistant;
import eagledata.ui.Activator;
import resourceset.BasedOnDescriptionDataResource;
import resourceset.ResourcesetFactory;

public class DataDescModelInterpreter {
	private static DataDescModelInterpreter INSTANCE = null;
	static List<IBasedOnDescriptionAssistant> assistances = null;
	
	public EObject getEObject(){
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow window = workbench == null ? null : workbench.getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window == null ? null : window.getActivePage();

		IEditorPart editor = activePage == null ? null : activePage.getActiveEditor();
		IEditorInput input = editor == null ? null : editor.getEditorInput();
		IPath path = input instanceof FileEditorInput ? ((FileEditorInput)input).getPath(): null;
		
		if (path != null){
			String extension = "datad";
		    if(path.getFileExtension().equals(extension)){
		    	EObject allXtextContents;
				try {
					allXtextContents = Activator.loadXtextFile(path.toFile(), new DataDslStandaloneSetup(), extension);
					return allXtextContents;
				} catch (IOException e) {
					return null;
				}
		    }
		}
		return null;
	}
	
	public void processFeed(Feed feed){
		for(String path : feed.getPaths()){
			BasedOnDescriptionDataResource dataresource = ResourcesetFactory.eINSTANCE.createBasedOnDescriptionDataResource();
			dataresource.setDescription(feed.getDescription());
			dataresource.setPath(path);
			
			AssistantManager.getInstance().addDataResource(dataresource);
			
			for(IBasedOnDescriptionAssistant assistant : assistances){
				assistant.setResource(dataresource);
				assistant.load(path);
			}
		}
		
	}
	
	public EObject loadModel(IFile member) {
		EObject allXtextContents;
		
		try {
			allXtextContents = Activator.loadXtextFile(IFileUtils.IFile2File(member), new DataDslStandaloneSetup(), "streamd");
			return allXtextContents;
		}catch (IOException e) {
			return null;
		}
	}
	
	private static void createInstance() {
	   	 if (INSTANCE == null) {
	            synchronized(DataDescModelInterpreter.class) {
	                if (INSTANCE == null) { 
	                    INSTANCE = new DataDescModelInterpreter();
	                }
	            }
	        }
	   }

	   public static DataDescModelInterpreter getInstance() {
	       if (INSTANCE == null){
	       	createInstance();
	       	assistances = new ArrayList<IBasedOnDescriptionAssistant>();
	       	
	       	BasedOnDescriptionDataResource resourceSet = ResourcesetFactory.eINSTANCE.createBasedOnDescriptionDataResource();
			for(IDataResourceAssistant dataresourceassistant : AssistantManager.getInstance().getAssistances()){
				if(dataresourceassistant instanceof IBasedOnDescriptionAssistant){
					IBasedOnDescriptionAssistant dataAssistant = (IBasedOnDescriptionAssistant)dataresourceassistant;
					String id = ((BasedOnDescriptionAssistant)dataresourceassistant).getId();
					resourceSet.setAssistant(id);
					assistances.add(dataAssistant);
				}
			}
	       }
	       return INSTANCE;
	   }
	   
	   public Object clone() throws CloneNotSupportedException {
		   	throw new CloneNotSupportedException(); 
		   }
		   

		public Collection<Setting> getIncomingReferences(DataDescription description) {
			Collection<Setting> references =
					  EcoreUtil.UsageCrossReferencer.find(description, Activator.getResourceSet());
			return references;
		}
		
		public Collection<Setting> getIncomingReferences(Fragment fragment) {
			Collection<Setting> references =
					  EcoreUtil.UsageCrossReferencer.find(fragment, Activator.getResourceSet());
			return references;
		}
}
