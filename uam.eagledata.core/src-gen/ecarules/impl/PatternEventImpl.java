/**
 */
package ecarules.impl;

import ecarules.Concept;
import ecarules.EcarulesPackage;
import ecarules.PatternEvent;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecarules.impl.PatternEventImpl#getConcepts <em>Concepts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternEventImpl extends EventImpl implements PatternEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcarulesPackage.Literals.PATTERN_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Concept> getConcepts() {
		return (EList<Concept>)eGet(EcarulesPackage.Literals.PATTERN_EVENT__CONCEPTS, true);
	}

} //PatternEventImpl
