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

import eagledata.core.extensions.description.BasedOnDescriptionAssistant;
import eagledata.core.extensions.description.IBasedOnDescriptionAssistant;
import eagledata.core.extensions.streaming.BasedOnStreamingDataAssistant;
import eagledata.core.extensions.streaming.IBasedOnStreamingDataAssistant;
import resourceset.DataResource;
import resourceset.DataResourceSet;
import resourceset.ResourcesetFactory;

public class AssistantManager{
	private static AssistantManager _INSTANCE = null;
	private List<IDataResourceAssistant> assistances = null;
	private static DataResourceSet dataresourceset = null;
	public static final String DATADESCRIPTION_EXTENSIONS_ID = "eagledata.core.extensions.assistant";	

	//private List<PropertyChangeListener> listener = new ArrayList<PropertyChangeListener>();
	
	public List<IDataResourceAssistant> getAssistances(){
		if (this.assistances == null) {
			this.assistances = new ArrayList<IDataResourceAssistant>();
		}
		
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		
		IConfigurationElement[] extensions = registry.getConfigurationElementsFor(DATADESCRIPTION_EXTENSIONS_ID);
		
		for(IConfigurationElement extension : extensions){
			Bundle bundle = null;
			IContributor contributor = extension.getContributor();
			
			switch (extension.getName()) {
				case "streamingconnection":
					IBasedOnStreamingDataAssistant streamingassistant;
					
					if (contributor instanceof RegistryContributor) {
						long id = Long.parseLong(((RegistryContributor) contributor).getActualId());
						Bundle thisBundle = FrameworkUtil.getBundle(getClass());
						bundle = thisBundle.getBundleContext().getBundle(id);
					}
					else{
						bundle = Platform.getBundle(contributor.getName());
					}
					
					try{
						if(extension.createExecutableExtension("class") instanceof IBasedOnStreamingDataAssistant){
							streamingassistant = (IBasedOnStreamingDataAssistant) extension.createExecutableExtension("class");
							
							((BasedOnStreamingDataAssistant)streamingassistant).setId(extension.getAttribute("id"));
							((BasedOnStreamingDataAssistant)streamingassistant).setNameExtension(extension.getAttribute("name"));
							this.assistances.add(streamingassistant);
						}
					}
					catch(CoreException e){
					}
				break;
				
				case "dataassistant":
					IBasedOnDescriptionAssistant basedondescriptionassistant;
					
					if (contributor instanceof RegistryContributor) {
					  long id = Long.parseLong(((RegistryContributor) contributor).getActualId());
					  Bundle thisBundle = FrameworkUtil.getBundle(getClass());
					  bundle = thisBundle.getBundleContext().getBundle(id);
					}
					else {
					  bundle = Platform.getBundle(contributor.getName());          
					}
					
					try{
						if(extension.createExecutableExtension("class") instanceof IBasedOnDescriptionAssistant){
							basedondescriptionassistant = (IBasedOnDescriptionAssistant) extension.createExecutableExtension("class");
							
							((BasedOnDescriptionAssistant)basedondescriptionassistant).setId(extension.getAttribute("id"));
							((BasedOnDescriptionAssistant)basedondescriptionassistant).setNameExtension(extension.getAttribute("name"));
							
							String extensionsAttribute = StringUtils.deleteWhitespace(extension.getAttribute("extensions"));
							String[] extensionsSeparated = StringUtils.splitByWholeSeparator(extensionsAttribute, ",");
							
							for(String s : extensionsSeparated){
								((BasedOnDescriptionAssistant)basedondescriptionassistant).addExtension(s);
							}
							
							this.assistances.add(basedondescriptionassistant);
						}
					}
					catch(CoreException e){
					}
					break;
					
				default:
					break;
			}	
		}
		
		return this.assistances;
	}

	private static void createInstance() {
   	 if (_INSTANCE == null) {
            synchronized(AssistantManager.class) {
                if (_INSTANCE == null) { 
                    _INSTANCE = new AssistantManager();
                    dataresourceset = ResourcesetFactory.eINSTANCE.createDataResourceSet();
                }
            }
        }
   }

   public static AssistantManager getInstance() {
       if (_INSTANCE == null){
       		createInstance();
       }
       return _INSTANCE;
   }
   
   public Object clone() throws CloneNotSupportedException {
   	throw new CloneNotSupportedException(); 
   }

	public DataResourceSet getDataResourceSet() {
		return dataresourceset;
	}
	
	public void setDataResourceSet(DataResourceSet dATA_RESOURCE_SET) {
		dataresourceset = dATA_RESOURCE_SET;
	}
	
	public void addDataResource(DataResource dataResource){
		dataresourceset.getResources().add(dataResource);
	}
}
