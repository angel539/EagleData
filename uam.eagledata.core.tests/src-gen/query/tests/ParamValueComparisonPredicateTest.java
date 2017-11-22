/**
 */
package query.tests;

import junit.textui.TestRunner;

import query.ParamValueComparisonPredicate;
import query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Param Value Comparison Predicate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParamValueComparisonPredicateTest extends ComparisonPredicateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParamValueComparisonPredicateTest.class);
	}

	/**
	 * Constructs a new Param Value Comparison Predicate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamValueComparisonPredicateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Param Value Comparison Predicate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ParamValueComparisonPredicate getFixture() {
		return (ParamValueComparisonPredicate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QueryFactory.eINSTANCE.createParamValueComparisonPredicate());
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

} //ParamValueComparisonPredicateTest
