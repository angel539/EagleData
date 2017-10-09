/**
 */
package ecarules.impl;

import ecarules.EcarulesPackage;
import ecarules.NamedElement;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecarules.impl.NamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecarules.impl.NamedElementImpl#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link ecarules.impl.NamedElementImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link ecarules.impl.NamedElementImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamedElementImpl extends DefaultPersistentEObject implements NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcarulesPackage.Literals.NAMED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(EcarulesPackage.Literals.NAMED_ELEMENT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(EcarulesPackage.Literals.NAMED_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NamedElement> getDescriptions() {
		return (EList<NamedElement>)eGet(EcarulesPackage.Literals.NAMED_ELEMENT__DESCRIPTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getDescriptor() {
		return (NamedElement)eGet(EcarulesPackage.Literals.NAMED_ELEMENT__DESCRIPTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptor(NamedElement newDescriptor) {
		eSet(EcarulesPackage.Literals.NAMED_ELEMENT__DESCRIPTOR, newDescriptor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eGet(EcarulesPackage.Literals.NAMED_ELEMENT__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eSet(EcarulesPackage.Literals.NAMED_ELEMENT__VALUE, newValue);
	}

} //NamedElementImpl
