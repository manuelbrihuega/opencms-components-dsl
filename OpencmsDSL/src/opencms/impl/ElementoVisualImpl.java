/**
 */
package opencms.impl;

import opencms.ElementoVisual;
import opencms.OpencmsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elemento Visual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link opencms.impl.ElementoVisualImpl#getName <em>Name</em>}</li>
 *   <li>{@link opencms.impl.ElementoVisualImpl#getOrden <em>Orden</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementoVisualImpl extends EObjectImpl implements ElementoVisual
{
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
   * The default value of the '{@link #getOrden() <em>Orden</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrden()
   * @generated
   * @ordered
   */
  protected static final int ORDEN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOrden() <em>Orden</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrden()
   * @generated
   * @ordered
   */
  protected int orden = ORDEN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementoVisualImpl()
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
    return OpencmsPackage.Literals.ELEMENTO_VISUAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpencmsPackage.ELEMENTO_VISUAL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getOrden()
  {
    return orden;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrden(int newOrden)
  {
    int oldOrden = orden;
    orden = newOrden;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpencmsPackage.ELEMENTO_VISUAL__ORDEN, oldOrden, orden));
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
      case OpencmsPackage.ELEMENTO_VISUAL__NAME:
        return getName();
      case OpencmsPackage.ELEMENTO_VISUAL__ORDEN:
        return getOrden();
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
      case OpencmsPackage.ELEMENTO_VISUAL__NAME:
        setName((String)newValue);
        return;
      case OpencmsPackage.ELEMENTO_VISUAL__ORDEN:
        setOrden((Integer)newValue);
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
      case OpencmsPackage.ELEMENTO_VISUAL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OpencmsPackage.ELEMENTO_VISUAL__ORDEN:
        setOrden(ORDEN_EDEFAULT);
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
      case OpencmsPackage.ELEMENTO_VISUAL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OpencmsPackage.ELEMENTO_VISUAL__ORDEN:
        return orden != ORDEN_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", orden: ");
    result.append(orden);
    result.append(')');
    return result.toString();
  }

} //ElementoVisualImpl
