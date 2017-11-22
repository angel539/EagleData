/**
 */
package query.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import query.QueryFactory;
import query.QueryParam;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Param</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryParamTest extends TestCase {

	/**
	 * The fixture for this Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryParam fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QueryParamTest.class);
	}

	/**
	 * Constructs a new Param test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParamTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(QueryParam fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryParam getFixture() {
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
		setFixture(QueryFactory.eINSTANCE.createQueryParam());
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

} //QueryParamTest
