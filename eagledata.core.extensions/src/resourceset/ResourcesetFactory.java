/**
 */
package resourceset;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see resourceset.ResourcesetPackage
 * @generated
 */
public interface ResourcesetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcesetFactory eINSTANCE = resourceset.impl.ResourcesetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Table Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Column</em>'.
	 * @generated
	 */
	TableColumn createTableColumn();

	/**
	 * Returns a new object of class '<em>Data Resource Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Resource Set</em>'.
	 * @generated
	 */
	DataResourceSet createDataResourceSet();

	/**
	 * Returns a new object of class '<em>Based On Streaming Data Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Based On Streaming Data Resource</em>'.
	 * @generated
	 */
	BasedOnStreamingDataResource createBasedOnStreamingDataResource();

	/**
	 * Returns a new object of class '<em>Based On Description Data Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Based On Description Data Resource</em>'.
	 * @generated
	 */
	BasedOnDescriptionDataResource createBasedOnDescriptionDataResource();

	/**
	 * Returns a new object of class '<em>Message Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Set</em>'.
	 * @generated
	 */
	MessageSet createMessageSet();

	/**
	 * Returns a new object of class '<em>Primitive Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Column</em>'.
	 * @generated
	 */
	PrimitiveColumn createPrimitiveColumn();

	/**
	 * Returns a new object of class '<em>Message Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Part</em>'.
	 * @generated
	 */
	MessagePart createMessagePart();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourcesetPackage getResourcesetPackage();

} //ResourcesetFactory
