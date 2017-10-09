package uam.eagledata.dsl.events.ui.contentassist;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import uam.eagledata.dsl.events.ui.contentassist.AbstractEventSetManagerDslProposalProvider;

@SuppressWarnings("all")
public class EventSetManagerDslProposalProvider extends AbstractEventSetManagerDslProposalProvider {
  public final static String ACTION_EXTENSIONS_ID = "eagledata.core.extensions.actions";
  
  @Override
  public void completePatternEvent_Triggers(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final IExtensionRegistry registry = Platform.getExtensionRegistry();
    final IConfigurationElement[] extensions = registry.getConfigurationElementsFor(EventSetManagerDslProposalProvider.ACTION_EXTENSIONS_ID);
    for (final IConfigurationElement ext : extensions) {
      String _name = ext.getName();
      boolean _equals = _name.equals("action");
      if (_equals) {
        String _attribute = ext.getAttribute("name");
        String _plus = ("\"" + _attribute);
        String _plus_1 = (_plus + "\"");
        String _attribute_1 = ext.getAttribute("name");
        ICompletionProposal _createCompletionProposal = this.createCompletionProposal(_plus_1, _attribute_1, null, context);
        acceptor.accept(_createCompletionProposal);
      }
    }
  }
}
