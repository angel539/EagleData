/**
 */
package ecarules.impl;

import ecarules.EcarulesPackage;
import ecarules.RegexConcept;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regex Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecarules.impl.RegexConceptImpl#getRegex <em>Regex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegexConceptImpl extends ConceptImpl implements RegexConcept {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegexConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcarulesPackage.Literals.REGEX_CONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegex() {
		return (String)eGet(EcarulesPackage.Literals.REGEX_CONCEPT__REGEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegex(String newRegex) {
		eSet(EcarulesPackage.Literals.REGEX_CONCEPT__REGEX, newRegex);
	}

} //RegexConceptImpl
