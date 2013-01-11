/**
 */
package opencms.tests;

import junit.textui.TestRunner;

import opencms.MenuDesplegable;
import opencms.OpencmsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Menu Desplegable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MenuDesplegableTest extends ComponentePredeterminadoTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(MenuDesplegableTest.class);
  }

  /**
   * Constructs a new Menu Desplegable test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MenuDesplegableTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Menu Desplegable test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected MenuDesplegable getFixture()
  {
    return (MenuDesplegable)fixture;
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
    setFixture(OpencmsFactory.eINSTANCE.createMenuDesplegable());
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

} //MenuDesplegableTest
