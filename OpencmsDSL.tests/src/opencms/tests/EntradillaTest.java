/**
 */
package opencms.tests;

import junit.textui.TestRunner;

import opencms.Entradilla;
import opencms.OpencmsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entradilla</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntradillaTest extends ElementoVisualTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(EntradillaTest.class);
  }

  /**
   * Constructs a new Entradilla test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntradillaTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Entradilla test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Entradilla getFixture()
  {
    return (Entradilla)fixture;
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
    setFixture(OpencmsFactory.eINSTANCE.createEntradilla());
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

} //EntradillaTest
