package eagledata.ui.wizards.importer;

import java.util.List;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import eagledata.core.discoverer.Type;
import eagledata.ui.Activator;


public class NodeListImportWizardPage extends WizardPage {
	private Composite container;
	private Table table = null;
	
	private List<String> randomColumns;
	private List<Type> types;
	
	public NodeListImportWizardPage(String pageName, String pageDescription, List<String> ramdomColumns, List<Type> types) {
		super(pageName);
		setTitle(pageName);
		setDescription(pageDescription);
		setImageDescriptor(Activator.getImageDescriptor("icons/survey.png"));
		
		this.randomColumns = ramdomColumns;
		this.types = types;
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
	    GridLayout layout = new GridLayout();
	    container.setLayout(layout);
	    layout.numColumns = 1;	    
	    
		table = new Table(container, SWT.BORDER);
		
		TableColumn tc1 = new TableColumn(table, SWT.LEFT);
		tc1.setText("Name");
		tc1.setWidth(100);
		
		TableColumn tc2 = new TableColumn(table, SWT.LEFT);
		tc2.setText("Type");
		tc2.setWidth(200);
   
		if(randomColumns != null){
			for(int i = 0; i < randomColumns.size(); i++){
				TableItem item = new TableItem(table, SWT.NONE);
				//item.setData(repository);
				item.setText(new String[]{randomColumns.get(i), types.get(i).toString()});
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
}
