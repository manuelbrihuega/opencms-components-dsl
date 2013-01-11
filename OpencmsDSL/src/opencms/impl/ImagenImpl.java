/**
 */
package opencms.impl;

import opencms.Imagen;
import opencms.OpencmsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imagen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link opencms.impl.ImagenImpl#getAlto <em>Alto</em>}</li>
 *   <li>{@link opencms.impl.ImagenImpl#getAncho <em>Ancho</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImagenImpl extends ElementoVisualImpl implements Imagen
{
  /**
   * The default value of the '{@link #getAlto() <em>Alto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlto()
   * @generated
   * @ordered
   */
  protected static final Float ALTO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlto() <em>Alto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlto()
   * @generated
   * @ordered
   */
  protected Float alto = ALTO_EDEFAULT;

  /**
   * The default value of the '{@link #getAncho() <em>Ancho</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAncho()
   * @generated
   * @ordered
   */
  protected static final Float ANCHO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAncho() <em>Ancho</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAncho()
   * @generated
   * @ordered
   */
  protected Float ancho = ANCHO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImagenImpl()
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
    return OpencmsPackage.Literals.IMAGEN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Float getAlto()
  {
    return alto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlto(Float newAlto)
  {
    Float oldAlto = alto;
    alto = newAlto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpencmsPackage.IMAGEN__ALTO, oldAlto, alto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Float getAncho()
  {
    return ancho;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAncho(Float newAncho)
  {
    Float oldAncho = ancho;
    ancho = newAncho;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpencmsPackage.IMAGEN__ANCHO, oldAncho, ancho));
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
      case OpencmsPackage.IMAGEN__ALTO:
        return getAlto();
      case OpencmsPackage.IMAGEN__ANCHO:
        return getAncho();
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
      case OpencmsPackage.IMAGEN__ALTO:
        setAlto((Float)newValue);
        return;
      case OpencmsPackage.IMAGEN__ANCHO:
        setAncho((Float)newValue);
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
      case OpencmsPackage.IMAGEN__ALTO:
        setAlto(ALTO_EDEFAULT);
        return;
      case OpencmsPackage.IMAGEN__ANCHO:
        setAncho(ANCHO_EDEFAULT);
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
      case OpencmsPackage.IMAGEN__ALTO:
        return ALTO_EDEFAULT == null ? alto != null : !ALTO_EDEFAULT.equals(alto);
      case OpencmsPackage.IMAGEN__ANCHO:
        return ANCHO_EDEFAULT == null ? ancho != null : !ANCHO_EDEFAULT.equals(ancho);
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
    result.append(" (alto: ");
    result.append(alto);
    result.append(", ancho: ");
    result.append(ancho);
    result.append(')');
    return result.toString();
  }

} //ImagenImpl
