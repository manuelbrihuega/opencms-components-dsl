/**
 */
package opencms.tests;

import junit.textui.TestRunner;

import opencms.OpencmsFactory;
import opencms.SelectorArchivos;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Selector Archivos</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectorArchivosTest extends ElementoOcultoTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(SelectorArchivosTest.class);
  }

  /**
   * Constructs a new Selector Archivos test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectorArchivosTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Selector Archivos test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected SelectorArchivos getFixture()
  {
    return (SelectorArchivos)fixture;
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
    setFixture(OpencmsFactory.eINSTANCE.createSelectorArchivos());
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

} //SelectorArchivosTest
