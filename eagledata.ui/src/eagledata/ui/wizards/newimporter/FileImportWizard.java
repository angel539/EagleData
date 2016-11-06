package eagledata.ui.wizards.newimporter;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.apache.commons.io.FilenameUtils;
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
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

import com.google.common.io.Files;
import eagledata.core.extensions.AssistantManager;
import eagledata.core.extensions.IDataResourceAssistant;
import eagledata.core.extensions.description.BasedOnDescriptionAssistant;
import eagledata.core.extensions.description.IBasedOnDescriptionAssistant;
import resourceset.*;

public class FileImportWizard extends Wizard implements IImportWizard {
	private NewFileImportWizardPage newFileImportPage;
	private NodeListImportWizardPage nodeListImportPage;
	private NewDescriptionWizardPage descriptionPage;
	
	private ISelection selection;
	private String path;
	private String fullpathContainer;
	
	private BasedOnDescriptionDataResource dataresource;
	
	//TableFormatDiscoverer tableDiscoverer = new TableFormatDiscoverer();
	
	//los tipos del discoverer deben de ser de los tipos de las data description... y es mejor si se hace mediante map - reduce...
	
	public FileImportWizard() {
		newFileImportPage = new NewFileImportWizardPage("File Import", "Import a based-on CSV, XML or JSON formatted file");
		nodeListImportPage = new NodeListImportWizardPage("", "Types discovering", "Types", null);
		descriptionPage = new NewDescriptionWizardPage(selection, "");
		addPage(newFileImportPage);
		addPage(nodeListImportPage);
		addPage(descriptionPage);
		
		dataresource = ResourcesetFactory.eINSTANCE.createBasedOnDescriptionDataResource();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if(page == newFileImportPage){
			path = newFileImportPage.getFilePath();
			
			dataresource.setPath(path);
			resolveAssistantForExtension(FilenameUtils.getExtension(path));
			Table content = ResourcesetFactory.eINSTANCE.createTable();			
			nodeListImportPage = new NodeListImportWizardPage(Files.getNameWithoutExtension(path), "Types discovering", "Inferring the types for data columns", content);
			addPage(nodeListImportPage);
			
			dataresource.setContent(content);
			//nodeListImportPage = new NodeListImportWizardPage(Files.getNameWithoutExtension(path), "Types discovering", "Inferring the types for data columns", assistantName, recordSample, types, enumerations);
			
			return nodeListImportPage;
		}
		
		if(page == nodeListImportPage){
			//nodeListImportPage.calculateDataModel();
			
			descriptionPage = new NewDescriptionWizardPage(selection, Files.getNameWithoutExtension(path));
			addPage(descriptionPage);
			return descriptionPage;
		}
		
		return null;
	}
	
	private void resolveAssistantForExtension(String extension){
		List<IDataResourceAssistant> assistances = AssistantManager.getInstance().getAssistances();
		
		loop: 
			for(IDataResourceAssistant dataresourceassistant : assistances){
				if(dataresourceassistant instanceof IBasedOnDescriptionAssistant){
					IBasedOnDescriptionAssistant dataassistant = (IBasedOnDescriptionAssistant) dataresourceassistant;
					
					for(String ext : ((BasedOnDescriptionAssistant) dataassistant).getExtensions()){
						if(extension.compareTo(ext) == 0){
							if(dataassistant.load(path)){
								dataresource.setAssistant(((BasedOnDescriptionAssistant) dataassistant).getId());
								dataassistant.load(path);
								//dataassistant.getResources().add(dataresource);
							}
								//
								//String assistant = ((BasedOnDescriptionAssistant) dataassistant).getNameExtension();
								
								
								//recordSample = tableDiscoverer.getRandomRow();
								//types = tableDiscoverer.getTypes();
								//enumerations = tableDiscoverer.getEnumerations();
								
								//BasedOnDescriptionDataResource resource = ResourcesetFactory.eINSTANCE.createBasedOnDescriptionDataResource();
								//resource.setPath(path);
								//resource.setAssistant(((BasedOnDescriptionAssistant) dataassistant).getId());
								//dataresource.setAssistant(assistant);
								//resource.setContent(dataassistant.getContent());
							//}
							break loop;
						}
					}
				}	
			}
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
		
		//saveModel();
		
		return true;
	}
	
	/*private void saveModel() {
		EObject model = nodeListImportPage.getDataModel();		
		
		String xtextFilePath = Files.getNameWithoutExtension(path) + ".datad";
		URI xtextUri = URI.createFileURI(fullpathContainer + "/" + xtextFilePath);
		
		try {
			Activator.saveXtextFile(model, xtextUri);
		} catch (IOException e) {
			MessageDialog.openError(getShell(), "Error", e.getMessage());
		}
	}*/

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
		
		fullpathContainer = folder.getLocationURI().getRawPath();
		monitor.worked(1);

		return true;
	}
}
