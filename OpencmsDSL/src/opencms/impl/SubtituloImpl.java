/**
 */
package opencms.impl;

import opencms.OpencmsPackage;
import opencms.Subtitulo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtitulo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link opencms.impl.SubtituloImpl#isEnlace <em>Enlace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubtituloImpl extends ElementoVisualImpl implements Subtitulo
{
  /**
   * The default value of the '{@link #isEnlace() <em>Enlace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnlace()
   * @generated
   * @ordered
   */
  protected static final boolean ENLACE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEnlace() <em>Enlace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnlace()
   * @generated
   * @ordered
   */
  protected boolean enlace = ENLACE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubtituloImpl()
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
    return OpencmsPackage.Literals.SUBTITULO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEnlace()
  {
    return enlace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnlace(boolean newEnlace)
  {
    boolean oldEnlace = enlace;
    enlace = newEnlace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpencmsPackage.SUBTITULO__ENLACE, oldEnlace, enlace));
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
      case OpencmsPackage.SUBTITULO__ENLACE:
        return isEnlace();
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
      case OpencmsPackage.SUBTITULO__ENLACE:
        setEnlace((Boolean)newValue);
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
      case OpencmsPackage.SUBTITULO__ENLACE:
        setEnlace(ENLACE_EDEFAULT);
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
      case OpencmsPackage.SUBTITULO__ENLACE:
        return enlace != ENLACE_EDEFAULT;
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
    result.append(" (enlace: ");
    result.append(enlace);
    result.append(')');
    return result.toString();
  }

} //SubtituloImpl
