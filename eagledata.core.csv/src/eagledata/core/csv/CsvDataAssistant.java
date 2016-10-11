package eagledata.core.csv;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import eagledata.core.extensions.DataAssistant;
import eagledata.core.extensions.IDataAssistant;
import resources.*;

public class CsvDataAssistant extends DataAssistant implements IDataAssistant{
	Table table = null;
	
	public CsvDataAssistant() {
	}

	@Override
	public boolean load(String filePath) {
        CSVFormat csvFileFormat = CSVFormat.DEFAULT.withAllowMissingColumnNames().withIgnoreEmptyLines().withDelimiter(';');
        try {
			FileReader fileReader = new FileReader(filePath);
			CSVParser csvFileParser = new CSVParser(fileReader, csvFileFormat);
			List<CSVRecord> records = csvFileParser.getRecords();
			if(records != null){
				table = ResourcesFactory.eINSTANCE.createTable();
				 
				for(CSVRecord record : records){
					 Row row = ResourcesFactory.eINSTANCE.createRow();
					 
					 Iterator<String> iterator = record.iterator();
					 while(iterator.hasNext()){
						 String cellString = iterator.next();
						 ContentCell cell = ResourcesFactory.eINSTANCE.createContentCell();
						 cell.setContent(cellString);
						 row.getCells().add(cell);
					 }
					 
					 table.getRows().add(row);
				 }
			}
			fileReader.close();
            csvFileParser.close();
            
            return true;
		} catch (FileNotFoundException e) {
			showMessage(e.getMessage());
		} catch (IOException e) {
			showMessage(e.getMessage());
		}
		return false;
	}

	@Override
	public Table getContent() {
		//System.out.println(this.table.eAllContents().toString());
		return this.table;
	}

	@Override
	public void setContent(Table table) {
		this.table = table;
	}
}
