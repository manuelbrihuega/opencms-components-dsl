/**
 */
package opencms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imagen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opencms.Imagen#getAlto <em>Alto</em>}</li>
 *   <li>{@link opencms.Imagen#getAncho <em>Ancho</em>}</li>
 * </ul>
 * </p>
 *
 * @see opencms.OpencmsPackage#getImagen()
 * @model
 * @generated
 */
public interface Imagen extends ElementoVisual
{
  /**
   * Returns the value of the '<em><b>Alto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alto</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alto</em>' attribute.
   * @see #setAlto(Float)
   * @see opencms.OpencmsPackage#getImagen_Alto()
   * @model annotation="gmf.label foo='bar'"
   * @generated
   */
  Float getAlto();

  /**
   * Sets the value of the '{@link opencms.Imagen#getAlto <em>Alto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alto</em>' attribute.
   * @see #getAlto()
   * @generated
   */
  void setAlto(Float value);

  /**
   * Returns the value of the '<em><b>Ancho</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ancho</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ancho</em>' attribute.
   * @see #setAncho(Float)
   * @see opencms.OpencmsPackage#getImagen_Ancho()
   * @model annotation="gmf.label foo='bar'"
   * @generated
   */
  Float getAncho();

  /**
   * Sets the value of the '{@link opencms.Imagen#getAncho <em>Ancho</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ancho</em>' attribute.
   * @see #getAncho()
   * @generated
   */
  void setAncho(Float value);

} // Imagen
