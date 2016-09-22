/**
 */
package extension;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extension.GridData#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link extension.GridData#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link extension.GridData#isHorizonralSpan <em>Horizonral Span</em>}</li>
 *   <li>{@link extension.GridData#isVerticalSpan <em>Vertical Span</em>}</li>
 * </ul>
 *
 * @see extension.ExtensionPackage#getGridData()
 * @model
 * @generated
 */
public interface GridData extends LayoutData {
	/**
	 * Returns the value of the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see #setHorizontalAlignment(int)
	 * @see extension.ExtensionPackage#getGridData_HorizontalAlignment()
	 * @model
	 * @generated
	 */
	int getHorizontalAlignment();

	/**
	 * Sets the value of the '{@link extension.GridData#getHorizontalAlignment <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see #getHorizontalAlignment()
	 * @generated
	 */
	void setHorizontalAlignment(int value);

	/**
	 * Returns the value of the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Alignment</em>' attribute.
	 * @see #setVerticalAlignment(int)
	 * @see extension.ExtensionPackage#getGridData_VerticalAlignment()
	 * @model
	 * @generated
	 */
	int getVerticalAlignment();

	/**
	 * Sets the value of the '{@link extension.GridData#getVerticalAlignment <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Alignment</em>' attribute.
	 * @see #getVerticalAlignment()
	 * @generated
	 */
	void setVerticalAlignment(int value);

	/**
	 * Returns the value of the '<em><b>Horizonral Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizonral Span</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizonral Span</em>' attribute.
	 * @see #setHorizonralSpan(boolean)
	 * @see extension.ExtensionPackage#getGridData_HorizonralSpan()
	 * @model
	 * @generated
	 */
	boolean isHorizonralSpan();

	/**
	 * Sets the value of the '{@link extension.GridData#isHorizonralSpan <em>Horizonral Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizonral Span</em>' attribute.
	 * @see #isHorizonralSpan()
	 * @generated
	 */
	void setHorizonralSpan(boolean value);

	/**
	 * Returns the value of the '<em><b>Vertical Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Span</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Span</em>' attribute.
	 * @see #setVerticalSpan(boolean)
	 * @see extension.ExtensionPackage#getGridData_VerticalSpan()
	 * @model
	 * @generated
	 */
	boolean isVerticalSpan();

	/**
	 * Sets the value of the '{@link extension.GridData#isVerticalSpan <em>Vertical Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Span</em>' attribute.
	 * @see #isVerticalSpan()
	 * @generated
	 */
	void setVerticalSpan(boolean value);

} // GridData
