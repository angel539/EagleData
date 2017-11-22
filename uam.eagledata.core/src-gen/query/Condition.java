/**
 */
package query;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.Condition#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getCondition()
 * @model abstract="true"
 * @extends PersistentEObject
 * @generated
 */
public interface Condition extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(ComparisonPredicate)
	 * @see query.QueryPackage#getCondition_Predicate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComparisonPredicate getPredicate();

	/**
	 * Sets the value of the '{@link query.Condition#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(ComparisonPredicate value);

} // Condition
