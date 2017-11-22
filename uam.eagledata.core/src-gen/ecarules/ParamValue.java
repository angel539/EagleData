/**
 */
package ecarules;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;
import query.QueryParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecarules.ParamValue#getValue <em>Value</em>}</li>
 *   <li>{@link ecarules.ParamValue#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see ecarules.EcarulesPackage#getParamValue()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface ParamValue extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Concept)
	 * @see ecarules.EcarulesPackage#getParamValue_Value()
	 * @model keys="name" required="true"
	 * @generated
	 */
	Concept getValue();

	/**
	 * Sets the value of the '{@link ecarules.ParamValue#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Concept value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' reference.
	 * @see #setParam(QueryParam)
	 * @see ecarules.EcarulesPackage#getParamValue_Param()
	 * @model
	 * @generated
	 */
	QueryParam getParam();

	/**
	 * Sets the value of the '{@link ecarules.ParamValue#getParam <em>Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' reference.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(QueryParam value);

} // ParamValue
