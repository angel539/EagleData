package uam.eagledata.ui.views.eventset;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import uam.eagledata.ui.views.*;
import ecarules.*;

public class TreeViewAdapterFactoryLabelProvider extends AdapterFactoryLabelProvider implements IStyledLabelProvider, IFontProvider{
	public TreeViewAdapterFactoryLabelProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	public Image getImage(Object obj) {
		if(obj instanceof IStructuredSelection) obj = ((IStructuredSelection) obj).getFirstElement();
		
		String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
		
		if(obj instanceof Event) return Activator.getImageDescriptor("icons/bolt.png").createImage();
    	
		return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
	}
	
	@Override
	public StyledString getStyledText(Object element) {
		if(element instanceof IStructuredSelection) element = ((IStructuredSelection) element).getFirstElement();
		
		if (element instanceof Event) {
			Event event = (Event) element;
			StyledString styledString = new StyledString(event.getName());
			return styledString;
		}
		
		return null;
	}
	
	@Override
	public Font getFont(Object object) {
		/*if (object instanceof Event) {
			Event semanticNode = (Event) object;
			
			if(semanticNode.isAbstract()){
				return JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT);
			}
		}*/
		return super.getFont(object);
	}
}
