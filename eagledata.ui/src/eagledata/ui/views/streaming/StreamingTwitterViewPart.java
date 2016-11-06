package eagledata.ui.views.streaming;

import javax.annotation.PostConstruct;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
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
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

import eagledata.core.extensions.AssistantManager;
import eagledata.ui.Activator;
import resourceset.DataResourceSet;

public class StreamingTwitterViewPart extends ViewPart implements ITabbedPropertySheetPageContributor{
	public static final String ID = "eagledata.ui.views.datatypes.StreamingView";
	static TreeViewer viewer;
	
	AssistantManager connectionFactory = AssistantManager.getInstance();
	
	boolean creation = true;
	EContentAdapter adapter = new EContentAdapter() {
        public void notifyChanged(Notification notification) {
            super.notifyChanged(notification);
            
            if(!creation){
            	refresh(AssistantManager.getInstance().getDataResourceSet());
            }
            creation = false;
        }
	};

	class NameSorter extends ViewerSorter {
		
	}

	public StreamingTwitterViewPart() {
	}

	@PostConstruct
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		new DrillDownAdapter(viewer);
		
		viewer.setContentProvider(new StreamingViewContentProvider(AssistantManager.getInstance().getDataResourceSet(), viewer));
		viewer.setLabelProvider(new DelegatingStyledCellLabelProvider(new StreamingViewLabelProvider()));
		
		viewer.setInput(AssistantManager.getInstance().getDataResourceSet());
		viewer.getTree().setHeaderVisible(true);
		
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "eagledata.ui.viewer");
		getSite().setSelectionProvider(viewer);
		
		invokeFilters();
		hookDoubleClickAction();
		contributeToActionBars();
		
		connectionFactory.getDataResourceSet().eAdapters().add(adapter);
	}
	
	private void invokeFilters() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] extensions = registry.getConfigurationElementsFor(Activator.FILTER_EXTENSIONS_ID);
		
		for(IConfigurationElement extension : extensions){
			if(extension.getName().compareTo("filter") == 0){
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
		//manager.add(playEventAction);
		//manager.add(stopEventAction);
	}

	private void fillLocalPullDown(IMenuManager manager) {
		//manager.add(filterShowAll);
		//manager.add(filterEntities);
	}
	
	private void hookDoubleClickAction() {
	}
	
	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	public static TreeViewer getViewer() {
		return viewer;
	}
	
	public void refresh(DataResourceSet dataresourceset) {
		new Thread(new Runnable() {
		      public void run() {
		         while (true) {
		            try { Thread.sleep(1000); } catch (Exception e) { }
		            Display.getDefault().asyncExec(new Runnable() {
		               public void run() {
		            	   viewer.setInput(dataresourceset);
						   viewer.expandToLevel(4);
		               }
		            });
		         }
		      }
		   }).start();
	}
	
	@Override
	public String getContributorId() {
		return null;
	}
}
