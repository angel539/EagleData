package eagledata.core.extensions;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

public class DataConnection{
	private String id = null;
	private String nameExtension = null;
	public List<JSONObject> objects = null;
	private List<PropertyChangeListener> listener = new ArrayList<PropertyChangeListener>();
	
	private boolean withLinks = false;
	private boolean withImages = false;
	private boolean withUrls = false;
	
	private boolean fromAndroid = false;
	private boolean fromIOs = false;
	private boolean fromWeb = false;
	private boolean fromAll = false;
	
	private int minRetweet = 0;
	private int minFavorite = 0;
	
	private List<String> termsToSearch;
	
	private double latitude;
	private double longitude;
	
	private double sw_latitude;
	private double sw_longitude;
	private double ne_latitude;
	private double ne_longitude;
	
	public boolean isWithLinks() {
		return withLinks;
	}

	public void setWithLinks(boolean withLinks) {
		this.withLinks = withLinks;
	}

	public boolean isWithImages() {
		return withImages;
	}

	public void setWithImages(boolean withImages) {
		this.withImages = withImages;
	}

	public boolean isWithUrls() {
		return withUrls;
	}

	public void setWithUrls(boolean withUrls) {
		this.withUrls = withUrls;
	}

	public boolean isFromAndroid() {
		return fromAndroid;
	}

	public void setFromAndroid(boolean fromAndroid) {
		this.fromAndroid = fromAndroid;
	}

	public boolean isFromIOs() {
		return fromIOs;
	}

	public void setFromIOs(boolean fromIOs) {
		this.fromIOs = fromIOs;
	}

	public boolean isFromWeb() {
		return fromWeb;
	}

	public void setFromWeb(boolean fromWeb) {
		this.fromWeb = fromWeb;
	}

	public boolean isFromAll() {
		return fromAll;
	}

	public void setFromAll(boolean fromAll) {
		this.fromAll = fromAll;
	}

	public int getMinRetweet() {
		return minRetweet;
	}

	public void setMinRetweet(int minRetweet) {
		this.minRetweet = minRetweet;
	}

	public int getMinFavorite() {
		return minFavorite;
	}

	public void setMinFavorite(int minFavorite) {
		this.minFavorite = minFavorite;
	}

	public static final String OBJECT_LIST = "objects";
	/*private static void createInstance() {
	   	 if (INSTANCE == null) {
	   		 synchronized(DataConnection.class) {
	   			 if (INSTANCE == null) {
	   				 INSTANCE = new DataConnection();
	   			 }
	   		 }
	     }
	}

  public static DataConnection getInstance() {
      if (INSTANCE == null){
      	createInstance();
      }
      return INSTANCE;
  }
  
  	public Object clone() throws CloneNotSupportedException {
  		throw new CloneNotSupportedException(); 
  	}*/

	public String getPatternId() {
		return id;
	}

	public void setPatternId(String id) {
		this.id = id;
	}

	public String getNameExtension() {
		return nameExtension;
	}

	public void setNameExtension(String nameExtension) {
		this.nameExtension = nameExtension;
	}
	
	public void addObject(JSONObject object){
		if(objects == null) objects = new ArrayList<JSONObject>();
		objects.add(object);
		
		notifyListeners(this, OBJECT_LIST, null, object);
	}
	
	private void notifyListeners(Object object, String property, JSONObject oldValue, JSONObject newValue) {
	    for (PropertyChangeListener name : listener) {
	    	name.propertyChange(new PropertyChangeEvent(this, property, oldValue, newValue));
	    }
	}

	public void addChangeListener(PropertyChangeListener newListener) {
		listener.add(newListener);
	}

	public List<String> getTermsToSearch() {
		return termsToSearch;
	}

	public void setTermsToSearch(List<String> termsToSearch) {
		this.termsToSearch = termsToSearch;
	}
	
	public void setGeoPosition(double lat, double longitude){
		this.latitude = lat;
		this.longitude = longitude;
	};
	
	public void setGeoRegion(double sw_lat, double sw_long, double ne_lat, double ne_long){
		this.sw_latitude = sw_lat;
		this.sw_longitude = sw_long;
		this.ne_latitude = ne_lat;
		this.ne_longitude = ne_long;
	}
}
