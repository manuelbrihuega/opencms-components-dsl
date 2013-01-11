/**
 */
package opencms.impl;

import opencms.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpencmsFactoryImpl extends EFactoryImpl implements OpencmsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OpencmsFactory init()
  {
    try
    {
      OpencmsFactory theOpencmsFactory = (OpencmsFactory)EPackage.Registry.INSTANCE.getEFactory("http://OpenCMS/1.0"); 
      if (theOpencmsFactory != null)
      {
        return theOpencmsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OpencmsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpencmsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case OpencmsPackage.DIAGRAMA: return createDiagrama();
      case OpencmsPackage.COMPONENTE: return createComponente();
      case OpencmsPackage.URL: return createUrl();
      case OpencmsPackage.SELECTOR_ARCHIVOS: return createSelectorArchivos();
      case OpencmsPackage.TAG: return createTag();
      case OpencmsPackage.IDENTIFICADOR_INTERNO: return createIdentificadorInterno();
      case OpencmsPackage.FECHA: return createFecha();
      case OpencmsPackage.ENTRADILLA: return createEntradilla();
      case OpencmsPackage.BOTON_SELECCION: return createBotonSeleccion();
      case OpencmsPackage.ENLACE: return createEnlace();
      case OpencmsPackage.VIDEO: return createVideo();
      case OpencmsPackage.TEXTO: return createTexto();
      case OpencmsPackage.BOTON: return createBoton();
      case OpencmsPackage.TITULO: return createTitulo();
      case OpencmsPackage.ETIQUETA: return createEtiqueta();
      case OpencmsPackage.AUDIO: return createAudio();
      case OpencmsPackage.SUBTITULO: return createSubtitulo();
      case OpencmsPackage.ENTRADA_TEXTO: return createEntradaTexto();
      case OpencmsPackage.IMAGEN: return createImagen();
      case OpencmsPackage.BANER: return createBaner();
      case OpencmsPackage.ICONO_RED_SOCIAL: return createIconoRedSocial();
      case OpencmsPackage.MENU_DESPLEGABLE: return createMenuDesplegable();
      case OpencmsPackage.BARRA_DESPLEGABLE: return createBarraDesplegable();
      case OpencmsPackage.SLIDER: return createSlider();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Diagrama createDiagrama()
  {
    DiagramaImpl diagrama = new DiagramaImpl();
    return diagrama;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Componente createComponente()
  {
    ComponenteImpl componente = new ComponenteImpl();
    return componente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Url createUrl()
  {
    UrlImpl url = new UrlImpl();
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectorArchivos createSelectorArchivos()
  {
    SelectorArchivosImpl selectorArchivos = new SelectorArchivosImpl();
    return selectorArchivos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tag createTag()
  {
    TagImpl tag = new TagImpl();
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentificadorInterno createIdentificadorInterno()
  {
    IdentificadorInternoImpl identificadorInterno = new IdentificadorInternoImpl();
    return identificadorInterno;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fecha createFecha()
  {
    FechaImpl fecha = new FechaImpl();
    return fecha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entradilla createEntradilla()
  {
    EntradillaImpl entradilla = new EntradillaImpl();
    return entradilla;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BotonSeleccion createBotonSeleccion()
  {
    BotonSeleccionImpl botonSeleccion = new BotonSeleccionImpl();
    return botonSeleccion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enlace createEnlace()
  {
    EnlaceImpl enlace = new EnlaceImpl();
    return enlace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Video createVideo()
  {
    VideoImpl video = new VideoImpl();
    return video;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Texto createTexto()
  {
    TextoImpl texto = new TextoImpl();
    return texto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boton createBoton()
  {
    BotonImpl boton = new BotonImpl();
    return boton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Titulo createTitulo()
  {
    TituloImpl titulo = new TituloImpl();
    return titulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Etiqueta createEtiqueta()
  {
    EtiquetaImpl etiqueta = new EtiquetaImpl();
    return etiqueta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Audio createAudio()
  {
    AudioImpl audio = new AudioImpl();
    return audio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subtitulo createSubtitulo()
  {
    SubtituloImpl subtitulo = new SubtituloImpl();
    return subtitulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntradaTexto createEntradaTexto()
  {
    EntradaTextoImpl entradaTexto = new EntradaTextoImpl();
    return entradaTexto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Imagen createImagen()
  {
    ImagenImpl imagen = new ImagenImpl();
    return imagen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Baner createBaner()
  {
    BanerImpl baner = new BanerImpl();
    return baner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IconoRedSocial createIconoRedSocial()
  {
    IconoRedSocialImpl iconoRedSocial = new IconoRedSocialImpl();
    return iconoRedSocial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MenuDesplegable createMenuDesplegable()
  {
    MenuDesplegableImpl menuDesplegable = new MenuDesplegableImpl();
    return menuDesplegable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BarraDesplegable createBarraDesplegable()
  {
    BarraDesplegableImpl barraDesplegable = new BarraDesplegableImpl();
    return barraDesplegable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Slider createSlider()
  {
    SliderImpl slider = new SliderImpl();
    return slider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpencmsPackage getOpencmsPackage()
  {
    return (OpencmsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OpencmsPackage getPackage()
  {
    return OpencmsPackage.eINSTANCE;
  }

} //OpencmsFactoryImpl
