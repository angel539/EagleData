package eagledata.ui.views.streaming;

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
import eagledata.ui.views.streaming.model.StreamingParent;
import eagledata.ui.Activator;

public class StreamingViewLabelProvider extends LabelProvider implements IStyledLabelProvider{
	public Image getImage(Object obj) {
		if(obj instanceof IStructuredSelection) obj = ((IStructuredSelection) obj).getFirstElement();
		
		String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
		//if(obj instanceof SearchParent) return Activator.getImageDescriptor("icons/searchm_obj.gif").createImage();
		//if(obj instanceof SearchParent) return Activator.getImageDescriptor("icons/stepbystep_co.gif").createImage();
		//if(obj instanceof PropertyParent) return Activator.getImageDescriptor("icons/method.png").createImage();
		if(obj instanceof StreamingParent) return Activator.getImageDescriptor("icons/twitter.png").createImage();
		//if(obj instanceof NodeParent) return Activator.getImageDescriptor("icons/connection.png").createImage();
		//if(obj instanceof OptionObject) return Activator.getImageDescriptor("icons/option.png").createImage();
		//if(obj instanceof EntityParentGroup) return Activator.getImageDescriptor("icons/class_set.gif").createImage();
		//if(obj instanceof FolderParent) return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);
		//if(obj instanceof AttrFolderParent) return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);
		//if(obj instanceof DataPropertyObject) return Activator.getImageDescriptor("icons/attribute.png").createImage();
		
		return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
	}
	
	@Override
	public StyledString getStyledText(Object element) {
		if(element instanceof IStructuredSelection) element = ((IStructuredSelection) element).getFirstElement();

		if (element instanceof StreamingParent) {
			StyledString styledString = new StyledString(((StreamingParent) element).getName());
			return styledString;
		}
		
		/*if (element instanceof NodeParent) {
			StyledString styledString = new StyledString(((NodeParent) element).getName());
			return styledString;
		}
		
		if (element instanceof OptionObject) {
			StyledString styledString = new StyledString(((OptionObject) element).getName());
			return styledString;
		}*/
		
		//System.out.println("??" + element.getClass());
		/*if (element instanceof FolderParent) {
			FolderParent repositoryNode = (FolderParent) element;
			StyledString styledString = new StyledString(repositoryNode.getName());
			
			if (repositoryNode.getChildren() != null) {
				styledString.append(" (" + repositoryNode.getChildren().length + ") ", StyledString.COUNTER_STYLER);
			}
			return styledString;
		}
		
		if (element instanceof AttrFolderParent) {
			AttrFolderParent repositoryNode = (AttrFolderParent) element;
			StyledString styledString = new StyledString(repositoryNode.getName());
			
			if (repositoryNode.getChildren() != null) {
				styledString.append(" (" + repositoryNode.getChildren().length + ") ", StyledString.COUNTER_STYLER);
			}
			return styledString;
		}
		
		if (element instanceof SearchParent) {
			//System.out.println("reconoce que es searchparent");
			SearchParent repositoryNode = (SearchParent) element;
			StyledString styledString = new StyledString(repositoryNode.getName());
			
			if (repositoryNode.getChildren() != null) {
				styledString.append(" (" + repositoryNode.getChildren().length + " results ) ", StyledString.QUALIFIER_STYLER);
			}
			return styledString;
		}
		
		if (element instanceof EntityParentGroup) {
			//System.out.println("reconoce que es searchparent");
			EntityParentGroup repositoryNode = (EntityParentGroup) element;
			StyledString styledString = new StyledString(repositoryNode.getName());
			
			if (repositoryNode.getChildren() != null) {
				styledString.append(" (" + repositoryNode.getChildren().length + " entities grouped) ", StyledString.QUALIFIER_STYLER);
				styledString.append(" (" + repositoryNode.getMax_weight() + " points) ", StyledString.DECORATIONS_STYLER);
			}
			return styledString;
		}
		
		if (element instanceof EntityParent) {
			StyledString styledString = new StyledString(((EntityParent) element).getName());
			//styledString.append(" (" + ((EntityParent) element).getSemanticElement().getWeight() + " points) ", StyledString.DECORATIONS_STYLER);
			return styledString;
		}
		
		if (element instanceof DataPropertyObject) {
			StyledString styledString = new StyledString(((DataPropertyObject) element).getName());
			return styledString;
		}
		
		if (element instanceof PropertyParent) {
			StyledString styledString = new StyledString(((PropertyParent) element).getName());
			return styledString;
		}
		*/
		return null;
	}
}
