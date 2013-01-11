/**
 */
package opencms.util;

import opencms.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see opencms.OpencmsPackage
 * @generated
 */
public class OpencmsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OpencmsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpencmsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = OpencmsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OpencmsSwitch<Adapter> modelSwitch =
    new OpencmsSwitch<Adapter>()
    {
      @Override
      public Adapter caseDiagrama(Diagrama object)
      {
        return createDiagramaAdapter();
      }
      @Override
      public Adapter caseComponente(Componente object)
      {
        return createComponenteAdapter();
      }
      @Override
      public Adapter caseElementoOculto(ElementoOculto object)
      {
        return createElementoOcultoAdapter();
      }
      @Override
      public Adapter caseUrl(Url object)
      {
        return createUrlAdapter();
      }
      @Override
      public Adapter caseSelectorArchivos(SelectorArchivos object)
      {
        return createSelectorArchivosAdapter();
      }
      @Override
      public Adapter caseTag(Tag object)
      {
        return createTagAdapter();
      }
      @Override
      public Adapter caseIdentificadorInterno(IdentificadorInterno object)
      {
        return createIdentificadorInternoAdapter();
      }
      @Override
      public Adapter caseElementoVisual(ElementoVisual object)
      {
        return createElementoVisualAdapter();
      }
      @Override
      public Adapter caseFecha(Fecha object)
      {
        return createFechaAdapter();
      }
      @Override
      public Adapter caseEntradilla(Entradilla object)
      {
        return createEntradillaAdapter();
      }
      @Override
      public Adapter caseBotonSeleccion(BotonSeleccion object)
      {
        return createBotonSeleccionAdapter();
      }
      @Override
      public Adapter caseEnlace(Enlace object)
      {
        return createEnlaceAdapter();
      }
      @Override
      public Adapter caseVideo(Video object)
      {
        return createVideoAdapter();
      }
      @Override
      public Adapter caseTexto(Texto object)
      {
        return createTextoAdapter();
      }
      @Override
      public Adapter caseBoton(Boton object)
      {
        return createBotonAdapter();
      }
      @Override
      public Adapter caseTitulo(Titulo object)
      {
        return createTituloAdapter();
      }
      @Override
      public Adapter caseEtiqueta(Etiqueta object)
      {
        return createEtiquetaAdapter();
      }
      @Override
      public Adapter caseAudio(Audio object)
      {
        return createAudioAdapter();
      }
      @Override
      public Adapter caseSubtitulo(Subtitulo object)
      {
        return createSubtituloAdapter();
      }
      @Override
      public Adapter caseEntradaTexto(EntradaTexto object)
      {
        return createEntradaTextoAdapter();
      }
      @Override
      public Adapter caseImagen(Imagen object)
      {
        return createImagenAdapter();
      }
      @Override
      public Adapter caseComponentePredeterminado(ComponentePredeterminado object)
      {
        return createComponentePredeterminadoAdapter();
      }
      @Override
      public Adapter caseBaner(Baner object)
      {
        return createBanerAdapter();
      }
      @Override
      public Adapter caseIconoRedSocial(IconoRedSocial object)
      {
        return createIconoRedSocialAdapter();
      }
      @Override
      public Adapter caseMenuDesplegable(MenuDesplegable object)
      {
        return createMenuDesplegableAdapter();
      }
      @Override
      public Adapter caseBarraDesplegable(BarraDesplegable object)
      {
        return createBarraDesplegableAdapter();
      }
      @Override
      public Adapter caseSlider(Slider object)
      {
        return createSliderAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link opencms.Diagrama <em>Diagrama</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.Diagrama
   * @generated
   */
  public Adapter createDiagramaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.Componente <em>Componente</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.Componente
   * @generated
   */
  public Adapter createComponenteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.ElementoOculto <em>Elemento Oculto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.ElementoOculto
   * @generated
   */
  public Adapter createElementoOcultoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.Url <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.Url
   * @generated
   */
  public Adapter createUrlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.SelectorArchivos <em>Selector Archivos</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.SelectorArchivos
   * @generated
   */
  public Adapter createSelectorArchivosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.Tag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.Tag
   * @generated
   */
  public Adapter createTagAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.IdentificadorInterno <em>Identificador Interno</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.IdentificadorInterno
   * @generated
   */
  public Adapter createIdentificadorInternoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.ElementoVisual <em>Elemento Visual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.ElementoVisual
   * @generated
   */
  public Adapter createElementoVisualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.Fecha <em>Fecha</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.Fecha
   * @generated
   */
  public Adapter createFechaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.Entradilla <em>Entradilla</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.Entradilla
   * @generated
   */
  public Adapter createEntradillaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.BotonSeleccion <em>Boton Seleccion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.BotonSeleccion
   * @generated
   */
  public Adapter createBotonSeleccionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.Enlace <em>Enlace</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.Enlace
   * @generated
   */
  public Adapter createEnlaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.Video <em>Video</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.Video
   * @generated
   */
  public Adapter createVideoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.Texto <em>Texto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.Texto
   * @generated
   */
  public Adapter createTextoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.Boton <em>Boton</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.Boton
   * @generated
   */
  public Adapter createBotonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.Titulo <em>Titulo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.Titulo
   * @generated
   */
  public Adapter createTituloAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.Etiqueta <em>Etiqueta</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.Etiqueta
   * @generated
   */
  public Adapter createEtiquetaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.Audio <em>Audio</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.Audio
   * @generated
   */
  public Adapter createAudioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.Subtitulo <em>Subtitulo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.Subtitulo
   * @generated
   */
  public Adapter createSubtituloAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.EntradaTexto <em>Entrada Texto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.EntradaTexto
   * @generated
   */
  public Adapter createEntradaTextoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.Imagen <em>Imagen</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.Imagen
   * @generated
   */
  public Adapter createImagenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.ComponentePredeterminado <em>Componente Predeterminado</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.ComponentePredeterminado
   * @generated
   */
  public Adapter createComponentePredeterminadoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.Baner <em>Baner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.Baner
   * @generated
   */
  public Adapter createBanerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.IconoRedSocial <em>Icono Red Social</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.IconoRedSocial
   * @generated
   */
  public Adapter createIconoRedSocialAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.MenuDesplegable <em>Menu Desplegable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.MenuDesplegable
   * @generated
   */
  public Adapter createMenuDesplegableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.BarraDesplegable <em>Barra Desplegable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.BarraDesplegable
   * @generated
   */
  public Adapter createBarraDesplegableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link opencms.Slider <em>Slider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see opencms.Slider
   * @generated
   */
  public Adapter createSliderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //OpencmsAdapterFactory
