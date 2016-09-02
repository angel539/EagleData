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
import eagledata.core.dsl.datadesc.dataDsl.CompositeNode;
import eagledata.core.dsl.datadesc.dataDsl.Fragment;
import eagledata.core.dsl.datadesc.dataDsl.IntOption;
import eagledata.core.dsl.datadesc.dataDsl.Option;
import eagledata.core.dsl.datadesc.dataDsl.PrimitiveNode;
import eagledata.core.dsl.datadesc.dataDsl.StringOption;
import eagledata.core.dsl.datadesc.dataDsl.Tag;
import eagledata.core.dsl.datadesc.dataDsl.Node;

public class JsonFragment{
	static String URL = "http://diagrameditorserver.herokuapp.com/fragments?json=true";
	
	public static JSONObject fragment2json(Fragment fragment, List<Tag> tags){
		JSONObject newObject = new JSONObject();
		String name = fragment.getName();
	    newObject.put("name", name);
	    
	    String content = fragment.toString();
	    newObject.put("content", content);
	    
	    if(tags != null){
	    	JSONArray newDomains = new JSONArray();
	    	for(Tag tag : tags){
	    		newDomains.put(tag.getTag());
	    	}
		    newObject.put("domains", newDomains);
	    }
	    
	    JSONArray newExtends = new JSONArray();
	    List<Fragment> extensions = fragment.getFragments();
	    for(Fragment extension : extensions){
	    	newExtends.put(extension.getName());
	    }
	    newObject.put("extends", newExtends);
	    
	    JSONArray newContentKeys = new JSONArray();
	    List<Node> nodes = fragment.getNodes();
	    
	    for(Node node : nodes){
	    	JSONObject newContentNode = new JSONObject();
   		 	newContentNode.put("name", node.getName());
   		 	
	    	if(node instanceof PrimitiveNode){
	    		PrimitiveNode primitiveNode = (PrimitiveNode) node;
	    		if(primitiveNode != null){
	    			newContentNode.put("type", ((PrimitiveNode) node).getType().getLiteral());
	    		}
	    	}
	    	
	    	if(node instanceof CompositeNode){
	    		CompositeNode compositeNode = (CompositeNode) node;
	    		if(compositeNode != null){
	    			newContentNode.put("type", compositeNode.getName());
	    		}
	    	}
	    	
	    	String optionString = new String();
    		for(Option option : node.getOptions()){
    			if(option instanceof StringOption){
    				String nameOption = ((StringOption) option).getKey().getLiteral();
    				String valueOption = ((StringOption) option).getValue();
    				
    				newContentNode.put("name", ((StringOption) option).getKey().getLiteral());
    				newContentNode.put("type", ((StringOption) option).getValue());
    				optionString = optionString + nameOption + ";" + valueOption + ";";
    			}
		    	
		    	if(option instanceof IntOption){
		    		String nameOption = ((IntOption) option).getKey().getLiteral();
	    			String valueOption = Integer.toString(((IntOption) option).getValue());
	    			
		    		newContentNode.put("name", ((IntOption) option).getKey().getLiteral());
			    	newContentNode.put("type", ((IntOption) option).getValue());
			    	optionString = optionString + nameOption + ";" + valueOption + ";";
		    	}
		    	
		    	if(option instanceof BooleanOption){
		    		String nameOption = ((BooleanOption) option).getKey().getLiteral();
	    			String valueOption = ((BooleanOption) option).getValue();
	    			
		    		newContentNode.put("name", ((BooleanOption) option).getKey().getLiteral());
			    	newContentNode.put("type", ((BooleanOption) option).getValue());
			    	optionString = optionString + nameOption + ";" + valueOption + ";";
		    	}
		    }
    		
    		newContentNode.put("options", optionString);
    		newContentKeys.put(newContentNode);
	    }
	    
	    newObject.put("contentKeys", newContentKeys);
	    return newObject;
	}
	
	
	public static List<JSONObject> getFragments(){
		List<JSONObject> fragments = new ArrayList<JSONObject>();
		
		String jsonString = getList(URL);
		try {  
			JSONObject json = new JSONObject(jsonString);
		    JSONArray array = (JSONArray)json.get("array");
		    
		    for(int i=0; i< array.length(); i++){
		    	JSONObject object = array.getJSONObject(i);
		    	fragments.add(object);
		    	
		    }
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return fragments;
	}
 
	private static String getList(String myURL) {
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
		String log = "";
		try {
			URL url = new URL(URL);
			URLConnection connection = url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestProperty("Accept", "application/json");
			connection.setRequestProperty("Content-Type", "application/json");
			//connection.ssetRequestProperty(key, value);
			
			byte[] jsonBytes = writeObject.toString().getBytes("UTF-8");
			
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.write(jsonBytes);
			
	        BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	        String line;
	        
	        while ((line = rd.readLine()) != null) {
	        	log += line;
	        }
	        wr.close();
 	        rd.close();
 	        return true;
		} catch (MalformedURLException e) {
			log += e.getMessage();
			return false;
		} catch (IOException e) {
			log += e.getMessage();
			return false;
		} 
	}
}

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



