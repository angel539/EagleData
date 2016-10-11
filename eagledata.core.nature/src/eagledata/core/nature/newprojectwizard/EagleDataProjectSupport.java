package eagledata.core.nature.newprojectwizard;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import eagledata.core.nature.EagleDataProjectNature;
 
public class EagleDataProjectSupport {
	
    public static IProject createProject(String projectName, java.net.URI location) { 
        IProject project = createBaseProject(projectName, location);
        try {
            addNature(project);
 
            String[] pathsDataset = {"dataset"}; //$NON-NLS-1$ //$NON-NLS-2$
            addToProjectStructure(project, pathsDataset, 0);
            
            String[] pathDescriptions = {"descriptions"}; //$NON-NLS-1$ //$NON-NLS-2$
            addToProjectStructure(project, pathDescriptions, 1);
            
            String[] pathWorkflow = {"workflow"}; //$NON-NLS-1$ //$NON-NLS-2$
            addToProjectStructure(project, pathWorkflow, 2);
        } catch (CoreException e) {
            e.printStackTrace();
            project = null;
        }
 
        return project;
    }
 
    /**
     * Just do the basics: create a basic project.
     *
     * @param location
     * @param projectName
     */
    private static IProject createBaseProject(String projectName, java.net.URI location) {
        IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
 
        if (!newProject.exists()) {
            java.net.URI projectLocation = location;
            IProjectDescription desc = newProject.getWorkspace().newProjectDescription(newProject.getName());
            if (location != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location)) {
                projectLocation = null;
            }
 
            desc.setLocationURI(projectLocation);
            try {
                newProject.create(desc, null);
                if (!newProject.isOpen()) {
                    newProject.open(null);
                }
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
 
        return newProject;
    }
 
    private static void createFolder(IFolder folder) throws CoreException {
        IContainer parent = folder.getParent();
        if (parent instanceof IFolder) {
            createFolder((IFolder) parent);
        }
        if (!folder.exists()) {
            folder.create(false, true, null);
        }
    }

    
    /*private static void createEmptyDescriptionModel(IFolder container) {
		EObject model = DataDslFactory.eINSTANCE.createDataModel();
		
		DataDescription description = DataDslFactory.eINSTANCE.createDataDescription();
		description.setName("Sample");
		description.setFormat("CSV");
		
		PrimitiveNode primitiveNode = DataDslFactory.eINSTANCE.createPrimitiveNode();
		primitiveNode.setType(BasicType.STRING);
		primitiveNode.setName("samplenode");
		
		
		
		String xtextFilePath = "newFile.datad";
		String fullpathContainer = container.getLocationURI().getRawPath();
		
		URI xtextUri = URI.createFileURI(fullpathContainer + "/" + xtextFilePath);
		
		try {
			Activator.saveXtextFile(model, xtextUri);
		} catch (IOException e) {
			MessageDialog.openError(null, "Error", e.getMessage());
		}
	}
    
    private static void createEmptyRuleModel(IFolder container) {
		EObject model = RuleDslFactory.eINSTANCE.createRuleModel();		
		
		String xtextFilePath = "newFile.rd";
		String fullpathContainer = container.getLocationURI().getRawPath();
		
		URI xtextUri = URI.createFileURI(fullpathContainer + "/" + xtextFilePath);
		
		try {
			Activator.saveXtextFile(model, xtextUri);
		} catch (IOException e) {
			MessageDialog.openError(null, "Error", e.getMessage());
		}
	}
    
    private static void createEmptyStreamingModel(IFolder container) {
		EObject model = StreamingDslFactory.eINSTANCE.createStreamingModel();		
		
		String xtextFilePath = "newFile.streamd";
		String fullpathContainer = container.getLocationURI().getRawPath();
		
		URI xtextUri = URI.createFileURI(fullpathContainer + "/" + xtextFilePath);
		
		try {
			Activator.saveXtextFile(model, xtextUri);
		} catch (IOException e) {
			MessageDialog.openError(null, "Error", e.getMessage());
		}
	}*/
 
    /**
     * Create a folder structure with a parent root, overlay, and a few child
     * folders.
     *
     * @param newProject
     * @param paths
     * @throws CoreException
     */
    private static void addToProjectStructure(IProject newProject, String[] paths, int type) throws CoreException {
        for (String path : paths) {
            IFolder etcFolders = newProject.getFolder(path);
            createFolder(etcFolders);
            
            /*switch (type) {
				case 0:
					break;
				case 1:
					createEmptyDescriptionModel(etcFolders);
					break;
				case 2:
					createEmptyRuleModel(etcFolders);
					createEmptyStreamingModel(etcFolders);
				default:
					break;
			}*/
            
        }
    }
 
    private static void addNature(IProject project) throws CoreException {
        if (!project.hasNature(EagleDataProjectNature.NATURE_ID)) {
            IProjectDescription description = project.getDescription();
            String[] prevNatures = description.getNatureIds();
            String[] newNatures = new String[prevNatures.length + 1];
            System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
            newNatures[prevNatures.length] = EagleDataProjectNature.NATURE_ID;
            description.setNatureIds(newNatures);
 
            IProgressMonitor monitor = null;
            project.setDescription(description, monitor);
        }
    }
 
}
