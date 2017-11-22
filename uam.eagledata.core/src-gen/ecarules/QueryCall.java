/**
 */
package ecarules;

import org.eclipse.emf.common.util.EList;

import query.Select;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecarules.QueryCall#getSelect <em>Select</em>}</li>
 *   <li>{@link ecarules.QueryCall#getQueryParams <em>Query Params</em>}</li>
 *   <li>{@link ecarules.QueryCall#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see ecarules.EcarulesPackage#getQueryCall()
 * @model
 * @generated
 */
public interface QueryCall extends Action {
	/**
	 * Returns the value of the '<em><b>Select</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' reference.
	 * @see #setSelect(Select)
	 * @see ecarules.EcarulesPackage#getQueryCall_Select()
	 * @model required="true"
	 * @generated
	 */
	Select getSelect();

	/**
	 * Sets the value of the '{@link ecarules.QueryCall#getSelect <em>Select</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' reference.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(Select value);

	/**
	 * Returns the value of the '<em><b>Query Params</b></em>' containment reference list.
	 * The list contents are of type {@link ecarules.ParamValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Params</em>' containment reference list.
	 * @see ecarules.EcarulesPackage#getQueryCall_QueryParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParamValue> getQueryParams();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(Method)
	 * @see ecarules.EcarulesPackage#getQueryCall_Method()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link ecarules.QueryCall#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

} // QueryCall
