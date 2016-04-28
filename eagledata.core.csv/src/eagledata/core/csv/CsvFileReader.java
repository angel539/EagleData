package eagledata.core.csv;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import eagledata.core.discoverer.FormatDiscoverer;
import eagledata.core.discoverer.Type;

public class CsvFileReader {
	public String fileName = null;
	
	public CsvFileReader(String fileName){
		this.fileName = fileName;
	}
	
	public List<Type> getTypes() {
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
            
            List<Type> types = new ArrayList<Type>();
            FormatDiscoverer discoverer = new FormatDiscoverer();
		 	for(Entry<Integer, List<String>> entry : columns.entrySet()){
		 		
		 		types.add(discoverer.discoverFor(entry.getValue()));
		 	}

            return types;
        } 
        catch (Exception e) {
            return null;
        }
	}

	public List<String> getRamdomRecord(){
		FileReader fileReader = null;
		CSVParser csvFileParser = null;
        CSVFormat csvFileFormat = CSVFormat.DEFAULT.withAllowMissingColumnNames().withIgnoreEmptyLines().withDelimiter(';');
        
        try {
            fileReader = new FileReader(fileName);
            
            csvFileParser = new CSVParser(fileReader, csvFileFormat);
            List<CSVRecord> records = csvFileParser.getRecords();
            
            Random rnd = new Random();
            int rndRecord = (int) (rnd.nextDouble() * records.size());
            
            CSVRecord copy = records.get(rndRecord);
            
            fileReader.close();
            csvFileParser.close();
            
            List<String> copyToArrayList = new ArrayList<String>();
            for(int i = 0; i < copy.size(); i++){
            	copyToArrayList.add(copy.get(i));
            }
            
            return copyToArrayList;
        } 
        catch (Exception e) {
            return null;
        }
	}
	
	 public static void main(String [] args){
		 	CsvFileReader csvFileReader = new CsvFileReader("./csvs/deportes.csv");
		 	System.out.println(csvFileReader.getRamdomRecord());
	   }
	 
	 
}
