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

import ecarules.ActionExecutableExtension;
import ecarules.ExtendedActionExecutableExtension;

public class ExecuteHandler extends AbstractHandler {
	public static final String ACTION_EXTENSIONS_ID = "eagledata.core.extensions.actions";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		/*EventSetManager eventSetManager = EventSetControlManager.getInstance().getModelDocument();
		
		for(Event e : eventSetManager.getEvents()){
			if (e instanceof PatternEvent) {
				PatternEvent patternE = (PatternEvent) e;
				
				for(Action trigger : patternE.getTriggers()){
					ActionExecutableExtension actionBundle = callActionExecutableExtension(trigger.getCalls());
					
					if(actionBundle != null){
						System.out.println("hola holita hola");
						actionBundle.execute(trigger.getParams());
					}
					else{
						System.out.println("ES NULO...");
					}
				}
			}
		}*/
		
		return Status.OK_STATUS;
	}
	
	private ActionExecutableExtension callActionExecutableExtension(String nameAction){
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
					if (o instanceof ExtendedActionExecutableExtension) {
						ExtendedActionExecutableExtension action = (ExtendedActionExecutableExtension) o;
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
