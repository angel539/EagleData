package eagledata.core.dsl.pattern.scoping

import eagledata.core.dsl.pattern.streamingDsl.Phrase
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider

class DataModelQualifiedNameProvider extends XbaseQualifiedNameProvider {
	def qualifiedName(Phrase phrase) {
		return QualifiedName.create(phrase.name)
	}
}