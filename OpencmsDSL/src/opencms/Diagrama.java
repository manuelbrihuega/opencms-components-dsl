/**
 */
package opencms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagrama</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opencms.Diagrama#getComponente <em>Componente</em>}</li>
 * </ul>
 * </p>
 *
 * @see opencms.OpencmsPackage#getDiagrama()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface Diagrama extends EObject
{
  /**
   * Returns the value of the '<em><b>Componente</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Componente</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Componente</em>' containment reference.
   * @see #setComponente(Componente)
   * @see opencms.OpencmsPackage#getDiagrama_Componente()
   * @model containment="true" required="true"
   * @generated
   */
  Componente getComponente();

  /**
   * Sets the value of the '{@link opencms.Diagrama#getComponente <em>Componente</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Componente</em>' containment reference.
   * @see #getComponente()
   * @generated
   */
  void setComponente(Componente value);

} // Diagrama
