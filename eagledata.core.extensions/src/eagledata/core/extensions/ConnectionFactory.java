package eagledata.core.extensions;

import java.beans.PropertyChangeEvent;
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

public class ConnectionFactory{
	private List<IDataConnection> connections = null;
	private static ConnectionFactory INSTANCE = null;

	public static final String CONNECTION_EXTENSIONS_ID = "eagledata.core.extensions.streaming";

	
	private List<PropertyChangeListener> listener = new ArrayList<PropertyChangeListener>();
	
	public List<IDataConnection> getConnections(){
		if (this.connections == null) {
			this.connections = new ArrayList<IDataConnection>();
		}
		
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] extensions = registry.getConfigurationElementsFor(CONNECTION_EXTENSIONS_ID);
		
		for(IConfigurationElement extension : extensions){
			//if(!isOnTheList(extension.getAttribute("id"))){
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
							
							//((DataConnection)connection).setId(extension.getAttribute("id"));
							((DataConnection)connection).setNameExtension(extension.getAttribute("name"));
							
							this.connections.add(connection);
						}
					}
					catch(CoreException e){
					}
				}
			//}		
		}
		
		return this.connections;
	}
	
	/*private boolean isOnTheList(String attribute) {
		for(IDataConnection assistant : connections){
			if(assistant instanceof IFormatAssistant){
				if(((FormatAssistant) assistant).getId().compareTo(attribute)==0) return true;
			}
		}
		return false;
	}*/

	private static void createInstance() {
   	 if (INSTANCE == null) {
            synchronized(ConnectionFactory.class) {
                if (INSTANCE == null) { 
                    INSTANCE = new ConnectionFactory();
                }
            }
        }
   }

   public static ConnectionFactory getInstance() {
       if (INSTANCE == null){
       	createInstance();
       }
       return INSTANCE;
   }
   
   public Object clone() throws CloneNotSupportedException {
   	throw new CloneNotSupportedException(); 
   }

   
   /*private void callToRegisterTypes(final Bundle bundle, final Object o) {
	   ISafeRunnable runnable = new ISafeRunnable() {
		   @Override
		   public void handleException(Throwable e) {
			   System.out.println("Exception in client saferunnable");
		   }
		   
		   @Override
		   public void run() throws Exception {
			   List<Class<? extends ISemanticElement>> types = ((IFormatAssistant) o).getRegisteredTypes();
			   if(types != null) addRegisteredTypes(bundle, types);
		   }
		};
		SafeRunner.run(runnable);
	}
   
   public boolean addRegisteredTypes(Bundle bundle, List<Class<? extends ISemanticElement>> registeredTypes){
	   if(registeredTypes != null){
		   this.registeredTypes.put(bundle, registeredTypes);
		   return true;
	   }
	   return false;
   }
   
	public Map<Bundle, List<Class<? extends ISemanticElement>>> getRegisteredTypes() {
		return registeredTypes;
	}
	
	public void setRegisteredTypes(Map<Bundle, List<Class<? extends ISemanticElement>>> registeredTypes) {
		this.registeredTypes = registeredTypes;
	}
	
	public List<ISearch> getSearches() {
		return searches;
	}

	public void setSearches(List<ISearch> searches) {
		this.searches = searches;
	}
	
	private void addSearch(ISearch search){
		if(this.searches == null) this.searches = new ArrayList<ISearch>();
		this.searches.add(search);
	}

	public static void completeSemanticClassProperties(IFormatAssistant assistant, ISemanticClass entity){
		List<ISemanticClass> superclasses = assistant.getSuper(entity, false);
		((ISemanticClass) entity).setSuperclasses(superclasses);
		List<ISemanticClass> subclasses = assistant.getSub(entity, false);
		((ISemanticClass) entity).setSubclasses(subclasses);
		List<IObjectProperty> references = assistant.getObjectProperties(entity, true, true);
		((ISemanticClass) entity).setReferences(references);
		List<IDataProperty> properties = assistant.getDataProperties(entity, true, true);
		((ISemanticClass) entity).setProperties(properties);
	}
	
	public static void completeSemanticClassProperties(IFormatAssistant assistant, ISemanticClass entity, ISearch search){
		List<ISemanticClass> superclasses = assistant.getSuper(entity, false);
		((ISemanticClass) entity).setSuperclasses(superclasses);
		List<ISemanticClass> subclasses = assistant.getSub(entity, false);
		((ISemanticClass) entity).setSubclasses(subclasses);
		List<IObjectProperty> references = assistant.getObjectProperties(entity, search.isFromSupers(), search.isFromEquivs());
		((ISemanticClass) entity).setReferences(references);
		List<IDataProperty> properties = assistant.getDataProperties(entity, search.isFromSupers(), search.isFromEquivs());
		((ISemanticClass) entity).setProperties(properties);
	}

	
	public List<ISemanticClass> search(RepositoryManager repositoryManager, Search search) {
		addSearch(search);	
		search.expand();
		
		Map<String, Integer> searchList = search.getOrderSearchesListByWeight();
		List<ISemanticClass> semanticClasses = new ArrayList<ISemanticClass>();
		
		for(IRepository repository : repositoryManager.getRepositories()){
			for(IResource resource : repository.getResources()){
				if((resource instanceof SemanticResource) && (resource.isActive())){
					search.getResourcesSearched().add(resource);
					
					for(IFormatAssistant assistant : connections){
						if((resource.isAlive()) && (resource.getAssistant() != null)){
							if(((FormatAssistant)assistant).getNameExtension().compareTo(resource.getAssistant())==0){
								if((resource != null) && (resource instanceof SemanticResource) && (assistant.load((SemanticResource) resource))){	
									List<ISemanticClass> entities = assistant.getClassesLike(searchList);
									
									for(ISemanticClass entity : entities){
										ConnectionFactory.completeSemanticClassProperties(assistant, entity, search);
										semanticClasses.add(entity);
									}
								}
							}
						}
					}
				}	
			}		
		}
		
		return semanticClasses;
	}*/
}
