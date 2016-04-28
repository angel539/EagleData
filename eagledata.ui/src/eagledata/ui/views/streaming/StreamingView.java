package eagledata.ui.views.streaming;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.json.JSONObject;

import eagledata.core.dsl.datadesc.dataDsl.IntOption;
import eagledata.core.dsl.pattern.PatternDslStandaloneSetup;
import eagledata.core.dsl.pattern.streamingDsl.BooleanOption;
import eagledata.core.dsl.pattern.streamingDsl.Concept;
import eagledata.core.dsl.pattern.streamingDsl.GeoOption;
import eagledata.core.dsl.pattern.streamingDsl.LanguageOption;
import eagledata.core.dsl.pattern.streamingDsl.Option;
import eagledata.core.dsl.pattern.streamingDsl.Phrase;
import eagledata.core.dsl.pattern.streamingDsl.SourceOption;
import eagledata.core.dsl.pattern.streamingDsl.TermList;
import eagledata.core.extensions.ConnectionFactory;
import eagledata.core.extensions.DataConnection;
import eagledata.core.extensions.IDataConnection;
import eagledata.ui.Activator;
import eagledata.ui.views.filters.EntityFilter;
import eagledata.ui.views.filters.ShowAllFilter;
import eagledata.ui.views.streaming.model.StreamingParent;
import eagledata.ui.views.streaming.model.TreeParent;

public class StreamingView extends ViewPart implements ITabbedPropertySheetPageContributor, PropertyChangeListener {
	public static final String ID = "eagledata.ui.views.datatypes.StreamingView";
	private List<String> entities = new ArrayList<String>();

	private static TreeViewer viewer;
	private Action receiveAction;
	
	private Action filterEntities;
	private Action filterShowAll;
	
	private static TreeParent invisibleRoot = new TreeParent("");
	ConnectionFactory connectionFactory = ConnectionFactory.getInstance();
	int counter = 0;
	
	
	private List<PropertyChangeListener> listener = new ArrayList<PropertyChangeListener>();
	
	public TreeParent getRoot() {
		return invisibleRoot;
	}

	class NameSorter extends ViewerSorter {
		
	}

	public StreamingView() {
	}
	
	/*class ColumnOneViewLabelProvider extends LabelProvider implements IStyledLabelProvider{
		@Override
		public StyledString getStyledText(Object element) {
			if (element instanceof StreamingParent) {
				StreamingParent streamingNode = (StreamingParent) element;
				StyledString styledString = new StyledString(streamingNode.getName());
				
				if (streamingNode.getChildren() != null) {
					styledString.append(" (" + streamingNode.getChildren().length + ") ", StyledString.COUNTER_STYLER);
				}
				return styledString;
			}
			
			return null;
		}
		
		@Override
		public Image getImage(Object obj) {
			String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
			
			if(obj instanceof StreamingParent) return Activator.getImageDescriptor("icons/comments.png").createImage();
        	
			return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
		}
	}*/

	public void createPartControl(Composite parent) {
		entities.addAll(Arrays.asList());
		
		PatternFilter filter = new PatternFilter();
		FilteredTree tree = new FilteredTree(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL, filter, true);
		
		viewer = tree.getViewer();
		viewer.setContentProvider(new StreamingViewContentProvider(invisibleRoot, getViewSite()));
		viewer.setLabelProvider(new DelegatingStyledCellLabelProvider(new StreamingViewLabelProvider()));
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());
		
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "eagledata.ui.viewer");
		getSite().setSelectionProvider(viewer);
		
		defaultFilteringActions();
		invokeFilters();
		invokeEditors();
		makeActions();
		hookDoubleClickAction();
		contributeToActionBars();
	}
	
	private void defaultFilteringActions() {
		filterShowAll = new Action() {
			public void run() {
				ViewerFilter[] filters = {new ShowAllFilter()};
				viewer.setFilters(filters);
				viewer.refresh();
			}
		};
		
		filterShowAll.setText("Show all");
		filterShowAll.setToolTipText("");
		filterShowAll.setImageDescriptor(Activator.getImageDescriptor("icons/alpha_mode.gif"));
		
		filterEntities = new Action() {
			public void run() {
				ViewerFilter[] filters = {new EntityFilter()};
				viewer.setFilters(filters);
				viewer.refresh();
			}
		};
		
		filterEntities.setText("Show main entities only");
		filterEntities.setToolTipText("");
		filterEntities.setImageDescriptor(Activator.getImageDescriptor("icons/filter_top_level.gif"));
		
		/*filterEntitiesWithAttrs = new Action() {
			public void run() {
				ViewerFilter[] filters = {new EntityWithAttrsFilter()};
				viewer.setFilters(filters);
				viewer.refresh();
			}
		};
		
		filterEntitiesWithAttrs.setText("Show entities with attrs");
		filterEntitiesWithAttrs.setToolTipText("");
		filterEntitiesWithAttrs.setImageDescriptor(Activator.getImageDescriptor("icons/filter_properties.gif"));*/
	}
	
	private void invokeFilters() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] extensions = registry.getConfigurationElementsFor(Activator.FILTER_EXTENSIONS_ID);
		
		for(IConfigurationElement extension : extensions){
			if(extension.getName().compareTo("filter")==0){
				ViewerFilter filter;
				try{
					filter = (ViewerFilter) extension.createExecutableExtension("class");
					
					if((filter != null) && (extension.getAttribute("view")).equals("entities")){
						Action extensionFilterAction = new Action() {
							public void run() {
								ViewerFilter[] filters = {filter};
								viewer.setFilters(filters);
								viewer.refresh();
							}
						};
						
						extensionFilterAction.setText(extension.getAttribute("name"));
						extensionFilterAction.setToolTipText(extension.getAttribute("description"));
						
						String namespace = extension.getDeclaringExtension().getNamespaceIdentifier();
						ImageDescriptor descriptor = null;
						while((descriptor == null) && (!namespace.isEmpty())){
							descriptor = Activator.getImageDescriptor(namespace, extension.getAttribute("icon"));
							
							if(descriptor == null){
								if(namespace.contains(".")){
									namespace = namespace.substring(0, namespace.lastIndexOf("."));
								}
								else{
									namespace = "";
								}
							}
						}
						
						if(descriptor != null) extensionFilterAction.setImageDescriptor(descriptor);
						
						IActionBars bars = getViewSite().getActionBars();
						bars.getMenuManager().add(extensionFilterAction);
					}
				}
				catch(CoreException e){
				}
			}	
		}
	}
	
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(receiveAction);
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(filterShowAll);
		manager.add(filterEntities);
	}
	
	private void hookDoubleClickAction() {
		/*viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				refreshAction.run();
			}
		});*/
	}
	
	private void invokeEditors(){
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
		IEditorPart editor = window.getActivePage().getActiveEditor();
		
		/*if (editor instanceof IDiagramContainerUI){
			IDiagramContainerUI diagramEditor =  (IDiagramContainerUI) editor;
			GraphicalViewer graphicalViewer = diagramEditor.getGraphicalViewer();

			IExtensionRegistry registry = Platform.getExtensionRegistry();
			IConfigurationElement[] extensions = registry.getConfigurationElementsFor(Activator.EDITOR_EXTENSIONS_ID);
			
			for(IConfigurationElement extension : extensions){
				if(extension.getName().compareTo("editordrop") == 0){
				
					GraphityEditorTransferDropTargetListener graphityDrop;
					try{
						graphityDrop = (GraphityEditorTransferDropTargetListener) extension.createExecutableExtension("class");
						graphicalViewer.addDropTargetListener(graphityDrop);
					}
					catch(CoreException e){
					}
				}	
			}
		 }*/
	}

	private void makeActions() {				
		receiveAction = new Action(){
			public void run(){
				executeReceiveAction();
			}
		};
		receiveAction.setText("Receive streaming");
		receiveAction.setToolTipText("");
		receiveAction.setImageDescriptor(Activator.getImageDescriptor("icons/play.png"));
		
		/*stopAction = new Action(){
			public void run(){
				executeStopAction();
			}
		};
		stopAction.setText("Stop streaming");
		stopAction.setToolTipText("");
		stopAction.setImageDescriptor(Activator.getImageDescriptor("icons/stop.png"));*/
	}
	
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	public static TreeViewer getViewer() {
		return viewer;
	}

	public static TreeParent getInvisibleRoot() {
		return invisibleRoot;
	}

	
	private void executeReceiveAction() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow window = workbench == null ? null : workbench.getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window == null ? null : window.getActivePage();

		IEditorPart editor = activePage == null ? null : activePage.getActiveEditor();
		IEditorInput input = editor == null ? null : editor.getEditorInput();
		IPath path = input instanceof FileEditorInput ? ((FileEditorInput)input).getPath(): null;
		
		if (path != null){
			String extension = "streamd";
		    if(path.getFileExtension().equals("streamd")){
		    	
		    	for(IDataConnection dataConnection : ConnectionFactory.getInstance().getConnections()){
		    		//dataConnection.connect();
		    		((DataConnection)dataConnection).addChangeListener(this);
    			}
		    	
				EObject allXtextContents;
				try {
					allXtextContents = Activator.loadXtextFile(path.toFile(), new PatternDslStandaloneSetup(), extension);
				
					TreeIterator<EObject> iterator = allXtextContents.eAllContents();
					while(iterator.hasNext()) {
			    		EObject element = iterator.next();
			    		if(element instanceof Phrase){
			    			StreamingParent streamingParent = new StreamingParent(((Phrase) element).getName());
							getInvisibleRoot().addChild(streamingParent);
			    			
			    			Phrase phrase = (Phrase) element;
			    			
			    			List<String> terms = new ArrayList<String>();
			    			for(Concept concept : phrase.getConcepts()){
			    				if(concept instanceof TermList){
			    					terms = ((TermList) concept).getTerms();
			    				}
			    			}
			    			
			    			for(Option option : phrase.getOptions()){
			    				if(option instanceof BooleanOption){
			    					//if(((BooleanOption) option).getKey().getLiteral().equals("retweet"))
			    				}
			    				if(option instanceof GeoOption){
			    					
			    				}
			    				if(option instanceof IntOption){
			    					
			    				}
			    				if(option instanceof LanguageOption){
			    					//if(option.key )
			    				}
			    				if(option instanceof SourceOption){
			    					
			    				}
			    				
			    				// falta completar el parseo de todas las opciones....
			    			}
			    			
			    			
			    			for(IDataConnection dataConnection : ConnectionFactory.getInstance().getConnections()){
			    				((DataConnection)dataConnection).setTermsToSearch(terms);
			    				//((DataConnection)dataConnection).set(terms);
			    				
			    				// falta hacer el set para la (DataConnection) de todas las opciones ...
			    				dataConnection.addListenPoint(phrase.getName());
			    			}	
			    		}
			    	}
				} catch (IOException e) {
					e.printStackTrace();
				}
		    }
		}

		/*List<JSONObject> fragmentsJson = JsonFragment.getFragments();
		getInvisibleRoot().emptyRoot();
		
		for(JSONObject fragmentJson : fragmentsJson){
			String name = fragmentJson.getString("name");
			StreamingParent parent = new StreamingParent(name);
			
			JSONArray extensions = fragmentJson.getJSONArray("extends");
	    	for(int j=0; j<extensions.length(); j++){
	    		String extension = extensions.getString(j);
	    		StreamingParent extensionParent = new StreamingParent(extension);
	    		parent.addChild(extensionParent);
	    	}
	    	
	    	JSONArray contentKeys = fragmentJson.getJSONArray("contentKeys");
	    	for(int j=0; j<contentKeys.length(); j++){
	    		JSONObject contentKey = contentKeys.getJSONObject(j);
	    		String contentName = contentKey.getString("name");
		    	String contentType = contentKey.getString("type");
		    	//String contentOptions = contentKey.getString("options");
		    	
		    	NodeParent node = new NodeParent(contentName, contentType);
		    	
		    	String contentOptions = contentKey.getString("options");
		    	String[] contentOptionsSpplited = StringUtils.split(contentOptions, ";");
		    	
		    	String key = "";
	    		String value = "";
	    		
		    	for(int i = 0; i<contentOptionsSpplited.length; i++){
		    		if((i%2)==0){
		    			key = contentOptionsSpplited[i];	
		    		}else{
		    			value = contentOptionsSpplited[i];
		    			OptionObject option = new OptionObject(key, value);
			    		node.addChild(option);
		    		}
		    	}

		    	parent.addChild(node);
	    	}
			
			getInvisibleRoot().addChild(parent);
		}
		
		getViewer().refresh();*/
	}

	/*private boolean isOnTheTree(EntityParent obj){
		boolean onTheTree = false;
		Object element = obj;
		
		while((((TreeParent) element).getParent() != getRoot()) && (!onTheTree)){
			for(TreeObject child : ((TreeParent) element).getParent().getChildren()){
				if((child instanceof EntityParent) && (child!=obj)){
				}
			}
			element = ((TreeParent) element).getParent();
		}
		
		if(((TreeParent)element).getParent() == getRoot()){
			for(TreeObject child : ((TreeParent) element).getParent().getChildren()){
				if((child instanceof EntityParent) && (child!=obj)){
					if(((String) ((EntityParent) child).getSemanticElement().getId()).compareTo((String) ((EntityParent) obj).getSemanticElement().getId())==0){
						onTheTree = true;
					}
				}		
			}
		}
		
		return onTheTree;
	}*/

	@Override
	public String getContributorId() {
		return getSite().getId();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (adapter == IPropertySheetPage.class)
            return new TabbedPropertySheetPage(this);
        return super.getAdapter(adapter);
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		if(((JSONObject)event.getNewValue()).has("text") && (((JSONObject) event.getNewValue()).getString("text") != null)){
			String text = ((JSONObject) event.getNewValue()).getString("text");
			
			StreamingParent streamingParent = new StreamingParent(text);
			getInvisibleRoot().addChild(streamingParent);
			//getViewer().refresh();
			//counter = 0;
		}
	}
}
