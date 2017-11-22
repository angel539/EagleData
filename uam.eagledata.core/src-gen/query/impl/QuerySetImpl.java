/**
 */
package query.impl;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import query.QueryPackage;
import query.QuerySet;
import query.Select;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link query.impl.QuerySetImpl#getQueries <em>Queries</em>}</li>
 *   <li>{@link query.impl.QuerySetImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link query.impl.QuerySetImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuerySetImpl extends DefaultPersistentEObject implements QuerySet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuerySetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.QUERY_SET;
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
	public EList<Select> getQueries() {
		return (EList<Select>)eGet(QueryPackage.Literals.QUERY_SET__QUERIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getImportedNamespace() {
		return (EList<String>)eGet(QueryPackage.Literals.QUERY_SET__IMPORTED_NAMESPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(QueryPackage.Literals.QUERY_SET__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(QueryPackage.Literals.QUERY_SET__NAME, newName);
	}

} //QuerySetImpl
