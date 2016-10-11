package eagledata.core.extensions;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.spi.RegistryContributor;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import streamingresources.StreamingResource;
import streamingresources.StreamingresourcesFactory;

public class DataAssistantConnectionFactory{
	private List<IDataAssistant> assistants = null;
	private static DataAssistantConnectionFactory INSTANCE = null;

	public static final String DATA_ASSISTANT_EXTENSIONS_ID = "eagledata.core.extensions.assistant";
	//private List<PropertyChangeListener> listener = new ArrayList<PropertyChangeListener>();
	
	public List<IDataAssistant> getConnections(){
		if (this.assistants == null) {
			this.assistants = new ArrayList<IDataAssistant>();
		}
		
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] extensions = registry.getConfigurationElementsFor(DATA_ASSISTANT_EXTENSIONS_ID);

		
		for(IConfigurationElement extension : extensions){
			if(extension.getName().compareTo("dataassistant") == 0){
				IDataAssistant assistant;
				Bundle bundle = null;
				IContributor contributor = extension.getContributor();

				if (contributor instanceof RegistryContributor) {
				  long id = Long.parseLong(((RegistryContributor) contributor).getActualId());
				  Bundle thisBundle = FrameworkUtil.getBundle(getClass());
				  bundle = thisBundle.getBundleContext().getBundle(id);
				} else {
				  bundle = Platform.getBundle(contributor.getName());          
				}
				
				try{
					if(extension.createExecutableExtension("class") instanceof IDataAssistant){
						assistant = (IDataAssistant) extension.createExecutableExtension("class");
						
						//StreamingResource streamingResource = StreamingresourcesFactory.eINSTANCE.createStreamingResource();
						
						((DataAssistant)assistant).setId(extension.getAttribute("id"));
						((DataAssistant)assistant).setNameExtension(extension.getAttribute("name"));
						//((DataAssistant)assistant).set(extension.getAttribute("name"));
						
						String extensionsAttribute = StringUtils.deleteWhitespace(extension.getAttribute("extensions"));
						String[] extensionsSeparated = StringUtils.splitByWholeSeparator(extensionsAttribute, ",");
						
						for(String s : extensionsSeparated){
							((DataAssistant)assistant).addExtension(s);
						}
						
						this.assistants.add(assistant);
					}
				}
				catch(CoreException e){
				}
			}
		}
		
		return this.assistants;
	}

	private static void createInstance() {
   	 if (INSTANCE == null) {
            synchronized(DataAssistantConnectionFactory.class) {
                if (INSTANCE == null) { 
                    INSTANCE = new DataAssistantConnectionFactory();
                }
            }
        }
   }

   public static DataAssistantConnectionFactory getInstance() {
       if (INSTANCE == null){
       	createInstance();
       }
       return INSTANCE;
   }
   
   public Object clone() throws CloneNotSupportedException {
   	throw new CloneNotSupportedException(); 
   }
}
