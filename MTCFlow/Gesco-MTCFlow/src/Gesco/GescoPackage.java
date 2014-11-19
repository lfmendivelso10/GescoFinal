/**
 */
package Gesco;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Gesco.GescoFactory
 * @model kind="package"
 * @generated
 */
public interface GescoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Gesco";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://co.edu.uniandes.david.mono.gesco.requerimientos";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Gesco";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GescoPackage eINSTANCE = Gesco.impl.GescoPackageImpl.init();

	/**
	 * The meta object id for the '{@link Gesco.impl.ConfiguracionImpl <em>Configuracion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gesco.impl.ConfiguracionImpl
	 * @see Gesco.impl.GescoPackageImpl#getConfiguracion()
	 * @generated
	 */
	int CONFIGURACION = 0;

	/**
	 * The feature id for the '<em><b>Sistema Operativo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION__SISTEMA_OPERATIVO = 0;

	/**
	 * The number of structural features of the '<em>Configuracion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Configuracion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gesco.impl.SistemaOperativoImpl <em>Sistema Operativo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gesco.impl.SistemaOperativoImpl
	 * @see Gesco.impl.GescoPackageImpl#getSistemaOperativo()
	 * @generated
	 */
	int SISTEMA_OPERATIVO = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_OPERATIVO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_OPERATIVO__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_OPERATIVO__DESCRIPCION = 2;

	/**
	 * The feature id for the '<em><b>Arquitectura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_OPERATIVO__ARQUITECTURA = 3;

	/**
	 * The feature id for the '<em><b>Fuentes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_OPERATIVO__FUENTES = 4;

	/**
	 * The feature id for the '<em><b>Requerimientos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_OPERATIVO__REQUERIMIENTOS = 5;

	/**
	 * The number of structural features of the '<em>Sistema Operativo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_OPERATIVO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Sistema Operativo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_OPERATIVO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gesco.impl.SoftwareImpl <em>Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gesco.impl.SoftwareImpl
	 * @see Gesco.impl.GescoPackageImpl#getSoftware()
	 * @generated
	 */
	int SOFTWARE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__DESCRIPCION = 2;

	/**
	 * The feature id for the '<em><b>Arquitectura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__ARQUITECTURA = 3;

	/**
	 * The feature id for the '<em><b>Ruta Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__RUTA_DESTINO = 4;

	/**
	 * The feature id for the '<em><b>Dependencia</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__DEPENDENCIA = 5;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__ORIGEN = 6;

	/**
	 * The number of structural features of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gesco.impl.FuentesImpl <em>Fuentes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gesco.impl.FuentesImpl
	 * @see Gesco.impl.GescoPackageImpl#getFuentes()
	 * @generated
	 */
	int FUENTES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUENTES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUENTES__AUTOR = 1;

	/**
	 * The feature id for the '<em><b>Fuente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUENTES__FUENTE = 2;

	/**
	 * The feature id for the '<em><b>Tipo Fuente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUENTES__TIPO_FUENTE = 3;

	/**
	 * The number of structural features of the '<em>Fuentes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUENTES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Fuentes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUENTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gesco.Arquitectura <em>Arquitectura</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gesco.Arquitectura
	 * @see Gesco.impl.GescoPackageImpl#getArquitectura()
	 * @generated
	 */
	int ARQUITECTURA = 4;


	/**
	 * Returns the meta object for class '{@link Gesco.Configuracion <em>Configuracion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuracion</em>'.
	 * @see Gesco.Configuracion
	 * @generated
	 */
	EClass getConfiguracion();

	/**
	 * Returns the meta object for the containment reference list '{@link Gesco.Configuracion#getSistemaOperativo <em>Sistema Operativo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sistema Operativo</em>'.
	 * @see Gesco.Configuracion#getSistemaOperativo()
	 * @see #getConfiguracion()
	 * @generated
	 */
	EReference getConfiguracion_SistemaOperativo();

	/**
	 * Returns the meta object for class '{@link Gesco.SistemaOperativo <em>Sistema Operativo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sistema Operativo</em>'.
	 * @see Gesco.SistemaOperativo
	 * @generated
	 */
	EClass getSistemaOperativo();

	/**
	 * Returns the meta object for the attribute '{@link Gesco.SistemaOperativo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gesco.SistemaOperativo#getName()
	 * @see #getSistemaOperativo()
	 * @generated
	 */
	EAttribute getSistemaOperativo_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gesco.SistemaOperativo#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see Gesco.SistemaOperativo#getVersion()
	 * @see #getSistemaOperativo()
	 * @generated
	 */
	EAttribute getSistemaOperativo_Version();

	/**
	 * Returns the meta object for the attribute '{@link Gesco.SistemaOperativo#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see Gesco.SistemaOperativo#getDescripcion()
	 * @see #getSistemaOperativo()
	 * @generated
	 */
	EAttribute getSistemaOperativo_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link Gesco.SistemaOperativo#getArquitectura <em>Arquitectura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arquitectura</em>'.
	 * @see Gesco.SistemaOperativo#getArquitectura()
	 * @see #getSistemaOperativo()
	 * @generated
	 */
	EAttribute getSistemaOperativo_Arquitectura();

	/**
	 * Returns the meta object for the containment reference list '{@link Gesco.SistemaOperativo#getFuentes <em>Fuentes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuentes</em>'.
	 * @see Gesco.SistemaOperativo#getFuentes()
	 * @see #getSistemaOperativo()
	 * @generated
	 */
	EReference getSistemaOperativo_Fuentes();

	/**
	 * Returns the meta object for the containment reference list '{@link Gesco.SistemaOperativo#getRequerimientos <em>Requerimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requerimientos</em>'.
	 * @see Gesco.SistemaOperativo#getRequerimientos()
	 * @see #getSistemaOperativo()
	 * @generated
	 */
	EReference getSistemaOperativo_Requerimientos();

	/**
	 * Returns the meta object for class '{@link Gesco.Software <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software</em>'.
	 * @see Gesco.Software
	 * @generated
	 */
	EClass getSoftware();

	/**
	 * Returns the meta object for the attribute '{@link Gesco.Software#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gesco.Software#getName()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gesco.Software#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see Gesco.Software#getVersion()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_Version();

	/**
	 * Returns the meta object for the attribute '{@link Gesco.Software#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see Gesco.Software#getDescripcion()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link Gesco.Software#getArquitectura <em>Arquitectura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arquitectura</em>'.
	 * @see Gesco.Software#getArquitectura()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_Arquitectura();

	/**
	 * Returns the meta object for the attribute '{@link Gesco.Software#getRutaDestino <em>Ruta Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta Destino</em>'.
	 * @see Gesco.Software#getRutaDestino()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_RutaDestino();

	/**
	 * Returns the meta object for the reference list '{@link Gesco.Software#getDependencia <em>Dependencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencia</em>'.
	 * @see Gesco.Software#getDependencia()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_Dependencia();

	/**
	 * Returns the meta object for the reference list '{@link Gesco.Software#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Origen</em>'.
	 * @see Gesco.Software#getOrigen()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_Origen();

	/**
	 * Returns the meta object for class '{@link Gesco.Fuentes <em>Fuentes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuentes</em>'.
	 * @see Gesco.Fuentes
	 * @generated
	 */
	EClass getFuentes();

	/**
	 * Returns the meta object for the attribute '{@link Gesco.Fuentes#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gesco.Fuentes#getName()
	 * @see #getFuentes()
	 * @generated
	 */
	EAttribute getFuentes_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gesco.Fuentes#getAutor <em>Autor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autor</em>'.
	 * @see Gesco.Fuentes#getAutor()
	 * @see #getFuentes()
	 * @generated
	 */
	EAttribute getFuentes_Autor();

	/**
	 * Returns the meta object for the attribute '{@link Gesco.Fuentes#getFuente <em>Fuente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuente</em>'.
	 * @see Gesco.Fuentes#getFuente()
	 * @see #getFuentes()
	 * @generated
	 */
	EAttribute getFuentes_Fuente();

	/**
	 * Returns the meta object for the attribute '{@link Gesco.Fuentes#getTipoFuente <em>Tipo Fuente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Fuente</em>'.
	 * @see Gesco.Fuentes#getTipoFuente()
	 * @see #getFuentes()
	 * @generated
	 */
	EAttribute getFuentes_TipoFuente();

	/**
	 * Returns the meta object for enum '{@link Gesco.Arquitectura <em>Arquitectura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arquitectura</em>'.
	 * @see Gesco.Arquitectura
	 * @generated
	 */
	EEnum getArquitectura();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GescoFactory getGescoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Gesco.impl.ConfiguracionImpl <em>Configuracion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gesco.impl.ConfiguracionImpl
		 * @see Gesco.impl.GescoPackageImpl#getConfiguracion()
		 * @generated
		 */
		EClass CONFIGURACION = eINSTANCE.getConfiguracion();

		/**
		 * The meta object literal for the '<em><b>Sistema Operativo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURACION__SISTEMA_OPERATIVO = eINSTANCE.getConfiguracion_SistemaOperativo();

		/**
		 * The meta object literal for the '{@link Gesco.impl.SistemaOperativoImpl <em>Sistema Operativo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gesco.impl.SistemaOperativoImpl
		 * @see Gesco.impl.GescoPackageImpl#getSistemaOperativo()
		 * @generated
		 */
		EClass SISTEMA_OPERATIVO = eINSTANCE.getSistemaOperativo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SISTEMA_OPERATIVO__NAME = eINSTANCE.getSistemaOperativo_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SISTEMA_OPERATIVO__VERSION = eINSTANCE.getSistemaOperativo_Version();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SISTEMA_OPERATIVO__DESCRIPCION = eINSTANCE.getSistemaOperativo_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Arquitectura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SISTEMA_OPERATIVO__ARQUITECTURA = eINSTANCE.getSistemaOperativo_Arquitectura();

		/**
		 * The meta object literal for the '<em><b>Fuentes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SISTEMA_OPERATIVO__FUENTES = eINSTANCE.getSistemaOperativo_Fuentes();

		/**
		 * The meta object literal for the '<em><b>Requerimientos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SISTEMA_OPERATIVO__REQUERIMIENTOS = eINSTANCE.getSistemaOperativo_Requerimientos();

		/**
		 * The meta object literal for the '{@link Gesco.impl.SoftwareImpl <em>Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gesco.impl.SoftwareImpl
		 * @see Gesco.impl.GescoPackageImpl#getSoftware()
		 * @generated
		 */
		EClass SOFTWARE = eINSTANCE.getSoftware();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__NAME = eINSTANCE.getSoftware_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__VERSION = eINSTANCE.getSoftware_Version();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__DESCRIPCION = eINSTANCE.getSoftware_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Arquitectura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__ARQUITECTURA = eINSTANCE.getSoftware_Arquitectura();

		/**
		 * The meta object literal for the '<em><b>Ruta Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__RUTA_DESTINO = eINSTANCE.getSoftware_RutaDestino();

		/**
		 * The meta object literal for the '<em><b>Dependencia</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__DEPENDENCIA = eINSTANCE.getSoftware_Dependencia();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__ORIGEN = eINSTANCE.getSoftware_Origen();

		/**
		 * The meta object literal for the '{@link Gesco.impl.FuentesImpl <em>Fuentes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gesco.impl.FuentesImpl
		 * @see Gesco.impl.GescoPackageImpl#getFuentes()
		 * @generated
		 */
		EClass FUENTES = eINSTANCE.getFuentes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUENTES__NAME = eINSTANCE.getFuentes_Name();

		/**
		 * The meta object literal for the '<em><b>Autor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUENTES__AUTOR = eINSTANCE.getFuentes_Autor();

		/**
		 * The meta object literal for the '<em><b>Fuente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUENTES__FUENTE = eINSTANCE.getFuentes_Fuente();

		/**
		 * The meta object literal for the '<em><b>Tipo Fuente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUENTES__TIPO_FUENTE = eINSTANCE.getFuentes_TipoFuente();

		/**
		 * The meta object literal for the '{@link Gesco.Arquitectura <em>Arquitectura</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gesco.Arquitectura
		 * @see Gesco.impl.GescoPackageImpl#getArquitectura()
		 * @generated
		 */
		EEnum ARQUITECTURA = eINSTANCE.getArquitectura();

	}

} //GescoPackage
