package uam.eagledata.extensions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.spi.RegistryContributor;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.google.inject.Inject;
import ecarules.ActionExecutableExtension;
import ecarules.DataConnection;
import ecarules.EventSetManager;
import ecarules.ExtendedActionExecutableExtension;
import ecarules.ExtensibleDataConnection;

public class EventSetControlManager{
	public static final String DATACONNECTION_EXTENSIONS_ID = "eagledata.core.extensions.dataconnection";
	public static final String ACTION_EXTENSIONS_ID = "eagledata.core.extensions.actions";
	
	private static EventSetControlManager INSTANCE = null;	
	@Inject UISynchronize sync;
	
	private static List<DataConnection> dataConnections = null;
	private static List<ActionExecutableExtension> actions = null;
	
	public List<DataConnection> getDataConnection() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] extensions = registry.getConfigurationElementsFor(DATACONNECTION_EXTENSIONS_ID);
		
		for(IConfigurationElement extension : extensions){
			if(! dataConnectionIsOnTheList(extension.getAttribute("id"))){
				if(extension.getName().compareTo("connection") == 0){
					ExtensibleDataConnection dataConnection;
					
					Bundle bundle = null;
					IContributor contributor = extension.getContributor();

					if (contributor instanceof RegistryContributor) {
						long id = Long.parseLong(((RegistryContributor) contributor).getActualId());
						Bundle thisBundle = FrameworkUtil.getBundle(getClass());
						bundle = thisBundle.getBundleContext().getBundle(id);
					}
					else {
						bundle = Platform.getBundle(contributor.getName());          
					}
					
					try{
						if(extension.createExecutableExtension("class") instanceof ExtensibleDataConnection){
							dataConnection = (ExtensibleDataConnection) extension.createExecutableExtension("class");
							
							((ExtensibleDataConnection) dataConnection).setId(extension.getAttribute("id"));
							((ExtensibleDataConnection) dataConnection).setName(extension.getAttribute("name"));
						
							dataConnections.add(dataConnection);
						}
					}
					catch(CoreException e){
						Activator.writeConsole(e.getMessage());
					}
				}
			}		
		}
		
		return dataConnections;
	}
	
	private boolean dataConnectionIsOnTheList(String attribute) {
		if(dataConnections == null)
			return false;
		
		for(DataConnection connection : dataConnections){
			if(connection instanceof DataConnection){
				if(((DataConnection) connection).getId().compareTo(attribute) == 0) 
					return true;
			}
		}
		
		return false;
	}
	
	public List<ActionExecutableExtension> getActions() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] extensions = registry.getConfigurationElementsFor(ACTION_EXTENSIONS_ID);
		
		for(IConfigurationElement extension : extensions){
			if(! actionIsOnTheList(extension.getAttribute("id"))){
				if(extension.getName().compareTo("action") == 0){
					ExtendedActionExecutableExtension action;
					
					Bundle bundle = null;
					IContributor contributor = extension.getContributor();

					if (contributor instanceof RegistryContributor) {
						long id = Long.parseLong(((RegistryContributor) contributor).getActualId());
						Bundle thisBundle = FrameworkUtil.getBundle(getClass());
						bundle = thisBundle.getBundleContext().getBundle(id);
					}
					else {
						bundle = Platform.getBundle(contributor.getName());          
					}
					
					try{
						if(extension.createExecutableExtension("class") instanceof ExtendedActionExecutableExtension){
							action = (ExtendedActionExecutableExtension) extension.createExecutableExtension("class");
							
							((ExtendedActionExecutableExtension) action).setId(extension.getAttribute("id"));
							((ExtendedActionExecutableExtension) action).setName(extension.getAttribute("name"));
						
							actions.add(action);
						}
					}
					catch(CoreException e){
						Activator.writeConsole(e.getMessage());
					}
				}
			}		
		}
		
		return actions;
	}
	
	private boolean actionIsOnTheList(String attribute) {
		if(actions == null)
			return false;
		
		for(ActionExecutableExtension action : actions){
			if(action instanceof ActionExecutableExtension){
				if(((ActionExecutableExtension) action).getId().compareTo(attribute) == 0) 
					return true;
			}
		}
		
		return false;
	}

	private static void createInstance(){
   	 if (INSTANCE == null) {
            synchronized(EventSetControlManager.class) {
                if (INSTANCE == null) { 
                    INSTANCE = new EventSetControlManager();
                    dataConnections = new ArrayList<DataConnection>();
                	actions = new ArrayList<ActionExecutableExtension>();
                }
            }
        }
   }
	
	public static void shutdown() {
		if (INSTANCE != null) {
			INSTANCE = null;
		}
	}
	
	public EventSetManager getModelDocumentFromEditor() {
		IXtextDocument xtextDocument = EditorUtils.getActiveXtextEditor().getDocument();
		
		XtextResource xtextResource = xtextDocument.readOnly(new IUnitOfWork<XtextResource, XtextResource>() {
	         public XtextResource exec(XtextResource state) throws Exception {
	                 return state;
	                 }
	         });
		
		EventSetManager eventSetManager = (EventSetManager) xtextResource.getContents().get(0);
		
		for(Adapter adapter : eventSetManager.eAdapters()){
			if (adapter instanceof org.eclipse.xtext.nodemodel.impl.RootNode) {
				org.eclipse.xtext.nodemodel.impl.RootNode rootNode = (org.eclipse.xtext.nodemodel.impl.RootNode) adapter;
				System.out.println(rootNode.getCompleteContent());
			}
		}
		
		return eventSetManager;
	}

	public static EventSetControlManager getInstance(){
		if (INSTANCE == null){
			createInstance();
		}
		
		return INSTANCE;
	}
   
	public Object clone() throws CloneNotSupportedException {
	   throw new CloneNotSupportedException(); 
    }
}
