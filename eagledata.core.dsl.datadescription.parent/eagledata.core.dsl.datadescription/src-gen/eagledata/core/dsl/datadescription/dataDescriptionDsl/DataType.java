/**
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadescription.dataDescriptionDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.DataType#getSpecialType <em>Special Type</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.DataType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescriptionDslPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends TypeSpecification
{
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
   * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescriptionDslPackage#getDataType_SpecialType()
   * @model
   * @generated
   */
  String getSpecialType();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.DataType#getSpecialType <em>Special Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Special Type</em>' attribute.
   * @see #getSpecialType()
   * @generated
   */
  void setSpecialType(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link eagledata.core.dsl.datadescription.dataDescriptionDsl.TypeKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.TypeKind
   * @see #setType(TypeKind)
   * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescriptionDslPackage#getDataType_Type()
   * @model
   * @generated
   */
  TypeKind getType();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.DataType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.TypeKind
   * @see #getType()
   * @generated
   */
  void setType(TypeKind value);

} // DataType
