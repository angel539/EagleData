package eagledata.core.csv;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.StringUtils;

import eagledata.core.discoverer.FormatDiscoverer;
import eagledata.core.dsl.datadesc.dataDsl.BasicType;
import eagledata.core.dsl.datadesc.dataDsl.Enumeration;

public class CsvFileReader {
	public String fileName = null;
	
	public CsvFileReader(String fileName){
		this.fileName = fileName;
	}
	
	public List<Enumeration> getEnumerations(){
		FileReader fileReader = null;
		CSVParser csvFileParser = null;
        CSVFormat csvFileFormat = CSVFormat.DEFAULT.withAllowMissingColumnNames().withIgnoreEmptyLines().withDelimiter(';');
        
        try {
            fileReader = new FileReader(fileName);
            
            csvFileParser = new CSVParser(fileReader, csvFileFormat);
            List<CSVRecord> records = csvFileParser.getRecords();
            
            int limit = records.get(0).size();
            Map<Integer, List<String>> columns = new HashMap<Integer, List<String>>();
            for(int i = 0; i < limit; i++){
            	List<String> values = new ArrayList<String>();
            	columns.put(i, values);	
            }
            
            for(CSVRecord record : records){
            	for(Entry<Integer, List<String>> entry : columns.entrySet()){
            		entry.getValue().add(record.get(entry.getKey()));
            	}
		 	}
            
            fileReader.close();
            csvFileParser.close();
            
            List<Enumeration> enumerations = new ArrayList<Enumeration>();
            
            FormatDiscoverer discoverer = new FormatDiscoverer();
		 	for(Entry<Integer, List<String>> entry : columns.entrySet()){
		 		enumerations.add(discoverer.discoverEnumerationFor(entry.getValue()));
		 	}

            return enumerations;
        } 
        catch (Exception e) {
            return null;
        }
	}
	public List<BasicType[]> getTypes() {
		FileReader fileReader = null;
		CSVParser csvFileParser = null;
        CSVFormat csvFileFormat = CSVFormat.DEFAULT.withAllowMissingColumnNames().withIgnoreEmptyLines().withDelimiter(';');
        
        try {
            fileReader = new FileReader(fileName);
            
            csvFileParser = new CSVParser(fileReader, csvFileFormat);
            List<CSVRecord> records = csvFileParser.getRecords();
            
            int limit = records.get(0).size();
            Map<Integer, List<String>> columns = new HashMap<Integer, List<String>>();
            for(int i = 0; i < limit; i++){
            	List<String> values = new ArrayList<String>();
            	columns.put(i, values);	
            }
            
            for(CSVRecord record : records){
            	for(Entry<Integer, List<String>> entry : columns.entrySet()){
            		entry.getValue().add(record.get(entry.getKey()));
            	}
		 	}
            
            fileReader.close();
            csvFileParser.close();
            
            List<BasicType[]> types = new ArrayList<BasicType[]>();
            
            FormatDiscoverer discoverer = new FormatDiscoverer();
		 	for(Entry<Integer, List<String>> entry : columns.entrySet()){
		 		types.add(discoverer.discoverFor(entry.getValue()));
		 	}

		 	List<BasicType[]> postProcessedList = completePlace(types);	
            return postProcessedList;
        } 
        catch (Exception e) {
            return null;
        }
	}
	
	private List<BasicType[]> completePlace(List<BasicType[]> dirtyList){
		boolean latitude = false;	
		List<BasicType[]> postProcessed = new ArrayList<BasicType[]>();
		
		for(BasicType[] element : dirtyList){
			BasicType[] copy = element;
			
			if(element != null){
				loop:
				for(BasicType type : element){
					if(type.getLiteral().equals(BasicType.LAT.getLiteral())){
						if(!latitude){
							latitude = true;
						}
						else{
							BasicType[] basicTypes = {BasicType.LONG};
							copy = basicTypes;
							break loop;
						}
					}
				}
			}
			
			postProcessed.add(copy);
		}
		return postProcessed;
	}

	public String[] getRandomRow(){
		FileReader fileReader = null;
		CSVParser csvFileParser = null;
        CSVFormat csvFileFormat = CSVFormat.DEFAULT.withAllowMissingColumnNames().withIgnoreEmptyLines().withDelimiter(';');
        
        try {
            fileReader = new FileReader(fileName);
            csvFileParser = new CSVParser(fileReader, csvFileFormat);
            
            List<CSVRecord> records = csvFileParser.getRecords();
            String[] copyToArrayList = new String[records.get(0).size()]; 
            
            for (int i = 0; i < records.get(0).size(); i++){
            	loop:
            	for(int j = 1; j < records.size(); j++){
            		String newRandomString = records.get(j).get(i);
            		if(newRandomString != null && !StringUtils.isEmpty(newRandomString) && !StringUtils.containsOnly(newRandomString, " ")){
						copyToArrayList[i] = newRandomString;
	    				break loop;
	    			}
            	}
            }
            
            fileReader.close();
            csvFileParser.close();
            
            System.out.println(copyToArrayList.toString());
            return copyToArrayList;
        } 
        catch (Exception e) {
            return null;
        }
	}
	
	 public static void main(String [] args){
		 	CsvFileReader csvFileReader = new CsvFileReader("./csvs/deportes.csv");
		 	System.out.println(csvFileReader.getRandomRow());
	   }
	 
	 
}
