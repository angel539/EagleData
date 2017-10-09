/**
 */
package ecarules.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ecarules</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcarulesTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new EcarulesTests("ecarules Tests");
		suite.addTestSuite(DataConnectionTest.class);
		suite.addTestSuite(ActionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcarulesTests(String name) {
		super(name);
	}

} //EcarulesTests
