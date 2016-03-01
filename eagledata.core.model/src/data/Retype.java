/**
 */
package data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data.Retype#getNewType <em>New Type</em>}</li>
 * </ul>
 *
 * @see data.DataPackage#getRetype()
 * @model
 * @generated
 */
public interface Retype extends NodeDeprecation {
	/**
	 * Returns the value of the '<em><b>New Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Type</em>' containment reference.
	 * @see #setNewType(TypeSpecification)
	 * @see data.DataPackage#getRetype_NewType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeSpecification getNewType();

	/**
	 * Sets the value of the '{@link data.Retype#getNewType <em>New Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Type</em>' containment reference.
	 * @see #getNewType()
	 * @generated
	 */
	void setNewType(TypeSpecification value);

} // Retype
