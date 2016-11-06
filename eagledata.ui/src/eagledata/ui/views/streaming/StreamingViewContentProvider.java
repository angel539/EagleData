package eagledata.ui.views.streaming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import resourceset.DataResourceSet;

public class StreamingViewContentProvider implements IStructuredContentProvider, ITreeContentProvider{	
	private DataResourceSet dataResourceSet;

	public StreamingViewContentProvider(DataResourceSet dataResourceSet, TreeViewer viewer) {
		super();
		this.dataResourceSet = dataResourceSet;
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		/*if (input != null) {
	        input.getWorkspace().removeResourceChangeListener(this);
	    }

	    input = (DataResourceSet) newInput;

	    if (input != null) {
	        input.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
	    }

	    viewer = (TreeViewer) viewer;*/
	}
	
	public void dispose() {
		/*if (input != null) {
	        input.getWorkspace().removeResourceChangeListener(this);
	        input = null;
	    }*/
	}
	
	public Object[] getElements(Object parent) {
		if (parent.equals(dataResourceSet)) {
			return getChildren(dataResourceSet);
		}
		
		return getChildren(parent);
	}

	public Object getParent(Object child) {
		if (child instanceof EObject) {
			return ((EObject)child).eContainer();
		}
		return null;
	}
	
	public Object[] getChildren(Object parent) {
		if (parent instanceof EObject) {
			return ((EObject)parent).eContents().toArray();
		}
		return new Object[0];
	}
	
	public boolean hasChildren(Object parent) {
		if (parent instanceof EObject){
			if(((EObject) parent).eContents() == null || ((EObject) parent).eContents().size() == 0){
				return false;
			}
			else{
				return true;
			}
		}
		return false;
	}
}