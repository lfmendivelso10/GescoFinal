/**
 */
package Linux;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linea Comando</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Linux.LineaComando#getParametros <em>Parametros</em>}</li>
 *   <li>{@link Linux.LineaComando#getId <em>Id</em>}</li>
 *   <li>{@link Linux.LineaComando#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link Linux.LineaComando#getRutaDestino <em>Ruta Destino</em>}</li>
 *   <li>{@link Linux.LineaComando#getGestor <em>Gestor</em>}</li>
 *   <li>{@link Linux.LineaComando#getAplicacion <em>Aplicacion</em>}</li>
 * </ul>
 * </p>
 *
 * @see Linux.LinuxPackage#getLineaComando()
 * @model
 * @generated
 */
public interface LineaComando extends EObject {
	/**
	 * Returns the value of the '<em><b>Parametros</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametros</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros</em>' containment reference.
	 * @see #setParametros(Parametro)
	 * @see Linux.LinuxPackage#getLineaComando_Parametros()
	 * @model containment="true"
	 * @generated
	 */
	Parametro getParametros();

	/**
	 * Sets the value of the '{@link Linux.LineaComando#getParametros <em>Parametros</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametros</em>' containment reference.
	 * @see #getParametros()
	 * @generated
	 */
	void setParametros(Parametro value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Linux.LinuxPackage#getLineaComando_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Linux.LineaComando#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see Linux.LinuxPackage#getLineaComando_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link Linux.LineaComando#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Ruta Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruta Destino</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruta Destino</em>' attribute.
	 * @see #setRutaDestino(String)
	 * @see Linux.LinuxPackage#getLineaComando_RutaDestino()
	 * @model
	 * @generated
	 */
	String getRutaDestino();

	/**
	 * Sets the value of the '{@link Linux.LineaComando#getRutaDestino <em>Ruta Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta Destino</em>' attribute.
	 * @see #getRutaDestino()
	 * @generated
	 */
	void setRutaDestino(String value);

	/**
	 * Returns the value of the '<em><b>Gestor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gestor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gestor</em>' attribute.
	 * @see #setGestor(String)
	 * @see Linux.LinuxPackage#getLineaComando_Gestor()
	 * @model required="true"
	 * @generated
	 */
	String getGestor();

	/**
	 * Sets the value of the '{@link Linux.LineaComando#getGestor <em>Gestor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gestor</em>' attribute.
	 * @see #getGestor()
	 * @generated
	 */
	void setGestor(String value);

	/**
	 * Returns the value of the '<em><b>Aplicacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aplicacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aplicacion</em>' attribute.
	 * @see #setAplicacion(String)
	 * @see Linux.LinuxPackage#getLineaComando_Aplicacion()
	 * @model required="true"
	 * @generated
	 */
	String getAplicacion();

	/**
	 * Sets the value of the '{@link Linux.LineaComando#getAplicacion <em>Aplicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aplicacion</em>' attribute.
	 * @see #getAplicacion()
	 * @generated
	 */
	void setAplicacion(String value);

} // LineaComando
