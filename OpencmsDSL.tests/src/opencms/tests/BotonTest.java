/**
 */
package opencms.tests;

import junit.textui.TestRunner;

import opencms.Boton;
import opencms.OpencmsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boton</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BotonTest extends ElementoVisualTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(BotonTest.class);
  }

  /**
   * Constructs a new Boton test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BotonTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Boton test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Boton getFixture()
  {
    return (Boton)fixture;
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
    setFixture(OpencmsFactory.eINSTANCE.createBoton());
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

} //BotonTest
