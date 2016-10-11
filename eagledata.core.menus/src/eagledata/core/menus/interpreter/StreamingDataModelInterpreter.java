package eagledata.core.menus.interpreter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
import eagledata.core.dsl.pattern.streamingDsl.Concept;
import eagledata.core.dsl.pattern.streamingDsl.Coordinate;
import eagledata.core.dsl.pattern.streamingDsl.GeoOption;
import eagledata.core.dsl.pattern.streamingDsl.GeographicalElement;
import eagledata.core.dsl.pattern.streamingDsl.Import;
import eagledata.core.dsl.pattern.streamingDsl.LatitudeLongitude;
import eagledata.core.dsl.pattern.streamingDsl.Option;
import eagledata.core.dsl.pattern.streamingDsl.Phrase;
import eagledata.core.dsl.pattern.streamingDsl.Place;
import eagledata.core.dsl.pattern.streamingDsl.Region;
import eagledata.core.dsl.pattern.streamingDsl.TermKey;
import eagledata.core.dsl.pattern.streamingDsl.TermList;
import eagledata.core.dsl.pattern.streamingDsl.WordListProperty;
import eagledata.core.extensions.DataConnection;
import eagledata.core.extensions.IDataConnection;
import eagledata.core.extensions.StreamingConnectionFactory;
import eagledata.ui.Activator;
import streamingresources.StreamingResourceSet;
import streamingresources.StreamingresourcesFactory;

import java.util.Collection;

public class StreamingDataModelInterpreter {
	private static StreamingDataModelInterpreter INSTANCE = null;
	
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
		
		
		double sw_lat = 0;
		double sw_long = 0;
		double ne_lat = 0;
		double ne_long = 0;
		
		for(Option option : phrase.getOptions()){
			if(option instanceof GeoOption){
				if(((GeoOption) option).getKey().getLiteral().equals("in")){
					GeographicalElement geoElement = ((GeoOption) option).getValue();
					if(geoElement instanceof Region){
						Region region = (Region) geoElement;
						
						Coordinate coordinateSW = region.getSouthWestBoundary().getCoordinates();
						if(coordinateSW instanceof LatitudeLongitude){
							sw_lat = ((LatitudeLongitude) coordinateSW).getLat();
							sw_long = ((LatitudeLongitude) coordinateSW).getLong();	
						}
						
						Coordinate coordinateNE = region.getNorthEastBoundary().getCoordinates();
						if(coordinateNE instanceof LatitudeLongitude){
							ne_lat = ((LatitudeLongitude) coordinateNE).getLat();
							ne_long = ((LatitudeLongitude) coordinateNE).getLong();	
						}
					}
				}
			}
		}
		
		StreamingResourceSet resourceSet = StreamingresourcesFactory.eINSTANCE.createStreamingResourceSet();
		for(IDataConnection dataConnection : StreamingConnectionFactory.getInstance().getConnections()){
			String id = ((DataConnection)dataConnection).getId();
			resourceSet.setAssistant(id);
			
			((DataConnection)dataConnection).setResourceSet(resourceSet);
			dataConnection.connect();
			dataConnection.buildClient(phrase);
		}
	}
	
	public void processPatternModel(IFile member) {
		EObject allXtextContents;
		
		try {
			allXtextContents = Activator.loadXtextFile(IFileUtils.IFile2File(member), new PatternDslStandaloneSetup(), "streamd");
			
			TreeIterator<EObject> iterator = allXtextContents.eAllContents();
			while(iterator.hasNext()) {
	    		EObject element = iterator.next();
	    		
	    		if(element instanceof Import){
	    			System.out.println(((Import) element).getImportedNamespace());
	    		}
	    		
	    		if(element instanceof TermList){
	    			System.out.println(((TermList) element).getName());
	    		}
	    		
	    		if(element instanceof Phrase){
	    			System.out.println(((Phrase) element).getName());
	    		}
	    		
	    		if(element instanceof Place){
	    			System.out.println(((Place) element).getName());
	    		}
	    		
	    		if(element instanceof Region){
	    			System.out.println(((Region) element).getName());
	    		}
			} 
		}catch (IOException e) {
			e.printStackTrace();
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
