package eagledata.core.menus.interpreter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import com.jesusjlopezf.utils.eclipse.resources.IFileUtils;

import eagledata.core.dsl.pattern.streamingDsl.Phrase;
import eagledata.core.dsl.rule.RuleDslStandaloneSetup;
import eagledata.core.dsl.rule.ruleDsl.Action;
import eagledata.core.dsl.rule.ruleDsl.Message;
import eagledata.core.dsl.rule.ruleDsl.Query;
import eagledata.core.dsl.rule.ruleDsl.Rule;
import eagledata.core.dsl.rule.ruleDsl.SetSelect;
import eagledata.ui.Activator;

public class RuleModelInterpreter {
	private static RuleModelInterpreter INSTANCE = null;
	
	public EObject getEObject(){
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow window = workbench == null ? null : workbench.getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window == null ? null : window.getActivePage();

		IEditorPart editor = activePage == null ? null : activePage.getActiveEditor();
		IEditorInput input = editor == null ? null : editor.getEditorInput();
		IPath path = input instanceof FileEditorInput ? ((FileEditorInput)input).getPath(): null;
		
		if (path != null){
			String extension = "rd";
		    if(path.getFileExtension().equals(extension)){
		    	EObject allXtextContents;
				try {
					allXtextContents = Activator.loadXtextFile(path.toFile(), new RuleDslStandaloneSetup(), extension);
					return allXtextContents;
				} catch (IOException e) {
					return null;
				}
		    }
		}
		return null;
	}
	
	public List<Rule> loadRules(EObject eObjectParent) {
		TreeIterator<EObject> iterator = eObjectParent.eAllContents();
		List<Rule> phrases = new ArrayList<Rule>();
		while(iterator.hasNext()) {
			EObject element = iterator.next();
			if(element instanceof Rule) phrases.add((Rule) element);
		}
		return phrases;
	}
	
	public void processAction(Action action){
		if(action instanceof Query){
			if(((Query) action).getSelect() instanceof SetSelect){
				SetSelect setSelect = (SetSelect) ((Query) action).getSelect();
			}
		}
		/*if(action instanceof Query){
			System.out.println(action.toString());
		}
		if(action instanceof Message){
			System.out.println(action.toString());
		}*/
	}
	
	public EObject loadModel(IFile member) {
		EObject allXtextContents;
		
		try {
			allXtextContents = Activator.loadXtextFile(IFileUtils.IFile2File(member), new RuleDslStandaloneSetup(), "rd");
			return allXtextContents;
			
		}catch (IOException e) {
			return null;
		}
	}
	
	private static void createInstance() {
	   	 if (INSTANCE == null) {
	            synchronized(RuleModelInterpreter.class) {
	                if (INSTANCE == null) { 
	                    INSTANCE = new RuleModelInterpreter();
	                }
	            }
	        }
	   }

	   public static RuleModelInterpreter getInstance() {
	       if (INSTANCE == null){
	       	createInstance();
	       }
	       return INSTANCE;
	   }
	   
	   public Object clone() throws CloneNotSupportedException {
	   	throw new CloneNotSupportedException(); 
	   }

	public Phrase loadEvent(Rule rule, Set<Phrase> set) {
		Collection references = EcoreUtil.UsageCrossReferencer.find(rule.getEvent(), set);
		System.out.println(references.toString());
		return null;
	}
}
