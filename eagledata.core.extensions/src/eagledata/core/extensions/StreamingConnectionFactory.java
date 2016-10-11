package eagledata.core.extensions;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

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

public class StreamingConnectionFactory{
	private List<IDataConnection> connections = null;
	private static StreamingConnectionFactory INSTANCE = null;

	public static final String CONNECTION_EXTENSIONS_ID = "eagledata.core.extensions.streaming";

	private List<PropertyChangeListener> listener = new ArrayList<PropertyChangeListener>();
	
	public List<IDataConnection> getConnections(){
		if (this.connections == null) {
			this.connections = new ArrayList<IDataConnection>();
		}
		
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] extensions = registry.getConfigurationElementsFor(CONNECTION_EXTENSIONS_ID);
		
		for(IConfigurationElement extension : extensions){
				if(extension.getName().compareTo("streamingconnection") == 0){
					IDataConnection connection;
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
						if(extension.createExecutableExtension("class") instanceof IDataConnection){
							connection = (IDataConnection) extension.createExecutableExtension("class");
							((DataConnection)connection).setId(extension.getAttribute("id"));
							((DataConnection)connection).setNameExtension(extension.getAttribute("name"));
							
							this.connections.add(connection);
						}
					}
					catch(CoreException e){
					}
				}	
		}
		
		return this.connections;
	}

	private static void createInstance() {
   	 if (INSTANCE == null) {
            synchronized(StreamingConnectionFactory.class) {
                if (INSTANCE == null) { 
                    INSTANCE = new StreamingConnectionFactory();
                }
            }
        }
   }

   public static StreamingConnectionFactory getInstance() {
       if (INSTANCE == null){
       	createInstance();
       }
       return INSTANCE;
   }
   
   public Object clone() throws CloneNotSupportedException {
   	throw new CloneNotSupportedException(); 
   }
}
