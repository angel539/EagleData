/**
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadescription.dataDescriptionDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescriptionDslPackage
 * @generated
 */
public interface DataDescriptionDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DataDescriptionDslFactory eINSTANCE = eagledata.core.dsl.datadescription.dataDescriptionDsl.impl.DataDescriptionDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Data Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Model</em>'.
   * @generated
   */
  DataModel createDataModel();

  /**
   * Returns a new object of class '<em>Data Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Description</em>'.
   * @generated
   */
  DataDescription createDataDescription();

  /**
   * Returns a new object of class '<em>Data Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Source</em>'.
   * @generated
   */
  DataSource createDataSource();

  /**
   * Returns a new object of class '<em>Data Fragment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Fragment</em>'.
   * @generated
   */
  DataFragment createDataFragment();

  /**
   * Returns a new object of class '<em>Format Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Format Specification</em>'.
   * @generated
   */
  FormatSpecification createFormatSpecification();

  /**
   * Returns a new object of class '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option</em>'.
   * @generated
   */
  Option createOption();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  Node createNode();

  /**
   * Returns a new object of class '<em>Composite Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Node</em>'.
   * @generated
   */
  CompositeNode createCompositeNode();

  /**
   * Returns a new object of class '<em>Node Deprecation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Deprecation</em>'.
   * @generated
   */
  NodeDeprecation createNodeDeprecation();

  /**
   * Returns a new object of class '<em>Leaf Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Leaf Node</em>'.
   * @generated
   */
  LeafNode createLeafNode();

  /**
   * Returns a new object of class '<em>Remove</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove</em>'.
   * @generated
   */
  Remove createRemove();

  /**
   * Returns a new object of class '<em>Retype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Retype</em>'.
   * @generated
   */
  Retype createRetype();

  /**
   * Returns a new object of class '<em>Rename</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rename</em>'.
   * @generated
   */
  Rename createRename();

  /**
   * Returns a new object of class '<em>Type Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Specification</em>'.
   * @generated
   */
  TypeSpecification createTypeSpecification();

  /**
   * Returns a new object of class '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type</em>'.
   * @generated
   */
  DataType createDataType();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DataDescriptionDslPackage getDataDescriptionDslPackage();

} //DataDescriptionDslFactory