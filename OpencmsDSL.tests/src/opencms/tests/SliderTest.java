/**
 */
package opencms.tests;

import junit.textui.TestRunner;

import opencms.OpencmsFactory;
import opencms.Slider;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Slider</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SliderTest extends ComponentePredeterminadoTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(SliderTest.class);
  }

  /**
   * Constructs a new Slider test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SliderTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Slider test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Slider getFixture()
  {
    return (Slider)fixture;
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
    setFixture(OpencmsFactory.eINSTANCE.createSlider());
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

} //SliderTest
