package eagledata.ui.wizards.newimporter;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

import com.google.common.io.Files;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.jesusjlopezf.utils.eclipse.emf.EMFUtils;
import com.jesusjlopezf.utils.eclipse.xtext.XtextUtils;

import eagledata.core.dsl.datadesc.DataDslRuntimeModule;
import eagledata.core.dsl.datadesc.DataDslStandaloneSetup;
import eagledata.core.dsl.datadesc.dataDsl.BasicType;
import eagledata.core.dsl.datadesc.dataDsl.DataDslPackage;
import eagledata.core.dsl.datadesc.dataDsl.Enumeration;
import eagledata.core.dsl.datadesc.validation.DataDslValidator;
import eagledata.core.dsl.rule.RuleDslRuntimeModule;
import eagledata.core.extensions.DataAssistant;
import eagledata.core.extensions.DataAssistantConnectionFactory;
import eagledata.core.extensions.IDataAssistant;
import eagledata.ui.Activator;
import resources.DataResource;
import resources.ResourcesFactory;
import resources.Row;

import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.serializer.impl.Serializer;

public class FileImportWizard extends Wizard implements IImportWizard {
	private NewFileImportWizardPage newFileImportPage;
	private NodeListImportWizardPage nodeListImportPage;
	private NewDescriptionWizardPage descriptionPage;
	
	private ISelection selection;
	private String path;
	private String fullpathContainer;
	
	public FileImportWizard() {
		newFileImportPage = new NewFileImportWizardPage("File Import", "Import a based-on CSV, XML or JSON formatted file");
		nodeListImportPage = new NodeListImportWizardPage("", "Types discovering", "Types", null, null, null, null);
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
			path = newFileImportPage.getFilePath();
			String extensionFile = FilenameUtils.getExtension(path);
			
			String assistantName = null;
			Row recordSample = null;
			List<BasicType[]> types = null;
			List<Enumeration> enumerations = null;
			
			List<IDataAssistant> assistances = DataAssistantConnectionFactory.getInstance().getConnections();
			
			loop: 
				for(IDataAssistant assistant : assistances){
					for(String ext : ((DataAssistant) assistant).getExtensions()){
						if(extensionFile.compareTo(ext) == 0){
							if(assistant.load(path)){
								assistantName = ((DataAssistant) assistant).getNameExtension();
								
								recordSample = assistant.getRandomRow();
								types = assistant.getTypes();
								enumerations = assistant.getEnumerations();
								DataResource resource = ResourcesFactory.eINSTANCE.createDataResource();
								resource.setPath(path);
								resource.setAssistant(((DataAssistant) assistant).getId());
								resource.setContent(assistant.getContent());
							}
							break loop;
						}
					}
				}
			
			nodeListImportPage = new NodeListImportWizardPage(Files.getNameWithoutExtension(path), "Types discovering", "Inferring the types for data columns", assistantName, recordSample, types, enumerations);
			addPage(nodeListImportPage);
			return nodeListImportPage;
		}
		
		if(page == nodeListImportPage){
			nodeListImportPage.calculateDataModel();
			
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
		
		saveModel();
		
		return true;
	}
	
	private void saveModel() {
		EObject model = nodeListImportPage.getDataModel();		
		
		String xtextFilePath = Files.getNameWithoutExtension(path) + ".datad";
		URI xtextUri = URI.createFileURI(fullpathContainer + "/" + xtextFilePath);
		
		try {
			Activator.saveXtextFile(model, xtextUri);
		} catch (IOException e) {
			MessageDialog.openError(getShell(), "Error", e.getMessage());
		}
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
		
		fullpathContainer = folder.getLocationURI().getRawPath();
		monitor.worked(1);

		return true;
	}
}
