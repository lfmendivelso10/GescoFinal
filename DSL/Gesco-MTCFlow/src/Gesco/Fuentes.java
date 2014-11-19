/**
 */
package Gesco;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuentes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Gesco.Fuentes#getName <em>Name</em>}</li>
 *   <li>{@link Gesco.Fuentes#getAutor <em>Autor</em>}</li>
 *   <li>{@link Gesco.Fuentes#getFuente <em>Fuente</em>}</li>
 *   <li>{@link Gesco.Fuentes#getTipoFuente <em>Tipo Fuente</em>}</li>
 * </ul>
 * </p>
 *
 * @see Gesco.GescoPackage#getFuentes()
 * @model
 * @generated
 */
public interface Fuentes extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Gesco.GescoPackage#getFuentes_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Gesco.Fuentes#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autor</em>' attribute.
	 * @see #setAutor(String)
	 * @see Gesco.GescoPackage#getFuentes_Autor()
	 * @model required="true"
	 * @generated
	 */
	String getAutor();

	/**
	 * Sets the value of the '{@link Gesco.Fuentes#getAutor <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autor</em>' attribute.
	 * @see #getAutor()
	 * @generated
	 */
	void setAutor(String value);

	/**
	 * Returns the value of the '<em><b>Fuente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuente</em>' attribute.
	 * @see #setFuente(String)
	 * @see Gesco.GescoPackage#getFuentes_Fuente()
	 * @model required="true"
	 * @generated
	 */
	String getFuente();

	/**
	 * Sets the value of the '{@link Gesco.Fuentes#getFuente <em>Fuente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuente</em>' attribute.
	 * @see #getFuente()
	 * @generated
	 */
	void setFuente(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Fuente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Fuente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Fuente</em>' attribute.
	 * @see #setTipoFuente(String)
	 * @see Gesco.GescoPackage#getFuentes_TipoFuente()
	 * @model required="true"
	 * @generated
	 */
	String getTipoFuente();

	/**
	 * Sets the value of the '{@link Gesco.Fuentes#getTipoFuente <em>Tipo Fuente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Fuente</em>' attribute.
	 * @see #getTipoFuente()
	 * @generated
	 */
	void setTipoFuente(String value);

} // Fuentes
