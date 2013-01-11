/**
 */
package opencms.tests;

import junit.textui.TestRunner;

import opencms.BarraDesplegable;
import opencms.OpencmsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Barra Desplegable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BarraDesplegableTest extends ComponentePredeterminadoTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(BarraDesplegableTest.class);
  }

  /**
   * Constructs a new Barra Desplegable test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BarraDesplegableTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Barra Desplegable test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected BarraDesplegable getFixture()
  {
    return (BarraDesplegable)fixture;
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
    setFixture(OpencmsFactory.eINSTANCE.createBarraDesplegable());
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

} //BarraDesplegableTest
