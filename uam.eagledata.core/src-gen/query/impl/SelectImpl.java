/**
 */
package query.impl;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import query.Condition;
import query.From;
import query.QueryPackage;
import query.QueryParam;
import query.Select;

import semanticmanager.DataProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link query.impl.SelectImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link query.impl.SelectImpl#getFrom <em>From</em>}</li>
 *   <li>{@link query.impl.SelectImpl#isSelectAll <em>Select All</em>}</li>
 *   <li>{@link query.impl.SelectImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link query.impl.SelectImpl#getName <em>Name</em>}</li>
 *   <li>{@link query.impl.SelectImpl#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectImpl extends DefaultPersistentEObject implements Select {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.SELECT;
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
	@SuppressWarnings("unchecked")
	public EList<DataProperty> getSelection() {
		return (EList<DataProperty>)eGet(QueryPackage.Literals.SELECT__SELECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<From> getFrom() {
		return (EList<From>)eGet(QueryPackage.Literals.SELECT__FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelectAll() {
		return (Boolean)eGet(QueryPackage.Literals.SELECT__SELECT_ALL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectAll(boolean newSelectAll) {
		eSet(QueryPackage.Literals.SELECT__SELECT_ALL, newSelectAll);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getWhere() {
		return (Condition)eGet(QueryPackage.Literals.SELECT__WHERE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(Condition newWhere) {
		eSet(QueryPackage.Literals.SELECT__WHERE, newWhere);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(QueryPackage.Literals.SELECT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(QueryPackage.Literals.SELECT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<QueryParam> getParams() {
		return (EList<QueryParam>)eGet(QueryPackage.Literals.SELECT__PARAMS, true);
	}

} //SelectImpl
