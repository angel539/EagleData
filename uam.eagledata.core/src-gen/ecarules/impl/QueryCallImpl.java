/**
 */
package ecarules.impl;

import ecarules.EcarulesPackage;
import ecarules.Method;
import ecarules.ParamValue;
import ecarules.QueryCall;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import query.Select;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecarules.impl.QueryCallImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link ecarules.impl.QueryCallImpl#getQueryParams <em>Query Params</em>}</li>
 *   <li>{@link ecarules.impl.QueryCallImpl#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryCallImpl extends ActionImpl implements QueryCall {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcarulesPackage.Literals.QUERY_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Select getSelect() {
		return (Select)eGet(EcarulesPackage.Literals.QUERY_CALL__SELECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelect(Select newSelect) {
		eSet(EcarulesPackage.Literals.QUERY_CALL__SELECT, newSelect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParamValue> getQueryParams() {
		return (EList<ParamValue>)eGet(EcarulesPackage.Literals.QUERY_CALL__QUERY_PARAMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Method getMethod() {
		return (Method)eGet(EcarulesPackage.Literals.QUERY_CALL__METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Method newMethod) {
		eSet(EcarulesPackage.Literals.QUERY_CALL__METHOD, newMethod);
	}

} //QueryCallImpl
