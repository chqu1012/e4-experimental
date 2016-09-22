/**
 */
package extension;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extension.Composite#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @see extension.ExtensionPackage#getComposite()
 * @model
 * @generated
 */
public interface Composite extends EObject {
	/**
	 * Returns the value of the '<em><b>Layout</b></em>' attribute.
	 * The literals are from the enumeration {@link extension.Layout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' attribute.
	 * @see extension.Layout
	 * @see #setLayout(Layout)
	 * @see extension.ExtensionPackage#getComposite_Layout()
	 * @model
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link extension.Composite#getLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' attribute.
	 * @see extension.Layout
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

} // Composite
