package eagledata.core.nature.newprojectwizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;

import eagledata.core.nature.EagleDataProjectNature;
 
public class EagleDataProjectSupport {
    public static IJavaProject createProject(String projectName, java.net.URI location) { 
    	IJavaProject project = createBaseProject(projectName, location);
        try {
            addNature(project.getProject());
            
            String[] pathsDataset = {"dataset", "workflow"};
            addToProjectStructure(project.getProject(), pathsDataset);
            
            
            IFolder binFolder = project.getProject().getFolder("bin");
            binFolder.create(false, true, null);
            project.setOutputLocation(binFolder.getFullPath(), null);
            
            List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
            IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
            LibraryLocation[] locations = JavaRuntime.getLibraryLocations(vmInstall);
            for (LibraryLocation element : locations) {
            	entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
            }
            project.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);
            
            IFolder sourceFolder = project.getProject().getFolder("src");
            sourceFolder.create(false, true, null);
            
            IPackageFragmentRoot root = project.getPackageFragmentRoot(sourceFolder);
            IClasspathEntry[] oldEntries = project.getRawClasspath();
            IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
            System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
            newEntries[oldEntries.length] = JavaCore.newSourceEntry(root.getPath());
            project.setRawClasspath(newEntries, null);
            
            //IPackageFragment pack = 
            project.getPackageFragmentRoot(sourceFolder).createPackageFragment(projectName, false, null);
            
            /*
            
            StringBuffer buffer = new StringBuffer();
			buffer.append("package " + pack.getElementName() + ";\n");
			buffer.append("\n");
			buffer.append(source);
			
			ICompilationUnit cu = pack.createCompilationUnit(className, buffer.toString(), false, null);
            
            */
        }
        catch (CoreException e) {
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
    private static IJavaProject createBaseProject(String projectName, java.net.URI location) {
    	IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
    	IJavaProject javaProject = JavaCore.create(newProject); 
    	
    	if (!javaProject.exists()) {
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
 
        return javaProject;
    	
    	/*IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
 
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
 
        return newProject;*/
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
 
    /**
     * Create a folder structure with a parent root, overlay, and a few child
     * folders.
     *
     * @param newProject
     * @param paths
     * @throws CoreException
     */
    private static void addToProjectStructure(IProject newProject, String[] paths) throws CoreException {
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
            
            String[] newNatures = new String[prevNatures.length + 2];
            
            System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
            
            newNatures[prevNatures.length] = EagleDataProjectNature.NATURE_ID;
            newNatures[prevNatures.length + 1] = JavaCore.NATURE_ID;
            description.setNatureIds(newNatures);
 
            IProgressMonitor monitor = null;
            project.setDescription(description, monitor);
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
}
