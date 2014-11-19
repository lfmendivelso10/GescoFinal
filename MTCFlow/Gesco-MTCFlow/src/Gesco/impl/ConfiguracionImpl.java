/**
 */
package Gesco.impl;

import Gesco.Configuracion;
import Gesco.GescoPackage;
import Gesco.SistemaOperativo;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link Gesco.impl.ConfiguracionImpl#getSistemaOperativo <em>Sistema Operativo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfiguracionImpl extends MinimalEObjectImpl.Container implements Configuracion {
	/**
	 * The cached value of the '{@link #getSistemaOperativo() <em>Sistema Operativo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSistemaOperativo()
	 * @generated
	 * @ordered
	 */
	protected EList<SistemaOperativo> sistemaOperativo;

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
		return GescoPackage.Literals.CONFIGURACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SistemaOperativo> getSistemaOperativo() {
		if (sistemaOperativo == null) {
			sistemaOperativo = new EObjectContainmentEList<SistemaOperativo>(SistemaOperativo.class, this, GescoPackage.CONFIGURACION__SISTEMA_OPERATIVO);
		}
		return sistemaOperativo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GescoPackage.CONFIGURACION__SISTEMA_OPERATIVO:
				return ((InternalEList<?>)getSistemaOperativo()).basicRemove(otherEnd, msgs);
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
			case GescoPackage.CONFIGURACION__SISTEMA_OPERATIVO:
				return getSistemaOperativo();
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
			case GescoPackage.CONFIGURACION__SISTEMA_OPERATIVO:
				getSistemaOperativo().clear();
				getSistemaOperativo().addAll((Collection<? extends SistemaOperativo>)newValue);
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
			case GescoPackage.CONFIGURACION__SISTEMA_OPERATIVO:
				getSistemaOperativo().clear();
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
			case GescoPackage.CONFIGURACION__SISTEMA_OPERATIVO:
				return sistemaOperativo != null && !sistemaOperativo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfiguracionImpl
