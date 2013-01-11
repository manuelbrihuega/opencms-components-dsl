/**
 */
package opencms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Componente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opencms.Componente#getName <em>Name</em>}</li>
 *   <li>{@link opencms.Componente#getElementoOculto <em>Elemento Oculto</em>}</li>
 *   <li>{@link opencms.Componente#getElementoVisual <em>Elemento Visual</em>}</li>
 *   <li>{@link opencms.Componente#getComponentePredeterminado <em>Componente Predeterminado</em>}</li>
 * </ul>
 * </p>
 *
 * @see opencms.OpencmsPackage#getComponente()
 * @model annotation="gmf.node label='name,orden' figure='rectangle' color='135,35,35' label.pattern='{0}:{1}' tool.small.bundle='OpencmsDSL' tool.small.path='resources/icono_componente.gif' tool.large.path='resources/icono_componente.gif' label.icon='true'"
 * @generated
 */
public interface Componente extends EObject
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
   * @see opencms.OpencmsPackage#getComponente_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link opencms.Componente#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Elemento Oculto</b></em>' containment reference list.
   * The list contents are of type {@link opencms.ElementoOculto}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elemento Oculto</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elemento Oculto</em>' containment reference list.
   * @see opencms.OpencmsPackage#getComponente_ElementoOculto()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<ElementoOculto> getElementoOculto();

  /**
   * Returns the value of the '<em><b>Elemento Visual</b></em>' containment reference list.
   * The list contents are of type {@link opencms.ElementoVisual}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elemento Visual</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elemento Visual</em>' containment reference list.
   * @see opencms.OpencmsPackage#getComponente_ElementoVisual()
   * @model containment="true" required="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<ElementoVisual> getElementoVisual();

  /**
   * Returns the value of the '<em><b>Componente Predeterminado</b></em>' containment reference list.
   * The list contents are of type {@link opencms.ComponentePredeterminado}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Componente Predeterminado</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Componente Predeterminado</em>' containment reference list.
   * @see opencms.OpencmsPackage#getComponente_ComponentePredeterminado()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<ComponentePredeterminado> getComponentePredeterminado();

} // Componente
