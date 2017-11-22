/**
 */
package ecarules;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

import org.eclipse.emf.common.util.EList;

import query.Select;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecarules.SelectCall#getCalls <em>Calls</em>}</li>
 *   <li>{@link ecarules.SelectCall#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see ecarules.EcarulesPackage#getSelectCall()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface SelectCall extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Calls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls</em>' reference.
	 * @see #setCalls(Select)
	 * @see ecarules.EcarulesPackage#getSelectCall_Calls()
	 * @model required="true"
	 * @generated
	 */
	Select getCalls();

	/**
	 * Sets the value of the '{@link ecarules.SelectCall#getCalls <em>Calls</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calls</em>' reference.
	 * @see #getCalls()
	 * @generated
	 */
	void setCalls(Select value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link ecarules.ParamValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see ecarules.EcarulesPackage#getSelectCall_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParamValue> getParams();

} // SelectCall
