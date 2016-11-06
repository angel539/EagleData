package eagledata.core.dsl.pattern.jvmmodel;

import com.google.inject.Inject;
import java.util.Collections;
import java.util.Set;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.RawSuperTypes;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DataDslTypes {
  @Inject
  @Extension
  private RawSuperTypes _rawSuperTypes;
  
  public final static Set<String> dataPrimitiveTypes = Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("double", "java.lang.Double", "java.lang.String", "byte[]", "boolean", "java.lang.Boolean", "java.util.Date", "void", "java.lang.Void", "int", "java.lang.Integer", "long", "java.lang.Long"));
  
  public boolean isPrimitiveType(final JvmTypeReference typeRef) {
    String _qualifiedName = typeRef.getQualifiedName();
    return DataDslTypes.dataPrimitiveTypes.contains(_qualifiedName);
  }
  
  public boolean isType(final JvmTypeReference typeRef) {
    return this.isPrimitiveType(typeRef);
  }
}
