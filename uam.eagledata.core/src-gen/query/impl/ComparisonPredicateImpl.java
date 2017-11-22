/**
 */
package query.impl;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import org.eclipse.emf.ecore.EClass;

import query.ComparisonPredicate;
import query.ComparisonType;
import query.QueryPackage;

import semanticmanager.DataProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link query.impl.ComparisonPredicateImpl#getComparisonType <em>Comparison Type</em>}</li>
 *   <li>{@link query.impl.ComparisonPredicateImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link query.impl.ComparisonPredicateImpl#isNot <em>Not</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComparisonPredicateImpl extends DefaultPersistentEObject implements ComparisonPredicate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonPredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.COMPARISON_PREDICATE;
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
	public ComparisonType getComparisonType() {
		return (ComparisonType)eGet(QueryPackage.Literals.COMPARISON_PREDICATE__COMPARISON_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonType(ComparisonType newComparisonType) {
		eSet(QueryPackage.Literals.COMPARISON_PREDICATE__COMPARISON_TYPE, newComparisonType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProperty getLeft() {
		return (DataProperty)eGet(QueryPackage.Literals.COMPARISON_PREDICATE__LEFT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(DataProperty newLeft) {
		eSet(QueryPackage.Literals.COMPARISON_PREDICATE__LEFT, newLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNot() {
		return (Boolean)eGet(QueryPackage.Literals.COMPARISON_PREDICATE__NOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNot(boolean newNot) {
		eSet(QueryPackage.Literals.COMPARISON_PREDICATE__NOT, newNot);
	}

} //ComparisonPredicateImpl
