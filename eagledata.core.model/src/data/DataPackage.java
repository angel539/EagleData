/**
 */
package data;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see data.DataFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface DataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/eagledata/core/model/data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eagledata.core.model.data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link data.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.NamedElementImpl
	 * @see data.impl.DataPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__OPTIONS = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.impl.DataDescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.DataDescriptionImpl
	 * @see data.impl.DataPackageImpl#getDataDescription()
	 * @generated
	 */
	int DATA_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DESCRIPTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DESCRIPTION__OPTIONS = NAMED_ELEMENT__OPTIONS;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DESCRIPTION__NODES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datasource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DESCRIPTION__DATASOURCE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DESCRIPTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DESCRIPTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.impl.DataSourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.DataSourceImpl
	 * @see data.impl.DataPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = DATA_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__OPTIONS = DATA_DESCRIPTION__OPTIONS;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NODES = DATA_DESCRIPTION__NODES;

	/**
	 * The feature id for the '<em><b>Datasource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DATASOURCE = DATA_DESCRIPTION__DATASOURCE;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__LINK = DATA_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__FORMAT = DATA_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__FRAGMENTS = DATA_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = DATA_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = DATA_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.impl.NamedParameterImpl <em>Named Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.NamedParameterImpl
	 * @see data.impl.DataPackageImpl#getNamedParameter()
	 * @generated
	 */
	int NAMED_PARAMETER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PARAMETER__OPTIONS = NAMED_ELEMENT__OPTIONS;

	/**
	 * The number of structural features of the '<em>Named Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Named Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PARAMETER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.NodeImpl
	 * @see data.impl.DataPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = NAMED_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OPTIONS = NAMED_PARAMETER__OPTIONS;

	/**
	 * The feature id for the '<em><b>Represented As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__REPRESENTED_AS = NAMED_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DATADESCRIPTION = NAMED_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compositenode</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COMPOSITENODE = NAMED_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = NAMED_PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = NAMED_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.impl.CompositeNodeImpl <em>Composite Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.CompositeNodeImpl
	 * @see data.impl.DataPackageImpl#getCompositeNode()
	 * @generated
	 */
	int COMPOSITE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__OPTIONS = NODE__OPTIONS;

	/**
	 * The feature id for the '<em><b>Represented As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__REPRESENTED_AS = NODE__REPRESENTED_AS;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__DATADESCRIPTION = NODE__DATADESCRIPTION;

	/**
	 * The feature id for the '<em><b>Compositenode</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__COMPOSITENODE = NODE__COMPOSITENODE;

	/**
	 * The feature id for the '<em><b>Subnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__SUBNODES = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__EXTENDS = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deprecations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__DEPRECATIONS = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__ENVIRONMENT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Composite Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Composite Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.impl.LeafNodeImpl <em>Leaf Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.LeafNodeImpl
	 * @see data.impl.DataPackageImpl#getLeafNode()
	 * @generated
	 */
	int LEAF_NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__OPTIONS = NODE__OPTIONS;

	/**
	 * The feature id for the '<em><b>Represented As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__REPRESENTED_AS = NODE__REPRESENTED_AS;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__DATADESCRIPTION = NODE__DATADESCRIPTION;

	/**
	 * The feature id for the '<em><b>Compositenode</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__COMPOSITENODE = NODE__COMPOSITENODE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__KEY = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__UNIQUE = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__TYPE = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__KEYWORD = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Leaf Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Leaf Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.impl.DataFragmentImpl <em>Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.DataFragmentImpl
	 * @see data.impl.DataPackageImpl#getDataFragment()
	 * @generated
	 */
	int DATA_FRAGMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FRAGMENT__NAME = DATA_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FRAGMENT__OPTIONS = DATA_DESCRIPTION__OPTIONS;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FRAGMENT__NODES = DATA_DESCRIPTION__NODES;

	/**
	 * The feature id for the '<em><b>Datasource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FRAGMENT__DATASOURCE = DATA_DESCRIPTION__DATASOURCE;

	/**
	 * The number of structural features of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FRAGMENT_FEATURE_COUNT = DATA_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FRAGMENT_OPERATION_COUNT = DATA_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.impl.DataModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.DataModelImpl
	 * @see data.impl.DataPackageImpl#getDataModel()
	 * @generated
	 */
	int DATA_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__IMPORT_URI = 0;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DESCRIPTIONS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.impl.NodeDeprecationImpl <em>Node Deprecation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.NodeDeprecationImpl
	 * @see data.impl.DataPackageImpl#getNodeDeprecation()
	 * @generated
	 */
	int NODE_DEPRECATION = 10;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEPRECATION__DEPRECATED = 0;

	/**
	 * The number of structural features of the '<em>Node Deprecation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEPRECATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node Deprecation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEPRECATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.impl.RemoveImpl <em>Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.RemoveImpl
	 * @see data.impl.DataPackageImpl#getRemove()
	 * @generated
	 */
	int REMOVE = 7;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__DEPRECATED = NODE_DEPRECATION__DEPRECATED;

	/**
	 * The number of structural features of the '<em>Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_COUNT = NODE_DEPRECATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OPERATION_COUNT = NODE_DEPRECATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.impl.RetypeImpl <em>Retype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.RetypeImpl
	 * @see data.impl.DataPackageImpl#getRetype()
	 * @generated
	 */
	int RETYPE = 8;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETYPE__DEPRECATED = NODE_DEPRECATION__DEPRECATED;

	/**
	 * The feature id for the '<em><b>New Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETYPE__NEW_TYPE = NODE_DEPRECATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Retype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETYPE_FEATURE_COUNT = NODE_DEPRECATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Retype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETYPE_OPERATION_COUNT = NODE_DEPRECATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.impl.RenameImpl <em>Rename</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.RenameImpl
	 * @see data.impl.DataPackageImpl#getRename()
	 * @generated
	 */
	int RENAME = 9;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME__DEPRECATED = NODE_DEPRECATION__DEPRECATED;

	/**
	 * The feature id for the '<em><b>New Represented As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME__NEW_REPRESENTED_AS = NODE_DEPRECATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rename</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_FEATURE_COUNT = NODE_DEPRECATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rename</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_OPERATION_COUNT = NODE_DEPRECATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.OptionImpl
	 * @see data.impl.DataPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 13;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__KEY = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUES = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.impl.FormatSpecificationImpl <em>Format Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.FormatSpecificationImpl
	 * @see data.impl.DataPackageImpl#getFormatSpecification()
	 * @generated
	 */
	int FORMAT_SPECIFICATION = 14;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_SPECIFICATION__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Special Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_SPECIFICATION__SPECIAL_FORMAT = 1;

	/**
	 * The number of structural features of the '<em>Format Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Format Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.impl.TypeSpecificationImpl <em>Type Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.TypeSpecificationImpl
	 * @see data.impl.DataPackageImpl#getTypeSpecification()
	 * @generated
	 */
	int TYPE_SPECIFICATION = 17;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFICATION__MAX = 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFICATION__MIN = 1;

	/**
	 * The number of structural features of the '<em>Type Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.impl.DataTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.DataTypeImpl
	 * @see data.impl.DataPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__MAX = TYPE_SPECIFICATION__MAX;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__MIN = TYPE_SPECIFICATION__MIN;

	/**
	 * The feature id for the '<em><b>Special Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SPECIAL_TYPE = TYPE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TYPE = TYPE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = TYPE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = TYPE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.ReferenceImpl
	 * @see data.impl.DataPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 16;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__MAX = TYPE_SPECIFICATION__MAX;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__MIN = TYPE_SPECIFICATION__MIN;

	/**
	 * The feature id for the '<em><b>Reference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENCE_TYPE = TYPE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = TYPE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = TYPE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.TypeKind <em>Type Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.TypeKind
	 * @see data.impl.DataPackageImpl#getTypeKind()
	 * @generated
	 */
	int TYPE_KIND = 18;

	/**
	 * The meta object id for the '{@link data.FormatKind <em>Format Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.FormatKind
	 * @see data.impl.DataPackageImpl#getFormatKind()
	 * @generated
	 */
	int FORMAT_KIND = 19;


	/**
	 * Returns the meta object for class '{@link data.DataSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see data.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute list '{@link data.DataSource#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Link</em>'.
	 * @see data.DataSource#getLink()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Link();

	/**
	 * Returns the meta object for the containment reference '{@link data.DataSource#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Format</em>'.
	 * @see data.DataSource#getFormat()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_Format();

	/**
	 * Returns the meta object for the reference list '{@link data.DataSource#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fragments</em>'.
	 * @see data.DataSource#getFragments()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_Fragments();

	/**
	 * Returns the meta object for class '{@link data.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see data.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link data.Node#getRepresentedAs <em>Represented As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Represented As</em>'.
	 * @see data.Node#getRepresentedAs()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_RepresentedAs();

	/**
	 * Returns the meta object for the container reference '{@link data.Node#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Datadescription</em>'.
	 * @see data.Node#getDatadescription()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Datadescription();

	/**
	 * Returns the meta object for the container reference '{@link data.Node#getCompositenode <em>Compositenode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Compositenode</em>'.
	 * @see data.Node#getCompositenode()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Compositenode();

	/**
	 * Returns the meta object for class '{@link data.CompositeNode <em>Composite Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Node</em>'.
	 * @see data.CompositeNode
	 * @generated
	 */
	EClass getCompositeNode();

	/**
	 * Returns the meta object for the containment reference list '{@link data.CompositeNode#getSubnodes <em>Subnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subnodes</em>'.
	 * @see data.CompositeNode#getSubnodes()
	 * @see #getCompositeNode()
	 * @generated
	 */
	EReference getCompositeNode_Subnodes();

	/**
	 * Returns the meta object for the reference list '{@link data.CompositeNode#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see data.CompositeNode#getExtends()
	 * @see #getCompositeNode()
	 * @generated
	 */
	EReference getCompositeNode_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link data.CompositeNode#getDeprecations <em>Deprecations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deprecations</em>'.
	 * @see data.CompositeNode#getDeprecations()
	 * @see #getCompositeNode()
	 * @generated
	 */
	EReference getCompositeNode_Deprecations();

	/**
	 * Returns the meta object for the attribute '{@link data.CompositeNode#isEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see data.CompositeNode#isEnvironment()
	 * @see #getCompositeNode()
	 * @generated
	 */
	EAttribute getCompositeNode_Environment();

	/**
	 * Returns the meta object for class '{@link data.LeafNode <em>Leaf Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Node</em>'.
	 * @see data.LeafNode
	 * @generated
	 */
	EClass getLeafNode();

	/**
	 * Returns the meta object for the attribute '{@link data.LeafNode#isKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see data.LeafNode#isKey()
	 * @see #getLeafNode()
	 * @generated
	 */
	EAttribute getLeafNode_Key();

	/**
	 * Returns the meta object for the attribute '{@link data.LeafNode#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see data.LeafNode#isUnique()
	 * @see #getLeafNode()
	 * @generated
	 */
	EAttribute getLeafNode_Unique();

	/**
	 * Returns the meta object for the containment reference '{@link data.LeafNode#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see data.LeafNode#getType()
	 * @see #getLeafNode()
	 * @generated
	 */
	EReference getLeafNode_Type();

	/**
	 * Returns the meta object for the attribute '{@link data.LeafNode#isKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see data.LeafNode#isKeyword()
	 * @see #getLeafNode()
	 * @generated
	 */
	EAttribute getLeafNode_Keyword();

	/**
	 * Returns the meta object for class '{@link data.DataFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment</em>'.
	 * @see data.DataFragment
	 * @generated
	 */
	EClass getDataFragment();

	/**
	 * Returns the meta object for class '{@link data.DataDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see data.DataDescription
	 * @generated
	 */
	EClass getDataDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link data.DataDescription#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see data.DataDescription#getNodes()
	 * @see #getDataDescription()
	 * @generated
	 */
	EReference getDataDescription_Nodes();

	/**
	 * Returns the meta object for the container reference '{@link data.DataDescription#getDatasource <em>Datasource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Datasource</em>'.
	 * @see data.DataDescription#getDatasource()
	 * @see #getDataDescription()
	 * @generated
	 */
	EReference getDataDescription_Datasource();

	/**
	 * Returns the meta object for class '{@link data.DataModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see data.DataModel
	 * @generated
	 */
	EClass getDataModel();

	/**
	 * Returns the meta object for the attribute list '{@link data.DataModel#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Import URI</em>'.
	 * @see data.DataModel#getImportURI()
	 * @see #getDataModel()
	 * @generated
	 */
	EAttribute getDataModel_ImportURI();

	/**
	 * Returns the meta object for the containment reference list '{@link data.DataModel#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see data.DataModel#getDescriptions()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Descriptions();

	/**
	 * Returns the meta object for class '{@link data.Remove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove</em>'.
	 * @see data.Remove
	 * @generated
	 */
	EClass getRemove();

	/**
	 * Returns the meta object for class '{@link data.Retype <em>Retype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retype</em>'.
	 * @see data.Retype
	 * @generated
	 */
	EClass getRetype();

	/**
	 * Returns the meta object for the containment reference '{@link data.Retype#getNewType <em>New Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Type</em>'.
	 * @see data.Retype#getNewType()
	 * @see #getRetype()
	 * @generated
	 */
	EReference getRetype_NewType();

	/**
	 * Returns the meta object for class '{@link data.Rename <em>Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename</em>'.
	 * @see data.Rename
	 * @generated
	 */
	EClass getRename();

	/**
	 * Returns the meta object for the attribute '{@link data.Rename#getNewRepresentedAs <em>New Represented As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Represented As</em>'.
	 * @see data.Rename#getNewRepresentedAs()
	 * @see #getRename()
	 * @generated
	 */
	EAttribute getRename_NewRepresentedAs();

	/**
	 * Returns the meta object for class '{@link data.NodeDeprecation <em>Node Deprecation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Deprecation</em>'.
	 * @see data.NodeDeprecation
	 * @generated
	 */
	EClass getNodeDeprecation();

	/**
	 * Returns the meta object for the reference '{@link data.NodeDeprecation#getDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deprecated</em>'.
	 * @see data.NodeDeprecation#getDeprecated()
	 * @see #getNodeDeprecation()
	 * @generated
	 */
	EReference getNodeDeprecation_Deprecated();

	/**
	 * Returns the meta object for class '{@link data.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see data.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link data.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see data.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link data.NamedElement#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see data.NamedElement#getOptions()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_Options();

	/**
	 * Returns the meta object for class '{@link data.NamedParameter <em>Named Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Parameter</em>'.
	 * @see data.NamedParameter
	 * @generated
	 */
	EClass getNamedParameter();

	/**
	 * Returns the meta object for class '{@link data.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see data.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link data.Option#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see data.Option#getKey()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Key();

	/**
	 * Returns the meta object for the attribute list '{@link data.Option#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see data.Option#getValues()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Values();

	/**
	 * Returns the meta object for class '{@link data.FormatSpecification <em>Format Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Format Specification</em>'.
	 * @see data.FormatSpecification
	 * @generated
	 */
	EClass getFormatSpecification();

	/**
	 * Returns the meta object for the attribute '{@link data.FormatSpecification#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see data.FormatSpecification#getFormat()
	 * @see #getFormatSpecification()
	 * @generated
	 */
	EAttribute getFormatSpecification_Format();

	/**
	 * Returns the meta object for the attribute '{@link data.FormatSpecification#getSpecialFormat <em>Special Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special Format</em>'.
	 * @see data.FormatSpecification#getSpecialFormat()
	 * @see #getFormatSpecification()
	 * @generated
	 */
	EAttribute getFormatSpecification_SpecialFormat();

	/**
	 * Returns the meta object for class '{@link data.DataType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see data.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link data.DataType#getSpecialType <em>Special Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special Type</em>'.
	 * @see data.DataType#getSpecialType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_SpecialType();

	/**
	 * Returns the meta object for the attribute '{@link data.DataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see data.DataType#getType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Type();

	/**
	 * Returns the meta object for class '{@link data.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see data.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link data.Reference#getReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Type</em>'.
	 * @see data.Reference#getReferenceType()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_ReferenceType();

	/**
	 * Returns the meta object for class '{@link data.TypeSpecification <em>Type Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Specification</em>'.
	 * @see data.TypeSpecification
	 * @generated
	 */
	EClass getTypeSpecification();

	/**
	 * Returns the meta object for the attribute '{@link data.TypeSpecification#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see data.TypeSpecification#getMax()
	 * @see #getTypeSpecification()
	 * @generated
	 */
	EAttribute getTypeSpecification_Max();

	/**
	 * Returns the meta object for the attribute '{@link data.TypeSpecification#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see data.TypeSpecification#getMin()
	 * @see #getTypeSpecification()
	 * @generated
	 */
	EAttribute getTypeSpecification_Min();

	/**
	 * Returns the meta object for enum '{@link data.TypeKind <em>Type Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Kind</em>'.
	 * @see data.TypeKind
	 * @generated
	 */
	EEnum getTypeKind();

	/**
	 * Returns the meta object for enum '{@link data.FormatKind <em>Format Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Format Kind</em>'.
	 * @see data.FormatKind
	 * @generated
	 */
	EEnum getFormatKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link data.impl.DataSourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.DataSourceImpl
		 * @see data.impl.DataPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__LINK = eINSTANCE.getDataSource_Link();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__FORMAT = eINSTANCE.getDataSource_Format();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__FRAGMENTS = eINSTANCE.getDataSource_Fragments();

		/**
		 * The meta object literal for the '{@link data.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.NodeImpl
		 * @see data.impl.DataPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Represented As</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__REPRESENTED_AS = eINSTANCE.getNode_RepresentedAs();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__DATADESCRIPTION = eINSTANCE.getNode_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Compositenode</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__COMPOSITENODE = eINSTANCE.getNode_Compositenode();

		/**
		 * The meta object literal for the '{@link data.impl.CompositeNodeImpl <em>Composite Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.CompositeNodeImpl
		 * @see data.impl.DataPackageImpl#getCompositeNode()
		 * @generated
		 */
		EClass COMPOSITE_NODE = eINSTANCE.getCompositeNode();

		/**
		 * The meta object literal for the '<em><b>Subnodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_NODE__SUBNODES = eINSTANCE.getCompositeNode_Subnodes();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_NODE__EXTENDS = eINSTANCE.getCompositeNode_Extends();

		/**
		 * The meta object literal for the '<em><b>Deprecations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_NODE__DEPRECATIONS = eINSTANCE.getCompositeNode_Deprecations();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_NODE__ENVIRONMENT = eINSTANCE.getCompositeNode_Environment();

		/**
		 * The meta object literal for the '{@link data.impl.LeafNodeImpl <em>Leaf Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.LeafNodeImpl
		 * @see data.impl.DataPackageImpl#getLeafNode()
		 * @generated
		 */
		EClass LEAF_NODE = eINSTANCE.getLeafNode();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF_NODE__KEY = eINSTANCE.getLeafNode_Key();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF_NODE__UNIQUE = eINSTANCE.getLeafNode_Unique();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_NODE__TYPE = eINSTANCE.getLeafNode_Type();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF_NODE__KEYWORD = eINSTANCE.getLeafNode_Keyword();

		/**
		 * The meta object literal for the '{@link data.impl.DataFragmentImpl <em>Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.DataFragmentImpl
		 * @see data.impl.DataPackageImpl#getDataFragment()
		 * @generated
		 */
		EClass DATA_FRAGMENT = eINSTANCE.getDataFragment();

		/**
		 * The meta object literal for the '{@link data.impl.DataDescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.DataDescriptionImpl
		 * @see data.impl.DataPackageImpl#getDataDescription()
		 * @generated
		 */
		EClass DATA_DESCRIPTION = eINSTANCE.getDataDescription();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DESCRIPTION__NODES = eINSTANCE.getDataDescription_Nodes();

		/**
		 * The meta object literal for the '<em><b>Datasource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DESCRIPTION__DATASOURCE = eINSTANCE.getDataDescription_Datasource();

		/**
		 * The meta object literal for the '{@link data.impl.DataModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.DataModelImpl
		 * @see data.impl.DataPackageImpl#getDataModel()
		 * @generated
		 */
		EClass DATA_MODEL = eINSTANCE.getDataModel();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MODEL__IMPORT_URI = eINSTANCE.getDataModel_ImportURI();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__DESCRIPTIONS = eINSTANCE.getDataModel_Descriptions();

		/**
		 * The meta object literal for the '{@link data.impl.RemoveImpl <em>Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.RemoveImpl
		 * @see data.impl.DataPackageImpl#getRemove()
		 * @generated
		 */
		EClass REMOVE = eINSTANCE.getRemove();

		/**
		 * The meta object literal for the '{@link data.impl.RetypeImpl <em>Retype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.RetypeImpl
		 * @see data.impl.DataPackageImpl#getRetype()
		 * @generated
		 */
		EClass RETYPE = eINSTANCE.getRetype();

		/**
		 * The meta object literal for the '<em><b>New Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETYPE__NEW_TYPE = eINSTANCE.getRetype_NewType();

		/**
		 * The meta object literal for the '{@link data.impl.RenameImpl <em>Rename</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.RenameImpl
		 * @see data.impl.DataPackageImpl#getRename()
		 * @generated
		 */
		EClass RENAME = eINSTANCE.getRename();

		/**
		 * The meta object literal for the '<em><b>New Represented As</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME__NEW_REPRESENTED_AS = eINSTANCE.getRename_NewRepresentedAs();

		/**
		 * The meta object literal for the '{@link data.impl.NodeDeprecationImpl <em>Node Deprecation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.NodeDeprecationImpl
		 * @see data.impl.DataPackageImpl#getNodeDeprecation()
		 * @generated
		 */
		EClass NODE_DEPRECATION = eINSTANCE.getNodeDeprecation();

		/**
		 * The meta object literal for the '<em><b>Deprecated</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_DEPRECATION__DEPRECATED = eINSTANCE.getNodeDeprecation_Deprecated();

		/**
		 * The meta object literal for the '{@link data.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.NamedElementImpl
		 * @see data.impl.DataPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__OPTIONS = eINSTANCE.getNamedElement_Options();

		/**
		 * The meta object literal for the '{@link data.impl.NamedParameterImpl <em>Named Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.NamedParameterImpl
		 * @see data.impl.DataPackageImpl#getNamedParameter()
		 * @generated
		 */
		EClass NAMED_PARAMETER = eINSTANCE.getNamedParameter();

		/**
		 * The meta object literal for the '{@link data.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.OptionImpl
		 * @see data.impl.DataPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__KEY = eINSTANCE.getOption_Key();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__VALUES = eINSTANCE.getOption_Values();

		/**
		 * The meta object literal for the '{@link data.impl.FormatSpecificationImpl <em>Format Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.FormatSpecificationImpl
		 * @see data.impl.DataPackageImpl#getFormatSpecification()
		 * @generated
		 */
		EClass FORMAT_SPECIFICATION = eINSTANCE.getFormatSpecification();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAT_SPECIFICATION__FORMAT = eINSTANCE.getFormatSpecification_Format();

		/**
		 * The meta object literal for the '<em><b>Special Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAT_SPECIFICATION__SPECIAL_FORMAT = eINSTANCE.getFormatSpecification_SpecialFormat();

		/**
		 * The meta object literal for the '{@link data.impl.DataTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.DataTypeImpl
		 * @see data.impl.DataPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Special Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__SPECIAL_TYPE = eINSTANCE.getDataType_SpecialType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__TYPE = eINSTANCE.getDataType_Type();

		/**
		 * The meta object literal for the '{@link data.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.ReferenceImpl
		 * @see data.impl.DataPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Reference Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REFERENCE_TYPE = eINSTANCE.getReference_ReferenceType();

		/**
		 * The meta object literal for the '{@link data.impl.TypeSpecificationImpl <em>Type Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.TypeSpecificationImpl
		 * @see data.impl.DataPackageImpl#getTypeSpecification()
		 * @generated
		 */
		EClass TYPE_SPECIFICATION = eINSTANCE.getTypeSpecification();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SPECIFICATION__MAX = eINSTANCE.getTypeSpecification_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SPECIFICATION__MIN = eINSTANCE.getTypeSpecification_Min();

		/**
		 * The meta object literal for the '{@link data.TypeKind <em>Type Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.TypeKind
		 * @see data.impl.DataPackageImpl#getTypeKind()
		 * @generated
		 */
		EEnum TYPE_KIND = eINSTANCE.getTypeKind();

		/**
		 * The meta object literal for the '{@link data.FormatKind <em>Format Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.FormatKind
		 * @see data.impl.DataPackageImpl#getFormatKind()
		 * @generated
		 */
		EEnum FORMAT_KIND = eINSTANCE.getFormatKind();

	}

} //DataPackage
