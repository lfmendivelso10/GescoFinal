/**
 */
package Linux.impl;

import Linux.LineaComando;
import Linux.LinuxPackage;
import Linux.Parametro;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linea Comando</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Linux.impl.LineaComandoImpl#getParametros <em>Parametros</em>}</li>
 *   <li>{@link Linux.impl.LineaComandoImpl#getId <em>Id</em>}</li>
 *   <li>{@link Linux.impl.LineaComandoImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link Linux.impl.LineaComandoImpl#getRutaDestino <em>Ruta Destino</em>}</li>
 *   <li>{@link Linux.impl.LineaComandoImpl#getGestor <em>Gestor</em>}</li>
 *   <li>{@link Linux.impl.LineaComandoImpl#getAplicacion <em>Aplicacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineaComandoImpl extends MinimalEObjectImpl.Container implements LineaComando {
	/**
	 * The cached value of the '{@link #getParametros() <em>Parametros</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametros()
	 * @generated
	 * @ordered
	 */
	protected Parametro parametros;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getGestor() <em>Gestor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGestor()
	 * @generated
	 * @ordered
	 */
	protected static final String GESTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGestor() <em>Gestor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGestor()
	 * @generated
	 * @ordered
	 */
	protected String gestor = GESTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAplicacion() <em>Aplicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAplicacion()
	 * @generated
	 * @ordered
	 */
	protected static final String APLICACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAplicacion() <em>Aplicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAplicacion()
	 * @generated
	 * @ordered
	 */
	protected String aplicacion = APLICACION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineaComandoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinuxPackage.Literals.LINEA_COMANDO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parametro getParametros() {
		return parametros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParametros(Parametro newParametros, NotificationChain msgs) {
		Parametro oldParametros = parametros;
		parametros = newParametros;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LinuxPackage.LINEA_COMANDO__PARAMETROS, oldParametros, newParametros);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametros(Parametro newParametros) {
		if (newParametros != parametros) {
			NotificationChain msgs = null;
			if (parametros != null)
				msgs = ((InternalEObject)parametros).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LinuxPackage.LINEA_COMANDO__PARAMETROS, null, msgs);
			if (newParametros != null)
				msgs = ((InternalEObject)newParametros).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LinuxPackage.LINEA_COMANDO__PARAMETROS, null, msgs);
			msgs = basicSetParametros(newParametros, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxPackage.LINEA_COMANDO__PARAMETROS, newParametros, newParametros));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxPackage.LINEA_COMANDO__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxPackage.LINEA_COMANDO__DESCRIPCION, oldDescripcion, descripcion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxPackage.LINEA_COMANDO__RUTA_DESTINO, oldRutaDestino, rutaDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGestor() {
		return gestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGestor(String newGestor) {
		String oldGestor = gestor;
		gestor = newGestor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxPackage.LINEA_COMANDO__GESTOR, oldGestor, gestor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAplicacion() {
		return aplicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAplicacion(String newAplicacion) {
		String oldAplicacion = aplicacion;
		aplicacion = newAplicacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxPackage.LINEA_COMANDO__APLICACION, oldAplicacion, aplicacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LinuxPackage.LINEA_COMANDO__PARAMETROS:
				return basicSetParametros(null, msgs);
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
			case LinuxPackage.LINEA_COMANDO__PARAMETROS:
				return getParametros();
			case LinuxPackage.LINEA_COMANDO__ID:
				return getId();
			case LinuxPackage.LINEA_COMANDO__DESCRIPCION:
				return getDescripcion();
			case LinuxPackage.LINEA_COMANDO__RUTA_DESTINO:
				return getRutaDestino();
			case LinuxPackage.LINEA_COMANDO__GESTOR:
				return getGestor();
			case LinuxPackage.LINEA_COMANDO__APLICACION:
				return getAplicacion();
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
			case LinuxPackage.LINEA_COMANDO__PARAMETROS:
				setParametros((Parametro)newValue);
				return;
			case LinuxPackage.LINEA_COMANDO__ID:
				setId((String)newValue);
				return;
			case LinuxPackage.LINEA_COMANDO__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case LinuxPackage.LINEA_COMANDO__RUTA_DESTINO:
				setRutaDestino((String)newValue);
				return;
			case LinuxPackage.LINEA_COMANDO__GESTOR:
				setGestor((String)newValue);
				return;
			case LinuxPackage.LINEA_COMANDO__APLICACION:
				setAplicacion((String)newValue);
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
			case LinuxPackage.LINEA_COMANDO__PARAMETROS:
				setParametros((Parametro)null);
				return;
			case LinuxPackage.LINEA_COMANDO__ID:
				setId(ID_EDEFAULT);
				return;
			case LinuxPackage.LINEA_COMANDO__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case LinuxPackage.LINEA_COMANDO__RUTA_DESTINO:
				setRutaDestino(RUTA_DESTINO_EDEFAULT);
				return;
			case LinuxPackage.LINEA_COMANDO__GESTOR:
				setGestor(GESTOR_EDEFAULT);
				return;
			case LinuxPackage.LINEA_COMANDO__APLICACION:
				setAplicacion(APLICACION_EDEFAULT);
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
			case LinuxPackage.LINEA_COMANDO__PARAMETROS:
				return parametros != null;
			case LinuxPackage.LINEA_COMANDO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LinuxPackage.LINEA_COMANDO__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case LinuxPackage.LINEA_COMANDO__RUTA_DESTINO:
				return RUTA_DESTINO_EDEFAULT == null ? rutaDestino != null : !RUTA_DESTINO_EDEFAULT.equals(rutaDestino);
			case LinuxPackage.LINEA_COMANDO__GESTOR:
				return GESTOR_EDEFAULT == null ? gestor != null : !GESTOR_EDEFAULT.equals(gestor);
			case LinuxPackage.LINEA_COMANDO__APLICACION:
				return APLICACION_EDEFAULT == null ? aplicacion != null : !APLICACION_EDEFAULT.equals(aplicacion);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", rutaDestino: ");
		result.append(rutaDestino);
		result.append(", gestor: ");
		result.append(gestor);
		result.append(", aplicacion: ");
		result.append(aplicacion);
		result.append(')');
		return result.toString();
	}

} //LineaComandoImpl
