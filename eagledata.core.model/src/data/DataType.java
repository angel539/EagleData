/**
 */
package data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data.DataType#getSpecialType <em>Special Type</em>}</li>
 *   <li>{@link data.DataType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see data.DataPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends TypeSpecification {
	/**
	 * Returns the value of the '<em><b>Special Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Type</em>' attribute.
	 * @see #setSpecialType(String)
	 * @see data.DataPackage#getDataType_SpecialType()
	 * @model
	 * @generated
	 */
	String getSpecialType();

	/**
	 * Sets the value of the '{@link data.DataType#getSpecialType <em>Special Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Type</em>' attribute.
	 * @see #getSpecialType()
	 * @generated
	 */
	void setSpecialType(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"string"</code>.
	 * The literals are from the enumeration {@link data.TypeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see data.TypeKind
	 * @see #setType(TypeKind)
	 * @see data.DataPackage#getDataType_Type()
	 * @model default="string"
	 * @generated
	 */
	TypeKind getType();

	/**
	 * Sets the value of the '{@link data.DataType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see data.TypeKind
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeKind value);

} // DataType
