/**
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadescription.dataDescriptionDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescription#getName <em>Name</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescription#getNodes <em>Nodes</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescription#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescriptionDslPackage#getDataDescription()
 * @model
 * @generated
 */
public interface DataDescription extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescriptionDslPackage#getDataDescription_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescription#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link eagledata.core.dsl.datadescription.dataDescriptionDsl.Node}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescriptionDslPackage#getDataDescription_Nodes()
   * @model containment="true"
   * @generated
   */
  EList<Node> getNodes();

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link eagledata.core.dsl.datadescription.dataDescriptionDsl.Option}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescriptionDslPackage#getDataDescription_Options()
   * @model containment="true"
   * @generated
   */
  EList<Option> getOptions();

} // DataDescription