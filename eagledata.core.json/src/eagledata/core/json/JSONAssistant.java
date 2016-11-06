package eagledata.core.json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

import eagledata.core.extensions.description.BasedOnDescriptionAssistant;
import eagledata.core.extensions.description.IBasedOnDescriptionAssistant;
import resourceset.*;

public class JSONAssistant extends BasedOnDescriptionAssistant implements IBasedOnDescriptionAssistant {
	private JSONObject jsonAllContent = null;
	BasedOnDescriptionDataResource resource = null;
	
	public JSONAssistant() {
		super();
	}
	
	@Override
	public boolean load(String filePath) {
		StringBuilder response = new StringBuilder();
		URLConnection urlConn = null;
		InputStreamReader in = null;
		
		try {
			URL url = new URL(filePath);
			urlConn = url.openConnection();
			
			if (urlConn != null)
				urlConn.setReadTimeout(60 * 1000);
			if (urlConn != null && urlConn.getInputStream() != null) {
				in = new InputStreamReader(urlConn.getInputStream(),
						Charset.defaultCharset());
				BufferedReader bufferedReader = new BufferedReader(in);
				if (bufferedReader != null) {
					int cp;
					while ((cp = bufferedReader.read()) != -1) {
						response.append((char) cp);
					}
					bufferedReader.close();
				}
			}
			
			in.close();
		}
		catch (Exception e) {
			showMessage("Exception while calling URL: " + filePath + " " + e.getMessage());
			return false;
		}
		
		jsonAllContent = new JSONObject(response.toString());
		
		if(jsonAllContent != null){
			Table tableContent = ResourcesetFactory.eINSTANCE.createTable();
			key2Column(jsonAllContent);
			
			resource = ResourcesetFactory.eINSTANCE.createBasedOnDescriptionDataResource();
			resource.setPath(filePath);
			resource.setContent(tableContent);
		}
		
		return true;
	}
	
     
    private void key2Column(Object root){
        if(root == null) return;
        
        if(root instanceof JSONObject){
        	Iterator<String> iterator = ((JSONObject) root).keys();
    		while(iterator.hasNext()){
    			String key = iterator.next();
    			Object jsonElement  = jsonAllContent.get(key);
    			key2Column(jsonElement);
    		}
        }
        
        if(root instanceof JSONArray){
        	JSONArray arrayRoot = (JSONArray) root;
        	Iterator<Object> iterator = arrayRoot.iterator();
    		while(iterator.hasNext()){
    			key2Column(iterator.next());
    		}
        }
        
        if(root instanceof String){
        	PrimitiveColumn primitiveColumn = ResourcesetFactory.eINSTANCE.createPrimitiveColumn();
        	primitiveColumn.getValues().add((String) root);
        }
    }

	@Override
	public BasedOnDescriptionDataResource getResource() {
		// TODO Auto-generated method stub
		return resource;
	}

	@Override
	public void setResource(BasedOnDescriptionDataResource resource) {
		this.resource = resource;
	}
}
