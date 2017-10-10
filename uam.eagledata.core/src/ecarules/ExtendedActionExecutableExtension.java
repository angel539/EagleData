package ecarules;

import org.eclipse.emf.common.util.EList;

public interface ExtendedActionExecutableExtension extends ActionExecutableExtension {
	boolean execute(EList<ActionParam> inputs);
}
