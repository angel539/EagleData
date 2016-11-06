package eagledata.core.dsl.pattern.scoping;

import eagledata.core.dsl.pattern.streamingDsl.Phrase;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;

@SuppressWarnings("all")
public class DataModelQualifiedNameProvider extends XbaseQualifiedNameProvider {
  public QualifiedName qualifiedName(final Phrase phrase) {
    String _name = phrase.getName();
    return QualifiedName.create(_name);
  }
}
