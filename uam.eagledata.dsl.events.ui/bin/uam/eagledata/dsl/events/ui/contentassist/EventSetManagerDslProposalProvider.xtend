package uam.eagledata.dsl.events.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.core.runtime.IExtensionRegistry
import org.eclipse.core.runtime.Platform
import org.eclipse.core.runtime.IConfigurationElement

class EventSetManagerDslProposalProvider extends AbstractEventSetManagerDslProposalProvider {
	public static final String ACTION_EXTENSIONS_ID = "eagledata.core.extensions.actions";

	override completePatternEvent_Triggers(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val IExtensionRegistry registry = Platform.getExtensionRegistry();
		val IConfigurationElement[] extensions = registry.getConfigurationElementsFor(ACTION_EXTENSIONS_ID);
		
		for (ext : extensions) {
			if (ext.getName().equals("action")) {
					acceptor.accept(createCompletionProposal("\"" + ext.getAttribute("name") + "\"", ext.getAttribute("name"), null, context));
			}
		}
	}
}
