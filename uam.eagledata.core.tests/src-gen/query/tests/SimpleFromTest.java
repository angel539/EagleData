/**
 */
package query.tests;

import junit.textui.TestRunner;

import query.QueryFactory;
import query.SimpleFrom;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple From</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleFromTest extends FromTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleFromTest.class);
	}

	/**
	 * Constructs a new Simple From test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleFromTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple From test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleFrom getFixture() {
		return (SimpleFrom)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QueryFactory.eINSTANCE.createSimpleFrom());
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

} //SimpleFromTest
