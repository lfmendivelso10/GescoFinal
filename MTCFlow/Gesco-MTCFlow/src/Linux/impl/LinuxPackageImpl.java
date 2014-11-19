/**
 */
package Linux.impl;

import Linux.Arquitectura;
import Linux.Configuracion;
import Linux.LineaComando;
import Linux.LinuxFactory;
import Linux.LinuxPackage;
import Linux.Parametro;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinuxPackageImpl extends EPackageImpl implements LinuxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configuracionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineaComandoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arquitecturaEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Linux.LinuxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LinuxPackageImpl() {
		super(eNS_URI, LinuxFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LinuxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LinuxPackage init() {
		if (isInited) return (LinuxPackage)EPackage.Registry.INSTANCE.getEPackage(LinuxPackage.eNS_URI);

		// Obtain or create and register package
		LinuxPackageImpl theLinuxPackage = (LinuxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LinuxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LinuxPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLinuxPackage.createPackageContents();

		// Initialize created meta-data
		theLinuxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLinuxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LinuxPackage.eNS_URI, theLinuxPackage);
		return theLinuxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguracion() {
		return configuracionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguracion_Version() {
		return (EAttribute)configuracionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguracion_Descripcion() {
		return (EAttribute)configuracionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguracion_Arquitectura() {
		return (EAttribute)configuracionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguracion_Repositorios() {
		return (EReference)configuracionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguracion_Aplicaciones() {
		return (EReference)configuracionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineaComando() {
		return lineaComandoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineaComando_Parametros() {
		return (EReference)lineaComandoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineaComando_Id() {
		return (EAttribute)lineaComandoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineaComando_Descripcion() {
		return (EAttribute)lineaComandoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineaComando_RutaDestino() {
		return (EAttribute)lineaComandoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineaComando_Gestor() {
		return (EAttribute)lineaComandoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineaComando_Aplicacion() {
		return (EAttribute)lineaComandoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametro() {
		return parametroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametro_Nombre() {
		return (EAttribute)parametroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametro_Valor() {
		return (EAttribute)parametroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArquitectura() {
		return arquitecturaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinuxFactory getLinuxFactory() {
		return (LinuxFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		configuracionEClass = createEClass(CONFIGURACION);
		createEAttribute(configuracionEClass, CONFIGURACION__VERSION);
		createEAttribute(configuracionEClass, CONFIGURACION__DESCRIPCION);
		createEAttribute(configuracionEClass, CONFIGURACION__ARQUITECTURA);
		createEReference(configuracionEClass, CONFIGURACION__REPOSITORIOS);
		createEReference(configuracionEClass, CONFIGURACION__APLICACIONES);

		lineaComandoEClass = createEClass(LINEA_COMANDO);
		createEReference(lineaComandoEClass, LINEA_COMANDO__PARAMETROS);
		createEAttribute(lineaComandoEClass, LINEA_COMANDO__ID);
		createEAttribute(lineaComandoEClass, LINEA_COMANDO__DESCRIPCION);
		createEAttribute(lineaComandoEClass, LINEA_COMANDO__RUTA_DESTINO);
		createEAttribute(lineaComandoEClass, LINEA_COMANDO__GESTOR);
		createEAttribute(lineaComandoEClass, LINEA_COMANDO__APLICACION);

		parametroEClass = createEClass(PARAMETRO);
		createEAttribute(parametroEClass, PARAMETRO__NOMBRE);
		createEAttribute(parametroEClass, PARAMETRO__VALOR);

		// Create enums
		arquitecturaEEnum = createEEnum(ARQUITECTURA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(configuracionEClass, Configuracion.class, "Configuracion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguracion_Version(), ecorePackage.getEString(), "version", null, 0, 1, Configuracion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguracion_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Configuracion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguracion_Arquitectura(), this.getArquitectura(), "arquitectura", null, 0, 1, Configuracion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguracion_Repositorios(), this.getLineaComando(), null, "repositorios", null, 0, -1, Configuracion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfiguracion_Aplicaciones(), this.getLineaComando(), null, "aplicaciones", null, 1, -1, Configuracion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lineaComandoEClass, LineaComando.class, "LineaComando", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLineaComando_Parametros(), this.getParametro(), null, "parametros", null, 0, 1, LineaComando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineaComando_Id(), ecorePackage.getEString(), "id", null, 0, 1, LineaComando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineaComando_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, LineaComando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineaComando_RutaDestino(), ecorePackage.getEString(), "rutaDestino", null, 0, 1, LineaComando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineaComando_Gestor(), ecorePackage.getEString(), "gestor", null, 1, 1, LineaComando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineaComando_Aplicacion(), ecorePackage.getEString(), "aplicacion", null, 1, 1, LineaComando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametroEClass, Parametro.class, "Parametro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParametro_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Parametro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParametro_Valor(), ecorePackage.getEString(), "valor", null, 1, 1, Parametro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(arquitecturaEEnum, Arquitectura.class, "Arquitectura");
		addEEnumLiteral(arquitecturaEEnum, Arquitectura.X32);
		addEEnumLiteral(arquitecturaEEnum, Arquitectura.X64);

		// Create resource
		createResource(eNS_URI);
	}

} //LinuxPackageImpl
