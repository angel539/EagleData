package eagledata.ui.wizards.importer;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.internal.core.ast.util.Injector;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.xtext.serializer.impl.Serializer;

import com.google.common.io.Files;
import com.google.inject.Guice;
import com.jesusjlopezf.utils.eclipse.emf.EMFUtils;
import com.jesusjlopezf.utils.eclipse.xtext.XtextUtils;
import com.jesusjlopezf.utils.resources.FileUtils;

import eagledata.core.csv.CsvFileReader;
import eagledata.core.dsl.datadesc.DataDslRuntimeModule;
import eagledata.core.dsl.datadesc.dataDsl.BasicType;
import eagledata.core.dsl.datadesc.dataDsl.Enumeration;

public class FileImportWizard extends Wizard implements IImportWizard {
	private NewFileImportWizardPage newFileImportPage;
	private NodeListImportWizardPage nodeListImportPage;
	private NewDescriptionWizardPage descriptionPage;
	
	private ISelection selection;
	private String path;
	
	public FileImportWizard() {
		newFileImportPage = new NewFileImportWizardPage("File Import", "Import a based-on CSV, XML or JSON formatted file");
		nodeListImportPage = new NodeListImportWizardPage("", "Types discovering", "Types", null, null, null);
		descriptionPage = new NewDescriptionWizardPage(selection, "");
		addPage(newFileImportPage);
		addPage(nodeListImportPage);
		addPage(descriptionPage);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if(page == newFileImportPage){
			path =  newFileImportPage.getFilePath();
			
			String[] recordSample = null;
			List<BasicType[]> types = null;
			List<Enumeration> enumerations = null;
			
			if(path.endsWith("csv")){
				CsvFileReader csvFileReader = new CsvFileReader(path);
				recordSample = csvFileReader.getRandomRow();
				types = csvFileReader.getTypes();
				enumerations = csvFileReader.getEnumerations();
			}
			
			nodeListImportPage = new NodeListImportWizardPage(Files.getNameWithoutExtension(path), "Types discovering", "Inferring the types for data columns", recordSample, types, enumerations);
			addPage(nodeListImportPage);
			return nodeListImportPage;
		}
		
		if(page == nodeListImportPage){
			descriptionPage = new NewDescriptionWizardPage(selection, Files.getNameWithoutExtension(path));
			addPage(descriptionPage);
			return descriptionPage;
		}
		
		return null;
	}
	
	@Override
	public boolean performFinish() {
		final String containerName = descriptionPage.getContainerName();
		final String folderName = descriptionPage.getFolderName();
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, folderName, monitor);
				}
				catch (CoreException e) {
					throw new InvocationTargetException(e);
				}
				finally {
					monitor.done();
				}
			}
		};
		
		try {
			getContainer().run(true, false, op);
		}
		catch (InterruptedException e) {
			MessageDialog.openError(getShell(), "Error", e.getMessage());
			return false;
		}
		catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		
		EObject model = nodeListImportPage.getModel();
		
		/*String filePath = containerName + "/" + folderName + "/" + Files.getNameWithoutExtension(path) + ".xmi";
		System.out.println("filepath:: " + filePath);
		File file = new File(filePath);
		try {
			EMFUtils.serialize2File(model, null, file);
		} catch (IOException e) {
			MessageDialog.openError(getShell(), "Error", e.getMessage());
		}*/
		
		DataDslRuntimeModule dataRuntime = new DataDslRuntimeModule();
		try{
			String xtextModel = XtextUtils.serialize(dataRuntime, model);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		//System.out.println(xtextModel);
		
		//com.google.inject.Injector injector = Guice.createInjector(dataRuntime);  
		//Serializer serializer = injector.getInstance(Serializer.class);  
		//String xtextModel = serializer.serialize(model);
		
		//String filePath = containerName + folderName + Files.getNameWithoutExtension(path) + ".datad";
		//System.out.println("filepath:: " + filePath);
		//File file = new File(filePath);
		//FileUtils.writeFile(file, xtextModel);
		
		//String xtextModel = XtextUtils.serialize(new DataDslRuntimeModule(), nodeListImportPage.getModel());
		//System.out.println(s);
		return true;
	}
	
	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "eagledata", IStatus.OK, message, null);
		throw new CoreException(status);
	}
	
	private boolean doFinish(String containerName, String folderName, IProgressMonitor monitor) throws CoreException {
		monitor.beginTask("Creating " + folderName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		
		IContainer container = (IContainer) resource;
		final IFolder folder = container.getFolder(new Path(folderName));
		
		if (folder.exists()) {
			monitor.setCanceled(true);
		}
		else {
			folder.create(true, true, monitor);
		}
		
		monitor.worked(1);
		return true;
	}
}
