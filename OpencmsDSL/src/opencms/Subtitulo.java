/**
 */
package opencms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtitulo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opencms.Subtitulo#isEnlace <em>Enlace</em>}</li>
 * </ul>
 * </p>
 *
 * @see opencms.OpencmsPackage#getSubtitulo()
 * @model
 * @generated
 */
public interface Subtitulo extends ElementoVisual
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
   * @see #setEnlace(boolean)
   * @see opencms.OpencmsPackage#getSubtitulo_Enlace()
   * @model annotation="gmf.label foo='bar'"
   * @generated
   */
  boolean isEnlace();

  /**
   * Sets the value of the '{@link opencms.Subtitulo#isEnlace <em>Enlace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enlace</em>' attribute.
   * @see #isEnlace()
   * @generated
   */
  void setEnlace(boolean value);

} // Subtitulo
