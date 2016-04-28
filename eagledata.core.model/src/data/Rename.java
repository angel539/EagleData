/**
 */
package data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rename</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data.Rename#getNewRepresentedAs <em>New Represented As</em>}</li>
 * </ul>
 *
 * @see data.DataPackage#getRename()
 * @model
 * @generated
 */
public interface Rename extends NodeDeprecation {
	/**
	 * Returns the value of the '<em><b>New Represented As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Represented As</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Represented As</em>' attribute.
	 * @see #setNewRepresentedAs(String)
	 * @see data.DataPackage#getRename_NewRepresentedAs()
	 * @model
	 * @generated
	 */
	String getNewRepresentedAs();

	/**
	 * Sets the value of the '{@link data.Rename#getNewRepresentedAs <em>New Represented As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Represented As</em>' attribute.
	 * @see #getNewRepresentedAs()
	 * @generated
	 */
	void setNewRepresentedAs(String value);

} // Rename
