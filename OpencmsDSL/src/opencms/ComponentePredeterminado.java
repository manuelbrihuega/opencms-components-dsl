/**
 */
package opencms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Componente Predeterminado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opencms.ComponentePredeterminado#getName <em>Name</em>}</li>
 *   <li>{@link opencms.ComponentePredeterminado#getOrden <em>Orden</em>}</li>
 * </ul>
 * </p>
 *
 * @see opencms.OpencmsPackage#getComponentePredeterminado()
 * @model abstract="true"
 *        annotation="gmf.node label='name,orden' figure='rectangle' color='35,135,135' label.pattern='{0}:{1}' tool.small.bundle='OpencmsDSL' tool.small.path='resources/icono_componente_predeterminado.gif' tool.large.path='resources/icono_componente_predeterminado.gif' label.icon='true'"
 * @generated
 */
public interface ComponentePredeterminado extends EObject
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
   * @see opencms.OpencmsPackage#getComponentePredeterminado_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link opencms.ComponentePredeterminado#getName <em>Name</em>}' attribute.
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
   * @see opencms.OpencmsPackage#getComponentePredeterminado_Orden()
   * @model
   * @generated
   */
  int getOrden();

  /**
   * Sets the value of the '{@link opencms.ComponentePredeterminado#getOrden <em>Orden</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orden</em>' attribute.
   * @see #getOrden()
   * @generated
   */
  void setOrden(int value);

} // ComponentePredeterminado
