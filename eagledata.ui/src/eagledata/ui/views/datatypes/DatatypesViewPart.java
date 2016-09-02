package eagledata.ui.views.datatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.json.JSONObject;

import eagledata.ui.Activator;
import eagledata.ui.http.JsonDatatypes;
import eagledata.ui.views.filters.EntityFilter;
import eagledata.ui.views.filters.ShowAllFilter;
import eagledata.ui.views.datatypes.model.DatatypeParent;
import eagledata.ui.views.datatypes.model.TreeParent;

public class DatatypesViewPart extends ViewPart implements ITabbedPropertySheetPageContributor{
	public static final String ID = "eagledata.ui.views.datatypes.DatatypesView";
	private List<String> entities = new ArrayList<String>();

	private static TreeViewer viewer;
	private Action refreshAction;
	
	private Action filterEntities;
	private Action filterShowAll;
	
	private static TreeParent invisibleRoot = new TreeParent("");
	
	public TreeParent getRoot() {
		return invisibleRoot;
	}

	class NameSorter extends ViewerSorter {
		
	}

	public DatatypesViewPart() {
	}

	public void createPartControl(Composite parent) {
		entities.addAll(Arrays.asList());
		
		PatternFilter filter = new PatternFilter();
		FilteredTree tree = new FilteredTree(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL, filter, true);
		
		viewer = tree.getViewer();
		viewer.setContentProvider(new DatatypesViewContentProvider(invisibleRoot, getViewSite()));
		viewer.setLabelProvider(new DelegatingStyledCellLabelProvider(new DatatypesViewLabelProvider()));
		viewer.setSorter(new NameSorter());
		
		viewer.setInput(getViewSite());
		
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "eagledata.ui.viewer");
		getSite().setSelectionProvider(viewer);
		/*
		DragSource ds = new DragSource(viewer.getTree(), DND.DROP_COPY);
		ds.setTransfer(new Transfer[] {ModelTransfer.getInstance()});
		ds.addDragListener(new DragSourceAdapter() {
				class DragSemanticClass extends SemanticClass{

					String idToString;
					
					@Override
					public String getId() {
						// TODO Auto-generated method stub
						return this.idToString;
					}					
				}
			
		     public void dragSetData(DragSourceEvent event) {
		    	 /*IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
		    	 ISemanticElement[] data = new ISemanticElement[selection.size()];
		    	 
		    	 for(int i=0; i<selection.size(); i++){
		    		 if(selection.toArray()[i] instanceof TreeObject){
		    			 data[i] = ((TreeObject) selection.toArray()[i]).getSemanticElement();
		    		 }
		    	 }
		    	 
		    	 event.data = data;*/
		    	 
		    	 /*IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
		    	 ISemanticElement[] data = new ISemanticElement[selection.size()];
		    	 
		    	 for(int i=0; i<selection.size(); i++){
		    		 if(selection.toArray()[i] instanceof EntityParent){
		    			 data[i] = ((EntityParent) selection.toArray()[i]).getSemanticElement();
		    		 }
		    		 
		    		 if(selection.toArray()[i] instanceof DataPropertyObject){
		    			 data[i] = ((DataPropertyObject) selection.toArray()[i]).getSemanticElement();
		    		 }
		    		 
		    		 if(selection.toArray()[i] instanceof PropertyParent){
		    			 data[i] = ((PropertyParent) selection.toArray()[i]).getSemanticElement();
		    		 }
		    		 
		    		 if(selection.toArray()[i] instanceof EntityParentGroup){*/
		    			 //List<ISemanticClass> semanticClasses = ((EntityParentGroup) selection.toArray()[i]).getSemanticClasses();
		    			 /*DragSemanticClass dragSemanticClass = new DragSemanticClass();
		    			 dragSemanticClass.setName(((EntityParentGroup) selection.toArray()[i]).getName());
		    			 
		    			 WizardDialog wizardDialog = new WizardDialog(null, new EntityGroupSelectorWizardDialog((EntityParentGroup) selection.toArray()[i], dragSemanticClass));
				    	 if (wizardDialog.open() == Window.OK) {
				    		 //if(searchOptions != null) searchAndRefreshView(searchOptions);
				    	 }
		    		 }
		    	 }
		    	 
		    	 event.data = data;
		    	 WizardDialog wizardDialog = new WizardDialog(null, new SearchEntityWizardDialog(searchOptions));
		    	 if (wizardDialog.open() == Window.OK) {
		    		 if(searchOptions != null) searchAndRefreshView(searchOptions);
		    	 }
		     }
		  });*/
		defaultFilteringActions();
		invokeFilters();
		invokeEditors();
		makeActions();
		hookDoubleClickAction();
		contributeToActionBars();
		
		DatatypesViewerComparator comparator = new DatatypesViewerComparator();
		viewer.setComparator(comparator);
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
		manager.add(refreshAction);
		//manager.add(wordnetLocation);
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(filterShowAll);
		manager.add(filterEntities);
	}
	
	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				refreshAction.run();
			}
		});
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
		refreshAction = new Action(){
			public void run(){
				executeRefreshAction();
			}
		};
		refreshAction.setText("Expand");
		refreshAction.setToolTipText("");
		refreshAction.setImageDescriptor(Activator.getImageDescriptor("icons/refresh.png"));
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
	
	private void executeRefreshAction() {
		List<JSONObject> datatypesJson = JsonDatatypes.getDatatypes();
		
		getInvisibleRoot().emptyRoot();
		
		for(JSONObject datatypeJson : datatypesJson){
			String name = datatypeJson.getString("name");
			DatatypeParent parent = new DatatypeParent(name);
			//EntityTreeViewDrawingProvider.drawEntityParentContent(parent);
			//searchParent.addChild(parent);
			getInvisibleRoot().addChild(parent);
			
			
	    	/*System.out.println("> " + name);
	    	String content = object.getString("content");
	    	System.out.println("> " + content);
	    	
	    	JSONArray domains = object.getJSONArray("domains");
	    	for(int j=0; j<domains.length(); j++){
	    		String domain = domains.getString(j);
	    		System.out.println("d> " + domain);
	    	}
	    	
	    	JSONArray extensions = object.getJSONArray("extends");
	    	for(int j=0; j<extensions.length(); j++){
	    		String extension = extensions.getString(j);
	    		System.out.println("e> " + extension);
	    	}
	    	
	    	JSONArray contentKeys = object.getJSONArray("contentKeys");
	    	for(int j=0; j<contentKeys.length(); j++){
	    		JSONObject contentKey = contentKeys.getJSONObject(i);
	    		String contentName = contentKey.getString("name");
		    	System.out.println(">> " + contentName);
		    	String contentType = contentKey.getString("type");
		    	System.out.println(">> " + contentType);
		    	String contentOptions = contentKey.getString("options");
		    	System.out.println(">> " + contentOptions);
	    	}
	    	
	    	//System.out.println("domains: " + object.get("domains"));
	    	//System.out.println("id: " + object.get("_id"));
	    	//System.out.println("content: " + object.get("content"));
	    	
	    	System.out.println("----------");*/
		}
		
		getViewer().refresh();
	}
	
	/*private void executeSearchAction() {
		RepositoryManager repositoryManager = RepositoryManager.getInstance();
		
		if((repositoryManager!=null) && (repositoryManager.getRepositories()!=null) && (repositoryManager.getRepositories().size() > 0)){
			Search searchOptions = new Search();
			
			WizardDialog wizardDialog = new WizardDialog(null, new SearchEntityWizardDialog(searchOptions));
			if (wizardDialog.open() == Window.OK) {
				if(searchOptions != null) searchAndRefreshView(searchOptions);
			}
		}  
	}*/
	
	/*public static boolean searchAndRefreshView(String candidate){
		Search search = new Search();
		search.setSearchField(candidate);
		return searchAndRefreshView(search);
	}*/
	
	private void showMessage(String message) {
		MessageDialog.openInformation(
			getViewer().getControl().getShell(),
			"Fragments",
			message);
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
}
