package eagledata.core.extensions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import org.eclipse.jface.dialogs.MessageDialog;

import eagledata.core.dsl.datadesc.dataDsl.BasicType;
import eagledata.core.dsl.datadesc.dataDsl.Enumeration;
import resources.*;

public interface IDataAssistant {
	static List<IDataAssistant> INSTANCES = new ArrayList<IDataAssistant>();
	
	public boolean load(String filePath);
	public void setContent(Table table);
	public Table getContent();
	
	default void showMessage(String message) {
		MessageDialog.openInformation(null, "Error", message);
	}
	
	default Row getRandomRow(){
		Random rnd = new Random();
		int rowPosition = (int)(rnd.nextDouble() * getContent().getRows().size());
		return getContent().getRows().get(rowPosition);
	}
	
	default List<Cell> getColumnContentData(int i){
		List<Cell> columnI = new ArrayList<Cell>();
		
		for(Row row : getContent().getRows()){
			columnI.add(row.getCells().get(i));
		}
		
		return columnI;
	}
	
	default int getWidthTable(){
		List<Row> rows = getContent().getRows();
		final Comparator<Row> comp = (p1, p2) -> Integer.compare( p1.getCells().size(), p2.getCells().size());
		return rows.stream().max(comp).get().getCells().size();
	}
	
	default List<Enumeration> getEnumerations(){        
        try {
            List<Enumeration> enumerations = new ArrayList<Enumeration>();
            TableFormatDiscoverer discoverer = new TableFormatDiscoverer();
            
            int max_size_row = getWidthTable();
            for(int i = 0; i<max_size_row; i++){
            	enumerations.add(discoverer.discoverEnumerationFor(getColumnContentData(i)));
            }

            return enumerations;
        } 
        catch (Exception e) {
            return null;
        }
	}
	
	default List<BasicType[]> getTypes(){        
        try {
            List<BasicType[]> basictypes = new ArrayList<BasicType[]>();
            TableFormatDiscoverer discoverer = new TableFormatDiscoverer();
            
            int max_size_row = getWidthTable();
            for(int i = 0; i<max_size_row; i++){
            	basictypes.add(discoverer.discoverTypesFor(getColumnContentData(i)));
            }

            return basictypes;
        } 
        catch (Exception e) {
            return null;
        }
	}
}
