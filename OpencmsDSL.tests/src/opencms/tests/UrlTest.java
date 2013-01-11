/**
 */
package opencms.tests;

import junit.textui.TestRunner;

import opencms.OpencmsFactory;
import opencms.Url;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Url</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UrlTest extends ElementoOcultoTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(UrlTest.class);
  }

  /**
   * Constructs a new Url test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UrlTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Url test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Url getFixture()
  {
    return (Url)fixture;
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
    setFixture(OpencmsFactory.eINSTANCE.createUrl());
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

} //UrlTest
