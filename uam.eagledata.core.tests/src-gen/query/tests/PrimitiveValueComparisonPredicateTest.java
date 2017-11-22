/**
 */
package query.tests;

import junit.textui.TestRunner;

import query.PrimitiveValueComparisonPredicate;
import query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Primitive Value Comparison Predicate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitiveValueComparisonPredicateTest extends ComparisonPredicateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrimitiveValueComparisonPredicateTest.class);
	}

	/**
	 * Constructs a new Primitive Value Comparison Predicate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveValueComparisonPredicateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Primitive Value Comparison Predicate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PrimitiveValueComparisonPredicate getFixture() {
		return (PrimitiveValueComparisonPredicate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QueryFactory.eINSTANCE.createPrimitiveValueComparisonPredicate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PrimitiveValueComparisonPredicateTest
