/**
 */
package ecarules.impl;

import ecarules.BinaryExpression;
import ecarules.Concept;
import ecarules.EcarulesPackage;
import ecarules.Literal;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecarules.impl.BinaryExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link ecarules.impl.BinaryExpressionImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryExpressionImpl extends ConditionImpl implements BinaryExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcarulesPackage.Literals.BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getLeft() {
		return (Concept)eGet(EcarulesPackage.Literals.BINARY_EXPRESSION__LEFT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(Concept newLeft) {
		eSet(EcarulesPackage.Literals.BINARY_EXPRESSION__LEFT, newLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getRight() {
		return (Literal)eGet(EcarulesPackage.Literals.BINARY_EXPRESSION__RIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(Literal newRight) {
		eSet(EcarulesPackage.Literals.BINARY_EXPRESSION__RIGHT, newRight);
	}

} //BinaryExpressionImpl
