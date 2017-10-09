package uam.eagledata.ui.views.eventset;

import org.eclipse.jface.viewers.Viewer;

import org.eclipse.jface.viewers.ViewerFilter;

import ecarules.*;

public class EventSetViewFilter extends ViewerFilter {
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		return element instanceof EventSetManager
				|| element instanceof Event;
	}
}
