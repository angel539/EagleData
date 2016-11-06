package eagledata.ui.views.fragments;

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import eagledata.ui.views.fragments.model.FragmentParent;
import eagledata.ui.views.fragments.model.NodeParent;
import eagledata.ui.views.fragments.model.OptionObject;
import eagledata.ui.Activator;

public class FragmentsViewLabelProvider extends LabelProvider implements IStyledLabelProvider{
	public Image getImage(Object obj) {
		if(obj instanceof IStructuredSelection) obj = ((IStructuredSelection) obj).getFirstElement();
		
		String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
		if(obj instanceof FragmentParent) return Activator.getImageDescriptor("icons/fragment.png").createImage();
		if(obj instanceof NodeParent) return Activator.getImageDescriptor("icons/connection.png").createImage();
		if(obj instanceof OptionObject) return Activator.getImageDescriptor("icons/option.png").createImage();
		
		return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
	}
	
	@Override
	public StyledString getStyledText(Object element) {
		if(element instanceof IStructuredSelection) element = ((IStructuredSelection) element).getFirstElement();

		if (element instanceof FragmentParent) {
			StyledString styledString = new StyledString(((FragmentParent) element).getName());
			return styledString;
		}
		
		if (element instanceof NodeParent) {
			StyledString styledString = new StyledString(((NodeParent) element).getName());
			return styledString;
		}
		
		if (element instanceof OptionObject) {
			StyledString styledString = new StyledString(((OptionObject) element).getName());
			return styledString;
		}
		
		return null;
	}
}
