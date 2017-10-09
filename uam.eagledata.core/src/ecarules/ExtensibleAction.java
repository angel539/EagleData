package ecarules;

import org.eclipse.emf.common.util.EList;

public interface ExtensibleAction extends Action {
	boolean execute(EList<Concept> inputs);
}
