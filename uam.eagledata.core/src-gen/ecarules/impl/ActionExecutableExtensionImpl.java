/**
 */
package ecarules.impl;

import ecarules.ActionExecutableExtension;
import ecarules.ActionParam;
import ecarules.EcarulesPackage;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Executable Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecarules.impl.ActionExecutableExtensionImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecarules.impl.ActionExecutableExtensionImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionExecutableExtensionImpl extends DefaultPersistentEObject implements ActionExecutableExtension {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionExecutableExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcarulesPackage.Literals.ACTION_EXECUTABLE_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(EcarulesPackage.Literals.ACTION_EXECUTABLE_EXTENSION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(EcarulesPackage.Literals.ACTION_EXECUTABLE_EXTENSION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(EcarulesPackage.Literals.ACTION_EXECUTABLE_EXTENSION__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(EcarulesPackage.Literals.ACTION_EXECUTABLE_EXTENSION__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean execute(EList<ActionParam> inputs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcarulesPackage.ACTION_EXECUTABLE_EXTENSION___EXECUTE__ELIST:
				return execute((EList<ActionParam>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ActionExecutableExtensionImpl
