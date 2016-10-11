/**
 */
package resources;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see resources.ResourcesFactory
 * @model kind="package"
 * @generated
 */
public interface ResourcesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resources";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.core.eagledata/resources/Resources";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resources";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcesPackage eINSTANCE = resources.impl.ResourcesPackageImpl.init();

	/**
	 * The meta object id for the '{@link resources.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.TableImpl
	 * @see resources.impl.ResourcesPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ROWS = 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link resources.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.RowImpl
	 * @see resources.impl.ResourcesPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 1;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__CELLS = 0;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link resources.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.CellImpl
	 * @see resources.impl.ResourcesPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 2;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link resources.impl.ContentCellImpl <em>Content Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.ContentCellImpl
	 * @see resources.impl.ResourcesPackageImpl#getContentCell()
	 * @generated
	 */
	int CONTENT_CELL = 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_CELL__CONTENT = CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_CELL_FEATURE_COUNT = CELL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Content Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_CELL_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resources.impl.TableCellImpl <em>Table Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.TableCellImpl
	 * @see resources.impl.ResourcesPackageImpl#getTableCell()
	 * @generated
	 */
	int TABLE_CELL = 4;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__TABLE = CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_FEATURE_COUNT = CELL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resources.impl.DataResourceImpl <em>Data Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.DataResourceImpl
	 * @see resources.impl.ResourcesPackageImpl#getDataResource()
	 * @generated
	 */
	int DATA_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__PATH = 0;

	/**
	 * The feature id for the '<em><b>Assistant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__ASSISTANT = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Data Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link resources.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see resources.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link resources.Table#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see resources.Table#getRows()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Rows();

	/**
	 * Returns the meta object for class '{@link resources.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see resources.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link resources.Row#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see resources.Row#getCells()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Cells();

	/**
	 * Returns the meta object for class '{@link resources.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see resources.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for class '{@link resources.ContentCell <em>Content Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Cell</em>'.
	 * @see resources.ContentCell
	 * @generated
	 */
	EClass getContentCell();

	/**
	 * Returns the meta object for the attribute '{@link resources.ContentCell#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see resources.ContentCell#getContent()
	 * @see #getContentCell()
	 * @generated
	 */
	EAttribute getContentCell_Content();

	/**
	 * Returns the meta object for class '{@link resources.TableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Cell</em>'.
	 * @see resources.TableCell
	 * @generated
	 */
	EClass getTableCell();

	/**
	 * Returns the meta object for the reference '{@link resources.TableCell#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see resources.TableCell#getTable()
	 * @see #getTableCell()
	 * @generated
	 */
	EReference getTableCell_Table();

	/**
	 * Returns the meta object for class '{@link resources.DataResource <em>Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Resource</em>'.
	 * @see resources.DataResource
	 * @generated
	 */
	EClass getDataResource();

	/**
	 * Returns the meta object for the attribute '{@link resources.DataResource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see resources.DataResource#getPath()
	 * @see #getDataResource()
	 * @generated
	 */
	EAttribute getDataResource_Path();

	/**
	 * Returns the meta object for the attribute '{@link resources.DataResource#getAssistant <em>Assistant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assistant</em>'.
	 * @see resources.DataResource#getAssistant()
	 * @see #getDataResource()
	 * @generated
	 */
	EAttribute getDataResource_Assistant();

	/**
	 * Returns the meta object for the containment reference '{@link resources.DataResource#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see resources.DataResource#getContent()
	 * @see #getDataResource()
	 * @generated
	 */
	EReference getDataResource_Content();

	/**
	 * Returns the meta object for the reference '{@link resources.DataResource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see resources.DataResource#getDescription()
	 * @see #getDataResource()
	 * @generated
	 */
	EReference getDataResource_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourcesFactory getResourcesFactory();

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
		 * The meta object literal for the '{@link resources.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.TableImpl
		 * @see resources.impl.ResourcesPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ROWS = eINSTANCE.getTable_Rows();

		/**
		 * The meta object literal for the '{@link resources.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.RowImpl
		 * @see resources.impl.ResourcesPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__CELLS = eINSTANCE.getRow_Cells();

		/**
		 * The meta object literal for the '{@link resources.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.CellImpl
		 * @see resources.impl.ResourcesPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '{@link resources.impl.ContentCellImpl <em>Content Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.ContentCellImpl
		 * @see resources.impl.ResourcesPackageImpl#getContentCell()
		 * @generated
		 */
		EClass CONTENT_CELL = eINSTANCE.getContentCell();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_CELL__CONTENT = eINSTANCE.getContentCell_Content();

		/**
		 * The meta object literal for the '{@link resources.impl.TableCellImpl <em>Table Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.TableCellImpl
		 * @see resources.impl.ResourcesPackageImpl#getTableCell()
		 * @generated
		 */
		EClass TABLE_CELL = eINSTANCE.getTableCell();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CELL__TABLE = eINSTANCE.getTableCell_Table();

		/**
		 * The meta object literal for the '{@link resources.impl.DataResourceImpl <em>Data Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.DataResourceImpl
		 * @see resources.impl.ResourcesPackageImpl#getDataResource()
		 * @generated
		 */
		EClass DATA_RESOURCE = eINSTANCE.getDataResource();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE__PATH = eINSTANCE.getDataResource_Path();

		/**
		 * The meta object literal for the '<em><b>Assistant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE__ASSISTANT = eINSTANCE.getDataResource_Assistant();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE__CONTENT = eINSTANCE.getDataResource_Content();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE__DESCRIPTION = eINSTANCE.getDataResource_Description();

	}

} //ResourcesPackage
