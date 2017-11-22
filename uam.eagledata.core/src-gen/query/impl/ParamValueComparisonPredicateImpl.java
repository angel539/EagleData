/**
 */
package query.impl;

import org.eclipse.emf.ecore.EClass;

import query.ParamValueComparisonPredicate;
import query.QueryPackage;
import query.QueryParam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Value Comparison Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link query.impl.ParamValueComparisonPredicateImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParamValueComparisonPredicateImpl extends ComparisonPredicateImpl implements ParamValueComparisonPredicate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParamValueComparisonPredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.PARAM_VALUE_COMPARISON_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParam getRight() {
		return (QueryParam)eGet(QueryPackage.Literals.PARAM_VALUE_COMPARISON_PREDICATE__RIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(QueryParam newRight) {
		eSet(QueryPackage.Literals.PARAM_VALUE_COMPARISON_PREDICATE__RIGHT, newRight);
	}

} //ParamValueComparisonPredicateImpl
