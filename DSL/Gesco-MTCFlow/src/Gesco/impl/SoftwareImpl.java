/**
 */
package Gesco.impl;

import Gesco.Arquitectura;
import Gesco.Fuentes;
import Gesco.GescoPackage;
import Gesco.Software;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Gesco.impl.SoftwareImpl#getName <em>Name</em>}</li>
 *   <li>{@link Gesco.impl.SoftwareImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link Gesco.impl.SoftwareImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link Gesco.impl.SoftwareImpl#getArquitectura <em>Arquitectura</em>}</li>
 *   <li>{@link Gesco.impl.SoftwareImpl#getRutaDestino <em>Ruta Destino</em>}</li>
 *   <li>{@link Gesco.impl.SoftwareImpl#getDependencia <em>Dependencia</em>}</li>
 *   <li>{@link Gesco.impl.SoftwareImpl#getOrigen <em>Origen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareImpl extends MinimalEObjectImpl.Container implements Software {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getArquitectura() <em>Arquitectura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArquitectura()
	 * @generated
	 * @ordered
	 */
	protected static final Arquitectura ARQUITECTURA_EDEFAULT = Arquitectura.X64;

	/**
	 * The cached value of the '{@link #getArquitectura() <em>Arquitectura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArquitectura()
	 * @generated
	 * @ordered
	 */
	protected Arquitectura arquitectura = ARQUITECTURA_EDEFAULT;

	/**
	 * The default value of the '{@link #getRutaDestino() <em>Ruta Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRutaDestino()
	 * @generated
	 * @ordered
	 */
	protected static final String RUTA_DESTINO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRutaDestino() <em>Ruta Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRutaDestino()
	 * @generated
	 * @ordered
	 */
	protected String rutaDestino = RUTA_DESTINO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencia() <em>Dependencia</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencia()
	 * @generated
	 * @ordered
	 */
	protected EList<Software> dependencia;

	/**
	 * The cached value of the '{@link #getOrigen() <em>Origen</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected EList<Fuentes> origen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GescoPackage.Literals.SOFTWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GescoPackage.SOFTWARE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GescoPackage.SOFTWARE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GescoPackage.SOFTWARE__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arquitectura getArquitectura() {
		return arquitectura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArquitectura(Arquitectura newArquitectura) {
		Arquitectura oldArquitectura = arquitectura;
		arquitectura = newArquitectura == null ? ARQUITECTURA_EDEFAULT : newArquitectura;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GescoPackage.SOFTWARE__ARQUITECTURA, oldArquitectura, arquitectura));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRutaDestino() {
		return rutaDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRutaDestino(String newRutaDestino) {
		String oldRutaDestino = rutaDestino;
		rutaDestino = newRutaDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GescoPackage.SOFTWARE__RUTA_DESTINO, oldRutaDestino, rutaDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Software> getDependencia() {
		if (dependencia == null) {
			dependencia = new EObjectResolvingEList<Software>(Software.class, this, GescoPackage.SOFTWARE__DEPENDENCIA);
		}
		return dependencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fuentes> getOrigen() {
		if (origen == null) {
			origen = new EObjectResolvingEList<Fuentes>(Fuentes.class, this, GescoPackage.SOFTWARE__ORIGEN);
		}
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GescoPackage.SOFTWARE__NAME:
				return getName();
			case GescoPackage.SOFTWARE__VERSION:
				return getVersion();
			case GescoPackage.SOFTWARE__DESCRIPCION:
				return getDescripcion();
			case GescoPackage.SOFTWARE__ARQUITECTURA:
				return getArquitectura();
			case GescoPackage.SOFTWARE__RUTA_DESTINO:
				return getRutaDestino();
			case GescoPackage.SOFTWARE__DEPENDENCIA:
				return getDependencia();
			case GescoPackage.SOFTWARE__ORIGEN:
				return getOrigen();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GescoPackage.SOFTWARE__NAME:
				setName((String)newValue);
				return;
			case GescoPackage.SOFTWARE__VERSION:
				setVersion((String)newValue);
				return;
			case GescoPackage.SOFTWARE__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case GescoPackage.SOFTWARE__ARQUITECTURA:
				setArquitectura((Arquitectura)newValue);
				return;
			case GescoPackage.SOFTWARE__RUTA_DESTINO:
				setRutaDestino((String)newValue);
				return;
			case GescoPackage.SOFTWARE__DEPENDENCIA:
				getDependencia().clear();
				getDependencia().addAll((Collection<? extends Software>)newValue);
				return;
			case GescoPackage.SOFTWARE__ORIGEN:
				getOrigen().clear();
				getOrigen().addAll((Collection<? extends Fuentes>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GescoPackage.SOFTWARE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GescoPackage.SOFTWARE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case GescoPackage.SOFTWARE__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case GescoPackage.SOFTWARE__ARQUITECTURA:
				setArquitectura(ARQUITECTURA_EDEFAULT);
				return;
			case GescoPackage.SOFTWARE__RUTA_DESTINO:
				setRutaDestino(RUTA_DESTINO_EDEFAULT);
				return;
			case GescoPackage.SOFTWARE__DEPENDENCIA:
				getDependencia().clear();
				return;
			case GescoPackage.SOFTWARE__ORIGEN:
				getOrigen().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GescoPackage.SOFTWARE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GescoPackage.SOFTWARE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case GescoPackage.SOFTWARE__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case GescoPackage.SOFTWARE__ARQUITECTURA:
				return arquitectura != ARQUITECTURA_EDEFAULT;
			case GescoPackage.SOFTWARE__RUTA_DESTINO:
				return RUTA_DESTINO_EDEFAULT == null ? rutaDestino != null : !RUTA_DESTINO_EDEFAULT.equals(rutaDestino);
			case GescoPackage.SOFTWARE__DEPENDENCIA:
				return dependencia != null && !dependencia.isEmpty();
			case GescoPackage.SOFTWARE__ORIGEN:
				return origen != null && !origen.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", arquitectura: ");
		result.append(arquitectura);
		result.append(", rutaDestino: ");
		result.append(rutaDestino);
		result.append(')');
		return result.toString();
	}

} //SoftwareImpl
