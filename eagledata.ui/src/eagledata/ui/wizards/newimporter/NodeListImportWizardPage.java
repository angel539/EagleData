package eagledata.ui.wizards.newimporter;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import eagledata.ui.Activator;


public class NodeListImportWizardPage extends WizardPage {
	private Composite container;
	private Table tableUI = null;
	private resourceset.Table tableContent = null;
	//private Row randomColumns;
	//private List<BasicType[]> types;
	//private List<Enumeration> enumerations;
	//private String fileName = "";
	
	//private DataModel dataModel = null;
	
	//private String assistant = null;
	
	/*public NodeListImportWizardPage(String fileName, String pageName, String pageDescription, String assistant, Row ramdomColumns, List<BasicType[]> types, List<Enumeration> enumerations) {
		super(pageName);
		setTitle(pageName);
		setDescription(pageDescription);
		setImageDescriptor(Activator.getImageDescriptor("icons/survey.png"));
		
		this.fileName = fileName;
		this.randomColumns = ramdomColumns;
		this.types = types;
		this.enumerations = enumerations;
		this.assistant = assistant;
	}*/

	public NodeListImportWizardPage(String fileName, String pageName, String pageDescription, resourceset.Table content) {
		super(pageName);
		setTitle(pageName);
		setDescription(pageDescription);
		setImageDescriptor(Activator.getImageDescriptor("icons/survey.png"));
		
		this.tableContent = content;
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
	    GridLayout layout = new GridLayout();
	    container.setLayout(layout);
	    layout.numColumns = 1;	    
	    
	    final Tree tree = new Tree(parent, SWT.VIRTUAL | SWT.BORDER);
	    tree.setItemCount(20);
	    tree.addListener(SWT.SetData, new Listener() {
	        public void handleEvent(Event event) {
	            TreeItem item = (TreeItem)event.item;
	            TreeItem parentItem = item.getParentItem();
	            String text = null;
	            if (parentItem == null) {
	                text = "node " + tree.indexOf(item);
	            } else {
	                text = parentItem.getText() + " - " + parentItem.indexOf(item);
	            }
	            item.setText(text);
	            System.out.println(text);
	            item.setItemCount(10);
	        }
	    });
	    
		/*tableUI = new Table(container, SWT.BORDER);
		tableUI.setLinesVisible(true);
		
		TableColumn tc0 = new TableColumn(tableUI, SWT.LEFT);
		tc0.setText("Key?");
		tc0.setWidth(50);
		
		TableColumn tc1 = new TableColumn(tableUI, SWT.LEFT);
		tc1.setText("Example");
		tc1.setWidth(100);
		
		TableColumn tc2 = new TableColumn(tableUI, SWT.LEFT);
		tc2.setText("Name");
		tc2.setWidth(200);
		
		TableColumn tc3 = new TableColumn(tableUI, SWT.LEFT);
		tc3.setText("Type");
		tc3.setWidth(200);
		
		TableColumn tc4 = new TableColumn(tableUI, SWT.LEFT);
		tc4.setWidth(200);
   		
		if(randomColumns != null){
			for(int i = 0; i < randomColumns.getCells().size(); i++){
				TableItem item = new TableItem(tableUI, SWT.NONE);
				
				TableEditor editor = new TableEditor(tableUI);
				
				Button button = new Button(tableUI, SWT.CHECK);
				button.pack();
				editor.minimumWidth = button.getSize().x;
				editor.horizontalAlignment = SWT.LEFT;
				editor.setEditor(button, item, 0);
				
				
				if(randomColumns.getCells().get(i)!=null && randomColumns.getCells().get(i) instanceof ContentCell){
					ContentCell contentCell = (ContentCell) randomColumns.getCells().get(i);
					item.setText(1, contentCell.getContent());
				}
				
				editor = new TableEditor(tableUI);
				Text text = new Text(tableUI, SWT.NONE);
				
				editor.grabHorizontal = true;
				editor.setEditor(text, item, 2);
				
				if(enumerations.get(i) != null){
					item.setText(3, "Enumeration");
					item.setText(4, enumerations.get(i).getValues().toString());
					item.setData("enum_values", enumerations.get(i).getValues());
				}
				else{
					if(types.get(i).length > 1){
						editor = new TableEditor(tableUI);
						CCombo combo = new CCombo(tableUI, SWT.NONE);
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
		
		tableUI.setHeaderVisible(true);*/  
	    
	    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
	    if(tableUI != null) tableUI.setLayoutData(gd);
	    setControl(container);
	    setPageComplete(true);
	}
	
	public Table getTable() {
		return tableUI;
	}

	public void setTable(Table table) {
		this.tableUI = table;
	}

	/*public DataModel getDataModel() {
		return dataModel;
	}

	public void setDataModel(DataModel dataModel) {
		this.dataModel = dataModel;
	}*/
	
	/*public void calculateDataModel() {
		dataModel = DataDslFactory.eINSTANCE.createDataModel();
		//DataDescription description = DataDslFactory.eINSTANCE.createDataDescription();
		//description.setName(StringUtils.capitalize(fileName));
		//description.setFormat("CSV");
		
		String descriptionName = StringUtils.capitalize(fileName);
		DataDescription dataDescription = DataDslModelUtils.createDescription(descriptionName, assistant);
		
		TableItem[] items = tableUI.getItems();
		
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
	}*/
}
