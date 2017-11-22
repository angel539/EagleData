/**
 */
package query.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import query.QueryFactory;
import query.Select;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectTest extends TestCase {

	/**
	 * The fixture for this Select test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Select fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SelectTest.class);
	}

	/**
	 * Constructs a new Select test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Select test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Select fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Select test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Select getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QueryFactory.eINSTANCE.createSelect());
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

} //SelectTest
