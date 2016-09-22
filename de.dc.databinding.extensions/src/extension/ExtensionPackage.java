/**
 */
package extension;

import org.eclipse.e4.ui.model.application.ui.basic.impl.BasicPackageImpl;

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
 * @see extension.ExtensionFactory
 * @model kind="package"
 * @generated
 */
public interface ExtensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://chqu1012.de/extension";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "extension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionPackage eINSTANCE = extension.impl.ExtensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link extension.impl.FormPartImpl <em>Form Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extension.impl.FormPartImpl
	 * @see extension.impl.ExtensionPackageImpl#getFormPart()
	 * @generated
	 */
	int FORM_PART = 0;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__ELEMENT_ID = BasicPackageImpl.PART__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Persisted State</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__PERSISTED_STATE = BasicPackageImpl.PART__PERSISTED_STATE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__TAGS = BasicPackageImpl.PART__TAGS;

	/**
	 * The feature id for the '<em><b>Contributor URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__CONTRIBUTOR_URI = BasicPackageImpl.PART__CONTRIBUTOR_URI;

	/**
	 * The feature id for the '<em><b>Transient Data</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__TRANSIENT_DATA = BasicPackageImpl.PART__TRANSIENT_DATA;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__WIDGET = BasicPackageImpl.PART__WIDGET;

	/**
	 * The feature id for the '<em><b>Renderer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__RENDERER = BasicPackageImpl.PART__RENDERER;

	/**
	 * The feature id for the '<em><b>To Be Rendered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__TO_BE_RENDERED = BasicPackageImpl.PART__TO_BE_RENDERED;

	/**
	 * The feature id for the '<em><b>On Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__ON_TOP = BasicPackageImpl.PART__ON_TOP;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__VISIBLE = BasicPackageImpl.PART__VISIBLE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__PARENT = BasicPackageImpl.PART__PARENT;

	/**
	 * The feature id for the '<em><b>Container Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__CONTAINER_DATA = BasicPackageImpl.PART__CONTAINER_DATA;

	/**
	 * The feature id for the '<em><b>Cur Shared Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__CUR_SHARED_REF = BasicPackageImpl.PART__CUR_SHARED_REF;

	/**
	 * The feature id for the '<em><b>Visible When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__VISIBLE_WHEN = BasicPackageImpl.PART__VISIBLE_WHEN;

	/**
	 * The feature id for the '<em><b>Accessibility Phrase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__ACCESSIBILITY_PHRASE = BasicPackageImpl.PART__ACCESSIBILITY_PHRASE;

	/**
	 * The feature id for the '<em><b>Localized Accessibility Phrase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__LOCALIZED_ACCESSIBILITY_PHRASE = BasicPackageImpl.PART__LOCALIZED_ACCESSIBILITY_PHRASE;

	/**
	 * The feature id for the '<em><b>Contribution URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__CONTRIBUTION_URI = BasicPackageImpl.PART__CONTRIBUTION_URI;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__OBJECT = BasicPackageImpl.PART__OBJECT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__CONTEXT = BasicPackageImpl.PART__CONTEXT;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__VARIABLES = BasicPackageImpl.PART__VARIABLES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__PROPERTIES = BasicPackageImpl.PART__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__LABEL = BasicPackageImpl.PART__LABEL;

	/**
	 * The feature id for the '<em><b>Icon URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__ICON_URI = BasicPackageImpl.PART__ICON_URI;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__TOOLTIP = BasicPackageImpl.PART__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Localized Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__LOCALIZED_LABEL = BasicPackageImpl.PART__LOCALIZED_LABEL;

	/**
	 * The feature id for the '<em><b>Localized Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__LOCALIZED_TOOLTIP = BasicPackageImpl.PART__LOCALIZED_TOOLTIP;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__HANDLERS = BasicPackageImpl.PART__HANDLERS;

	/**
	 * The feature id for the '<em><b>Dirty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__DIRTY = BasicPackageImpl.PART__DIRTY;

	/**
	 * The feature id for the '<em><b>Binding Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__BINDING_CONTEXTS = BasicPackageImpl.PART__BINDING_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Menus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__MENUS = BasicPackageImpl.PART__MENUS;

	/**
	 * The feature id for the '<em><b>Toolbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__TOOLBAR = BasicPackageImpl.PART__TOOLBAR;

	/**
	 * The feature id for the '<em><b>Closeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__CLOSEABLE = BasicPackageImpl.PART__CLOSEABLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__DESCRIPTION = BasicPackageImpl.PART__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Localized Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__LOCALIZED_DESCRIPTION = BasicPackageImpl.PART__LOCALIZED_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__COMPOSITES = BasicPackageImpl.PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__WIDTH = BasicPackageImpl.PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__HEIGHT = BasicPackageImpl.PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__LAYOUT = BasicPackageImpl.PART_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART__LAYOUT_DATA = BasicPackageImpl.PART_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Form Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART_FEATURE_COUNT = BasicPackageImpl.PART_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Update Localization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART___UPDATE_LOCALIZATION = BasicPackageImpl.PART___UPDATE_LOCALIZATION;

	/**
	 * The number of operations of the '<em>Form Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PART_OPERATION_COUNT = BasicPackageImpl.PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extension.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extension.impl.CompositeImpl
	 * @see extension.impl.ExtensionPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 1;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__LAYOUT = 0;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link extension.impl.LayoutDataImpl <em>Layout Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extension.impl.LayoutDataImpl
	 * @see extension.impl.ExtensionPackageImpl#getLayoutData()
	 * @generated
	 */
	int LAYOUT_DATA = 2;

	/**
	 * The number of structural features of the '<em>Layout Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Layout Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link extension.impl.GridDataImpl <em>Grid Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extension.impl.GridDataImpl
	 * @see extension.impl.ExtensionPackageImpl#getGridData()
	 * @generated
	 */
	int GRID_DATA = 3;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA__HORIZONTAL_ALIGNMENT = LAYOUT_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA__VERTICAL_ALIGNMENT = LAYOUT_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Horizonral Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA__HORIZONRAL_SPAN = LAYOUT_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vertical Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA__VERTICAL_SPAN = LAYOUT_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Grid Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA_FEATURE_COUNT = LAYOUT_DATA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Grid Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA_OPERATION_COUNT = LAYOUT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extension.Layout <em>Layout</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extension.Layout
	 * @see extension.impl.ExtensionPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 4;


	/**
	 * Returns the meta object for class '{@link extension.FormPart <em>Form Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Part</em>'.
	 * @see extension.FormPart
	 * @generated
	 */
	EClass getFormPart();

	/**
	 * Returns the meta object for the containment reference list '{@link extension.FormPart#getComposites <em>Composites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composites</em>'.
	 * @see extension.FormPart#getComposites()
	 * @see #getFormPart()
	 * @generated
	 */
	EReference getFormPart_Composites();

	/**
	 * Returns the meta object for the attribute '{@link extension.FormPart#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see extension.FormPart#getWidth()
	 * @see #getFormPart()
	 * @generated
	 */
	EAttribute getFormPart_Width();

	/**
	 * Returns the meta object for the attribute '{@link extension.FormPart#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see extension.FormPart#getHeight()
	 * @see #getFormPart()
	 * @generated
	 */
	EAttribute getFormPart_Height();

	/**
	 * Returns the meta object for the attribute '{@link extension.FormPart#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see extension.FormPart#getLayout()
	 * @see #getFormPart()
	 * @generated
	 */
	EAttribute getFormPart_Layout();

	/**
	 * Returns the meta object for the containment reference '{@link extension.FormPart#getLayoutData <em>Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Data</em>'.
	 * @see extension.FormPart#getLayoutData()
	 * @see #getFormPart()
	 * @generated
	 */
	EReference getFormPart_LayoutData();

	/**
	 * Returns the meta object for class '{@link extension.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see extension.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the attribute '{@link extension.Composite#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see extension.Composite#getLayout()
	 * @see #getComposite()
	 * @generated
	 */
	EAttribute getComposite_Layout();

	/**
	 * Returns the meta object for class '{@link extension.LayoutData <em>Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Data</em>'.
	 * @see extension.LayoutData
	 * @generated
	 */
	EClass getLayoutData();

	/**
	 * Returns the meta object for class '{@link extension.GridData <em>Grid Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Data</em>'.
	 * @see extension.GridData
	 * @generated
	 */
	EClass getGridData();

	/**
	 * Returns the meta object for the attribute '{@link extension.GridData#getHorizontalAlignment <em>Horizontal Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Alignment</em>'.
	 * @see extension.GridData#getHorizontalAlignment()
	 * @see #getGridData()
	 * @generated
	 */
	EAttribute getGridData_HorizontalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link extension.GridData#getVerticalAlignment <em>Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Alignment</em>'.
	 * @see extension.GridData#getVerticalAlignment()
	 * @see #getGridData()
	 * @generated
	 */
	EAttribute getGridData_VerticalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link extension.GridData#isHorizonralSpan <em>Horizonral Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizonral Span</em>'.
	 * @see extension.GridData#isHorizonralSpan()
	 * @see #getGridData()
	 * @generated
	 */
	EAttribute getGridData_HorizonralSpan();

	/**
	 * Returns the meta object for the attribute '{@link extension.GridData#isVerticalSpan <em>Vertical Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Span</em>'.
	 * @see extension.GridData#isVerticalSpan()
	 * @see #getGridData()
	 * @generated
	 */
	EAttribute getGridData_VerticalSpan();

	/**
	 * Returns the meta object for enum '{@link extension.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout</em>'.
	 * @see extension.Layout
	 * @generated
	 */
	EEnum getLayout();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtensionFactory getExtensionFactory();

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
		 * The meta object literal for the '{@link extension.impl.FormPartImpl <em>Form Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extension.impl.FormPartImpl
		 * @see extension.impl.ExtensionPackageImpl#getFormPart()
		 * @generated
		 */
		EClass FORM_PART = eINSTANCE.getFormPart();

		/**
		 * The meta object literal for the '<em><b>Composites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_PART__COMPOSITES = eINSTANCE.getFormPart_Composites();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_PART__WIDTH = eINSTANCE.getFormPart_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_PART__HEIGHT = eINSTANCE.getFormPart_Height();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_PART__LAYOUT = eINSTANCE.getFormPart_Layout();

		/**
		 * The meta object literal for the '<em><b>Layout Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_PART__LAYOUT_DATA = eINSTANCE.getFormPart_LayoutData();

		/**
		 * The meta object literal for the '{@link extension.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extension.impl.CompositeImpl
		 * @see extension.impl.ExtensionPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE__LAYOUT = eINSTANCE.getComposite_Layout();

		/**
		 * The meta object literal for the '{@link extension.impl.LayoutDataImpl <em>Layout Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extension.impl.LayoutDataImpl
		 * @see extension.impl.ExtensionPackageImpl#getLayoutData()
		 * @generated
		 */
		EClass LAYOUT_DATA = eINSTANCE.getLayoutData();

		/**
		 * The meta object literal for the '{@link extension.impl.GridDataImpl <em>Grid Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extension.impl.GridDataImpl
		 * @see extension.impl.ExtensionPackageImpl#getGridData()
		 * @generated
		 */
		EClass GRID_DATA = eINSTANCE.getGridData();

		/**
		 * The meta object literal for the '<em><b>Horizontal Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_DATA__HORIZONTAL_ALIGNMENT = eINSTANCE.getGridData_HorizontalAlignment();

		/**
		 * The meta object literal for the '<em><b>Vertical Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_DATA__VERTICAL_ALIGNMENT = eINSTANCE.getGridData_VerticalAlignment();

		/**
		 * The meta object literal for the '<em><b>Horizonral Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_DATA__HORIZONRAL_SPAN = eINSTANCE.getGridData_HorizonralSpan();

		/**
		 * The meta object literal for the '<em><b>Vertical Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_DATA__VERTICAL_SPAN = eINSTANCE.getGridData_VerticalSpan();

		/**
		 * The meta object literal for the '{@link extension.Layout <em>Layout</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extension.Layout
		 * @see extension.impl.ExtensionPackageImpl#getLayout()
		 * @generated
		 */
		EEnum LAYOUT = eINSTANCE.getLayout();

	}

} //ExtensionPackage
