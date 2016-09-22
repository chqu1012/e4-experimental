/**
 */
package extension.impl;

import extension.Composite;
import extension.ExtensionPackage;
import extension.FormPart;

import extension.Layout;
import extension.LayoutData;
import java.util.Collection;

import org.eclipse.e4.ui.model.application.ui.basic.impl.PartImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extension.impl.FormPartImpl#getComposites <em>Composites</em>}</li>
 *   <li>{@link extension.impl.FormPartImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link extension.impl.FormPartImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link extension.impl.FormPartImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link extension.impl.FormPartImpl#getLayoutData <em>Layout Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormPartImpl extends PartImpl implements FormPart {
	/**
	 * The cached value of the '{@link #getComposites() <em>Composites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposites()
	 * @generated
	 * @ordered
	 */
	protected EList<Composite> composites;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;
	/**
	 * The default value of the '{@link #getLayout() <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected static final Layout LAYOUT_EDEFAULT = Layout.GRID;
	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected Layout layout = LAYOUT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getLayoutData() <em>Layout Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutData()
	 * @generated
	 * @ordered
	 */
	protected LayoutData layoutData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionPackage.Literals.FORM_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composite> getComposites() {
		if (composites == null) {
			composites = new EObjectContainmentEList<Composite>(Composite.class, this, ExtensionPackage.FORM_PART__COMPOSITES);
		}
		return composites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.FORM_PART__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.FORM_PART__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(Layout newLayout) {
		Layout oldLayout = layout;
		layout = newLayout == null ? LAYOUT_EDEFAULT : newLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.FORM_PART__LAYOUT, oldLayout, layout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutData getLayoutData() {
		return layoutData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayoutData(LayoutData newLayoutData, NotificationChain msgs) {
		LayoutData oldLayoutData = layoutData;
		layoutData = newLayoutData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionPackage.FORM_PART__LAYOUT_DATA, oldLayoutData, newLayoutData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutData(LayoutData newLayoutData) {
		if (newLayoutData != layoutData) {
			NotificationChain msgs = null;
			if (layoutData != null)
				msgs = ((InternalEObject)layoutData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtensionPackage.FORM_PART__LAYOUT_DATA, null, msgs);
			if (newLayoutData != null)
				msgs = ((InternalEObject)newLayoutData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtensionPackage.FORM_PART__LAYOUT_DATA, null, msgs);
			msgs = basicSetLayoutData(newLayoutData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.FORM_PART__LAYOUT_DATA, newLayoutData, newLayoutData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionPackage.FORM_PART__COMPOSITES:
				return ((InternalEList<?>)getComposites()).basicRemove(otherEnd, msgs);
			case ExtensionPackage.FORM_PART__LAYOUT_DATA:
				return basicSetLayoutData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionPackage.FORM_PART__COMPOSITES:
				return getComposites();
			case ExtensionPackage.FORM_PART__WIDTH:
				return getWidth();
			case ExtensionPackage.FORM_PART__HEIGHT:
				return getHeight();
			case ExtensionPackage.FORM_PART__LAYOUT:
				return getLayout();
			case ExtensionPackage.FORM_PART__LAYOUT_DATA:
				return getLayoutData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtensionPackage.FORM_PART__COMPOSITES:
				getComposites().clear();
				getComposites().addAll((Collection<? extends Composite>)newValue);
				return;
			case ExtensionPackage.FORM_PART__WIDTH:
				setWidth((Integer)newValue);
				return;
			case ExtensionPackage.FORM_PART__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case ExtensionPackage.FORM_PART__LAYOUT:
				setLayout((Layout)newValue);
				return;
			case ExtensionPackage.FORM_PART__LAYOUT_DATA:
				setLayoutData((LayoutData)newValue);
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
			case ExtensionPackage.FORM_PART__COMPOSITES:
				getComposites().clear();
				return;
			case ExtensionPackage.FORM_PART__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case ExtensionPackage.FORM_PART__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case ExtensionPackage.FORM_PART__LAYOUT:
				setLayout(LAYOUT_EDEFAULT);
				return;
			case ExtensionPackage.FORM_PART__LAYOUT_DATA:
				setLayoutData((LayoutData)null);
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
			case ExtensionPackage.FORM_PART__COMPOSITES:
				return composites != null && !composites.isEmpty();
			case ExtensionPackage.FORM_PART__WIDTH:
				return width != WIDTH_EDEFAULT;
			case ExtensionPackage.FORM_PART__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case ExtensionPackage.FORM_PART__LAYOUT:
				return layout != LAYOUT_EDEFAULT;
			case ExtensionPackage.FORM_PART__LAYOUT_DATA:
				return layoutData != null;
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", layout: ");
		result.append(layout);
		result.append(')');
		return result.toString();
	}

} //FormPartImpl
