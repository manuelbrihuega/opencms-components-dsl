/**
 */
package opencms.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import opencms.Componente;
import opencms.OpencmsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Componente</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponenteTest extends TestCase
{

  /**
   * The fixture for this Componente test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Componente fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ComponenteTest.class);
  }

  /**
   * Constructs a new Componente test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponenteTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Componente test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Componente fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Componente test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Componente getFixture()
  {
    return fixture;
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
    setFixture(OpencmsFactory.eINSTANCE.createComponente());
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

} //ComponenteTest
