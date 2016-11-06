package eagledata.ui.views.streaming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import eagledata.core.dsl.pattern.streamingDsl.TermKey;
import eagledata.ui.Activator;
import resourceset.BasedOnDescriptionDataResource;
import resourceset.BasedOnStreamingDataResource;
import resourceset.DataResource;
import resourceset.Message;
import resourceset.MessagePart;
import resourceset.MessageSet;
import resourceset.PrimitiveColumn;
import resourceset.Table;
import resourceset.User;

public class StreamingViewLabelProvider extends LabelProvider implements IStyledLabelProvider{
	public Image getImage(Object obj) {
		if(obj instanceof IStructuredSelection) obj = ((IStructuredSelection) obj).getFirstElement();
		
		String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
		
		if(obj instanceof DataResource) return Activator.getImageDescriptor("icons/Unicast-16.png").createImage();
		if(obj instanceof Message) return Activator.getImageDescriptor("icons/Plus-16.png").createImage();
		if(obj instanceof MessagePart) return Activator.getImageDescriptor("icons/Puzzle-16.png").createImage();
		if(obj instanceof Table) return Activator.getImageDescriptor("icons/CSV-16.png").createImage();
		
		return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
	}
	
	@Override
	public StyledString getStyledText(Object element) {
		if(element instanceof IStructuredSelection) element = ((IStructuredSelection) element).getFirstElement();

		if (element instanceof DataResource) {
			StyledString styledString = new StyledString("");
			
			DataResource dataresource = (DataResource) element;
			
			if(dataresource instanceof BasedOnStreamingDataResource){
				BasedOnStreamingDataResource basedOnStreamingDR = (BasedOnStreamingDataResource) dataresource;
				styledString = new StyledString(basedOnStreamingDR.getDescription().getName());
			}
			else{
				BasedOnDescriptionDataResource basedOnDescriptionDR = (BasedOnDescriptionDataResource) dataresource;
				styledString = new StyledString(basedOnDescriptionDR.getDescription().getName());
			}
			return styledString;
		}
		
		if (element instanceof MessageSet) {
			MessageSet messageset = (MessageSet) element;
		
			StyledString styledString = new StyledString("Messages: ");
			if (messageset.getMessages() != null) {
				styledString.append(" (" + messageset.getMessages().size() + ") ", StyledString.COUNTER_STYLER);
			}
			return styledString;
		}
		
		if (element instanceof Table) {
			Table table = (Table) element;
		
			StyledString styledString = new StyledString("Columns: ");
			if (table.getColumns() != null) {
				styledString.append(" (" + table.getColumns().size() + ") ", StyledString.COUNTER_STYLER);
			}
			return styledString;
		}
		
		if (element instanceof Message) {
			Message message = (Message) element;
		
			StyledString styledString = new StyledString(message.getText());
			return styledString;
		}
		
		if (element instanceof PrimitiveColumn) {
			PrimitiveColumn column = (PrimitiveColumn) element;
		
			StyledString styledString;
			if(column.getMetadata() != null && column.getMetadata().getName() != null){
				styledString = new StyledString(column.getMetadata().getName());
			}
			else{
				styledString = new StyledString("");
			}
			
			if (column.getValues() != null) {
				styledString.append(" (" + column.getValues().size() + ") values", StyledString.COUNTER_STYLER);
			}
			return styledString;
		}
		
		if (element instanceof User) {
			User user = (User) element;
		
			StyledString styledString = new StyledString(user.getId());
			return styledString;
		}
		
		if (element instanceof MessagePart) {
			StyledString styledString = null;
			MessagePart messagePart = (MessagePart) element;
			
			if(messagePart.getConcept() instanceof TermKey){
				TermKey termKey = (TermKey) messagePart.getConcept();
				styledString = new StyledString(termKey.getName() + ":" + messagePart.getTextPart());
			}
			else{
				styledString = new StyledString(((MessagePart) element).getTextPart());
			}
			
			return styledString;
		}
		
		if(element instanceof EObject){
			StyledString eObjectString = new StyledString(element.toString());
			return eObjectString;
		}
		
		StyledString voidString = new StyledString("");
		return voidString;
	}
}
