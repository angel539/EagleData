package eagledata.core.extensions.description;

import org.eclipse.jface.dialogs.MessageDialog;

import eagledata.core.extensions.IDataResourceAssistant;
import resourceset.*;

public interface IBasedOnDescriptionAssistant extends IDataResourceAssistant{
	public boolean load(String filePath);
	
	BasedOnDescriptionDataResource getResource();
	void setResource(BasedOnDescriptionDataResource resource);
	
	default void showMessage(String message) {
		MessageDialog.openInformation(null, "Error", message);
	}
}
