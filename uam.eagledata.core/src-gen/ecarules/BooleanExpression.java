/**
 */
package ecarules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecarules.BooleanExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see ecarules.EcarulesPackage#getBooleanExpression()
 * @model
 * @generated
 */
public interface BooleanExpression extends Condition {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see ecarules.EcarulesPackage#getBooleanExpression_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link ecarules.BooleanExpression#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // BooleanExpression
