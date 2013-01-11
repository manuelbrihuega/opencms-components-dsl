/**
 */
package opencms.impl;

import java.util.Collection;

import opencms.Componente;
import opencms.ComponentePredeterminado;
import opencms.ElementoOculto;
import opencms.ElementoVisual;
import opencms.OpencmsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Componente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link opencms.impl.ComponenteImpl#getName <em>Name</em>}</li>
 *   <li>{@link opencms.impl.ComponenteImpl#getElementoOculto <em>Elemento Oculto</em>}</li>
 *   <li>{@link opencms.impl.ComponenteImpl#getElementoVisual <em>Elemento Visual</em>}</li>
 *   <li>{@link opencms.impl.ComponenteImpl#getComponentePredeterminado <em>Componente Predeterminado</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponenteImpl extends EObjectImpl implements Componente
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
   * The cached value of the '{@link #getElementoOculto() <em>Elemento Oculto</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementoOculto()
   * @generated
   * @ordered
   */
  protected EList<ElementoOculto> elementoOculto;

  /**
   * The cached value of the '{@link #getElementoVisual() <em>Elemento Visual</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementoVisual()
   * @generated
   * @ordered
   */
  protected EList<ElementoVisual> elementoVisual;

  /**
   * The cached value of the '{@link #getComponentePredeterminado() <em>Componente Predeterminado</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentePredeterminado()
   * @generated
   * @ordered
   */
  protected EList<ComponentePredeterminado> componentePredeterminado;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponenteImpl()
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
    return OpencmsPackage.Literals.COMPONENTE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, OpencmsPackage.COMPONENTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementoOculto> getElementoOculto()
  {
    if (elementoOculto == null)
    {
      elementoOculto = new EObjectContainmentEList<ElementoOculto>(ElementoOculto.class, this, OpencmsPackage.COMPONENTE__ELEMENTO_OCULTO);
    }
    return elementoOculto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementoVisual> getElementoVisual()
  {
    if (elementoVisual == null)
    {
      elementoVisual = new EObjectContainmentEList<ElementoVisual>(ElementoVisual.class, this, OpencmsPackage.COMPONENTE__ELEMENTO_VISUAL);
    }
    return elementoVisual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentePredeterminado> getComponentePredeterminado()
  {
    if (componentePredeterminado == null)
    {
      componentePredeterminado = new EObjectContainmentEList<ComponentePredeterminado>(ComponentePredeterminado.class, this, OpencmsPackage.COMPONENTE__COMPONENTE_PREDETERMINADO);
    }
    return componentePredeterminado;
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
      case OpencmsPackage.COMPONENTE__ELEMENTO_OCULTO:
        return ((InternalEList<?>)getElementoOculto()).basicRemove(otherEnd, msgs);
      case OpencmsPackage.COMPONENTE__ELEMENTO_VISUAL:
        return ((InternalEList<?>)getElementoVisual()).basicRemove(otherEnd, msgs);
      case OpencmsPackage.COMPONENTE__COMPONENTE_PREDETERMINADO:
        return ((InternalEList<?>)getComponentePredeterminado()).basicRemove(otherEnd, msgs);
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
      case OpencmsPackage.COMPONENTE__NAME:
        return getName();
      case OpencmsPackage.COMPONENTE__ELEMENTO_OCULTO:
        return getElementoOculto();
      case OpencmsPackage.COMPONENTE__ELEMENTO_VISUAL:
        return getElementoVisual();
      case OpencmsPackage.COMPONENTE__COMPONENTE_PREDETERMINADO:
        return getComponentePredeterminado();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OpencmsPackage.COMPONENTE__NAME:
        setName((String)newValue);
        return;
      case OpencmsPackage.COMPONENTE__ELEMENTO_OCULTO:
        getElementoOculto().clear();
        getElementoOculto().addAll((Collection<? extends ElementoOculto>)newValue);
        return;
      case OpencmsPackage.COMPONENTE__ELEMENTO_VISUAL:
        getElementoVisual().clear();
        getElementoVisual().addAll((Collection<? extends ElementoVisual>)newValue);
        return;
      case OpencmsPackage.COMPONENTE__COMPONENTE_PREDETERMINADO:
        getComponentePredeterminado().clear();
        getComponentePredeterminado().addAll((Collection<? extends ComponentePredeterminado>)newValue);
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
      case OpencmsPackage.COMPONENTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OpencmsPackage.COMPONENTE__ELEMENTO_OCULTO:
        getElementoOculto().clear();
        return;
      case OpencmsPackage.COMPONENTE__ELEMENTO_VISUAL:
        getElementoVisual().clear();
        return;
      case OpencmsPackage.COMPONENTE__COMPONENTE_PREDETERMINADO:
        getComponentePredeterminado().clear();
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
      case OpencmsPackage.COMPONENTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OpencmsPackage.COMPONENTE__ELEMENTO_OCULTO:
        return elementoOculto != null && !elementoOculto.isEmpty();
      case OpencmsPackage.COMPONENTE__ELEMENTO_VISUAL:
        return elementoVisual != null && !elementoVisual.isEmpty();
      case OpencmsPackage.COMPONENTE__COMPONENTE_PREDETERMINADO:
        return componentePredeterminado != null && !componentePredeterminado.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //ComponenteImpl
