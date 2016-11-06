package eagledata.core.dsl.pattern.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.RawSuperTypes
import org.eclipse.xtext.common.types.JvmType

class DataDslTypes {
	@Inject extension RawSuperTypes
	
	public static val dataPrimitiveTypes = #{
		'double',
		'java.lang.Double',
		'java.lang.String',
		'byte[]',
		'boolean',
		'java.lang.Boolean',
		'java.util.Date',
		'void',
		'java.lang.Void',
		'int',
		'java.lang.Integer',
		'long',
		'java.lang.Long'
	}
	
	def isPrimitiveType(JvmTypeReference typeRef) {
		dataPrimitiveTypes.contains(typeRef.qualifiedName)
	}
	
	def isType(JvmTypeReference typeRef) {
		typeRef.isPrimitiveType// || typeRef.type.isMongoBean
	}
	
	/*def isMongoBean(JvmType type) {
		return type.collectNames.contains('org.xtext.mongobeans.lib.IMongoBean')
	}*/
}