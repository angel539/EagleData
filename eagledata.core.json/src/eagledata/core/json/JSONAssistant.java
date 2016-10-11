package eagledata.core.json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

import eagledata.core.extensions.DataAssistant;
import eagledata.core.extensions.IDataAssistant;
import resources.*;

public class JSONAssistant extends DataAssistant implements IDataAssistant {
	private Table table = null;
	private JSONObject jsonAllContent = null;
	
	public JSONAssistant() {
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
			table = ResourcesFactory.eINSTANCE.createTable();
			Row row = ResourcesFactory.eINSTANCE.createRow();
			Iterator<String> iterator = jsonAllContent.keys();
			while(iterator.hasNext()){
				String key = iterator.next();
				Object jsonElement  = jsonAllContent.get(key);
				
				if(jsonElement instanceof JSONArray){
					Cell tableCell = jsonArray2TableCell((JSONArray) jsonElement);
					row.getCells().add(tableCell);
				}
				if(jsonElement instanceof String){
					ContentCell contentCell = jsonString2ContentCell((String) jsonElement);
					row.getCells().add(contentCell);
				}
			}
			
			table.getRows().add(row);
		}
		
		return true;
	}

	private Row jsonObject2Row(JSONObject jsonObject){
		Row row = ResourcesFactory.eINSTANCE.createRow();
		
		Iterator<String> iterator = jsonObject.keys();
		while(iterator.hasNext()){
			String key = iterator.next();
			Object jsonElement = jsonObject.get(key);
			
			if(jsonElement instanceof JSONArray){
				TableCell tableCell = jsonArray2TableCell((JSONArray) jsonElement);
				row.getCells().add(tableCell);
			}
			if(jsonElement instanceof String){
				ContentCell contentCell = jsonString2ContentCell((String) jsonElement);
				row.getCells().add(contentCell);
			}
		}
		
		return row;
	}
	
	private TableCell jsonArray2TableCell(JSONArray jsonArray){
		TableCell tableCell = ResourcesFactory.eINSTANCE.createTableCell();	
		Table subTable = ResourcesFactory.eINSTANCE.createTable();
		
		Iterator<Object> iterator = jsonArray.iterator();
		while(iterator.hasNext()){
			Object object = iterator.next();
			
			if(object instanceof JSONObject){
		    	Row row = jsonObject2Row((JSONObject) object);
				subTable.getRows().add(row); 
			}
		}
		
		tableCell.setTable(subTable);
		return tableCell;
	}
	
	private ContentCell jsonString2ContentCell(String jsonString){
		ContentCell contentCell = ResourcesFactory.eINSTANCE.createContentCell();
		contentCell.setContent(jsonString);
		return contentCell;
	}

	@Override
	public Table getContent() {
		return this.table;
	}
	
	@Override
	public void setContent(Table table) {
		this.table = table;
	}
}
