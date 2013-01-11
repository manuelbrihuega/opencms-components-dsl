/**
 */
package opencms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento Oculto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opencms.ElementoOculto#getName <em>Name</em>}</li>
 *   <li>{@link opencms.ElementoOculto#getOrden <em>Orden</em>}</li>
 * </ul>
 * </p>
 *
 * @see opencms.OpencmsPackage#getElementoOculto()
 * @model abstract="true"
 *        annotation="gmf.node label='name,orden' figure='rectangle' color='135,35,135' label.pattern='{0}:{1}' tool.small.bundle='OpencmsDSL' tool.small.path='resources/icono_ojo_oculto.gif' tool.large.path='resources/icono_ojo_oculto.gif' label.icon='true'"
 * @generated
 */
public interface ElementoOculto extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see opencms.OpencmsPackage#getElementoOculto_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link opencms.ElementoOculto#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orden</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orden</em>' attribute.
   * @see #setOrden(int)
   * @see opencms.OpencmsPackage#getElementoOculto_Orden()
   * @model
   * @generated
   */
  int getOrden();

  /**
   * Sets the value of the '{@link opencms.ElementoOculto#getOrden <em>Orden</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orden</em>' attribute.
   * @see #getOrden()
   * @generated
   */
  void setOrden(int value);

} // ElementoOculto
