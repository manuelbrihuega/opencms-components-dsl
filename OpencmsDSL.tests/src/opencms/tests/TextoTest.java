/**
 */
package opencms.tests;

import junit.textui.TestRunner;

import opencms.OpencmsFactory;
import opencms.Texto;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Texto</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextoTest extends ElementoVisualTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(TextoTest.class);
  }

  /**
   * Constructs a new Texto test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextoTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Texto test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Texto getFixture()
  {
    return (Texto)fixture;
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
    setFixture(OpencmsFactory.eINSTANCE.createTexto());
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

} //TextoTest
