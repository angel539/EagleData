/**
 */
package query;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

import semanticmanager.DataProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.ComparisonPredicate#getComparisonType <em>Comparison Type</em>}</li>
 *   <li>{@link query.ComparisonPredicate#getLeft <em>Left</em>}</li>
 *   <li>{@link query.ComparisonPredicate#isNot <em>Not</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getComparisonPredicate()
 * @model abstract="true"
 * @extends PersistentEObject
 * @generated
 */
public interface ComparisonPredicate extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Comparison Type</b></em>' attribute.
	 * The literals are from the enumeration {@link query.ComparisonType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Type</em>' attribute.
	 * @see query.ComparisonType
	 * @see #setComparisonType(ComparisonType)
	 * @see query.QueryPackage#getComparisonPredicate_ComparisonType()
	 * @model required="true"
	 * @generated
	 */
	ComparisonType getComparisonType();

	/**
	 * Sets the value of the '{@link query.ComparisonPredicate#getComparisonType <em>Comparison Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Type</em>' attribute.
	 * @see query.ComparisonType
	 * @see #getComparisonType()
	 * @generated
	 */
	void setComparisonType(ComparisonType value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(DataProperty)
	 * @see query.QueryPackage#getComparisonPredicate_Left()
	 * @model keys="name" required="true"
	 * @generated
	 */
	DataProperty getLeft();

	/**
	 * Sets the value of the '{@link query.ComparisonPredicate#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(DataProperty value);

	/**
	 * Returns the value of the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' attribute.
	 * @see #setNot(boolean)
	 * @see query.QueryPackage#getComparisonPredicate_Not()
	 * @model
	 * @generated
	 */
	boolean isNot();

	/**
	 * Sets the value of the '{@link query.ComparisonPredicate#isNot <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' attribute.
	 * @see #isNot()
	 * @generated
	 */
	void setNot(boolean value);

} // ComparisonPredicate
