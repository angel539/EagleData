package eagledata.core.menus.interpreter;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
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
import eagledata.core.dsl.datadesc.dataDsl.DataTypeRefinement;
import eagledata.core.dsl.datadesc.dataDsl.Enumeration;
import eagledata.core.dsl.datadesc.dataDsl.Fragment;
import eagledata.core.dsl.pattern.PatternDslStandaloneSetup;
import eagledata.ui.Activator;

public class DataDescModelInterpreter {
	private static DataDescModelInterpreter INSTANCE = null;
	
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
	
	public void processDataModel(IFile member) {
		EObject allXtextContents;
		
		try {
			allXtextContents = Activator.loadXtextFile(IFileUtils.IFile2File(member), new DataDslStandaloneSetup(), "datad");
			
			TreeIterator<EObject> iterator = allXtextContents.eAllContents();
			while(iterator.hasNext()) {
	    		EObject element = iterator.next();
	    		
	    		if(element instanceof DataTypeRefinement){
	    			System.out.println(((DataTypeRefinement) element).getName());
	    		}
	    		
	    		if(element instanceof DataDescription){
	    			System.out.println(((DataDescription) element).getName());
	    		}
	    		
	    		if(element instanceof Enumeration){
	    			System.out.println(((Enumeration) element).getName());
	    		}
	    		
	    		if(element instanceof Fragment){
	    			System.out.println(((Fragment) element).getName());
	    		}
	    		
	    		if(element instanceof eagledata.core.dsl.datadesc.dataDsl.Import){
	    			System.out.println(((eagledata.core.dsl.datadesc.dataDsl.Import) element).getImportedNamespace());
	    		}
	    		
	    		if(element instanceof eagledata.core.dsl.datadesc.dataDsl.Package){
	    			System.out.println(((eagledata.core.dsl.datadesc.dataDsl.Package) element).getName());
	    		}
			} 
		}catch (IOException e) {
			e.printStackTrace();
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
	       }
	       return INSTANCE;
	   }
	   
	   public Object clone() throws CloneNotSupportedException {
	   	throw new CloneNotSupportedException(); 
	   }
}
