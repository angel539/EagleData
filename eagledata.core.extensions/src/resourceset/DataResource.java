/**
 */
package resourceset;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceset.DataResource#getAssistant <em>Assistant</em>}</li>
 * </ul>
 *
 * @see resourceset.ResourcesetPackage#getDataResource()
 * @model abstract="true"
 * @generated
 */
public interface DataResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Assistant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assistant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assistant</em>' attribute.
	 * @see #setAssistant(String)
	 * @see resourceset.ResourcesetPackage#getDataResource_Assistant()
	 * @model
	 * @generated
	 */
	String getAssistant();

	/**
	 * Sets the value of the '{@link resourceset.DataResource#getAssistant <em>Assistant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assistant</em>' attribute.
	 * @see #getAssistant()
	 * @generated
	 */
	void setAssistant(String value);

} // DataResource
