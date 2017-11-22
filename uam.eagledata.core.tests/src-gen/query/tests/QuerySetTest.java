/**
 */
package query.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import query.QueryFactory;
import query.QuerySet;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuerySetTest extends TestCase {

	/**
	 * The fixture for this Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuerySet fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuerySetTest.class);
	}

	/**
	 * Constructs a new Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuerySetTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(QuerySet fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuerySet getFixture() {
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
		setFixture(QueryFactory.eINSTANCE.createQuerySet());
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

} //QuerySetTest
