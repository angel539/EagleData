package eagledata.ui.views.fragments;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;

public class FragmentsViewer extends TreeViewer {
	public FragmentsViewer(Composite parent) {
		super(parent);
	}

	public FragmentsViewer(Tree tree) {
		super(tree);
	}

	public FragmentsViewer(Composite parent, int style) {
		super(parent, style);
	}
}
