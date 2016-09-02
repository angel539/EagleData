package eagledata.ui.views.datatypes;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;

public class DatatypesTreeViewer extends TreeViewer {
	public DatatypesTreeViewer(Composite parent) {
		super(parent);
	}

	public DatatypesTreeViewer(Tree tree) {
		super(tree);
	}

	public DatatypesTreeViewer(Composite parent, int style) {
		super(parent, style);
	}
}
