/**
 */
package resourceset.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import resourceset.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see resourceset.ResourcesetPackage
 * @generated
 */
public class ResourcesetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResourcesetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ResourcesetPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcesetSwitch<Adapter> modelSwitch =
		new ResourcesetSwitch<Adapter>() {
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseTableColumn(TableColumn object) {
				return createTableColumnAdapter();
			}
			@Override
			public Adapter caseDataResourceSet(DataResourceSet object) {
				return createDataResourceSetAdapter();
			}
			@Override
			public Adapter caseBasedOnStreamingDataResource(BasedOnStreamingDataResource object) {
				return createBasedOnStreamingDataResourceAdapter();
			}
			@Override
			public Adapter caseBasedOnDescriptionDataResource(BasedOnDescriptionDataResource object) {
				return createBasedOnDescriptionDataResourceAdapter();
			}
			@Override
			public Adapter caseDataResource(DataResource object) {
				return createDataResourceAdapter();
			}
			@Override
			public Adapter caseMessageSet(MessageSet object) {
				return createMessageSetAdapter();
			}
			@Override
			public Adapter casePrimitiveColumn(PrimitiveColumn object) {
				return createPrimitiveColumnAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseMessagePart(MessagePart object) {
				return createMessagePartAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link resourceset.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resourceset.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resourceset.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resourceset.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resourceset.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resourceset.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resourceset.TableColumn <em>Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resourceset.TableColumn
	 * @generated
	 */
	public Adapter createTableColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resourceset.DataResourceSet <em>Data Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resourceset.DataResourceSet
	 * @generated
	 */
	public Adapter createDataResourceSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resourceset.BasedOnStreamingDataResource <em>Based On Streaming Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resourceset.BasedOnStreamingDataResource
	 * @generated
	 */
	public Adapter createBasedOnStreamingDataResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resourceset.BasedOnDescriptionDataResource <em>Based On Description Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resourceset.BasedOnDescriptionDataResource
	 * @generated
	 */
	public Adapter createBasedOnDescriptionDataResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resourceset.DataResource <em>Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resourceset.DataResource
	 * @generated
	 */
	public Adapter createDataResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resourceset.MessageSet <em>Message Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resourceset.MessageSet
	 * @generated
	 */
	public Adapter createMessageSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resourceset.PrimitiveColumn <em>Primitive Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resourceset.PrimitiveColumn
	 * @generated
	 */
	public Adapter createPrimitiveColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resourceset.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resourceset.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resourceset.MessagePart <em>Message Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resourceset.MessagePart
	 * @generated
	 */
	public Adapter createMessagePartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ResourcesetAdapterFactory
