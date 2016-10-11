package eagledata.core.nature;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

import eagledata.core.dsl.rule.RuleDslRuntimeModule;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "eagledata.core.nature"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	
	private static Injector injector = 
			Guice.createInjector(new RuleDslRuntimeModule());
	private static XtextResourceSet resourceSet = 
			injector.getInstance(XtextResourceSet.class);
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

	public static void saveXtextFile(EObject model, URI xtextUri) throws IOException{
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(model);
		int severity = diagnostic.getSeverity();
		
		if(severity ==  Diagnostic.OK){
			Resource resource = resourceSet.createResource(xtextUri);
			resource.getContents().add(model);
			
			try {			    
				Map<Object, Object> options = SaveOptions.newBuilder().format().getOptions().toOptionsMap();
				resource.save(options);
			} catch (IOException e) {}
		}
	}
}
