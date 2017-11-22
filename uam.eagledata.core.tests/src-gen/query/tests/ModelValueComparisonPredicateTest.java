/**
 */
package query.tests;

import junit.textui.TestRunner;

import query.ModelValueComparisonPredicate;
import query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model Value Comparison Predicate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelValueComparisonPredicateTest extends ComparisonPredicateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModelValueComparisonPredicateTest.class);
	}

	/**
	 * Constructs a new Model Value Comparison Predicate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelValueComparisonPredicateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Model Value Comparison Predicate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ModelValueComparisonPredicate getFixture() {
		return (ModelValueComparisonPredicate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QueryFactory.eINSTANCE.createModelValueComparisonPredicate());
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

} //ModelValueComparisonPredicateTest
