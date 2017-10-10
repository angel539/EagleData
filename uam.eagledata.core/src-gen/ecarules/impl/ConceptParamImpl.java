/**
 */
package ecarules.impl;

import ecarules.Concept;
import ecarules.ConceptParam;
import ecarules.EcarulesPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecarules.impl.ConceptParamImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptParamImpl extends ActionParamImpl implements ConceptParam {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcarulesPackage.Literals.CONCEPT_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getValue() {
		return (Concept)eGet(EcarulesPackage.Literals.CONCEPT_PARAM__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Concept newValue) {
		eSet(EcarulesPackage.Literals.CONCEPT_PARAM__VALUE, newValue);
	}

} //ConceptParamImpl
