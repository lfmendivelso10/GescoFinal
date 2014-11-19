/**
 */
package Gesco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Gesco.Software#getName <em>Name</em>}</li>
 *   <li>{@link Gesco.Software#getVersion <em>Version</em>}</li>
 *   <li>{@link Gesco.Software#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link Gesco.Software#getArquitectura <em>Arquitectura</em>}</li>
 *   <li>{@link Gesco.Software#getRutaDestino <em>Ruta Destino</em>}</li>
 *   <li>{@link Gesco.Software#getDependencia <em>Dependencia</em>}</li>
 *   <li>{@link Gesco.Software#getOrigen <em>Origen</em>}</li>
 * </ul>
 * </p>
 *
 * @see Gesco.GescoPackage#getSoftware()
 * @model
 * @generated
 */
public interface Software extends EObject {
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
	 * @see Gesco.GescoPackage#getSoftware_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Gesco.Software#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see Gesco.GescoPackage#getSoftware_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link Gesco.Software#getVersion <em>Version</em>}' attribute.
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
	 * @see Gesco.GescoPackage#getSoftware_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link Gesco.Software#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Arquitectura</b></em>' attribute.
	 * The literals are from the enumeration {@link Gesco.Arquitectura}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arquitectura</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arquitectura</em>' attribute.
	 * @see Gesco.Arquitectura
	 * @see #setArquitectura(Arquitectura)
	 * @see Gesco.GescoPackage#getSoftware_Arquitectura()
	 * @model required="true"
	 * @generated
	 */
	Arquitectura getArquitectura();

	/**
	 * Sets the value of the '{@link Gesco.Software#getArquitectura <em>Arquitectura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arquitectura</em>' attribute.
	 * @see Gesco.Arquitectura
	 * @see #getArquitectura()
	 * @generated
	 */
	void setArquitectura(Arquitectura value);

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
	 * @see Gesco.GescoPackage#getSoftware_RutaDestino()
	 * @model
	 * @generated
	 */
	String getRutaDestino();

	/**
	 * Sets the value of the '{@link Gesco.Software#getRutaDestino <em>Ruta Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta Destino</em>' attribute.
	 * @see #getRutaDestino()
	 * @generated
	 */
	void setRutaDestino(String value);

	/**
	 * Returns the value of the '<em><b>Dependencia</b></em>' reference list.
	 * The list contents are of type {@link Gesco.Software}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencia</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencia</em>' reference list.
	 * @see Gesco.GescoPackage#getSoftware_Dependencia()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Software> getDependencia();

	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference list.
	 * The list contents are of type {@link Gesco.Fuentes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origen</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference list.
	 * @see Gesco.GescoPackage#getSoftware_Origen()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Fuentes> getOrigen();

} // Software
