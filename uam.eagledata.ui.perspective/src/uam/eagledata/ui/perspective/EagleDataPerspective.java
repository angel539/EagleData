package uam.eagledata.ui.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class EagleDataPerspective implements IPerspectiveFactory {
	@Override
	public void createInitialLayout(IPageLayout layout) {
		defineActions(layout);
		defineLayout(layout);
	}

	private void defineActions(IPageLayout layout) {
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");
		
		layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
		layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
	}
	
	private void defineLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		
		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, (float) 0.15, editorArea);
		left.addView(IPageLayout.ID_PROJECT_EXPLORER);
		
		IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, (float) 0.70, editorArea);
		bottom.addView(IPageLayout.ID_PROP_SHEET);
	}	
}
