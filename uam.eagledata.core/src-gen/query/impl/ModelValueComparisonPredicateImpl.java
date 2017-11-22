/**
 */
package query.impl;

import org.eclipse.emf.ecore.EClass;

import query.ModelValueComparisonPredicate;
import query.QueryPackage;

import semanticmanager.DataProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Value Comparison Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link query.impl.ModelValueComparisonPredicateImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelValueComparisonPredicateImpl extends ComparisonPredicateImpl implements ModelValueComparisonPredicate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelValueComparisonPredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.MODEL_VALUE_COMPARISON_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProperty getRight() {
		return (DataProperty)eGet(QueryPackage.Literals.MODEL_VALUE_COMPARISON_PREDICATE__RIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(DataProperty newRight) {
		eSet(QueryPackage.Literals.MODEL_VALUE_COMPARISON_PREDICATE__RIGHT, newRight);
	}

} //ModelValueComparisonPredicateImpl
