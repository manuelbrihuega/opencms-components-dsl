/**
 */
package opencms.tests;

import junit.textui.TestRunner;

import opencms.OpencmsFactory;
import opencms.Subtitulo;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subtitulo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubtituloTest extends ElementoVisualTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(SubtituloTest.class);
  }

  /**
   * Constructs a new Subtitulo test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubtituloTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Subtitulo test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Subtitulo getFixture()
  {
    return (Subtitulo)fixture;
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
    setFixture(OpencmsFactory.eINSTANCE.createSubtitulo());
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

} //SubtituloTest
