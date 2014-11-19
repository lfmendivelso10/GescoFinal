/**
 */
package Linux;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuracion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Linux.Configuracion#getVersion <em>Version</em>}</li>
 *   <li>{@link Linux.Configuracion#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link Linux.Configuracion#getArquitectura <em>Arquitectura</em>}</li>
 *   <li>{@link Linux.Configuracion#getRepositorios <em>Repositorios</em>}</li>
 *   <li>{@link Linux.Configuracion#getAplicaciones <em>Aplicaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @see Linux.LinuxPackage#getConfiguracion()
 * @model
 * @generated
 */
public interface Configuracion extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see Linux.LinuxPackage#getConfiguracion_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link Linux.Configuracion#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see Linux.LinuxPackage#getConfiguracion_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link Linux.Configuracion#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Arquitectura</b></em>' attribute.
	 * The literals are from the enumeration {@link Linux.Arquitectura}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arquitectura</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arquitectura</em>' attribute.
	 * @see Linux.Arquitectura
	 * @see #setArquitectura(Arquitectura)
	 * @see Linux.LinuxPackage#getConfiguracion_Arquitectura()
	 * @model
	 * @generated
	 */
	Arquitectura getArquitectura();

	/**
	 * Sets the value of the '{@link Linux.Configuracion#getArquitectura <em>Arquitectura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arquitectura</em>' attribute.
	 * @see Linux.Arquitectura
	 * @see #getArquitectura()
	 * @generated
	 */
	void setArquitectura(Arquitectura value);

	/**
	 * Returns the value of the '<em><b>Repositorios</b></em>' containment reference list.
	 * The list contents are of type {@link Linux.LineaComando}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositorios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositorios</em>' containment reference list.
	 * @see Linux.LinuxPackage#getConfiguracion_Repositorios()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<LineaComando> getRepositorios();

	/**
	 * Returns the value of the '<em><b>Aplicaciones</b></em>' containment reference list.
	 * The list contents are of type {@link Linux.LineaComando}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aplicaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aplicaciones</em>' containment reference list.
	 * @see Linux.LinuxPackage#getConfiguracion_Aplicaciones()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<LineaComando> getAplicaciones();

} // Configuracion
