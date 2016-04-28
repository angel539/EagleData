/**
 */
package data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data.Reference#getReferenceType <em>Reference Type</em>}</li>
 * </ul>
 *
 * @see data.DataPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends TypeSpecification {
	/**
	 * Returns the value of the '<em><b>Reference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type</em>' reference.
	 * @see #setReferenceType(NamedElement)
	 * @see data.DataPackage#getReference_ReferenceType()
	 * @model required="true"
	 * @generated
	 */
	NamedElement getReferenceType();

	/**
	 * Sets the value of the '{@link data.Reference#getReferenceType <em>Reference Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Type</em>' reference.
	 * @see #getReferenceType()
	 * @generated
	 */
	void setReferenceType(NamedElement value);

} // Reference
