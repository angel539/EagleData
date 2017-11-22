/**
 */
package ecarules.impl;

import ecarules.Concept;
import ecarules.EcarulesPackage;
import ecarules.ParamValue;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import org.eclipse.emf.ecore.EClass;
import query.QueryParam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecarules.impl.ParamValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link ecarules.impl.ParamValueImpl#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParamValueImpl extends DefaultPersistentEObject implements ParamValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParamValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcarulesPackage.Literals.PARAM_VALUE;
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
	public Concept getValue() {
		return (Concept)eGet(EcarulesPackage.Literals.PARAM_VALUE__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Concept newValue) {
		eSet(EcarulesPackage.Literals.PARAM_VALUE__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParam getParam() {
		return (QueryParam)eGet(EcarulesPackage.Literals.PARAM_VALUE__PARAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam(QueryParam newParam) {
		eSet(EcarulesPackage.Literals.PARAM_VALUE__PARAM, newParam);
	}

} //ParamValueImpl
