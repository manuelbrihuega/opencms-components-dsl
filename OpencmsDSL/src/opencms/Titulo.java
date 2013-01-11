/**
 */
package opencms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Titulo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opencms.Titulo#getEnlace <em>Enlace</em>}</li>
 * </ul>
 * </p>
 *
 * @see opencms.OpencmsPackage#getTitulo()
 * @model
 * @generated
 */
public interface Titulo extends ElementoVisual
{
  /**
   * Returns the value of the '<em><b>Enlace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enlace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enlace</em>' attribute.
   * @see #setEnlace(Boolean)
   * @see opencms.OpencmsPackage#getTitulo_Enlace()
   * @model annotation="gmf.label foo='bar'"
   * @generated
   */
  Boolean getEnlace();

  /**
   * Sets the value of the '{@link opencms.Titulo#getEnlace <em>Enlace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enlace</em>' attribute.
   * @see #getEnlace()
   * @generated
   */
  void setEnlace(Boolean value);

} // Titulo
