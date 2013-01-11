/**
 */
package opencms.tests;

import junit.textui.TestRunner;

import opencms.BotonSeleccion;
import opencms.OpencmsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boton Seleccion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BotonSeleccionTest extends ElementoVisualTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(BotonSeleccionTest.class);
  }

  /**
   * Constructs a new Boton Seleccion test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BotonSeleccionTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Boton Seleccion test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected BotonSeleccion getFixture()
  {
    return (BotonSeleccion)fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(OpencmsFactory.eINSTANCE.createBotonSeleccion());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

} //BotonSeleccionTest
