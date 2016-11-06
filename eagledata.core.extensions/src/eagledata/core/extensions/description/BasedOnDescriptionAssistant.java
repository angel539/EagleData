package eagledata.core.extensions.description;

import java.util.ArrayList;
import java.util.List;

public class BasedOnDescriptionAssistant {
	private static BasedOnDescriptionAssistant INSTANCE = null;
	private String id = null;
	private String nameExtension = null;
	private List<String> extensions = null;
	
	private static void createInstance() {
	   	 if (INSTANCE == null) {
	   		 synchronized(BasedOnDescriptionAssistant.class) {
	   			 if (INSTANCE == null) {
	   				 INSTANCE = new BasedOnDescriptionAssistant();
	   			 }
	   		 }
	     }
	}

  public static BasedOnDescriptionAssistant getInstance() {
      if (INSTANCE == null){
      	createInstance();
      }
      return INSTANCE;
  }
  
  	public Object clone() throws CloneNotSupportedException {
  		throw new CloneNotSupportedException(); 
  	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNameExtension() {
		return nameExtension;
	}

	public void setNameExtension(String nameExtension) {
		this.nameExtension = nameExtension;
	}

	public List<String> getExtensions() {
		return extensions;
	}

	public void setExtensions(List<String> extensions) {
		this.extensions = extensions;
	}
	
	public void addExtension(String extension) {
		if(this.extensions == null) extensions = new ArrayList<String>();
		extensions.add(extension);
	}
}
