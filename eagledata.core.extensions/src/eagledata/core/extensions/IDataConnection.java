package eagledata.core.extensions;
import java.util.List;

import org.json.JSONObject;

public interface IDataConnection {
	List<JSONObject> getDataObjects();
	List<JSONObject> getTextId();
 	List<String> getSimpleMessages();
 	void addListenPoint(String id);
 	boolean connect();
 	String getConsumerKey();
 	String getConsumerSecret();
 	String getAccessToken();
 	String getAccessSecret();
}
