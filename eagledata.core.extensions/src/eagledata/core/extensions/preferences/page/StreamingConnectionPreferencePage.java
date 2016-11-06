package eagledata.core.extensions.preferences.page;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import eagledata.core.extensions.Activator;

public class StreamingConnectionPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {
	public StreamingConnectionPreferencePage() {
	}

	public StreamingConnectionPreferencePage(String title) {
		super(title);
	}

	public StreamingConnectionPreferencePage(String title, ImageDescriptor image) {
		super(title, image);
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Setting streaming data connections");
	}

	@Override
	protected Control createContents(Composite parent) {
		return null;
	}
}
