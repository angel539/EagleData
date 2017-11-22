/**
 */
package ecarules;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecarules.Condition#getExpression <em>Expression</em>}</li>
 *   <li>{@link ecarules.Condition#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link ecarules.Condition#getGeo <em>Geo</em>}</li>
 * </ul>
 *
 * @see ecarules.EcarulesPackage#getCondition()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface Condition extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see ecarules.EcarulesPackage#getCondition_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link ecarules.Condition#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link ecarules.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see ecarules.EcarulesPackage#getCondition_Triggers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getTriggers();

	/**
	 * Returns the value of the '<em><b>Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo</em>' reference.
	 * @see #setGeo(GeographicalElement)
	 * @see ecarules.EcarulesPackage#getCondition_Geo()
	 * @model
	 * @generated
	 */
	GeographicalElement getGeo();

	/**
	 * Sets the value of the '{@link ecarules.Condition#getGeo <em>Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo</em>' reference.
	 * @see #getGeo()
	 * @generated
	 */
	void setGeo(GeographicalElement value);

} // Condition
