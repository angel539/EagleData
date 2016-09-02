package eagledata.ui;

import java.util.Iterator;

import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IFragmentProvider;

import com.google.inject.Inject;

public class DataDslQualifiedNameFragmentProvider implements IFragmentProvider {
	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;
	 
  public String getFragment(EObject obj, Fallback fallback) {
    org.eclipse.xtext.naming.QualifiedName qName = qualifiedNameProvider.getFullyQualifiedName(obj);
    String qNameLastSegment = qName.getLastSegment();
    return qNameLastSegment != null ? qNameLastSegment : fallback.getFragment(obj);
  }
 
  public EObject getEObject(Resource resource,
                            String fragment,
                            Fallback fallback) {
    if (fragment != null) {
      Iterator<EObject> i = EcoreUtil.getAllContents(resource, false);
      while(i.hasNext()) {
        EObject eObject = i.next();
        String candidateFragment = (eObject.eIsProxy())
            ? ((InternalEObject) eObject).eProxyURI().fragment()
            : getFragment(eObject, fallback);
        if (fragment.equals(candidateFragment))
          return eObject;
      }
    }
	    return fallback.getEObject(fragment);
	  }
}