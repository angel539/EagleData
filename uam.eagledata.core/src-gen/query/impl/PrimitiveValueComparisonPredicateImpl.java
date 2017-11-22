/**
 */
package query.impl;

import org.eclipse.emf.ecore.EClass;

import query.PrimitiveValueComparisonPredicate;
import query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Value Comparison Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link query.impl.PrimitiveValueComparisonPredicateImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveValueComparisonPredicateImpl extends ComparisonPredicateImpl implements PrimitiveValueComparisonPredicate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveValueComparisonPredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.PRIMITIVE_VALUE_COMPARISON_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eGet(QueryPackage.Literals.PRIMITIVE_VALUE_COMPARISON_PREDICATE__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eSet(QueryPackage.Literals.PRIMITIVE_VALUE_COMPARISON_PREDICATE__VALUE, newValue);
	}

} //PrimitiveValueComparisonPredicateImpl
