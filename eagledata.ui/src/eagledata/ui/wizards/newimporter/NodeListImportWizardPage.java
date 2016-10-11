package eagledata.ui.wizards.newimporter;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import eagledata.core.dsl.datadesc.dataDsl.*;
import eagledata.ui.Activator;
import eagledata.ui.DataDslModelUtils;
import resources.*;


public class NodeListImportWizardPage extends WizardPage {
	private Composite container;
	private Table table = null;
	
	private Row randomColumns;
	private List<BasicType[]> types;
	private List<Enumeration> enumerations;
	private String fileName = "";
	
	private DataModel dataModel = null;
	
	private String assistant = null;
	
	public NodeListImportWizardPage(String fileName, String pageName, String pageDescription, String assistant, Row ramdomColumns, List<BasicType[]> types, List<Enumeration> enumerations) {
		super(pageName);
		setTitle(pageName);
		setDescription(pageDescription);
		setImageDescriptor(Activator.getImageDescriptor("icons/survey.png"));
		
		this.fileName = fileName;
		this.randomColumns = ramdomColumns;
		this.types = types;
		this.enumerations = enumerations;
		this.assistant = assistant;
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
	    GridLayout layout = new GridLayout();
	    container.setLayout(layout);
	    layout.numColumns = 1;	    
	    
		table = new Table(container, SWT.BORDER);
		table.setLinesVisible(true);
		
		TableColumn tc0 = new TableColumn(table, SWT.LEFT);
		tc0.setText("Key?");
		tc0.setWidth(50);
		
		TableColumn tc1 = new TableColumn(table, SWT.LEFT);
		tc1.setText("Example");
		tc1.setWidth(100);
		
		TableColumn tc2 = new TableColumn(table, SWT.LEFT);
		tc2.setText("Name");
		tc2.setWidth(200);
		
		TableColumn tc3 = new TableColumn(table, SWT.LEFT);
		tc3.setText("Type");
		tc3.setWidth(200);
		
		TableColumn tc4 = new TableColumn(table, SWT.LEFT);
		tc4.setWidth(200);
   		
		if(randomColumns != null){
			for(int i = 0; i < randomColumns.getCells().size(); i++){
				TableItem item = new TableItem(table, SWT.NONE);
				
				TableEditor editor = new TableEditor(table);
				
				Button button = new Button(table, SWT.CHECK);
				button.pack();
				editor.minimumWidth = button.getSize().x;
				editor.horizontalAlignment = SWT.LEFT;
				editor.setEditor(button, item, 0);
				
				
				if(randomColumns.getCells().get(i)!=null && randomColumns.getCells().get(i) instanceof ContentCell){
					ContentCell contentCell = (ContentCell) randomColumns.getCells().get(i);
					item.setText(1, contentCell.getContent());
				}
				
				editor = new TableEditor(table);
				Text text = new Text(table, SWT.NONE);
				
				editor.grabHorizontal = true;
				editor.setEditor(text, item, 2);
				
				if(enumerations.get(i) != null){
					item.setText(3, "Enumeration");
					item.setText(4, enumerations.get(i).getValues().toString());
					item.setData("enum_values", enumerations.get(i).getValues());
				}
				else{
					if(types.get(i).length > 1){
						editor = new TableEditor(table);
						CCombo combo = new CCombo(table, SWT.NONE);
						combo.setText(types.get(i)[0].getLiteral());
						
						if(types.get(i).length > 1){
							for(int j = 1; j<types.get(i).length; j++){
								combo.add(types.get(i)[j].getLiteral());
							}	
						}
						
						editor.grabHorizontal = true;
						editor.setEditor(combo, item, 3);		
					}
					else{
						item.setText(3, types.get(i)[0].getLiteral());
					}	
				}
				
			}
		}
		
		table.setHeaderVisible(true);  
	    
	    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
	    if(table != null) table.setLayoutData(gd);
	    setControl(container);
	    setPageComplete(true);
	}
	
	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public DataModel getDataModel() {
		return dataModel;
	}

	public void setDataModel(DataModel dataModel) {
		this.dataModel = dataModel;
	}
	
	public void calculateDataModel() {
		dataModel = DataDslFactory.eINSTANCE.createDataModel();
		//DataDescription description = DataDslFactory.eINSTANCE.createDataDescription();
		//description.setName(StringUtils.capitalize(fileName));
		//description.setFormat("CSV");
		
		String descriptionName = StringUtils.capitalize(fileName);
		DataDescription dataDescription = DataDslModelUtils.createDescription(descriptionName, assistant);
		
		TableItem[] items = table.getItems();
		
		for(int i = 0; i < items.length; i++){
			String name = items[i].getText(2);
			
			if(name == null || StringUtils.isEmpty(name)){
				name = "NodeName" + i;
			}
			
			boolean key = items[i].getChecked();
			boolean unique = items[i].getChecked();
			
			switch(items[i].getText(3)){
				case "Enumeration":
					Object values = items[i].getData("enum_values");
					List<String> parsedValues = null;
					
					if (values instanceof List<?>){
						parsedValues = (List) values;
					}
					
					Enumeration enumeration = DataDslModelUtils.createEnumeration(name, parsedValues);
					CompositeNode compositeNode = DataDslModelUtils.createCompositeNode(name, key, unique, enumeration, null);
					dataDescription.getNodes().add(compositeNode);
					dataModel.getElements().add(enumeration);
				break;
				
				default:
					String type = items[i].getText(3);
					
					PrimitiveNode primitiveNode = DataDslModelUtils.createPrimitiveNode(name, key, unique, type, null);
					dataDescription.getNodes().add(primitiveNode);
					break;
			}
		}
		
		dataModel.getElements().add(dataDescription);
	}
}
