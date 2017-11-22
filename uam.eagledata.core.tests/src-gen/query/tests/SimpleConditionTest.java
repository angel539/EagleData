/**
 */
package query.tests;

import junit.textui.TestRunner;

import query.QueryFactory;
import query.SimpleCondition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleConditionTest extends ConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleConditionTest.class);
	}

	/**
	 * Constructs a new Simple Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleCondition getFixture() {
		return (SimpleCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QueryFactory.eINSTANCE.createSimpleCondition());
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

} //SimpleConditionTest
