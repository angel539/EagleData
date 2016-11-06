package eagledata.core.csv;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.google.common.collect.Lists;

import eagledata.core.dsl.datadesc.dataDsl.Node;
import eagledata.core.dsl.datadesc.dataDsl.PrimitiveNode;
import eagledata.core.extensions.description.BasedOnDescriptionAssistant;
import eagledata.core.extensions.description.IBasedOnDescriptionAssistant;
import resourceset.*;

public class CsvDataAssistant extends BasedOnDescriptionAssistant implements IBasedOnDescriptionAssistant{
	BasedOnDescriptionDataResource resource = null;

	public CsvDataAssistant() {
		super();
	}

	@Override
	public boolean load(String filePath) {
        CSVFormat csvFileFormat = CSVFormat.DEFAULT.withAllowMissingColumnNames().withIgnoreEmptyLines().withDelimiter(';');
        try {
			FileReader fileReader = new FileReader(filePath);
			CSVParser csvFileParser = new CSVParser(fileReader, csvFileFormat);
			List<CSVRecord> records = csvFileParser.getRecords();
			if(records != null){
				Table tableContent = ResourcesetFactory.eINSTANCE.createTable();
				
				CSVRecord recordInit = records.get(0);
				Iterator<String> iterator = recordInit.iterator();
				while(iterator.hasNext()){
					String column = iterator.next();
					PrimitiveColumn primitiveColumn = ResourcesetFactory.eINSTANCE.createPrimitiveColumn();
					
					loop:
					for(Node node : resource.getDescription().getNodes()){
						if(node instanceof PrimitiveNode){
							if(node.getName().compareToIgnoreCase(column) == 0){
								primitiveColumn.setMetadata((PrimitiveNode) node);
								break loop;
							}
						}
					}
					tableContent.getColumns().add(primitiveColumn);
				}
				
				for(int i=1; i < records.size(); i++){
					CSVRecord recordValue = records.get(i);
					Iterator<String> iteratorValue = recordValue.iterator();
					List<String> listValue = Lists.newArrayList(iteratorValue);
					
					for(int j = 0; j < listValue.size(); j++){
						if(tableContent.getColumns().get(j) instanceof PrimitiveColumn){
							PrimitiveColumn pColumn = (PrimitiveColumn) tableContent.getColumns().get(j);
							pColumn.getValues().add(listValue.get(j));
						}
					}
				}
				
				resource.setContent(tableContent);
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
	public BasedOnDescriptionDataResource getResource() {
		return resource;
	}

	@Override
	public void setResource(BasedOnDescriptionDataResource resource) {
		System.out.println("setting resource...");
			this.resource = resource;	
	}
}
