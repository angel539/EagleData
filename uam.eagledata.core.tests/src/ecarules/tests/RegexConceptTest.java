/**
 */
package ecarules.tests;

import ecarules.EcarulesFactory;
import ecarules.RegexConcept;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Regex Concept</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegexConceptTest extends ConceptTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RegexConceptTest.class);
	}

	/**
	 * Constructs a new Regex Concept test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegexConceptTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Regex Concept test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RegexConcept getFixture() {
		return (RegexConcept)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EcarulesFactory.eINSTANCE.createRegexConcept());
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

} //RegexConceptTest
