/**
 */
package opencms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see opencms.OpencmsFactory
 * @model kind="package"
 * @generated
 */
public interface OpencmsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "opencms";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://OpenCMS/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "opencmsn";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OpencmsPackage eINSTANCE = opencms.impl.OpencmsPackageImpl.init();

  /**
   * The meta object id for the '{@link opencms.impl.DiagramaImpl <em>Diagrama</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.DiagramaImpl
   * @see opencms.impl.OpencmsPackageImpl#getDiagrama()
   * @generated
   */
  int DIAGRAMA = 0;

  /**
   * The feature id for the '<em><b>Componente</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAMA__COMPONENTE = 0;

  /**
   * The number of structural features of the '<em>Diagrama</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAMA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link opencms.impl.ComponenteImpl <em>Componente</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.ComponenteImpl
   * @see opencms.impl.OpencmsPackageImpl#getComponente()
   * @generated
   */
  int COMPONENTE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Elemento Oculto</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENTE__ELEMENTO_OCULTO = 1;

  /**
   * The feature id for the '<em><b>Elemento Visual</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENTE__ELEMENTO_VISUAL = 2;

  /**
   * The feature id for the '<em><b>Componente Predeterminado</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENTE__COMPONENTE_PREDETERMINADO = 3;

  /**
   * The number of structural features of the '<em>Componente</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENTE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link opencms.impl.ElementoOcultoImpl <em>Elemento Oculto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.ElementoOcultoImpl
   * @see opencms.impl.OpencmsPackageImpl#getElementoOculto()
   * @generated
   */
  int ELEMENTO_OCULTO = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENTO_OCULTO__NAME = 0;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENTO_OCULTO__ORDEN = 1;

  /**
   * The number of structural features of the '<em>Elemento Oculto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENTO_OCULTO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link opencms.impl.UrlImpl <em>Url</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.UrlImpl
   * @see opencms.impl.OpencmsPackageImpl#getUrl()
   * @generated
   */
  int URL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL__NAME = ELEMENTO_OCULTO__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL__ORDEN = ELEMENTO_OCULTO__ORDEN;

  /**
   * The number of structural features of the '<em>Url</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_FEATURE_COUNT = ELEMENTO_OCULTO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link opencms.impl.SelectorArchivosImpl <em>Selector Archivos</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.SelectorArchivosImpl
   * @see opencms.impl.OpencmsPackageImpl#getSelectorArchivos()
   * @generated
   */
  int SELECTOR_ARCHIVOS = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR_ARCHIVOS__NAME = ELEMENTO_OCULTO__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR_ARCHIVOS__ORDEN = ELEMENTO_OCULTO__ORDEN;

  /**
   * The number of structural features of the '<em>Selector Archivos</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR_ARCHIVOS_FEATURE_COUNT = ELEMENTO_OCULTO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link opencms.impl.TagImpl <em>Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.TagImpl
   * @see opencms.impl.OpencmsPackageImpl#getTag()
   * @generated
   */
  int TAG = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__NAME = ELEMENTO_OCULTO__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__ORDEN = ELEMENTO_OCULTO__ORDEN;

  /**
   * The number of structural features of the '<em>Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FEATURE_COUNT = ELEMENTO_OCULTO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link opencms.impl.IdentificadorInternoImpl <em>Identificador Interno</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.IdentificadorInternoImpl
   * @see opencms.impl.OpencmsPackageImpl#getIdentificadorInterno()
   * @generated
   */
  int IDENTIFICADOR_INTERNO = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFICADOR_INTERNO__NAME = ELEMENTO_OCULTO__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFICADOR_INTERNO__ORDEN = ELEMENTO_OCULTO__ORDEN;

  /**
   * The number of structural features of the '<em>Identificador Interno</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFICADOR_INTERNO_FEATURE_COUNT = ELEMENTO_OCULTO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link opencms.impl.ElementoVisualImpl <em>Elemento Visual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.ElementoVisualImpl
   * @see opencms.impl.OpencmsPackageImpl#getElementoVisual()
   * @generated
   */
  int ELEMENTO_VISUAL = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENTO_VISUAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENTO_VISUAL__ORDEN = 1;

  /**
   * The number of structural features of the '<em>Elemento Visual</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENTO_VISUAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link opencms.impl.FechaImpl <em>Fecha</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.FechaImpl
   * @see opencms.impl.OpencmsPackageImpl#getFecha()
   * @generated
   */
  int FECHA = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FECHA__NAME = ELEMENTO_VISUAL__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FECHA__ORDEN = ELEMENTO_VISUAL__ORDEN;

  /**
   * The number of structural features of the '<em>Fecha</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FECHA_FEATURE_COUNT = ELEMENTO_VISUAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link opencms.impl.EntradillaImpl <em>Entradilla</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.EntradillaImpl
   * @see opencms.impl.OpencmsPackageImpl#getEntradilla()
   * @generated
   */
  int ENTRADILLA = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRADILLA__NAME = ELEMENTO_VISUAL__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRADILLA__ORDEN = ELEMENTO_VISUAL__ORDEN;

  /**
   * The number of structural features of the '<em>Entradilla</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRADILLA_FEATURE_COUNT = ELEMENTO_VISUAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link opencms.impl.BotonSeleccionImpl <em>Boton Seleccion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.BotonSeleccionImpl
   * @see opencms.impl.OpencmsPackageImpl#getBotonSeleccion()
   * @generated
   */
  int BOTON_SELECCION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOTON_SELECCION__NAME = ELEMENTO_VISUAL__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOTON_SELECCION__ORDEN = ELEMENTO_VISUAL__ORDEN;

  /**
   * The number of structural features of the '<em>Boton Seleccion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOTON_SELECCION_FEATURE_COUNT = ELEMENTO_VISUAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link opencms.impl.EnlaceImpl <em>Enlace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.EnlaceImpl
   * @see opencms.impl.OpencmsPackageImpl#getEnlace()
   * @generated
   */
  int ENLACE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLACE__NAME = ELEMENTO_VISUAL__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLACE__ORDEN = ELEMENTO_VISUAL__ORDEN;

  /**
   * The number of structural features of the '<em>Enlace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLACE_FEATURE_COUNT = ELEMENTO_VISUAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link opencms.impl.VideoImpl <em>Video</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.VideoImpl
   * @see opencms.impl.OpencmsPackageImpl#getVideo()
   * @generated
   */
  int VIDEO = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO__NAME = ELEMENTO_VISUAL__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO__ORDEN = ELEMENTO_VISUAL__ORDEN;

  /**
   * The number of structural features of the '<em>Video</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_FEATURE_COUNT = ELEMENTO_VISUAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link opencms.impl.TextoImpl <em>Texto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.TextoImpl
   * @see opencms.impl.OpencmsPackageImpl#getTexto()
   * @generated
   */
  int TEXTO = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTO__NAME = ELEMENTO_VISUAL__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTO__ORDEN = ELEMENTO_VISUAL__ORDEN;

  /**
   * The number of structural features of the '<em>Texto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTO_FEATURE_COUNT = ELEMENTO_VISUAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link opencms.impl.BotonImpl <em>Boton</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.BotonImpl
   * @see opencms.impl.OpencmsPackageImpl#getBoton()
   * @generated
   */
  int BOTON = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOTON__NAME = ELEMENTO_VISUAL__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOTON__ORDEN = ELEMENTO_VISUAL__ORDEN;

  /**
   * The number of structural features of the '<em>Boton</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOTON_FEATURE_COUNT = ELEMENTO_VISUAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link opencms.impl.TituloImpl <em>Titulo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.TituloImpl
   * @see opencms.impl.OpencmsPackageImpl#getTitulo()
   * @generated
   */
  int TITULO = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITULO__NAME = ELEMENTO_VISUAL__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITULO__ORDEN = ELEMENTO_VISUAL__ORDEN;

  /**
   * The feature id for the '<em><b>Enlace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITULO__ENLACE = ELEMENTO_VISUAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Titulo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITULO_FEATURE_COUNT = ELEMENTO_VISUAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link opencms.impl.EtiquetaImpl <em>Etiqueta</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.EtiquetaImpl
   * @see opencms.impl.OpencmsPackageImpl#getEtiqueta()
   * @generated
   */
  int ETIQUETA = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETIQUETA__NAME = ELEMENTO_VISUAL__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETIQUETA__ORDEN = ELEMENTO_VISUAL__ORDEN;

  /**
   * The number of structural features of the '<em>Etiqueta</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETIQUETA_FEATURE_COUNT = ELEMENTO_VISUAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link opencms.impl.AudioImpl <em>Audio</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.AudioImpl
   * @see opencms.impl.OpencmsPackageImpl#getAudio()
   * @generated
   */
  int AUDIO = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO__NAME = ELEMENTO_VISUAL__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO__ORDEN = ELEMENTO_VISUAL__ORDEN;

  /**
   * The number of structural features of the '<em>Audio</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_FEATURE_COUNT = ELEMENTO_VISUAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link opencms.impl.SubtituloImpl <em>Subtitulo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.SubtituloImpl
   * @see opencms.impl.OpencmsPackageImpl#getSubtitulo()
   * @generated
   */
  int SUBTITULO = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTITULO__NAME = ELEMENTO_VISUAL__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTITULO__ORDEN = ELEMENTO_VISUAL__ORDEN;

  /**
   * The feature id for the '<em><b>Enlace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTITULO__ENLACE = ELEMENTO_VISUAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Subtitulo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTITULO_FEATURE_COUNT = ELEMENTO_VISUAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link opencms.impl.EntradaTextoImpl <em>Entrada Texto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.EntradaTextoImpl
   * @see opencms.impl.OpencmsPackageImpl#getEntradaTexto()
   * @generated
   */
  int ENTRADA_TEXTO = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRADA_TEXTO__NAME = ELEMENTO_VISUAL__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRADA_TEXTO__ORDEN = ELEMENTO_VISUAL__ORDEN;

  /**
   * The number of structural features of the '<em>Entrada Texto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRADA_TEXTO_FEATURE_COUNT = ELEMENTO_VISUAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link opencms.impl.ImagenImpl <em>Imagen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.ImagenImpl
   * @see opencms.impl.OpencmsPackageImpl#getImagen()
   * @generated
   */
  int IMAGEN = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGEN__NAME = ELEMENTO_VISUAL__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGEN__ORDEN = ELEMENTO_VISUAL__ORDEN;

  /**
   * The feature id for the '<em><b>Alto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGEN__ALTO = ELEMENTO_VISUAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ancho</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGEN__ANCHO = ELEMENTO_VISUAL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Imagen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGEN_FEATURE_COUNT = ELEMENTO_VISUAL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link opencms.impl.ComponentePredeterminadoImpl <em>Componente Predeterminado</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.ComponentePredeterminadoImpl
   * @see opencms.impl.OpencmsPackageImpl#getComponentePredeterminado()
   * @generated
   */
  int COMPONENTE_PREDETERMINADO = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENTE_PREDETERMINADO__NAME = 0;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENTE_PREDETERMINADO__ORDEN = 1;

  /**
   * The number of structural features of the '<em>Componente Predeterminado</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENTE_PREDETERMINADO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link opencms.impl.BanerImpl <em>Baner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.BanerImpl
   * @see opencms.impl.OpencmsPackageImpl#getBaner()
   * @generated
   */
  int BANER = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BANER__NAME = COMPONENTE_PREDETERMINADO__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BANER__ORDEN = COMPONENTE_PREDETERMINADO__ORDEN;

  /**
   * The number of structural features of the '<em>Baner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BANER_FEATURE_COUNT = COMPONENTE_PREDETERMINADO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link opencms.impl.IconoRedSocialImpl <em>Icono Red Social</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.IconoRedSocialImpl
   * @see opencms.impl.OpencmsPackageImpl#getIconoRedSocial()
   * @generated
   */
  int ICONO_RED_SOCIAL = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICONO_RED_SOCIAL__NAME = COMPONENTE_PREDETERMINADO__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICONO_RED_SOCIAL__ORDEN = COMPONENTE_PREDETERMINADO__ORDEN;

  /**
   * The number of structural features of the '<em>Icono Red Social</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICONO_RED_SOCIAL_FEATURE_COUNT = COMPONENTE_PREDETERMINADO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link opencms.impl.MenuDesplegableImpl <em>Menu Desplegable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.MenuDesplegableImpl
   * @see opencms.impl.OpencmsPackageImpl#getMenuDesplegable()
   * @generated
   */
  int MENU_DESPLEGABLE = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_DESPLEGABLE__NAME = COMPONENTE_PREDETERMINADO__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_DESPLEGABLE__ORDEN = COMPONENTE_PREDETERMINADO__ORDEN;

  /**
   * The number of structural features of the '<em>Menu Desplegable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_DESPLEGABLE_FEATURE_COUNT = COMPONENTE_PREDETERMINADO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link opencms.impl.BarraDesplegableImpl <em>Barra Desplegable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.BarraDesplegableImpl
   * @see opencms.impl.OpencmsPackageImpl#getBarraDesplegable()
   * @generated
   */
  int BARRA_DESPLEGABLE = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BARRA_DESPLEGABLE__NAME = COMPONENTE_PREDETERMINADO__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BARRA_DESPLEGABLE__ORDEN = COMPONENTE_PREDETERMINADO__ORDEN;

  /**
   * The number of structural features of the '<em>Barra Desplegable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BARRA_DESPLEGABLE_FEATURE_COUNT = COMPONENTE_PREDETERMINADO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link opencms.impl.SliderImpl <em>Slider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see opencms.impl.SliderImpl
   * @see opencms.impl.OpencmsPackageImpl#getSlider()
   * @generated
   */
  int SLIDER = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER__NAME = COMPONENTE_PREDETERMINADO__NAME;

  /**
   * The feature id for the '<em><b>Orden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER__ORDEN = COMPONENTE_PREDETERMINADO__ORDEN;

  /**
   * The number of structural features of the '<em>Slider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_FEATURE_COUNT = COMPONENTE_PREDETERMINADO_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link opencms.Diagrama <em>Diagrama</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diagrama</em>'.
   * @see opencms.Diagrama
   * @generated
   */
  EClass getDiagrama();

  /**
   * Returns the meta object for the containment reference '{@link opencms.Diagrama#getComponente <em>Componente</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Componente</em>'.
   * @see opencms.Diagrama#getComponente()
   * @see #getDiagrama()
   * @generated
   */
  EReference getDiagrama_Componente();

  /**
   * Returns the meta object for class '{@link opencms.Componente <em>Componente</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Componente</em>'.
   * @see opencms.Componente
   * @generated
   */
  EClass getComponente();

  /**
   * Returns the meta object for the attribute '{@link opencms.Componente#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see opencms.Componente#getName()
   * @see #getComponente()
   * @generated
   */
  EAttribute getComponente_Name();

  /**
   * Returns the meta object for the containment reference list '{@link opencms.Componente#getElementoOculto <em>Elemento Oculto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elemento Oculto</em>'.
   * @see opencms.Componente#getElementoOculto()
   * @see #getComponente()
   * @generated
   */
  EReference getComponente_ElementoOculto();

  /**
   * Returns the meta object for the containment reference list '{@link opencms.Componente#getElementoVisual <em>Elemento Visual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elemento Visual</em>'.
   * @see opencms.Componente#getElementoVisual()
   * @see #getComponente()
   * @generated
   */
  EReference getComponente_ElementoVisual();

  /**
   * Returns the meta object for the containment reference list '{@link opencms.Componente#getComponentePredeterminado <em>Componente Predeterminado</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Componente Predeterminado</em>'.
   * @see opencms.Componente#getComponentePredeterminado()
   * @see #getComponente()
   * @generated
   */
  EReference getComponente_ComponentePredeterminado();

  /**
   * Returns the meta object for class '{@link opencms.ElementoOculto <em>Elemento Oculto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Elemento Oculto</em>'.
   * @see opencms.ElementoOculto
   * @generated
   */
  EClass getElementoOculto();

  /**
   * Returns the meta object for the attribute '{@link opencms.ElementoOculto#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see opencms.ElementoOculto#getName()
   * @see #getElementoOculto()
   * @generated
   */
  EAttribute getElementoOculto_Name();

  /**
   * Returns the meta object for the attribute '{@link opencms.ElementoOculto#getOrden <em>Orden</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orden</em>'.
   * @see opencms.ElementoOculto#getOrden()
   * @see #getElementoOculto()
   * @generated
   */
  EAttribute getElementoOculto_Orden();

  /**
   * Returns the meta object for class '{@link opencms.Url <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Url</em>'.
   * @see opencms.Url
   * @generated
   */
  EClass getUrl();

  /**
   * Returns the meta object for class '{@link opencms.SelectorArchivos <em>Selector Archivos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selector Archivos</em>'.
   * @see opencms.SelectorArchivos
   * @generated
   */
  EClass getSelectorArchivos();

  /**
   * Returns the meta object for class '{@link opencms.Tag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag</em>'.
   * @see opencms.Tag
   * @generated
   */
  EClass getTag();

  /**
   * Returns the meta object for class '{@link opencms.IdentificadorInterno <em>Identificador Interno</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identificador Interno</em>'.
   * @see opencms.IdentificadorInterno
   * @generated
   */
  EClass getIdentificadorInterno();

  /**
   * Returns the meta object for class '{@link opencms.ElementoVisual <em>Elemento Visual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Elemento Visual</em>'.
   * @see opencms.ElementoVisual
   * @generated
   */
  EClass getElementoVisual();

  /**
   * Returns the meta object for the attribute '{@link opencms.ElementoVisual#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see opencms.ElementoVisual#getName()
   * @see #getElementoVisual()
   * @generated
   */
  EAttribute getElementoVisual_Name();

  /**
   * Returns the meta object for the attribute '{@link opencms.ElementoVisual#getOrden <em>Orden</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orden</em>'.
   * @see opencms.ElementoVisual#getOrden()
   * @see #getElementoVisual()
   * @generated
   */
  EAttribute getElementoVisual_Orden();

  /**
   * Returns the meta object for class '{@link opencms.Fecha <em>Fecha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fecha</em>'.
   * @see opencms.Fecha
   * @generated
   */
  EClass getFecha();

  /**
   * Returns the meta object for class '{@link opencms.Entradilla <em>Entradilla</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entradilla</em>'.
   * @see opencms.Entradilla
   * @generated
   */
  EClass getEntradilla();

  /**
   * Returns the meta object for class '{@link opencms.BotonSeleccion <em>Boton Seleccion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boton Seleccion</em>'.
   * @see opencms.BotonSeleccion
   * @generated
   */
  EClass getBotonSeleccion();

  /**
   * Returns the meta object for class '{@link opencms.Enlace <em>Enlace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enlace</em>'.
   * @see opencms.Enlace
   * @generated
   */
  EClass getEnlace();

  /**
   * Returns the meta object for class '{@link opencms.Video <em>Video</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video</em>'.
   * @see opencms.Video
   * @generated
   */
  EClass getVideo();

  /**
   * Returns the meta object for class '{@link opencms.Texto <em>Texto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Texto</em>'.
   * @see opencms.Texto
   * @generated
   */
  EClass getTexto();

  /**
   * Returns the meta object for class '{@link opencms.Boton <em>Boton</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boton</em>'.
   * @see opencms.Boton
   * @generated
   */
  EClass getBoton();

  /**
   * Returns the meta object for class '{@link opencms.Titulo <em>Titulo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Titulo</em>'.
   * @see opencms.Titulo
   * @generated
   */
  EClass getTitulo();

  /**
   * Returns the meta object for the attribute '{@link opencms.Titulo#getEnlace <em>Enlace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enlace</em>'.
   * @see opencms.Titulo#getEnlace()
   * @see #getTitulo()
   * @generated
   */
  EAttribute getTitulo_Enlace();

  /**
   * Returns the meta object for class '{@link opencms.Etiqueta <em>Etiqueta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Etiqueta</em>'.
   * @see opencms.Etiqueta
   * @generated
   */
  EClass getEtiqueta();

  /**
   * Returns the meta object for class '{@link opencms.Audio <em>Audio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Audio</em>'.
   * @see opencms.Audio
   * @generated
   */
  EClass getAudio();

  /**
   * Returns the meta object for class '{@link opencms.Subtitulo <em>Subtitulo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subtitulo</em>'.
   * @see opencms.Subtitulo
   * @generated
   */
  EClass getSubtitulo();

  /**
   * Returns the meta object for the attribute '{@link opencms.Subtitulo#isEnlace <em>Enlace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enlace</em>'.
   * @see opencms.Subtitulo#isEnlace()
   * @see #getSubtitulo()
   * @generated
   */
  EAttribute getSubtitulo_Enlace();

  /**
   * Returns the meta object for class '{@link opencms.EntradaTexto <em>Entrada Texto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entrada Texto</em>'.
   * @see opencms.EntradaTexto
   * @generated
   */
  EClass getEntradaTexto();

  /**
   * Returns the meta object for class '{@link opencms.Imagen <em>Imagen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imagen</em>'.
   * @see opencms.Imagen
   * @generated
   */
  EClass getImagen();

  /**
   * Returns the meta object for the attribute '{@link opencms.Imagen#getAlto <em>Alto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alto</em>'.
   * @see opencms.Imagen#getAlto()
   * @see #getImagen()
   * @generated
   */
  EAttribute getImagen_Alto();

  /**
   * Returns the meta object for the attribute '{@link opencms.Imagen#getAncho <em>Ancho</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ancho</em>'.
   * @see opencms.Imagen#getAncho()
   * @see #getImagen()
   * @generated
   */
  EAttribute getImagen_Ancho();

  /**
   * Returns the meta object for class '{@link opencms.ComponentePredeterminado <em>Componente Predeterminado</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Componente Predeterminado</em>'.
   * @see opencms.ComponentePredeterminado
   * @generated
   */
  EClass getComponentePredeterminado();

  /**
   * Returns the meta object for the attribute '{@link opencms.ComponentePredeterminado#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see opencms.ComponentePredeterminado#getName()
   * @see #getComponentePredeterminado()
   * @generated
   */
  EAttribute getComponentePredeterminado_Name();

  /**
   * Returns the meta object for the attribute '{@link opencms.ComponentePredeterminado#getOrden <em>Orden</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orden</em>'.
   * @see opencms.ComponentePredeterminado#getOrden()
   * @see #getComponentePredeterminado()
   * @generated
   */
  EAttribute getComponentePredeterminado_Orden();

  /**
   * Returns the meta object for class '{@link opencms.Baner <em>Baner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Baner</em>'.
   * @see opencms.Baner
   * @generated
   */
  EClass getBaner();

  /**
   * Returns the meta object for class '{@link opencms.IconoRedSocial <em>Icono Red Social</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Icono Red Social</em>'.
   * @see opencms.IconoRedSocial
   * @generated
   */
  EClass getIconoRedSocial();

  /**
   * Returns the meta object for class '{@link opencms.MenuDesplegable <em>Menu Desplegable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Menu Desplegable</em>'.
   * @see opencms.MenuDesplegable
   * @generated
   */
  EClass getMenuDesplegable();

  /**
   * Returns the meta object for class '{@link opencms.BarraDesplegable <em>Barra Desplegable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Barra Desplegable</em>'.
   * @see opencms.BarraDesplegable
   * @generated
   */
  EClass getBarraDesplegable();

  /**
   * Returns the meta object for class '{@link opencms.Slider <em>Slider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slider</em>'.
   * @see opencms.Slider
   * @generated
   */
  EClass getSlider();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OpencmsFactory getOpencmsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link opencms.impl.DiagramaImpl <em>Diagrama</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.DiagramaImpl
     * @see opencms.impl.OpencmsPackageImpl#getDiagrama()
     * @generated
     */
    EClass DIAGRAMA = eINSTANCE.getDiagrama();

    /**
     * The meta object literal for the '<em><b>Componente</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAMA__COMPONENTE = eINSTANCE.getDiagrama_Componente();

    /**
     * The meta object literal for the '{@link opencms.impl.ComponenteImpl <em>Componente</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.ComponenteImpl
     * @see opencms.impl.OpencmsPackageImpl#getComponente()
     * @generated
     */
    EClass COMPONENTE = eINSTANCE.getComponente();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENTE__NAME = eINSTANCE.getComponente_Name();

    /**
     * The meta object literal for the '<em><b>Elemento Oculto</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENTE__ELEMENTO_OCULTO = eINSTANCE.getComponente_ElementoOculto();

    /**
     * The meta object literal for the '<em><b>Elemento Visual</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENTE__ELEMENTO_VISUAL = eINSTANCE.getComponente_ElementoVisual();

    /**
     * The meta object literal for the '<em><b>Componente Predeterminado</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENTE__COMPONENTE_PREDETERMINADO = eINSTANCE.getComponente_ComponentePredeterminado();

    /**
     * The meta object literal for the '{@link opencms.impl.ElementoOcultoImpl <em>Elemento Oculto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.ElementoOcultoImpl
     * @see opencms.impl.OpencmsPackageImpl#getElementoOculto()
     * @generated
     */
    EClass ELEMENTO_OCULTO = eINSTANCE.getElementoOculto();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENTO_OCULTO__NAME = eINSTANCE.getElementoOculto_Name();

    /**
     * The meta object literal for the '<em><b>Orden</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENTO_OCULTO__ORDEN = eINSTANCE.getElementoOculto_Orden();

    /**
     * The meta object literal for the '{@link opencms.impl.UrlImpl <em>Url</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.UrlImpl
     * @see opencms.impl.OpencmsPackageImpl#getUrl()
     * @generated
     */
    EClass URL = eINSTANCE.getUrl();

    /**
     * The meta object literal for the '{@link opencms.impl.SelectorArchivosImpl <em>Selector Archivos</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.SelectorArchivosImpl
     * @see opencms.impl.OpencmsPackageImpl#getSelectorArchivos()
     * @generated
     */
    EClass SELECTOR_ARCHIVOS = eINSTANCE.getSelectorArchivos();

    /**
     * The meta object literal for the '{@link opencms.impl.TagImpl <em>Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.TagImpl
     * @see opencms.impl.OpencmsPackageImpl#getTag()
     * @generated
     */
    EClass TAG = eINSTANCE.getTag();

    /**
     * The meta object literal for the '{@link opencms.impl.IdentificadorInternoImpl <em>Identificador Interno</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.IdentificadorInternoImpl
     * @see opencms.impl.OpencmsPackageImpl#getIdentificadorInterno()
     * @generated
     */
    EClass IDENTIFICADOR_INTERNO = eINSTANCE.getIdentificadorInterno();

    /**
     * The meta object literal for the '{@link opencms.impl.ElementoVisualImpl <em>Elemento Visual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.ElementoVisualImpl
     * @see opencms.impl.OpencmsPackageImpl#getElementoVisual()
     * @generated
     */
    EClass ELEMENTO_VISUAL = eINSTANCE.getElementoVisual();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENTO_VISUAL__NAME = eINSTANCE.getElementoVisual_Name();

    /**
     * The meta object literal for the '<em><b>Orden</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENTO_VISUAL__ORDEN = eINSTANCE.getElementoVisual_Orden();

    /**
     * The meta object literal for the '{@link opencms.impl.FechaImpl <em>Fecha</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.FechaImpl
     * @see opencms.impl.OpencmsPackageImpl#getFecha()
     * @generated
     */
    EClass FECHA = eINSTANCE.getFecha();

    /**
     * The meta object literal for the '{@link opencms.impl.EntradillaImpl <em>Entradilla</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.EntradillaImpl
     * @see opencms.impl.OpencmsPackageImpl#getEntradilla()
     * @generated
     */
    EClass ENTRADILLA = eINSTANCE.getEntradilla();

    /**
     * The meta object literal for the '{@link opencms.impl.BotonSeleccionImpl <em>Boton Seleccion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.BotonSeleccionImpl
     * @see opencms.impl.OpencmsPackageImpl#getBotonSeleccion()
     * @generated
     */
    EClass BOTON_SELECCION = eINSTANCE.getBotonSeleccion();

    /**
     * The meta object literal for the '{@link opencms.impl.EnlaceImpl <em>Enlace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.EnlaceImpl
     * @see opencms.impl.OpencmsPackageImpl#getEnlace()
     * @generated
     */
    EClass ENLACE = eINSTANCE.getEnlace();

    /**
     * The meta object literal for the '{@link opencms.impl.VideoImpl <em>Video</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.VideoImpl
     * @see opencms.impl.OpencmsPackageImpl#getVideo()
     * @generated
     */
    EClass VIDEO = eINSTANCE.getVideo();

    /**
     * The meta object literal for the '{@link opencms.impl.TextoImpl <em>Texto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.TextoImpl
     * @see opencms.impl.OpencmsPackageImpl#getTexto()
     * @generated
     */
    EClass TEXTO = eINSTANCE.getTexto();

    /**
     * The meta object literal for the '{@link opencms.impl.BotonImpl <em>Boton</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.BotonImpl
     * @see opencms.impl.OpencmsPackageImpl#getBoton()
     * @generated
     */
    EClass BOTON = eINSTANCE.getBoton();

    /**
     * The meta object literal for the '{@link opencms.impl.TituloImpl <em>Titulo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.TituloImpl
     * @see opencms.impl.OpencmsPackageImpl#getTitulo()
     * @generated
     */
    EClass TITULO = eINSTANCE.getTitulo();

    /**
     * The meta object literal for the '<em><b>Enlace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TITULO__ENLACE = eINSTANCE.getTitulo_Enlace();

    /**
     * The meta object literal for the '{@link opencms.impl.EtiquetaImpl <em>Etiqueta</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.EtiquetaImpl
     * @see opencms.impl.OpencmsPackageImpl#getEtiqueta()
     * @generated
     */
    EClass ETIQUETA = eINSTANCE.getEtiqueta();

    /**
     * The meta object literal for the '{@link opencms.impl.AudioImpl <em>Audio</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.AudioImpl
     * @see opencms.impl.OpencmsPackageImpl#getAudio()
     * @generated
     */
    EClass AUDIO = eINSTANCE.getAudio();

    /**
     * The meta object literal for the '{@link opencms.impl.SubtituloImpl <em>Subtitulo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.SubtituloImpl
     * @see opencms.impl.OpencmsPackageImpl#getSubtitulo()
     * @generated
     */
    EClass SUBTITULO = eINSTANCE.getSubtitulo();

    /**
     * The meta object literal for the '<em><b>Enlace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBTITULO__ENLACE = eINSTANCE.getSubtitulo_Enlace();

    /**
     * The meta object literal for the '{@link opencms.impl.EntradaTextoImpl <em>Entrada Texto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.EntradaTextoImpl
     * @see opencms.impl.OpencmsPackageImpl#getEntradaTexto()
     * @generated
     */
    EClass ENTRADA_TEXTO = eINSTANCE.getEntradaTexto();

    /**
     * The meta object literal for the '{@link opencms.impl.ImagenImpl <em>Imagen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.ImagenImpl
     * @see opencms.impl.OpencmsPackageImpl#getImagen()
     * @generated
     */
    EClass IMAGEN = eINSTANCE.getImagen();

    /**
     * The meta object literal for the '<em><b>Alto</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGEN__ALTO = eINSTANCE.getImagen_Alto();

    /**
     * The meta object literal for the '<em><b>Ancho</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGEN__ANCHO = eINSTANCE.getImagen_Ancho();

    /**
     * The meta object literal for the '{@link opencms.impl.ComponentePredeterminadoImpl <em>Componente Predeterminado</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.ComponentePredeterminadoImpl
     * @see opencms.impl.OpencmsPackageImpl#getComponentePredeterminado()
     * @generated
     */
    EClass COMPONENTE_PREDETERMINADO = eINSTANCE.getComponentePredeterminado();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENTE_PREDETERMINADO__NAME = eINSTANCE.getComponentePredeterminado_Name();

    /**
     * The meta object literal for the '<em><b>Orden</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENTE_PREDETERMINADO__ORDEN = eINSTANCE.getComponentePredeterminado_Orden();

    /**
     * The meta object literal for the '{@link opencms.impl.BanerImpl <em>Baner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.BanerImpl
     * @see opencms.impl.OpencmsPackageImpl#getBaner()
     * @generated
     */
    EClass BANER = eINSTANCE.getBaner();

    /**
     * The meta object literal for the '{@link opencms.impl.IconoRedSocialImpl <em>Icono Red Social</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.IconoRedSocialImpl
     * @see opencms.impl.OpencmsPackageImpl#getIconoRedSocial()
     * @generated
     */
    EClass ICONO_RED_SOCIAL = eINSTANCE.getIconoRedSocial();

    /**
     * The meta object literal for the '{@link opencms.impl.MenuDesplegableImpl <em>Menu Desplegable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.MenuDesplegableImpl
     * @see opencms.impl.OpencmsPackageImpl#getMenuDesplegable()
     * @generated
     */
    EClass MENU_DESPLEGABLE = eINSTANCE.getMenuDesplegable();

    /**
     * The meta object literal for the '{@link opencms.impl.BarraDesplegableImpl <em>Barra Desplegable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.BarraDesplegableImpl
     * @see opencms.impl.OpencmsPackageImpl#getBarraDesplegable()
     * @generated
     */
    EClass BARRA_DESPLEGABLE = eINSTANCE.getBarraDesplegable();

    /**
     * The meta object literal for the '{@link opencms.impl.SliderImpl <em>Slider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see opencms.impl.SliderImpl
     * @see opencms.impl.OpencmsPackageImpl#getSlider()
     * @generated
     */
    EClass SLIDER = eINSTANCE.getSlider();

  }

} //OpencmsPackage
