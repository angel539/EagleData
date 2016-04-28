package eagledata.ui.wizards.importer;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

import eagledata.core.csv.CsvFileReader;
import eagledata.core.discoverer.Type;

public class FileImportWizard extends Wizard implements IImportWizard {
	NewFileImportWizardPage newFileImportPage;
	NodeListImportWizardPage nodeListImportPage;
	
	public FileImportWizard() {
		newFileImportPage = new NewFileImportWizardPage("File Import", "Import a based-on CSV, XML or JSON formatted file");
		nodeListImportPage = new NodeListImportWizardPage("Types discovering", "Types", null, null);
		addPage(newFileImportPage);
		addPage(nodeListImportPage);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if(page == newFileImportPage){
			String path =  newFileImportPage.getFilePath();
			
			List<String> recordSample = null;
			List<Type> types = null;
			if(path.endsWith("csv")){
				CsvFileReader csvFileReader = new CsvFileReader(path);
				recordSample = csvFileReader.getRamdomRecord();
				types = csvFileReader.getTypes();
			}
			
			nodeListImportPage = new NodeListImportWizardPage("Types discovering", "Types", recordSample, types);
			addPage(nodeListImportPage);
			return nodeListImportPage;
		}
		return null;
	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return true;
	}
	
	/*@Override
	public boolean performFinish() {
		
		return true;
	}*/
}
