package uam.eagledata.ui.views.eventset;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;

import ecarules.provider.EcarulesItemProviderAdapterFactory;
import uam.eagledata.extensions.EventSetControlManager;

public class EventSetViewPart extends ViewPart {
	public static final String ID = "uam.eagledata.ui.views.EventSetView";
	public static TreeViewer viewer;
	
	protected ComposedAdapterFactory adapterFactory;
	List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
	
	@Override
	public void createPartControl(Composite parent) {
		PatternFilter patternfilter = new PatternFilter();
		FilteredTree tree = new FilteredTree(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL, patternfilter, true);
		
		viewer = tree.getViewer();	
		
		EventSetViewFilter filter = new EventSetViewFilter();
		ViewerFilter[] filters = {filter};
		viewer.setFilters(filters);
		
		new DrillDownAdapter(viewer);
		
		// Building the content and the label provider from EMF Edit
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new EcarulesItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
		
		adapterFactory = new ComposedAdapterFactory(factories);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(adapterFactory);
		viewer.setContentProvider(contentProvider);
		
		EventSetControlManager assistantFactory = EventSetControlManager.getInstance();
		//viewer.setSorter(new NameSorter());
		viewer.setLabelProvider(new DelegatingStyledCellLabelProvider(new TreeViewAdapterFactoryLabelProvider(adapterFactory)));		  
		viewer.setInput(assistantFactory.getEventSetManager());
		
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "extremo.ui.viewer");
		
		getSite().setSelectionProvider(viewer);
		getViewSite().setSelectionProvider(viewer);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
}
