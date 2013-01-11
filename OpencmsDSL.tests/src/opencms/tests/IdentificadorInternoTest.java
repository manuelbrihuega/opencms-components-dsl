/**
 */
package opencms.tests;

import junit.textui.TestRunner;

import opencms.IdentificadorInterno;
import opencms.OpencmsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Identificador Interno</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentificadorInternoTest extends ElementoOcultoTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(IdentificadorInternoTest.class);
  }

  /**
   * Constructs a new Identificador Interno test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentificadorInternoTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Identificador Interno test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected IdentificadorInterno getFixture()
  {
    return (IdentificadorInterno)fixture;
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
    setFixture(OpencmsFactory.eINSTANCE.createIdentificadorInterno());
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

} //IdentificadorInternoTest
