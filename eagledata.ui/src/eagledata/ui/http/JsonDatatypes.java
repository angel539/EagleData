package eagledata.ui.http;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import eagledata.core.dsl.datadesc.dataDsl.BooleanOption;
import eagledata.core.dsl.datadesc.dataDsl.DataTypeRefinement;
import eagledata.core.dsl.datadesc.dataDsl.Enumeration;
import eagledata.core.dsl.datadesc.dataDsl.IntOption;
import eagledata.core.dsl.datadesc.dataDsl.Option;
import eagledata.core.dsl.datadesc.dataDsl.StringOption;

public class JsonDatatypes {
	static String URL = "http://diagrameditorserver.herokuapp.com/datatypes?json=true";
	
	/*
	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
	    }
	    return sb.toString();
	}
	
	public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
		InputStream is = new URL(url).openStream();
		
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			return json;
		}
		finally {
			is.close();
		}
	}
	
	public static JSONObject writeJsonFromUrl(String url) throws IOException, JSONException {
		InputStream is = new URL(url).openStream();
		
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			return json;
		}
		finally {
			is.close();
		}
	}

	  public static void main(String[] args) throws IOException, JSONException {
	    JSONObject json = readJsonFromUrl(URL);

	  }
	 */
	
	public static JSONObject datatype2json(DataTypeRefinement datatype){
		JSONObject newObject = new JSONObject();
		String name = datatype.getName();
	    newObject.put("name", name);
	    
	    String content = datatype.toString();
	    newObject.put("content", content);
	    
	    //JSONArray newDomains = new JSONArray();
	    //newDomains.put("dominio3");
	    //newDomains.put("dominio4");
	    
	    //newObject.put("domains", newDomains);
	    
	    String extension = datatype.getRefine().getLiteral();
	    newObject.put("extend", extension);
	    
	    JSONArray newContentKeys = new JSONArray(); 
	    List<Option> options = datatype.getOptions();
	    for(Option option : options){
	    	JSONObject newContentNode = new JSONObject();
	    	
	    	if(option instanceof StringOption){
	    		newContentNode.put("name", ((StringOption) option).getKey().getLiteral());
		    	newContentNode.put("type", ((StringOption) option).getValue());
	    	}
	    	
	    	if(option instanceof IntOption){
	    		newContentNode.put("name", ((IntOption) option).getKey().getLiteral());
		    	newContentNode.put("type", ((IntOption) option).getValue());
	    	}
	    	
	    	if(option instanceof BooleanOption){
	    		newContentNode.put("name", ((BooleanOption) option).getKey().getLiteral());
		    	newContentNode.put("type", ((BooleanOption) option).getValue());
	    	}
	    	
	    	
	    	newContentKeys.put(newContentNode);
	    }
	    
	    newObject.put("contentKeys", newContentKeys);
	    
	    return newObject;
	}
	
	public static JSONObject enumeration2json(Enumeration enumeration){
		JSONObject newObject = new JSONObject();
		String name = enumeration.getName();
	    newObject.put("name", name);
	    
	    String content = enumeration.toString();
	    newObject.put("content", content);
	    
	    //String extension = enumeration.getRefine().getLiteral();
	    //newObject.put("extend", extension);
	    
	    /*JSONArray newContentKeys = new JSONArray(); 
	    List<Option> options = enumeration.getOptions();
	    for(Option option : options){
	    	JSONObject newContentNode = new JSONObject();
	    	
	    	if(option instanceof StringOption){
	    		newContentNode.put("name", ((StringOption) option).getKey().getLiteral());
		    	newContentNode.put("type", ((StringOption) option).getValue());
	    	}
	    	
	    	if(option instanceof IntOption){
	    		newContentNode.put("name", ((IntOption) option).getKey().getLiteral());
		    	newContentNode.put("type", ((IntOption) option).getValue());
	    	}
	    	
	    	if(option instanceof BooleanOption){
	    		newContentNode.put("name", ((BooleanOption) option).getKey().getLiteral());
		    	newContentNode.put("type", ((BooleanOption) option).getValue());
	    	}
	    	
	    	newContentKeys.put(newContentNode);
	    }*/
	    
	    //newObject.put("contentKeys", newContentKeys);
	    
	    return newObject;
	}
	
	
	public static List<JSONObject> getDatatypes(){
		List<JSONObject> datatypes = new ArrayList<JSONObject>();
		String jsonString = getList(URL);
		try {  
			JSONObject json = new JSONObject(jsonString);
		    JSONArray array = (JSONArray)json.get("array");
		    
		    for(int i=0; i< array.length(); i++){
		    	JSONObject object = array.getJSONObject(i);
		    	datatypes.add(object);
		    	
		    }
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return datatypes;
	}
	
	public static void main(String[] args) {
		String jsonString = getList(URL);
		try {  
			JSONObject json = new JSONObject(jsonString);
		    JSONArray array = (JSONArray)json.get("array");
		    
		    for(int i=0; i< array.length(); i++){
		    	JSONObject object = array.getJSONObject(i);
		    	
		    	String name = object.getString("name");
		    	System.out.println("> " + name);
		    	String content = object.getString("content");
		    	System.out.println("> " + content);
		    	String extension = object.getString("extend");
		    	System.out.println("> " + extension);
		    	
		    	JSONArray contentKeys = object.getJSONArray("contentKeys");
		    	for(int j=0; j<contentKeys.length(); j++){
		    		JSONObject contentKey = contentKeys.getJSONObject(i);
		    		String contentName = contentKey.getString("name");
			    	System.out.println(">> " + contentName);
			    	String contentType = contentKey.getString("type");
			    	System.out.println(">> " + contentType);
		    	}
		    	
		    	//System.out.println("domains: " + object.get("domains"));
		    	//System.out.println("id: " + object.get("_id"));
		    	//System.out.println("content: " + object.get("content"));
		    	
		    	System.out.println("----------");
		    }
		    
		    JSONObject newObject = new JSONObject();
		    newObject.put("name", "nuevo2");
		    newObject.put("content", "mifragmento");
		    newObject.put("extend", "date");
		    
		    JSONArray newContentKeys = new JSONArray();
		    
		    JSONObject newContentKey1 = new JSONObject();
		    newContentKey1.put("name", "contentKey1");
		    newContentKey1.put("type", "contentType1");
		    newContentKeys.put(newContentKey1);
		    
		    JSONObject newContentKey2 = new JSONObject();
		    newContentKey2.put("name", "contentKey2");
		    newContentKey2.put("type", "contentType2");
		    newContentKeys.put(newContentKey2);
		    
		    newObject.put("contentKeys", newContentKeys);
		    
		    post(newObject);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
 
	public static String getList(String myURL) {
		System.out.println("Requested URL:" + myURL);
		StringBuilder sb = new StringBuilder();
		URLConnection urlConn = null;
		InputStreamReader in = null;
		try {
			URL url = new URL(myURL);
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
						sb.append((char) cp);
					}
					bufferedReader.close();
				}
			}
		in.close();
		} catch (Exception e) {
			throw new RuntimeException("Exception while calling URL:"+ myURL, e);
		} 
 
		return sb.toString();
	}
	
	public static boolean post(JSONObject writeObject){
		try {
			URL url = new URL(URL);
			URLConnection connection = url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestProperty("Accept", "application/json");
			connection.setRequestProperty("Content-Type", "application/json");
	        

			byte[] jsonBytes = writeObject.toString().getBytes("UTF-8");
			
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.write(jsonBytes);

			BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	        String line;
	        while ((line = rd.readLine()) != null) {
	        	if(line.contains("200")){
	        		wr.close();
	     	        rd.close();
	        		return true;
	        	}
	        }
	        
	        wr.close();
 	        rd.close();
    		return false;
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} 
	}
}
