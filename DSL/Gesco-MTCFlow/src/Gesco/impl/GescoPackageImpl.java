/**
 */
package Gesco.impl;

import Gesco.Arquitectura;
import Gesco.Configuracion;
import Gesco.Fuentes;
import Gesco.GescoFactory;
import Gesco.GescoPackage;
import Gesco.SistemaOperativo;
import Gesco.Software;

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
public class GescoPackageImpl extends EPackageImpl implements GescoPackage {
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
	private EClass sistemaOperativoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuentesEClass = null;

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
	 * @see Gesco.GescoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GescoPackageImpl() {
		super(eNS_URI, GescoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GescoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GescoPackage init() {
		if (isInited) return (GescoPackage)EPackage.Registry.INSTANCE.getEPackage(GescoPackage.eNS_URI);

		// Obtain or create and register package
		GescoPackageImpl theGescoPackage = (GescoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GescoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GescoPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGescoPackage.createPackageContents();

		// Initialize created meta-data
		theGescoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGescoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GescoPackage.eNS_URI, theGescoPackage);
		return theGescoPackage;
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
	public EReference getConfiguracion_SistemaOperativo() {
		return (EReference)configuracionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSistemaOperativo() {
		return sistemaOperativoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSistemaOperativo_Name() {
		return (EAttribute)sistemaOperativoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSistemaOperativo_Version() {
		return (EAttribute)sistemaOperativoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSistemaOperativo_Descripcion() {
		return (EAttribute)sistemaOperativoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSistemaOperativo_Arquitectura() {
		return (EAttribute)sistemaOperativoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSistemaOperativo_Fuentes() {
		return (EReference)sistemaOperativoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSistemaOperativo_Requerimientos() {
		return (EReference)sistemaOperativoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftware() {
		return softwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftware_Name() {
		return (EAttribute)softwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftware_Version() {
		return (EAttribute)softwareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftware_Descripcion() {
		return (EAttribute)softwareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftware_Arquitectura() {
		return (EAttribute)softwareEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftware_RutaDestino() {
		return (EAttribute)softwareEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftware_Dependencia() {
		return (EReference)softwareEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftware_Origen() {
		return (EReference)softwareEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuentes() {
		return fuentesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuentes_Name() {
		return (EAttribute)fuentesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuentes_Autor() {
		return (EAttribute)fuentesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuentes_Fuente() {
		return (EAttribute)fuentesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuentes_TipoFuente() {
		return (EAttribute)fuentesEClass.getEStructuralFeatures().get(3);
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
	public GescoFactory getGescoFactory() {
		return (GescoFactory)getEFactoryInstance();
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
		createEReference(configuracionEClass, CONFIGURACION__SISTEMA_OPERATIVO);

		sistemaOperativoEClass = createEClass(SISTEMA_OPERATIVO);
		createEAttribute(sistemaOperativoEClass, SISTEMA_OPERATIVO__NAME);
		createEAttribute(sistemaOperativoEClass, SISTEMA_OPERATIVO__VERSION);
		createEAttribute(sistemaOperativoEClass, SISTEMA_OPERATIVO__DESCRIPCION);
		createEAttribute(sistemaOperativoEClass, SISTEMA_OPERATIVO__ARQUITECTURA);
		createEReference(sistemaOperativoEClass, SISTEMA_OPERATIVO__FUENTES);
		createEReference(sistemaOperativoEClass, SISTEMA_OPERATIVO__REQUERIMIENTOS);

		softwareEClass = createEClass(SOFTWARE);
		createEAttribute(softwareEClass, SOFTWARE__NAME);
		createEAttribute(softwareEClass, SOFTWARE__VERSION);
		createEAttribute(softwareEClass, SOFTWARE__DESCRIPCION);
		createEAttribute(softwareEClass, SOFTWARE__ARQUITECTURA);
		createEAttribute(softwareEClass, SOFTWARE__RUTA_DESTINO);
		createEReference(softwareEClass, SOFTWARE__DEPENDENCIA);
		createEReference(softwareEClass, SOFTWARE__ORIGEN);

		fuentesEClass = createEClass(FUENTES);
		createEAttribute(fuentesEClass, FUENTES__NAME);
		createEAttribute(fuentesEClass, FUENTES__AUTOR);
		createEAttribute(fuentesEClass, FUENTES__FUENTE);
		createEAttribute(fuentesEClass, FUENTES__TIPO_FUENTE);

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
		initEReference(getConfiguracion_SistemaOperativo(), this.getSistemaOperativo(), null, "sistemaOperativo", null, 0, -1, Configuracion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sistemaOperativoEClass, SistemaOperativo.class, "SistemaOperativo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSistemaOperativo_Name(), ecorePackage.getEString(), "name", null, 1, 1, SistemaOperativo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSistemaOperativo_Version(), ecorePackage.getEString(), "version", null, 1, 1, SistemaOperativo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSistemaOperativo_Descripcion(), ecorePackage.getEString(), "descripcion", null, 1, 1, SistemaOperativo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSistemaOperativo_Arquitectura(), this.getArquitectura(), "arquitectura", null, 1, 1, SistemaOperativo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSistemaOperativo_Fuentes(), this.getFuentes(), null, "fuentes", null, 0, -1, SistemaOperativo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSistemaOperativo_Requerimientos(), this.getSoftware(), null, "requerimientos", null, 0, -1, SistemaOperativo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(softwareEClass, Software.class, "Software", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftware_Name(), ecorePackage.getEString(), "name", null, 1, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftware_Version(), ecorePackage.getEString(), "version", null, 0, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftware_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftware_Arquitectura(), this.getArquitectura(), "arquitectura", null, 1, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftware_RutaDestino(), ecorePackage.getEString(), "rutaDestino", null, 0, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftware_Dependencia(), this.getSoftware(), null, "dependencia", null, 0, -1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSoftware_Origen(), this.getFuentes(), null, "origen", null, 0, -1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fuentesEClass, Fuentes.class, "Fuentes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuentes_Name(), ecorePackage.getEString(), "name", null, 1, 1, Fuentes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuentes_Autor(), ecorePackage.getEString(), "autor", null, 1, 1, Fuentes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuentes_Fuente(), ecorePackage.getEString(), "fuente", null, 1, 1, Fuentes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuentes_TipoFuente(), ecorePackage.getEString(), "tipoFuente", null, 1, 1, Fuentes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(arquitecturaEEnum, Arquitectura.class, "Arquitectura");
		addEEnumLiteral(arquitecturaEEnum, Arquitectura.X64);
		addEEnumLiteral(arquitecturaEEnum, Arquitectura.X32);

		// Create resource
		createResource(eNS_URI);
	}

} //GescoPackageImpl
