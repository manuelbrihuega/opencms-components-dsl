/**
 */
package opencms.impl;

import opencms.Audio;
import opencms.Baner;
import opencms.BarraDesplegable;
import opencms.Boton;
import opencms.BotonSeleccion;
import opencms.Componente;
import opencms.ComponentePredeterminado;
import opencms.Diagrama;
import opencms.ElementoOculto;
import opencms.ElementoVisual;
import opencms.Enlace;
import opencms.EntradaTexto;
import opencms.Entradilla;
import opencms.Etiqueta;
import opencms.Fecha;
import opencms.IconoRedSocial;
import opencms.IdentificadorInterno;
import opencms.Imagen;
import opencms.MenuDesplegable;
import opencms.OpencmsFactory;
import opencms.OpencmsPackage;
import opencms.SelectorArchivos;
import opencms.Slider;
import opencms.Subtitulo;
import opencms.Tag;
import opencms.Texto;
import opencms.Titulo;
import opencms.Url;
import opencms.Video;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpencmsPackageImpl extends EPackageImpl implements OpencmsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass diagramaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componenteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementoOcultoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass urlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectorArchivosEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tagEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identificadorInternoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementoVisualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fechaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entradillaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass botonSeleccionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enlaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass videoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass botonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tituloEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etiquetaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass audioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subtituloEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entradaTextoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imagenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentePredeterminadoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass banerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iconoRedSocialEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass menuDesplegableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass barraDesplegableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sliderEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see opencms.OpencmsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OpencmsPackageImpl()
  {
    super(eNS_URI, OpencmsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link OpencmsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static OpencmsPackage init()
  {
    if (isInited) return (OpencmsPackage)EPackage.Registry.INSTANCE.getEPackage(OpencmsPackage.eNS_URI);

    // Obtain or create and register package
    OpencmsPackageImpl theOpencmsPackage = (OpencmsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OpencmsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OpencmsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theOpencmsPackage.createPackageContents();

    // Initialize created meta-data
    theOpencmsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOpencmsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(OpencmsPackage.eNS_URI, theOpencmsPackage);
    return theOpencmsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiagrama()
  {
    return diagramaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagrama_Componente()
  {
    return (EReference)diagramaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponente()
  {
    return componenteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponente_Name()
  {
    return (EAttribute)componenteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponente_ElementoOculto()
  {
    return (EReference)componenteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponente_ElementoVisual()
  {
    return (EReference)componenteEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponente_ComponentePredeterminado()
  {
    return (EReference)componenteEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementoOculto()
  {
    return elementoOcultoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementoOculto_Name()
  {
    return (EAttribute)elementoOcultoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementoOculto_Orden()
  {
    return (EAttribute)elementoOcultoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUrl()
  {
    return urlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectorArchivos()
  {
    return selectorArchivosEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTag()
  {
    return tagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentificadorInterno()
  {
    return identificadorInternoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementoVisual()
  {
    return elementoVisualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementoVisual_Name()
  {
    return (EAttribute)elementoVisualEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementoVisual_Orden()
  {
    return (EAttribute)elementoVisualEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFecha()
  {
    return fechaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntradilla()
  {
    return entradillaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBotonSeleccion()
  {
    return botonSeleccionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnlace()
  {
    return enlaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVideo()
  {
    return videoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTexto()
  {
    return textoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoton()
  {
    return botonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTitulo()
  {
    return tituloEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTitulo_Enlace()
  {
    return (EAttribute)tituloEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEtiqueta()
  {
    return etiquetaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAudio()
  {
    return audioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubtitulo()
  {
    return subtituloEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubtitulo_Enlace()
  {
    return (EAttribute)subtituloEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntradaTexto()
  {
    return entradaTextoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImagen()
  {
    return imagenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImagen_Alto()
  {
    return (EAttribute)imagenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImagen_Ancho()
  {
    return (EAttribute)imagenEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentePredeterminado()
  {
    return componentePredeterminadoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentePredeterminado_Name()
  {
    return (EAttribute)componentePredeterminadoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentePredeterminado_Orden()
  {
    return (EAttribute)componentePredeterminadoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBaner()
  {
    return banerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIconoRedSocial()
  {
    return iconoRedSocialEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMenuDesplegable()
  {
    return menuDesplegableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBarraDesplegable()
  {
    return barraDesplegableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSlider()
  {
    return sliderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpencmsFactory getOpencmsFactory()
  {
    return (OpencmsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    diagramaEClass = createEClass(DIAGRAMA);
    createEReference(diagramaEClass, DIAGRAMA__COMPONENTE);

    componenteEClass = createEClass(COMPONENTE);
    createEAttribute(componenteEClass, COMPONENTE__NAME);
    createEReference(componenteEClass, COMPONENTE__ELEMENTO_OCULTO);
    createEReference(componenteEClass, COMPONENTE__ELEMENTO_VISUAL);
    createEReference(componenteEClass, COMPONENTE__COMPONENTE_PREDETERMINADO);

    elementoOcultoEClass = createEClass(ELEMENTO_OCULTO);
    createEAttribute(elementoOcultoEClass, ELEMENTO_OCULTO__NAME);
    createEAttribute(elementoOcultoEClass, ELEMENTO_OCULTO__ORDEN);

    urlEClass = createEClass(URL);

    selectorArchivosEClass = createEClass(SELECTOR_ARCHIVOS);

    tagEClass = createEClass(TAG);

    identificadorInternoEClass = createEClass(IDENTIFICADOR_INTERNO);

    elementoVisualEClass = createEClass(ELEMENTO_VISUAL);
    createEAttribute(elementoVisualEClass, ELEMENTO_VISUAL__NAME);
    createEAttribute(elementoVisualEClass, ELEMENTO_VISUAL__ORDEN);

    fechaEClass = createEClass(FECHA);

    entradillaEClass = createEClass(ENTRADILLA);

    botonSeleccionEClass = createEClass(BOTON_SELECCION);

    enlaceEClass = createEClass(ENLACE);

    videoEClass = createEClass(VIDEO);

    textoEClass = createEClass(TEXTO);

    botonEClass = createEClass(BOTON);

    tituloEClass = createEClass(TITULO);
    createEAttribute(tituloEClass, TITULO__ENLACE);

    etiquetaEClass = createEClass(ETIQUETA);

    audioEClass = createEClass(AUDIO);

    subtituloEClass = createEClass(SUBTITULO);
    createEAttribute(subtituloEClass, SUBTITULO__ENLACE);

    entradaTextoEClass = createEClass(ENTRADA_TEXTO);

    imagenEClass = createEClass(IMAGEN);
    createEAttribute(imagenEClass, IMAGEN__ALTO);
    createEAttribute(imagenEClass, IMAGEN__ANCHO);

    componentePredeterminadoEClass = createEClass(COMPONENTE_PREDETERMINADO);
    createEAttribute(componentePredeterminadoEClass, COMPONENTE_PREDETERMINADO__NAME);
    createEAttribute(componentePredeterminadoEClass, COMPONENTE_PREDETERMINADO__ORDEN);

    banerEClass = createEClass(BANER);

    iconoRedSocialEClass = createEClass(ICONO_RED_SOCIAL);

    menuDesplegableEClass = createEClass(MENU_DESPLEGABLE);

    barraDesplegableEClass = createEClass(BARRA_DESPLEGABLE);

    sliderEClass = createEClass(SLIDER);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    urlEClass.getESuperTypes().add(this.getElementoOculto());
    selectorArchivosEClass.getESuperTypes().add(this.getElementoOculto());
    tagEClass.getESuperTypes().add(this.getElementoOculto());
    identificadorInternoEClass.getESuperTypes().add(this.getElementoOculto());
    fechaEClass.getESuperTypes().add(this.getElementoVisual());
    entradillaEClass.getESuperTypes().add(this.getElementoVisual());
    botonSeleccionEClass.getESuperTypes().add(this.getElementoVisual());
    enlaceEClass.getESuperTypes().add(this.getElementoVisual());
    videoEClass.getESuperTypes().add(this.getElementoVisual());
    textoEClass.getESuperTypes().add(this.getElementoVisual());
    botonEClass.getESuperTypes().add(this.getElementoVisual());
    tituloEClass.getESuperTypes().add(this.getElementoVisual());
    etiquetaEClass.getESuperTypes().add(this.getElementoVisual());
    audioEClass.getESuperTypes().add(this.getElementoVisual());
    subtituloEClass.getESuperTypes().add(this.getElementoVisual());
    entradaTextoEClass.getESuperTypes().add(this.getElementoVisual());
    imagenEClass.getESuperTypes().add(this.getElementoVisual());
    banerEClass.getESuperTypes().add(this.getComponentePredeterminado());
    iconoRedSocialEClass.getESuperTypes().add(this.getComponentePredeterminado());
    menuDesplegableEClass.getESuperTypes().add(this.getComponentePredeterminado());
    barraDesplegableEClass.getESuperTypes().add(this.getComponentePredeterminado());
    sliderEClass.getESuperTypes().add(this.getComponentePredeterminado());

    // Initialize classes and features; add operations and parameters
    initEClass(diagramaEClass, Diagrama.class, "Diagrama", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDiagrama_Componente(), this.getComponente(), null, "componente", null, 1, 1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componenteEClass, Componente.class, "Componente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponente_Name(), ecorePackage.getEString(), "name", null, 0, 1, Componente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponente_ElementoOculto(), this.getElementoOculto(), null, "elementoOculto", null, 0, -1, Componente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponente_ElementoVisual(), this.getElementoVisual(), null, "elementoVisual", null, 1, -1, Componente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponente_ComponentePredeterminado(), this.getComponentePredeterminado(), null, "componentePredeterminado", null, 0, -1, Componente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementoOcultoEClass, ElementoOculto.class, "ElementoOculto", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementoOculto_Name(), ecorePackage.getEString(), "name", null, 0, 1, ElementoOculto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElementoOculto_Orden(), ecorePackage.getEInt(), "orden", null, 0, 1, ElementoOculto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(urlEClass, Url.class, "Url", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(selectorArchivosEClass, SelectorArchivos.class, "SelectorArchivos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(identificadorInternoEClass, IdentificadorInterno.class, "IdentificadorInterno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(elementoVisualEClass, ElementoVisual.class, "ElementoVisual", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementoVisual_Name(), ecorePackage.getEString(), "name", null, 0, 1, ElementoVisual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElementoVisual_Orden(), ecorePackage.getEInt(), "orden", null, 0, 1, ElementoVisual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fechaEClass, Fecha.class, "Fecha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(entradillaEClass, Entradilla.class, "Entradilla", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(botonSeleccionEClass, BotonSeleccion.class, "BotonSeleccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enlaceEClass, Enlace.class, "Enlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(videoEClass, Video.class, "Video", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(textoEClass, Texto.class, "Texto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(botonEClass, Boton.class, "Boton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tituloEClass, Titulo.class, "Titulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTitulo_Enlace(), ecorePackage.getEBooleanObject(), "enlace", null, 0, 1, Titulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etiquetaEClass, Etiqueta.class, "Etiqueta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(audioEClass, Audio.class, "Audio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subtituloEClass, Subtitulo.class, "Subtitulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubtitulo_Enlace(), ecorePackage.getEBoolean(), "enlace", null, 0, 1, Subtitulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entradaTextoEClass, EntradaTexto.class, "EntradaTexto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(imagenEClass, Imagen.class, "Imagen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImagen_Alto(), ecorePackage.getEFloatObject(), "alto", null, 0, 1, Imagen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImagen_Ancho(), ecorePackage.getEFloatObject(), "ancho", null, 0, 1, Imagen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentePredeterminadoEClass, ComponentePredeterminado.class, "ComponentePredeterminado", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponentePredeterminado_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentePredeterminado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponentePredeterminado_Orden(), ecorePackage.getEInt(), "orden", null, 0, 1, ComponentePredeterminado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(banerEClass, Baner.class, "Baner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(iconoRedSocialEClass, IconoRedSocial.class, "IconoRedSocial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(menuDesplegableEClass, MenuDesplegable.class, "MenuDesplegable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(barraDesplegableEClass, BarraDesplegable.class, "BarraDesplegable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sliderEClass, Slider.class, "Slider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf.diagram
    createGmfAnnotations();
    // gmf.node
    createGmf_1Annotations();
    // gmf.compartment
    createGmf_2Annotations();
    // gmf.label
    createGmf_3Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf.diagram";		
    addAnnotation
      (diagramaEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });											
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.node";			
    addAnnotation
      (componenteEClass, 
       source, 
       new String[] 
       {
       "label", "name,orden",
       "figure", "rectangle",
       "color", "135,35,35",
       "label.pattern", "{0}:{1}",
       "tool.small.bundle", "OpencmsDSL",
       "tool.small.path", "resources/icono_componente.gif",
       "tool.large.path", "resources/icono_componente.gif",
       "label.icon", "true"
       });					
    addAnnotation
      (elementoOcultoEClass, 
       source, 
       new String[] 
       {
       "label", "name,orden",
       "figure", "rectangle",
       "color", "135,35,135",
       "label.pattern", "{0}:{1}",
       "tool.small.bundle", "OpencmsDSL",
       "tool.small.path", "resources/icono_ojo_oculto.gif",
       "tool.large.path", "resources/icono_ojo_oculto.gif",
       "label.icon", "true"
       });		
    addAnnotation
      (elementoVisualEClass, 
       source, 
       new String[] 
       {
       "label", "name,orden",
       "figure", "rectangle",
       "color", "135,135,135",
       "label.pattern", "{0}:{1}",
       "tool.small.bundle", "OpencmsDSL",
       "tool.small.path", "resources/icono_ojo.gif",
       "tool.large.path", "resources/icono_ojo.gif",
       "label.icon", "true"
       });						
    addAnnotation
      (componentePredeterminadoEClass, 
       source, 
       new String[] 
       {
       "label", "name,orden",
       "figure", "rectangle",
       "color", "35,135,135",
       "label.pattern", "{0}:{1}",
       "tool.small.bundle", "OpencmsDSL",
       "tool.small.path", "resources/icono_componente_predeterminado.gif",
       "tool.large.path", "resources/icono_componente_predeterminado.gif",
       "label.icon", "true"
       });
  }

  /**
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.compartment";				
    addAnnotation
      (getComponente_ElementoOculto(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (getComponente_ElementoVisual(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (getComponente_ComponentePredeterminado(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });							
  }

  /**
   * Initializes the annotations for <b>gmf.label</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.label";									
    addAnnotation
      (getTitulo_Enlace(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (getSubtitulo_Enlace(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (getImagen_Alto(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (getImagen_Ancho(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });	
  }

} //OpencmsPackageImpl
