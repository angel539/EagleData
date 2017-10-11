package uam.eagledata.dsl.events.ui.contentassist

class EventSetManagerDslProposalProvider extends AbstractEventSetManagerDslProposalProvider {
	//public static final String ACTION_EXTENSIONS_ID = "eagledata.core.extensions.actions"
	//public static final String DATACONNECTION_EXTENSIONS_ID = "eagledata.core.extensions.dataconnection"
	
	/*override completeEvent_Triggers(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val IExtensionRegistry registry = Platform.getExtensionRegistry();
		val IConfigurationElement[] extensions = registry.getConfigurationElementsFor(ACTION_EXTENSIONS_ID);
		
		for (ext : extensions) {
			if (ext.getName().equals("action")) {
					acceptor.accept(createCompletionProposal("\"" + ext.getAttribute("name") + "\"", ext.getAttribute("name"), null, context));
			}
		}
	}*/
	
	/*override completeAction_Calls(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val IExtensionRegistry registry = Platform.getExtensionRegistry();
		val IConfigurationElement[] extensions = registry.getConfigurationElementsFor(ACTION_EXTENSIONS_ID);
		
		for (ext : extensions) {
			if (ext.getName().equals("action")) {
					acceptor.accept(createCompletionProposal("\"" + ext.getAttribute("name") + "\"", ext.getAttribute("name"), null, context));
			}
		}
	}*/
	
	/*override completeEvent_Dataconnection(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val IExtensionRegistry registry = Platform.getExtensionRegistry();
		val IConfigurationElement[] extensions = registry.getConfigurationElementsFor(DATACONNECTION_EXTENSIONS_ID);
		
		for (ext : extensions) {
			if (ext.getName().equals("connection")) {
					acceptor.accept(createCompletionProposal("\"" + ext.getAttribute("name") + "\"", ext.getAttribute("name"), null, context));
			}
		}
	}*/
}
