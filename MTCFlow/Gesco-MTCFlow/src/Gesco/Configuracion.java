/**
 */
package Gesco;

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
 *   <li>{@link Gesco.Configuracion#getSistemaOperativo <em>Sistema Operativo</em>}</li>
 * </ul>
 * </p>
 *
 * @see Gesco.GescoPackage#getConfiguracion()
 * @model
 * @generated
 */
public interface Configuracion extends EObject {
	/**
	 * Returns the value of the '<em><b>Sistema Operativo</b></em>' containment reference list.
	 * The list contents are of type {@link Gesco.SistemaOperativo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sistema Operativo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sistema Operativo</em>' containment reference list.
	 * @see Gesco.GescoPackage#getConfiguracion_SistemaOperativo()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SistemaOperativo> getSistemaOperativo();

} // Configuracion
