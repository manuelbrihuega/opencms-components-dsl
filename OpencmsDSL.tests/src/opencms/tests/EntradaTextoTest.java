/**
 */
package opencms.tests;

import junit.textui.TestRunner;

import opencms.EntradaTexto;
import opencms.OpencmsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entrada Texto</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntradaTextoTest extends ElementoVisualTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(EntradaTextoTest.class);
  }

  /**
   * Constructs a new Entrada Texto test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntradaTextoTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Entrada Texto test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EntradaTexto getFixture()
  {
    return (EntradaTexto)fixture;
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
    setFixture(OpencmsFactory.eINSTANCE.createEntradaTexto());
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

} //EntradaTextoTest
