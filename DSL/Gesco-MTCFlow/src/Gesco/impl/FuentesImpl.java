/**
 */
package Gesco.impl;

import Gesco.Fuentes;
import Gesco.GescoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuentes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Gesco.impl.FuentesImpl#getName <em>Name</em>}</li>
 *   <li>{@link Gesco.impl.FuentesImpl#getAutor <em>Autor</em>}</li>
 *   <li>{@link Gesco.impl.FuentesImpl#getFuente <em>Fuente</em>}</li>
 *   <li>{@link Gesco.impl.FuentesImpl#getTipoFuente <em>Tipo Fuente</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FuentesImpl extends MinimalEObjectImpl.Container implements Fuentes {
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
	 * The default value of the '{@link #getAutor() <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutor() <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected String autor = AUTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFuente() <em>Fuente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuente()
	 * @generated
	 * @ordered
	 */
	protected static final String FUENTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFuente() <em>Fuente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuente()
	 * @generated
	 * @ordered
	 */
	protected String fuente = FUENTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoFuente() <em>Tipo Fuente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoFuente()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_FUENTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoFuente() <em>Tipo Fuente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoFuente()
	 * @generated
	 * @ordered
	 */
	protected String tipoFuente = TIPO_FUENTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuentesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GescoPackage.Literals.FUENTES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GescoPackage.FUENTES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutor(String newAutor) {
		String oldAutor = autor;
		autor = newAutor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GescoPackage.FUENTES__AUTOR, oldAutor, autor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFuente() {
		return fuente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuente(String newFuente) {
		String oldFuente = fuente;
		fuente = newFuente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GescoPackage.FUENTES__FUENTE, oldFuente, fuente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipoFuente() {
		return tipoFuente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoFuente(String newTipoFuente) {
		String oldTipoFuente = tipoFuente;
		tipoFuente = newTipoFuente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GescoPackage.FUENTES__TIPO_FUENTE, oldTipoFuente, tipoFuente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GescoPackage.FUENTES__NAME:
				return getName();
			case GescoPackage.FUENTES__AUTOR:
				return getAutor();
			case GescoPackage.FUENTES__FUENTE:
				return getFuente();
			case GescoPackage.FUENTES__TIPO_FUENTE:
				return getTipoFuente();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GescoPackage.FUENTES__NAME:
				setName((String)newValue);
				return;
			case GescoPackage.FUENTES__AUTOR:
				setAutor((String)newValue);
				return;
			case GescoPackage.FUENTES__FUENTE:
				setFuente((String)newValue);
				return;
			case GescoPackage.FUENTES__TIPO_FUENTE:
				setTipoFuente((String)newValue);
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
			case GescoPackage.FUENTES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GescoPackage.FUENTES__AUTOR:
				setAutor(AUTOR_EDEFAULT);
				return;
			case GescoPackage.FUENTES__FUENTE:
				setFuente(FUENTE_EDEFAULT);
				return;
			case GescoPackage.FUENTES__TIPO_FUENTE:
				setTipoFuente(TIPO_FUENTE_EDEFAULT);
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
			case GescoPackage.FUENTES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GescoPackage.FUENTES__AUTOR:
				return AUTOR_EDEFAULT == null ? autor != null : !AUTOR_EDEFAULT.equals(autor);
			case GescoPackage.FUENTES__FUENTE:
				return FUENTE_EDEFAULT == null ? fuente != null : !FUENTE_EDEFAULT.equals(fuente);
			case GescoPackage.FUENTES__TIPO_FUENTE:
				return TIPO_FUENTE_EDEFAULT == null ? tipoFuente != null : !TIPO_FUENTE_EDEFAULT.equals(tipoFuente);
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
		result.append(", autor: ");
		result.append(autor);
		result.append(", fuente: ");
		result.append(fuente);
		result.append(", tipoFuente: ");
		result.append(tipoFuente);
		result.append(')');
		return result.toString();
	}

} //FuentesImpl
