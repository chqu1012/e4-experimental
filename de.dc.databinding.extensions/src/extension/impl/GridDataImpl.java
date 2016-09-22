/**
 */
package extension.impl;

import extension.ExtensionPackage;
import extension.GridData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extension.impl.GridDataImpl#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link extension.impl.GridDataImpl#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link extension.impl.GridDataImpl#isHorizonralSpan <em>Horizonral Span</em>}</li>
 *   <li>{@link extension.impl.GridDataImpl#isVerticalSpan <em>Vertical Span</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GridDataImpl extends LayoutDataImpl implements GridData {
	/**
	 * The default value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final int HORIZONTAL_ALIGNMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected int horizontalAlignment = HORIZONTAL_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final int VERTICAL_ALIGNMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected int verticalAlignment = VERTICAL_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isHorizonralSpan() <em>Horizonral Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizonralSpan()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HORIZONRAL_SPAN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHorizonralSpan() <em>Horizonral Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizonralSpan()
	 * @generated
	 * @ordered
	 */
	protected boolean horizonralSpan = HORIZONRAL_SPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #isVerticalSpan() <em>Vertical Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerticalSpan()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERTICAL_SPAN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerticalSpan() <em>Vertical Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerticalSpan()
	 * @generated
	 * @ordered
	 */
	protected boolean verticalSpan = VERTICAL_SPAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionPackage.Literals.GRID_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHorizontalAlignment() {
		return horizontalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalAlignment(int newHorizontalAlignment) {
		int oldHorizontalAlignment = horizontalAlignment;
		horizontalAlignment = newHorizontalAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.GRID_DATA__HORIZONTAL_ALIGNMENT, oldHorizontalAlignment, horizontalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVerticalAlignment() {
		return verticalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalAlignment(int newVerticalAlignment) {
		int oldVerticalAlignment = verticalAlignment;
		verticalAlignment = newVerticalAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.GRID_DATA__VERTICAL_ALIGNMENT, oldVerticalAlignment, verticalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHorizonralSpan() {
		return horizonralSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizonralSpan(boolean newHorizonralSpan) {
		boolean oldHorizonralSpan = horizonralSpan;
		horizonralSpan = newHorizonralSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.GRID_DATA__HORIZONRAL_SPAN, oldHorizonralSpan, horizonralSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVerticalSpan() {
		return verticalSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalSpan(boolean newVerticalSpan) {
		boolean oldVerticalSpan = verticalSpan;
		verticalSpan = newVerticalSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.GRID_DATA__VERTICAL_SPAN, oldVerticalSpan, verticalSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionPackage.GRID_DATA__HORIZONTAL_ALIGNMENT:
				return getHorizontalAlignment();
			case ExtensionPackage.GRID_DATA__VERTICAL_ALIGNMENT:
				return getVerticalAlignment();
			case ExtensionPackage.GRID_DATA__HORIZONRAL_SPAN:
				return isHorizonralSpan();
			case ExtensionPackage.GRID_DATA__VERTICAL_SPAN:
				return isVerticalSpan();
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
			case ExtensionPackage.GRID_DATA__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment((Integer)newValue);
				return;
			case ExtensionPackage.GRID_DATA__VERTICAL_ALIGNMENT:
				setVerticalAlignment((Integer)newValue);
				return;
			case ExtensionPackage.GRID_DATA__HORIZONRAL_SPAN:
				setHorizonralSpan((Boolean)newValue);
				return;
			case ExtensionPackage.GRID_DATA__VERTICAL_SPAN:
				setVerticalSpan((Boolean)newValue);
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
			case ExtensionPackage.GRID_DATA__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment(HORIZONTAL_ALIGNMENT_EDEFAULT);
				return;
			case ExtensionPackage.GRID_DATA__VERTICAL_ALIGNMENT:
				setVerticalAlignment(VERTICAL_ALIGNMENT_EDEFAULT);
				return;
			case ExtensionPackage.GRID_DATA__HORIZONRAL_SPAN:
				setHorizonralSpan(HORIZONRAL_SPAN_EDEFAULT);
				return;
			case ExtensionPackage.GRID_DATA__VERTICAL_SPAN:
				setVerticalSpan(VERTICAL_SPAN_EDEFAULT);
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
			case ExtensionPackage.GRID_DATA__HORIZONTAL_ALIGNMENT:
				return horizontalAlignment != HORIZONTAL_ALIGNMENT_EDEFAULT;
			case ExtensionPackage.GRID_DATA__VERTICAL_ALIGNMENT:
				return verticalAlignment != VERTICAL_ALIGNMENT_EDEFAULT;
			case ExtensionPackage.GRID_DATA__HORIZONRAL_SPAN:
				return horizonralSpan != HORIZONRAL_SPAN_EDEFAULT;
			case ExtensionPackage.GRID_DATA__VERTICAL_SPAN:
				return verticalSpan != VERTICAL_SPAN_EDEFAULT;
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
		result.append(" (horizontalAlignment: ");
		result.append(horizontalAlignment);
		result.append(", verticalAlignment: ");
		result.append(verticalAlignment);
		result.append(", horizonralSpan: ");
		result.append(horizonralSpan);
		result.append(", verticalSpan: ");
		result.append(verticalSpan);
		result.append(')');
		return result.toString();
	}

} //GridDataImpl
