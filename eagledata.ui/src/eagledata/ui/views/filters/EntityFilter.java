package eagledata.ui.views.filters;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class EntityFilter extends ViewerFilter {
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		//return element instanceof EntityParent || element instanceof SearchParent;
		return true;
	}
}
