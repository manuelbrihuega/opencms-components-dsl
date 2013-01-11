/**
 */
package opencms.util;

import opencms.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see opencms.OpencmsPackage
 * @generated
 */
public class OpencmsSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OpencmsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpencmsSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = OpencmsPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case OpencmsPackage.DIAGRAMA:
      {
        Diagrama diagrama = (Diagrama)theEObject;
        T result = caseDiagrama(diagrama);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.COMPONENTE:
      {
        Componente componente = (Componente)theEObject;
        T result = caseComponente(componente);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.ELEMENTO_OCULTO:
      {
        ElementoOculto elementoOculto = (ElementoOculto)theEObject;
        T result = caseElementoOculto(elementoOculto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.URL:
      {
        Url url = (Url)theEObject;
        T result = caseUrl(url);
        if (result == null) result = caseElementoOculto(url);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.SELECTOR_ARCHIVOS:
      {
        SelectorArchivos selectorArchivos = (SelectorArchivos)theEObject;
        T result = caseSelectorArchivos(selectorArchivos);
        if (result == null) result = caseElementoOculto(selectorArchivos);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.TAG:
      {
        Tag tag = (Tag)theEObject;
        T result = caseTag(tag);
        if (result == null) result = caseElementoOculto(tag);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.IDENTIFICADOR_INTERNO:
      {
        IdentificadorInterno identificadorInterno = (IdentificadorInterno)theEObject;
        T result = caseIdentificadorInterno(identificadorInterno);
        if (result == null) result = caseElementoOculto(identificadorInterno);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.ELEMENTO_VISUAL:
      {
        ElementoVisual elementoVisual = (ElementoVisual)theEObject;
        T result = caseElementoVisual(elementoVisual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.FECHA:
      {
        Fecha fecha = (Fecha)theEObject;
        T result = caseFecha(fecha);
        if (result == null) result = caseElementoVisual(fecha);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.ENTRADILLA:
      {
        Entradilla entradilla = (Entradilla)theEObject;
        T result = caseEntradilla(entradilla);
        if (result == null) result = caseElementoVisual(entradilla);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.BOTON_SELECCION:
      {
        BotonSeleccion botonSeleccion = (BotonSeleccion)theEObject;
        T result = caseBotonSeleccion(botonSeleccion);
        if (result == null) result = caseElementoVisual(botonSeleccion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.ENLACE:
      {
        Enlace enlace = (Enlace)theEObject;
        T result = caseEnlace(enlace);
        if (result == null) result = caseElementoVisual(enlace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.VIDEO:
      {
        Video video = (Video)theEObject;
        T result = caseVideo(video);
        if (result == null) result = caseElementoVisual(video);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.TEXTO:
      {
        Texto texto = (Texto)theEObject;
        T result = caseTexto(texto);
        if (result == null) result = caseElementoVisual(texto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.BOTON:
      {
        Boton boton = (Boton)theEObject;
        T result = caseBoton(boton);
        if (result == null) result = caseElementoVisual(boton);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.TITULO:
      {
        Titulo titulo = (Titulo)theEObject;
        T result = caseTitulo(titulo);
        if (result == null) result = caseElementoVisual(titulo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.ETIQUETA:
      {
        Etiqueta etiqueta = (Etiqueta)theEObject;
        T result = caseEtiqueta(etiqueta);
        if (result == null) result = caseElementoVisual(etiqueta);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.AUDIO:
      {
        Audio audio = (Audio)theEObject;
        T result = caseAudio(audio);
        if (result == null) result = caseElementoVisual(audio);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.SUBTITULO:
      {
        Subtitulo subtitulo = (Subtitulo)theEObject;
        T result = caseSubtitulo(subtitulo);
        if (result == null) result = caseElementoVisual(subtitulo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.ENTRADA_TEXTO:
      {
        EntradaTexto entradaTexto = (EntradaTexto)theEObject;
        T result = caseEntradaTexto(entradaTexto);
        if (result == null) result = caseElementoVisual(entradaTexto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.IMAGEN:
      {
        Imagen imagen = (Imagen)theEObject;
        T result = caseImagen(imagen);
        if (result == null) result = caseElementoVisual(imagen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.COMPONENTE_PREDETERMINADO:
      {
        ComponentePredeterminado componentePredeterminado = (ComponentePredeterminado)theEObject;
        T result = caseComponentePredeterminado(componentePredeterminado);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.BANER:
      {
        Baner baner = (Baner)theEObject;
        T result = caseBaner(baner);
        if (result == null) result = caseComponentePredeterminado(baner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.ICONO_RED_SOCIAL:
      {
        IconoRedSocial iconoRedSocial = (IconoRedSocial)theEObject;
        T result = caseIconoRedSocial(iconoRedSocial);
        if (result == null) result = caseComponentePredeterminado(iconoRedSocial);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.MENU_DESPLEGABLE:
      {
        MenuDesplegable menuDesplegable = (MenuDesplegable)theEObject;
        T result = caseMenuDesplegable(menuDesplegable);
        if (result == null) result = caseComponentePredeterminado(menuDesplegable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.BARRA_DESPLEGABLE:
      {
        BarraDesplegable barraDesplegable = (BarraDesplegable)theEObject;
        T result = caseBarraDesplegable(barraDesplegable);
        if (result == null) result = caseComponentePredeterminado(barraDesplegable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpencmsPackage.SLIDER:
      {
        Slider slider = (Slider)theEObject;
        T result = caseSlider(slider);
        if (result == null) result = caseComponentePredeterminado(slider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Diagrama</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Diagrama</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiagrama(Diagrama object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Componente</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Componente</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponente(Componente object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Elemento Oculto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Elemento Oculto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementoOculto(ElementoOculto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Url</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Url</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUrl(Url object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selector Archivos</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selector Archivos</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectorArchivos(SelectorArchivos object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTag(Tag object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Identificador Interno</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identificador Interno</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdentificadorInterno(IdentificadorInterno object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Elemento Visual</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Elemento Visual</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementoVisual(ElementoVisual object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fecha</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fecha</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFecha(Fecha object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entradilla</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entradilla</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntradilla(Entradilla object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boton Seleccion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boton Seleccion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBotonSeleccion(BotonSeleccion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enlace</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enlace</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnlace(Enlace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Video</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Video</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVideo(Video object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Texto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTexto(Texto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boton</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boton</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoton(Boton object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Titulo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Titulo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTitulo(Titulo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Etiqueta</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Etiqueta</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEtiqueta(Etiqueta object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Audio</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Audio</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAudio(Audio object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subtitulo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subtitulo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubtitulo(Subtitulo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entrada Texto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entrada Texto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntradaTexto(EntradaTexto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imagen</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imagen</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImagen(Imagen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Componente Predeterminado</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Componente Predeterminado</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentePredeterminado(ComponentePredeterminado object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Baner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Baner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaner(Baner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Icono Red Social</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Icono Red Social</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIconoRedSocial(IconoRedSocial object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Menu Desplegable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Menu Desplegable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMenuDesplegable(MenuDesplegable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Barra Desplegable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Barra Desplegable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBarraDesplegable(BarraDesplegable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlider(Slider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //OpencmsSwitch
