/**
 */
package resourceset.impl;

import eagledata.core.dsl.pattern.streamingDsl.Feature;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import resourceset.MessagePart;
import resourceset.ResourcesetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resourceset.impl.MessagePartImpl#getTextPart <em>Text Part</em>}</li>
 *   <li>{@link resourceset.impl.MessagePartImpl#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessagePartImpl extends MinimalEObjectImpl.Container implements MessagePart {
	/**
	 * The default value of the '{@link #getTextPart() <em>Text Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPart()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextPart() <em>Text Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPart()
	 * @generated
	 * @ordered
	 */
	protected String textPart = TEXT_PART_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected Feature concept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessagePartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesetPackage.Literals.MESSAGE_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextPart() {
		return textPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextPart(String newTextPart) {
		String oldTextPart = textPart;
		textPart = newTextPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesetPackage.MESSAGE_PART__TEXT_PART, oldTextPart, textPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getConcept() {
		if (concept != null && concept.eIsProxy()) {
			InternalEObject oldConcept = (InternalEObject)concept;
			concept = (Feature)eResolveProxy(oldConcept);
			if (concept != oldConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesetPackage.MESSAGE_PART__CONCEPT, oldConcept, concept));
			}
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetConcept() {
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcept(Feature newConcept) {
		Feature oldConcept = concept;
		concept = newConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesetPackage.MESSAGE_PART__CONCEPT, oldConcept, concept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesetPackage.MESSAGE_PART__TEXT_PART:
				return getTextPart();
			case ResourcesetPackage.MESSAGE_PART__CONCEPT:
				if (resolve) return getConcept();
				return basicGetConcept();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesetPackage.MESSAGE_PART__TEXT_PART:
				setTextPart((String)newValue);
				return;
			case ResourcesetPackage.MESSAGE_PART__CONCEPT:
				setConcept((Feature)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ResourcesetPackage.MESSAGE_PART__TEXT_PART:
				setTextPart(TEXT_PART_EDEFAULT);
				return;
			case ResourcesetPackage.MESSAGE_PART__CONCEPT:
				setConcept((Feature)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ResourcesetPackage.MESSAGE_PART__TEXT_PART:
				return TEXT_PART_EDEFAULT == null ? textPart != null : !TEXT_PART_EDEFAULT.equals(textPart);
			case ResourcesetPackage.MESSAGE_PART__CONCEPT:
				return concept != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (textPart: ");
		result.append(textPart);
		result.append(')');
		return result.toString();
	}

} //MessagePartImpl
