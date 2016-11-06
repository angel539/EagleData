/**
 */
package resourceset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Resource Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceset.DataResourceSet#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see resourceset.ResourcesetPackage#getDataResourceSet()
 * @model
 * @generated
 */
public interface DataResourceSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link resourceset.DataResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see resourceset.ResourcesetPackage#getDataResourceSet_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataResource> getResources();

} // DataResourceSet
