/**
 */
package Gesco.impl;

import Gesco.Arquitectura;
import Gesco.Fuentes;
import Gesco.GescoPackage;
import Gesco.SistemaOperativo;
import Gesco.Software;

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
 * An implementation of the model object '<em><b>Sistema Operativo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Gesco.impl.SistemaOperativoImpl#getName <em>Name</em>}</li>
 *   <li>{@link Gesco.impl.SistemaOperativoImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link Gesco.impl.SistemaOperativoImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link Gesco.impl.SistemaOperativoImpl#getArquitectura <em>Arquitectura</em>}</li>
 *   <li>{@link Gesco.impl.SistemaOperativoImpl#getFuentes <em>Fuentes</em>}</li>
 *   <li>{@link Gesco.impl.SistemaOperativoImpl#getRequerimientos <em>Requerimientos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SistemaOperativoImpl extends MinimalEObjectImpl.Container implements SistemaOperativo {
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
	 * The cached value of the '{@link #getFuentes() <em>Fuentes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuentes()
	 * @generated
	 * @ordered
	 */
	protected EList<Fuentes> fuentes;

	/**
	 * The cached value of the '{@link #getRequerimientos() <em>Requerimientos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequerimientos()
	 * @generated
	 * @ordered
	 */
	protected EList<Software> requerimientos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SistemaOperativoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GescoPackage.Literals.SISTEMA_OPERATIVO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GescoPackage.SISTEMA_OPERATIVO__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GescoPackage.SISTEMA_OPERATIVO__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GescoPackage.SISTEMA_OPERATIVO__DESCRIPCION, oldDescripcion, descripcion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GescoPackage.SISTEMA_OPERATIVO__ARQUITECTURA, oldArquitectura, arquitectura));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fuentes> getFuentes() {
		if (fuentes == null) {
			fuentes = new EObjectContainmentEList<Fuentes>(Fuentes.class, this, GescoPackage.SISTEMA_OPERATIVO__FUENTES);
		}
		return fuentes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Software> getRequerimientos() {
		if (requerimientos == null) {
			requerimientos = new EObjectContainmentEList<Software>(Software.class, this, GescoPackage.SISTEMA_OPERATIVO__REQUERIMIENTOS);
		}
		return requerimientos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GescoPackage.SISTEMA_OPERATIVO__FUENTES:
				return ((InternalEList<?>)getFuentes()).basicRemove(otherEnd, msgs);
			case GescoPackage.SISTEMA_OPERATIVO__REQUERIMIENTOS:
				return ((InternalEList<?>)getRequerimientos()).basicRemove(otherEnd, msgs);
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
			case GescoPackage.SISTEMA_OPERATIVO__NAME:
				return getName();
			case GescoPackage.SISTEMA_OPERATIVO__VERSION:
				return getVersion();
			case GescoPackage.SISTEMA_OPERATIVO__DESCRIPCION:
				return getDescripcion();
			case GescoPackage.SISTEMA_OPERATIVO__ARQUITECTURA:
				return getArquitectura();
			case GescoPackage.SISTEMA_OPERATIVO__FUENTES:
				return getFuentes();
			case GescoPackage.SISTEMA_OPERATIVO__REQUERIMIENTOS:
				return getRequerimientos();
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
			case GescoPackage.SISTEMA_OPERATIVO__NAME:
				setName((String)newValue);
				return;
			case GescoPackage.SISTEMA_OPERATIVO__VERSION:
				setVersion((String)newValue);
				return;
			case GescoPackage.SISTEMA_OPERATIVO__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case GescoPackage.SISTEMA_OPERATIVO__ARQUITECTURA:
				setArquitectura((Arquitectura)newValue);
				return;
			case GescoPackage.SISTEMA_OPERATIVO__FUENTES:
				getFuentes().clear();
				getFuentes().addAll((Collection<? extends Fuentes>)newValue);
				return;
			case GescoPackage.SISTEMA_OPERATIVO__REQUERIMIENTOS:
				getRequerimientos().clear();
				getRequerimientos().addAll((Collection<? extends Software>)newValue);
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
			case GescoPackage.SISTEMA_OPERATIVO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GescoPackage.SISTEMA_OPERATIVO__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case GescoPackage.SISTEMA_OPERATIVO__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case GescoPackage.SISTEMA_OPERATIVO__ARQUITECTURA:
				setArquitectura(ARQUITECTURA_EDEFAULT);
				return;
			case GescoPackage.SISTEMA_OPERATIVO__FUENTES:
				getFuentes().clear();
				return;
			case GescoPackage.SISTEMA_OPERATIVO__REQUERIMIENTOS:
				getRequerimientos().clear();
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
			case GescoPackage.SISTEMA_OPERATIVO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GescoPackage.SISTEMA_OPERATIVO__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case GescoPackage.SISTEMA_OPERATIVO__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case GescoPackage.SISTEMA_OPERATIVO__ARQUITECTURA:
				return arquitectura != ARQUITECTURA_EDEFAULT;
			case GescoPackage.SISTEMA_OPERATIVO__FUENTES:
				return fuentes != null && !fuentes.isEmpty();
			case GescoPackage.SISTEMA_OPERATIVO__REQUERIMIENTOS:
				return requerimientos != null && !requerimientos.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SistemaOperativoImpl
