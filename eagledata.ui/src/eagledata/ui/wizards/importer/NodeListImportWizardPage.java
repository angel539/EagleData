package eagledata.ui.wizards.importer;

import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
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


public class NodeListImportWizardPage extends WizardPage {
	private Composite container;
	private Table table = null;
	
	private String[] randomColumns;
	private List<BasicType[]> types;
	private List<Enumeration> enumerations;
	private String fileName = "";
	
	public NodeListImportWizardPage(String fileName, String pageName, String pageDescription, String[] ramdomColumns, List<BasicType[]> types, List<Enumeration> enumerations) {
		super(pageName);
		setTitle(pageName);
		setDescription(pageDescription);
		setImageDescriptor(Activator.getImageDescriptor("icons/survey.png"));
		
		this.fileName = fileName;
		this.randomColumns = ramdomColumns;
		this.types = types;
		this.enumerations = enumerations;
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
			for(int i = 0; i < randomColumns.length; i++){
				TableItem item = new TableItem(table, SWT.NONE);
				
				TableEditor editor = new TableEditor(table);
				
				Button button = new Button(table, SWT.CHECK);
				button.pack();
				editor.minimumWidth = button.getSize().x;
				editor.horizontalAlignment = SWT.LEFT;
				editor.setEditor(button, item, 0);
				
				if(randomColumns[i] != null){
					item.setText(1, randomColumns[i]);
				}
				else{
					item.setText(1, "");
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

	public EObject getModel() {
		DataModel dataModel = DataDslFactory.eINSTANCE.createDataModel();
		DataDescription description = DataDslFactory.eINSTANCE.createDataDescription();
		description.setName(StringUtils.capitalize(fileName));
		description.setFormat("CSV");
		
		TableItem[] items = table.getItems();
		
		for(int i = 0; i < items.length; i++){
			if(items[i].getText(3).equals("Enumeration")){
				Enumeration enumeration = DataDslFactory.eINSTANCE.createEnumeration();
				Object data = items[i].getData("enum_values");
				
				if(data instanceof List<?>){
					enumeration.getValues().addAll((List<String>) data);
				}
				
				String enum_name = items[i].getText(2);
				CompositeNode compositeNode = DataDslFactory.eINSTANCE.createCompositeNode();
				
				if(enum_name != null && !StringUtils.isEmpty(enum_name)){
					enumeration.setName("Enum" + StringUtils.capitalize(enum_name));
					compositeNode.setName(StringUtils.capitalize(enum_name));
				}
				else{
					enumeration.setName("EnumName" + i);
					compositeNode.setName("NodeName" + i);
				}
				compositeNode.setType(enumeration);
				dataModel.getElements().add(enumeration);
				
				if(items[i].getChecked()){
					compositeNode.setKey(true);
				}
				
				description.getNodes().add(compositeNode);
			}
			else{
				PrimitiveNode primitiveNode = DataDslFactory.eINSTANCE.createPrimitiveNode();
				String type = items[i].getText(3);
				primitiveNode.setType(BasicType.get(type));
				
				if(items[i].getChecked()){
					primitiveNode.setKey(true);
				}	
				
				String type_name = items[i].getText(2);
				
				if(type_name != null && !StringUtils.isEmpty(type_name)){
					primitiveNode.setName(StringUtils.capitalize(type_name));
				}
				else{
					primitiveNode.setName("NodeName" + i);
				}
				
				description.getNodes().add(primitiveNode);	
			}
		}
		
		dataModel.getElements().add(description);
		return dataModel;
	}
}
