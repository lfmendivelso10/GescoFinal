/**
 */
package Gesco;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Gesco.GescoPackage
 * @generated
 */
public interface GescoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GescoFactory eINSTANCE = Gesco.impl.GescoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Configuracion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuracion</em>'.
	 * @generated
	 */
	Configuracion createConfiguracion();

	/**
	 * Returns a new object of class '<em>Sistema Operativo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sistema Operativo</em>'.
	 * @generated
	 */
	SistemaOperativo createSistemaOperativo();

	/**
	 * Returns a new object of class '<em>Software</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software</em>'.
	 * @generated
	 */
	Software createSoftware();

	/**
	 * Returns a new object of class '<em>Fuentes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fuentes</em>'.
	 * @generated
	 */
	Fuentes createFuentes();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GescoPackage getGescoPackage();

} //GescoFactory
