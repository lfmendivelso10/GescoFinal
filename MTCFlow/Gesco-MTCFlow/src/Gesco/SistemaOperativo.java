/**
 */
package Gesco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sistema Operativo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Gesco.SistemaOperativo#getName <em>Name</em>}</li>
 *   <li>{@link Gesco.SistemaOperativo#getVersion <em>Version</em>}</li>
 *   <li>{@link Gesco.SistemaOperativo#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link Gesco.SistemaOperativo#getArquitectura <em>Arquitectura</em>}</li>
 *   <li>{@link Gesco.SistemaOperativo#getFuentes <em>Fuentes</em>}</li>
 *   <li>{@link Gesco.SistemaOperativo#getRequerimientos <em>Requerimientos</em>}</li>
 * </ul>
 * </p>
 *
 * @see Gesco.GescoPackage#getSistemaOperativo()
 * @model
 * @generated
 */
public interface SistemaOperativo extends EObject {
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
	 * @see Gesco.GescoPackage#getSistemaOperativo_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Gesco.SistemaOperativo#getName <em>Name</em>}' attribute.
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
	 * @see Gesco.GescoPackage#getSistemaOperativo_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link Gesco.SistemaOperativo#getVersion <em>Version</em>}' attribute.
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
	 * @see Gesco.GescoPackage#getSistemaOperativo_Descripcion()
	 * @model required="true"
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link Gesco.SistemaOperativo#getDescripcion <em>Descripcion</em>}' attribute.
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
	 * @see Gesco.GescoPackage#getSistemaOperativo_Arquitectura()
	 * @model required="true"
	 * @generated
	 */
	Arquitectura getArquitectura();

	/**
	 * Sets the value of the '{@link Gesco.SistemaOperativo#getArquitectura <em>Arquitectura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arquitectura</em>' attribute.
	 * @see Gesco.Arquitectura
	 * @see #getArquitectura()
	 * @generated
	 */
	void setArquitectura(Arquitectura value);

	/**
	 * Returns the value of the '<em><b>Fuentes</b></em>' containment reference list.
	 * The list contents are of type {@link Gesco.Fuentes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuentes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuentes</em>' containment reference list.
	 * @see Gesco.GescoPackage#getSistemaOperativo_Fuentes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Fuentes> getFuentes();

	/**
	 * Returns the value of the '<em><b>Requerimientos</b></em>' containment reference list.
	 * The list contents are of type {@link Gesco.Software}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requerimientos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requerimientos</em>' containment reference list.
	 * @see Gesco.GescoPackage#getSistemaOperativo_Requerimientos()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Software> getRequerimientos();

} // SistemaOperativo
