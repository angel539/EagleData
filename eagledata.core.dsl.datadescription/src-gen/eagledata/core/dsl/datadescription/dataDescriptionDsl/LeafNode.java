/**
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadescription.dataDescriptionDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.LeafNode#isKey <em>Key</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.LeafNode#isUnique <em>Unique</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.LeafNode#getType <em>Type</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.LeafNode#isKeyword <em>Keyword</em>}</li>
 * </ul>
 *
 * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescriptionDslPackage#getLeafNode()
 * @model
 * @generated
 */
public interface LeafNode extends Node
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(boolean)
   * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescriptionDslPackage#getLeafNode_Key()
   * @model
   * @generated
   */
  boolean isKey();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.LeafNode#isKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #isKey()
   * @generated
   */
  void setKey(boolean value);

  /**
   * Returns the value of the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unique</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique</em>' attribute.
   * @see #setUnique(boolean)
   * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescriptionDslPackage#getLeafNode_Unique()
   * @model
   * @generated
   */
  boolean isUnique();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.LeafNode#isUnique <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique</em>' attribute.
   * @see #isUnique()
   * @generated
   */
  void setUnique(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeSpecification)
   * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescriptionDslPackage#getLeafNode_Type()
   * @model containment="true"
   * @generated
   */
  TypeSpecification getType();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.LeafNode#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeSpecification value);

  /**
   * Returns the value of the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keyword</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keyword</em>' attribute.
   * @see #setKeyword(boolean)
   * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescriptionDslPackage#getLeafNode_Keyword()
   * @model
   * @generated
   */
  boolean isKeyword();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.LeafNode#isKeyword <em>Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keyword</em>' attribute.
   * @see #isKeyword()
   * @generated
   */
  void setKeyword(boolean value);

} // LeafNode