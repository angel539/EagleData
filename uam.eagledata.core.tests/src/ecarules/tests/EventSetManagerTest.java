/**
 */
package ecarules.tests;

import ecarules.EcarulesFactory;
import ecarules.EventSetManager;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event Set Manager</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventSetManagerTest extends TestCase {

	/**
	 * The fixture for this Event Set Manager test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventSetManager fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EventSetManagerTest.class);
	}

	/**
	 * Constructs a new Event Set Manager test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventSetManagerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Event Set Manager test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EventSetManager fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Event Set Manager test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventSetManager getFixture() {
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
		setFixture(EcarulesFactory.eINSTANCE.createEventSetManager());
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

} //EventSetManagerTest
