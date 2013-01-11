/**
 */
package opencms.tests;

import junit.textui.TestRunner;

import opencms.Fecha;
import opencms.OpencmsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fecha</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FechaTest extends ElementoVisualTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(FechaTest.class);
  }

  /**
   * Constructs a new Fecha test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FechaTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Fecha test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Fecha getFixture()
  {
    return (Fecha)fixture;
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
    setFixture(OpencmsFactory.eINSTANCE.createFecha());
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

} //FechaTest
