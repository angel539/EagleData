package eagledata.ui;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import com.google.inject.Injector;
import com.jesusjlopezf.utils.resources.FileUtils;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "eagledata.ui"; //$NON-NLS-1$
	public static final String EXTENSIONS_ID = "eagledata.ui.actions";
	public static final String FILTER_EXTENSIONS_ID = "eagledata.ui.views.filters";
	public static final String EDITOR_EXTENSIONS_ID = "eagledata.ui.drop";
	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	
	public static ImageDescriptor getImageDescriptor(String pluginID, String path){
		if(pluginID != null && path != null){
			Bundle bundle = Platform.getBundle(pluginID);
			if(bundle == null) return null;
			
			IPath ipath  = new Path(path);
			URL url = FileLocator.find(bundle, ipath, null);
			ImageDescriptor descriptor = ImageDescriptor.createFromURL(url);
			return descriptor;
		}
		
		return null;
	}
	
	public static EObject loadXtextFile(File file, ISetup standaloneSetup, String extension) throws IOException{
		String textShell = FileUtils.readFile(file.getAbsolutePath().toString());		
		Injector injector = standaloneSetup.createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI.createURI("dummy:/example." + extension));
		InputStream in = new ByteArrayInputStream(textShell.getBytes());
		resource.load(in, resourceSet.getLoadOptions());
		return resource.getContents().get(0);
	}
}
