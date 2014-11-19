/**
 */
package Linux;

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
 * @see Linux.LinuxFactory
 * @model kind="package"
 * @generated
 */
public interface LinuxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Linux";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "co.edu.uniandes.mono.gesco.linux";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co.edu.uniandes.mono.gesco.linux";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinuxPackage eINSTANCE = Linux.impl.LinuxPackageImpl.init();

	/**
	 * The meta object id for the '{@link Linux.impl.ConfiguracionImpl <em>Configuracion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Linux.impl.ConfiguracionImpl
	 * @see Linux.impl.LinuxPackageImpl#getConfiguracion()
	 * @generated
	 */
	int CONFIGURACION = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION__DESCRIPCION = 1;

	/**
	 * The feature id for the '<em><b>Arquitectura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION__ARQUITECTURA = 2;

	/**
	 * The feature id for the '<em><b>Repositorios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION__REPOSITORIOS = 3;

	/**
	 * The feature id for the '<em><b>Aplicaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION__APLICACIONES = 4;

	/**
	 * The number of structural features of the '<em>Configuracion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Configuracion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Linux.impl.LineaComandoImpl <em>Linea Comando</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Linux.impl.LineaComandoImpl
	 * @see Linux.impl.LinuxPackageImpl#getLineaComando()
	 * @generated
	 */
	int LINEA_COMANDO = 1;

	/**
	 * The feature id for the '<em><b>Parametros</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_COMANDO__PARAMETROS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_COMANDO__ID = 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_COMANDO__DESCRIPCION = 2;

	/**
	 * The feature id for the '<em><b>Ruta Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_COMANDO__RUTA_DESTINO = 3;

	/**
	 * The feature id for the '<em><b>Gestor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_COMANDO__GESTOR = 4;

	/**
	 * The feature id for the '<em><b>Aplicacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_COMANDO__APLICACION = 5;

	/**
	 * The number of structural features of the '<em>Linea Comando</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_COMANDO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Linea Comando</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_COMANDO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Linux.impl.ParametroImpl <em>Parametro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Linux.impl.ParametroImpl
	 * @see Linux.impl.LinuxPackageImpl#getParametro()
	 * @generated
	 */
	int PARAMETRO = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO__VALOR = 1;

	/**
	 * The number of structural features of the '<em>Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Linux.Arquitectura <em>Arquitectura</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Linux.Arquitectura
	 * @see Linux.impl.LinuxPackageImpl#getArquitectura()
	 * @generated
	 */
	int ARQUITECTURA = 3;


	/**
	 * Returns the meta object for class '{@link Linux.Configuracion <em>Configuracion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuracion</em>'.
	 * @see Linux.Configuracion
	 * @generated
	 */
	EClass getConfiguracion();

	/**
	 * Returns the meta object for the attribute '{@link Linux.Configuracion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see Linux.Configuracion#getVersion()
	 * @see #getConfiguracion()
	 * @generated
	 */
	EAttribute getConfiguracion_Version();

	/**
	 * Returns the meta object for the attribute '{@link Linux.Configuracion#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see Linux.Configuracion#getDescripcion()
	 * @see #getConfiguracion()
	 * @generated
	 */
	EAttribute getConfiguracion_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link Linux.Configuracion#getArquitectura <em>Arquitectura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arquitectura</em>'.
	 * @see Linux.Configuracion#getArquitectura()
	 * @see #getConfiguracion()
	 * @generated
	 */
	EAttribute getConfiguracion_Arquitectura();

	/**
	 * Returns the meta object for the containment reference list '{@link Linux.Configuracion#getRepositorios <em>Repositorios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositorios</em>'.
	 * @see Linux.Configuracion#getRepositorios()
	 * @see #getConfiguracion()
	 * @generated
	 */
	EReference getConfiguracion_Repositorios();

	/**
	 * Returns the meta object for the containment reference list '{@link Linux.Configuracion#getAplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aplicaciones</em>'.
	 * @see Linux.Configuracion#getAplicaciones()
	 * @see #getConfiguracion()
	 * @generated
	 */
	EReference getConfiguracion_Aplicaciones();

	/**
	 * Returns the meta object for class '{@link Linux.LineaComando <em>Linea Comando</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linea Comando</em>'.
	 * @see Linux.LineaComando
	 * @generated
	 */
	EClass getLineaComando();

	/**
	 * Returns the meta object for the containment reference '{@link Linux.LineaComando#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parametros</em>'.
	 * @see Linux.LineaComando#getParametros()
	 * @see #getLineaComando()
	 * @generated
	 */
	EReference getLineaComando_Parametros();

	/**
	 * Returns the meta object for the attribute '{@link Linux.LineaComando#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Linux.LineaComando#getId()
	 * @see #getLineaComando()
	 * @generated
	 */
	EAttribute getLineaComando_Id();

	/**
	 * Returns the meta object for the attribute '{@link Linux.LineaComando#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see Linux.LineaComando#getDescripcion()
	 * @see #getLineaComando()
	 * @generated
	 */
	EAttribute getLineaComando_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link Linux.LineaComando#getRutaDestino <em>Ruta Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta Destino</em>'.
	 * @see Linux.LineaComando#getRutaDestino()
	 * @see #getLineaComando()
	 * @generated
	 */
	EAttribute getLineaComando_RutaDestino();

	/**
	 * Returns the meta object for the attribute '{@link Linux.LineaComando#getGestor <em>Gestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gestor</em>'.
	 * @see Linux.LineaComando#getGestor()
	 * @see #getLineaComando()
	 * @generated
	 */
	EAttribute getLineaComando_Gestor();

	/**
	 * Returns the meta object for the attribute '{@link Linux.LineaComando#getAplicacion <em>Aplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aplicacion</em>'.
	 * @see Linux.LineaComando#getAplicacion()
	 * @see #getLineaComando()
	 * @generated
	 */
	EAttribute getLineaComando_Aplicacion();

	/**
	 * Returns the meta object for class '{@link Linux.Parametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametro</em>'.
	 * @see Linux.Parametro
	 * @generated
	 */
	EClass getParametro();

	/**
	 * Returns the meta object for the attribute '{@link Linux.Parametro#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see Linux.Parametro#getNombre()
	 * @see #getParametro()
	 * @generated
	 */
	EAttribute getParametro_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link Linux.Parametro#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see Linux.Parametro#getValor()
	 * @see #getParametro()
	 * @generated
	 */
	EAttribute getParametro_Valor();

	/**
	 * Returns the meta object for enum '{@link Linux.Arquitectura <em>Arquitectura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arquitectura</em>'.
	 * @see Linux.Arquitectura
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
	LinuxFactory getLinuxFactory();

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
		 * The meta object literal for the '{@link Linux.impl.ConfiguracionImpl <em>Configuracion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Linux.impl.ConfiguracionImpl
		 * @see Linux.impl.LinuxPackageImpl#getConfiguracion()
		 * @generated
		 */
		EClass CONFIGURACION = eINSTANCE.getConfiguracion();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION__VERSION = eINSTANCE.getConfiguracion_Version();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION__DESCRIPCION = eINSTANCE.getConfiguracion_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Arquitectura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION__ARQUITECTURA = eINSTANCE.getConfiguracion_Arquitectura();

		/**
		 * The meta object literal for the '<em><b>Repositorios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURACION__REPOSITORIOS = eINSTANCE.getConfiguracion_Repositorios();

		/**
		 * The meta object literal for the '<em><b>Aplicaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURACION__APLICACIONES = eINSTANCE.getConfiguracion_Aplicaciones();

		/**
		 * The meta object literal for the '{@link Linux.impl.LineaComandoImpl <em>Linea Comando</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Linux.impl.LineaComandoImpl
		 * @see Linux.impl.LinuxPackageImpl#getLineaComando()
		 * @generated
		 */
		EClass LINEA_COMANDO = eINSTANCE.getLineaComando();

		/**
		 * The meta object literal for the '<em><b>Parametros</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINEA_COMANDO__PARAMETROS = eINSTANCE.getLineaComando_Parametros();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEA_COMANDO__ID = eINSTANCE.getLineaComando_Id();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEA_COMANDO__DESCRIPCION = eINSTANCE.getLineaComando_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Ruta Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEA_COMANDO__RUTA_DESTINO = eINSTANCE.getLineaComando_RutaDestino();

		/**
		 * The meta object literal for the '<em><b>Gestor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEA_COMANDO__GESTOR = eINSTANCE.getLineaComando_Gestor();

		/**
		 * The meta object literal for the '<em><b>Aplicacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEA_COMANDO__APLICACION = eINSTANCE.getLineaComando_Aplicacion();

		/**
		 * The meta object literal for the '{@link Linux.impl.ParametroImpl <em>Parametro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Linux.impl.ParametroImpl
		 * @see Linux.impl.LinuxPackageImpl#getParametro()
		 * @generated
		 */
		EClass PARAMETRO = eINSTANCE.getParametro();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRO__NOMBRE = eINSTANCE.getParametro_Nombre();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRO__VALOR = eINSTANCE.getParametro_Valor();

		/**
		 * The meta object literal for the '{@link Linux.Arquitectura <em>Arquitectura</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Linux.Arquitectura
		 * @see Linux.impl.LinuxPackageImpl#getArquitectura()
		 * @generated
		 */
		EEnum ARQUITECTURA = eINSTANCE.getArquitectura();

	}

} //LinuxPackage
