/**
 */
package opencms.impl;

import opencms.Componente;
import opencms.Diagrama;
import opencms.OpencmsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagrama</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link opencms.impl.DiagramaImpl#getComponente <em>Componente</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramaImpl extends EObjectImpl implements Diagrama
{
  /**
   * The cached value of the '{@link #getComponente() <em>Componente</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponente()
   * @generated
   * @ordered
   */
  protected Componente componente;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DiagramaImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OpencmsPackage.Literals.DIAGRAMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Componente getComponente()
  {
    return componente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponente(Componente newComponente, NotificationChain msgs)
  {
    Componente oldComponente = componente;
    componente = newComponente;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpencmsPackage.DIAGRAMA__COMPONENTE, oldComponente, newComponente);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponente(Componente newComponente)
  {
    if (newComponente != componente)
    {
      NotificationChain msgs = null;
      if (componente != null)
        msgs = ((InternalEObject)componente).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpencmsPackage.DIAGRAMA__COMPONENTE, null, msgs);
      if (newComponente != null)
        msgs = ((InternalEObject)newComponente).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpencmsPackage.DIAGRAMA__COMPONENTE, null, msgs);
      msgs = basicSetComponente(newComponente, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpencmsPackage.DIAGRAMA__COMPONENTE, newComponente, newComponente));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OpencmsPackage.DIAGRAMA__COMPONENTE:
        return basicSetComponente(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OpencmsPackage.DIAGRAMA__COMPONENTE:
        return getComponente();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OpencmsPackage.DIAGRAMA__COMPONENTE:
        setComponente((Componente)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OpencmsPackage.DIAGRAMA__COMPONENTE:
        setComponente((Componente)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OpencmsPackage.DIAGRAMA__COMPONENTE:
        return componente != null;
    }
    return super.eIsSet(featureID);
  }

} //DiagramaImpl
