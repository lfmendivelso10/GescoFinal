/**
 */
package Linux.impl;

import Linux.Arquitectura;
import Linux.Configuracion;
import Linux.LineaComando;
import Linux.LinuxPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuracion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Linux.impl.ConfiguracionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link Linux.impl.ConfiguracionImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link Linux.impl.ConfiguracionImpl#getArquitectura <em>Arquitectura</em>}</li>
 *   <li>{@link Linux.impl.ConfiguracionImpl#getRepositorios <em>Repositorios</em>}</li>
 *   <li>{@link Linux.impl.ConfiguracionImpl#getAplicaciones <em>Aplicaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfiguracionImpl extends MinimalEObjectImpl.Container implements Configuracion {
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
	protected static final Arquitectura ARQUITECTURA_EDEFAULT = Arquitectura.X32;

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
	 * The cached value of the '{@link #getRepositorios() <em>Repositorios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositorios()
	 * @generated
	 * @ordered
	 */
	protected EList<LineaComando> repositorios;

	/**
	 * The cached value of the '{@link #getAplicaciones() <em>Aplicaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAplicaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<LineaComando> aplicaciones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguracionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinuxPackage.Literals.CONFIGURACION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxPackage.CONFIGURACION__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxPackage.CONFIGURACION__DESCRIPCION, oldDescripcion, descripcion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxPackage.CONFIGURACION__ARQUITECTURA, oldArquitectura, arquitectura));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineaComando> getRepositorios() {
		if (repositorios == null) {
			repositorios = new EObjectContainmentEList<LineaComando>(LineaComando.class, this, LinuxPackage.CONFIGURACION__REPOSITORIOS);
		}
		return repositorios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineaComando> getAplicaciones() {
		if (aplicaciones == null) {
			aplicaciones = new EObjectContainmentEList<LineaComando>(LineaComando.class, this, LinuxPackage.CONFIGURACION__APLICACIONES);
		}
		return aplicaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LinuxPackage.CONFIGURACION__REPOSITORIOS:
				return ((InternalEList<?>)getRepositorios()).basicRemove(otherEnd, msgs);
			case LinuxPackage.CONFIGURACION__APLICACIONES:
				return ((InternalEList<?>)getAplicaciones()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LinuxPackage.CONFIGURACION__VERSION:
				return getVersion();
			case LinuxPackage.CONFIGURACION__DESCRIPCION:
				return getDescripcion();
			case LinuxPackage.CONFIGURACION__ARQUITECTURA:
				return getArquitectura();
			case LinuxPackage.CONFIGURACION__REPOSITORIOS:
				return getRepositorios();
			case LinuxPackage.CONFIGURACION__APLICACIONES:
				return getAplicaciones();
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
			case LinuxPackage.CONFIGURACION__VERSION:
				setVersion((String)newValue);
				return;
			case LinuxPackage.CONFIGURACION__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case LinuxPackage.CONFIGURACION__ARQUITECTURA:
				setArquitectura((Arquitectura)newValue);
				return;
			case LinuxPackage.CONFIGURACION__REPOSITORIOS:
				getRepositorios().clear();
				getRepositorios().addAll((Collection<? extends LineaComando>)newValue);
				return;
			case LinuxPackage.CONFIGURACION__APLICACIONES:
				getAplicaciones().clear();
				getAplicaciones().addAll((Collection<? extends LineaComando>)newValue);
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
			case LinuxPackage.CONFIGURACION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case LinuxPackage.CONFIGURACION__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case LinuxPackage.CONFIGURACION__ARQUITECTURA:
				setArquitectura(ARQUITECTURA_EDEFAULT);
				return;
			case LinuxPackage.CONFIGURACION__REPOSITORIOS:
				getRepositorios().clear();
				return;
			case LinuxPackage.CONFIGURACION__APLICACIONES:
				getAplicaciones().clear();
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
			case LinuxPackage.CONFIGURACION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case LinuxPackage.CONFIGURACION__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case LinuxPackage.CONFIGURACION__ARQUITECTURA:
				return arquitectura != ARQUITECTURA_EDEFAULT;
			case LinuxPackage.CONFIGURACION__REPOSITORIOS:
				return repositorios != null && !repositorios.isEmpty();
			case LinuxPackage.CONFIGURACION__APLICACIONES:
				return aplicaciones != null && !aplicaciones.isEmpty();
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
		result.append(" (version: ");
		result.append(version);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", arquitectura: ");
		result.append(arquitectura);
		result.append(')');
		return result.toString();
	}

} //ConfiguracionImpl
