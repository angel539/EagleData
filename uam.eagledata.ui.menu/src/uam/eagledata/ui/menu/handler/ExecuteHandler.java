package uam.eagledata.ui.menu.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.spi.RegistryContributor;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import ecarules.Action;
import ecarules.Event;
import ecarules.EventSetManager;
import ecarules.PatternEvent;
import uam.eagledata.extensions.EventSetControlManager;

public class ExecuteHandler extends AbstractHandler {
	public static final String ACTION_EXTENSIONS_ID = "eagledata.core.extensions.actions";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		EventSetManager eventSetManager = EventSetControlManager.getInstance().getEventSetManager();
		
		for(Event e : eventSetManager.getEvents()){
			if (e instanceof PatternEvent) {
				PatternEvent patternE = (PatternEvent) e;
				for(String trigger : patternE.getTriggers()){
					Action actionBundle = callActionExtension(trigger);
					if(actionBundle != null){
						actionBundle.execute(null);
					}else{
						System.out.println("ES NULO...");
					}
				}
			}
		}
		
		return Status.OK_STATUS;
	}
	
	private Action callActionExtension(String nameAction){
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] extensions = registry.getConfigurationElementsFor(ACTION_EXTENSIONS_ID);
		
		for(IConfigurationElement extension : extensions){
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
			
            if (extension.getAttribute("name").equals(nameAction)) {
            	Object o;
				try {
					o = extension.createExecutableExtension("class");
					if (o instanceof Action) {
						Action action = (Action) o;
	                    return action;
	                }
				} catch (CoreException e) {
					return null;
				}
            }
		}
		
		return null;
	}
	
	
}
