/*
 * 
 */
package opencms.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import opencms.Componente;
import opencms.ComponentePredeterminado;
import opencms.Diagrama;
import opencms.ElementoOculto;
import opencms.ElementoVisual;
import opencms.diagram.edit.parts.AudioEditPart;
import opencms.diagram.edit.parts.BanerEditPart;
import opencms.diagram.edit.parts.BarraDesplegableEditPart;
import opencms.diagram.edit.parts.BotonEditPart;
import opencms.diagram.edit.parts.BotonSeleccionEditPart;
import opencms.diagram.edit.parts.ComponenteComponenteComponentePredeterminadoCompartmentEditPart;
import opencms.diagram.edit.parts.ComponenteComponenteElementoOcultoCompartmentEditPart;
import opencms.diagram.edit.parts.ComponenteComponenteElementoVisualCompartmentEditPart;
import opencms.diagram.edit.parts.ComponenteEditPart;
import opencms.diagram.edit.parts.DiagramaEditPart;
import opencms.diagram.edit.parts.EnlaceEditPart;
import opencms.diagram.edit.parts.EntradaTextoEditPart;
import opencms.diagram.edit.parts.EntradillaEditPart;
import opencms.diagram.edit.parts.EtiquetaEditPart;
import opencms.diagram.edit.parts.FechaEditPart;
import opencms.diagram.edit.parts.IconoRedSocialEditPart;
import opencms.diagram.edit.parts.IdentificadorInternoEditPart;
import opencms.diagram.edit.parts.ImagenEditPart;
import opencms.diagram.edit.parts.MenuDesplegableEditPart;
import opencms.diagram.edit.parts.SelectorArchivosEditPart;
import opencms.diagram.edit.parts.SliderEditPart;
import opencms.diagram.edit.parts.SubtituloEditPart;
import opencms.diagram.edit.parts.TagEditPart;
import opencms.diagram.edit.parts.TextoEditPart;
import opencms.diagram.edit.parts.TituloEditPart;
import opencms.diagram.edit.parts.UrlEditPart;
import opencms.diagram.edit.parts.VideoEditPart;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class OpencmsDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsNodeDescriptor> getSemanticChildren(View view) {
		switch (OpencmsVisualIDRegistry.getVisualID(view)) {
		case DiagramaEditPart.VISUAL_ID:
			return getDiagrama_1000SemanticChildren(view);
		case ComponenteComponenteElementoOcultoCompartmentEditPart.VISUAL_ID:
			return getComponenteComponenteElementoOcultoCompartment_7001SemanticChildren(view);
		case ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID:
			return getComponenteComponenteElementoVisualCompartment_7002SemanticChildren(view);
		case ComponenteComponenteComponentePredeterminadoCompartmentEditPart.VISUAL_ID:
			return getComponenteComponenteComponentePredeterminadoCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsNodeDescriptor> getDiagrama_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Diagrama modelElement = (Diagrama) view.getElement();
		LinkedList<OpencmsNodeDescriptor> result = new LinkedList<OpencmsNodeDescriptor>();
		{
			Componente childElement = modelElement.getComponente();
			int visualID = OpencmsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ComponenteEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OpencmsNodeDescriptor> getComponenteComponenteElementoOcultoCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Componente modelElement = (Componente) containerView.getElement();
		LinkedList<OpencmsNodeDescriptor> result = new LinkedList<OpencmsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElementoOculto().iterator(); it
				.hasNext();) {
			ElementoOculto childElement = (ElementoOculto) it.next();
			int visualID = OpencmsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == UrlEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SelectorArchivosEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TagEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IdentificadorInternoEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OpencmsNodeDescriptor> getComponenteComponenteElementoVisualCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Componente modelElement = (Componente) containerView.getElement();
		LinkedList<OpencmsNodeDescriptor> result = new LinkedList<OpencmsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElementoVisual().iterator(); it
				.hasNext();) {
			ElementoVisual childElement = (ElementoVisual) it.next();
			int visualID = OpencmsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FechaEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntradillaEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BotonSeleccionEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnlaceEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == VideoEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextoEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BotonEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TituloEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EtiquetaEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AudioEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SubtituloEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntradaTextoEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ImagenEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OpencmsNodeDescriptor> getComponenteComponenteComponentePredeterminadoCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Componente modelElement = (Componente) containerView.getElement();
		LinkedList<OpencmsNodeDescriptor> result = new LinkedList<OpencmsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponentePredeterminado()
				.iterator(); it.hasNext();) {
			ComponentePredeterminado childElement = (ComponentePredeterminado) it
					.next();
			int visualID = OpencmsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == BanerEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IconoRedSocialEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MenuDesplegableEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BarraDesplegableEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SliderEditPart.VISUAL_ID) {
				result.add(new OpencmsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getContainedLinks(View view) {
		switch (OpencmsVisualIDRegistry.getVisualID(view)) {
		case DiagramaEditPart.VISUAL_ID:
			return getDiagrama_1000ContainedLinks(view);
		case ComponenteEditPart.VISUAL_ID:
			return getComponente_2001ContainedLinks(view);
		case UrlEditPart.VISUAL_ID:
			return getUrl_3001ContainedLinks(view);
		case SelectorArchivosEditPart.VISUAL_ID:
			return getSelectorArchivos_3002ContainedLinks(view);
		case TagEditPart.VISUAL_ID:
			return getTag_3003ContainedLinks(view);
		case IdentificadorInternoEditPart.VISUAL_ID:
			return getIdentificadorInterno_3004ContainedLinks(view);
		case FechaEditPart.VISUAL_ID:
			return getFecha_3005ContainedLinks(view);
		case EntradillaEditPart.VISUAL_ID:
			return getEntradilla_3006ContainedLinks(view);
		case BotonSeleccionEditPart.VISUAL_ID:
			return getBotonSeleccion_3007ContainedLinks(view);
		case EnlaceEditPart.VISUAL_ID:
			return getEnlace_3008ContainedLinks(view);
		case VideoEditPart.VISUAL_ID:
			return getVideo_3009ContainedLinks(view);
		case TextoEditPart.VISUAL_ID:
			return getTexto_3010ContainedLinks(view);
		case BotonEditPart.VISUAL_ID:
			return getBoton_3011ContainedLinks(view);
		case TituloEditPart.VISUAL_ID:
			return getTitulo_3012ContainedLinks(view);
		case EtiquetaEditPart.VISUAL_ID:
			return getEtiqueta_3013ContainedLinks(view);
		case AudioEditPart.VISUAL_ID:
			return getAudio_3014ContainedLinks(view);
		case SubtituloEditPart.VISUAL_ID:
			return getSubtitulo_3015ContainedLinks(view);
		case EntradaTextoEditPart.VISUAL_ID:
			return getEntradaTexto_3016ContainedLinks(view);
		case ImagenEditPart.VISUAL_ID:
			return getImagen_3017ContainedLinks(view);
		case BanerEditPart.VISUAL_ID:
			return getBaner_3018ContainedLinks(view);
		case IconoRedSocialEditPart.VISUAL_ID:
			return getIconoRedSocial_3019ContainedLinks(view);
		case MenuDesplegableEditPart.VISUAL_ID:
			return getMenuDesplegable_3020ContainedLinks(view);
		case BarraDesplegableEditPart.VISUAL_ID:
			return getBarraDesplegable_3021ContainedLinks(view);
		case SliderEditPart.VISUAL_ID:
			return getSlider_3022ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getIncomingLinks(View view) {
		switch (OpencmsVisualIDRegistry.getVisualID(view)) {
		case ComponenteEditPart.VISUAL_ID:
			return getComponente_2001IncomingLinks(view);
		case UrlEditPart.VISUAL_ID:
			return getUrl_3001IncomingLinks(view);
		case SelectorArchivosEditPart.VISUAL_ID:
			return getSelectorArchivos_3002IncomingLinks(view);
		case TagEditPart.VISUAL_ID:
			return getTag_3003IncomingLinks(view);
		case IdentificadorInternoEditPart.VISUAL_ID:
			return getIdentificadorInterno_3004IncomingLinks(view);
		case FechaEditPart.VISUAL_ID:
			return getFecha_3005IncomingLinks(view);
		case EntradillaEditPart.VISUAL_ID:
			return getEntradilla_3006IncomingLinks(view);
		case BotonSeleccionEditPart.VISUAL_ID:
			return getBotonSeleccion_3007IncomingLinks(view);
		case EnlaceEditPart.VISUAL_ID:
			return getEnlace_3008IncomingLinks(view);
		case VideoEditPart.VISUAL_ID:
			return getVideo_3009IncomingLinks(view);
		case TextoEditPart.VISUAL_ID:
			return getTexto_3010IncomingLinks(view);
		case BotonEditPart.VISUAL_ID:
			return getBoton_3011IncomingLinks(view);
		case TituloEditPart.VISUAL_ID:
			return getTitulo_3012IncomingLinks(view);
		case EtiquetaEditPart.VISUAL_ID:
			return getEtiqueta_3013IncomingLinks(view);
		case AudioEditPart.VISUAL_ID:
			return getAudio_3014IncomingLinks(view);
		case SubtituloEditPart.VISUAL_ID:
			return getSubtitulo_3015IncomingLinks(view);
		case EntradaTextoEditPart.VISUAL_ID:
			return getEntradaTexto_3016IncomingLinks(view);
		case ImagenEditPart.VISUAL_ID:
			return getImagen_3017IncomingLinks(view);
		case BanerEditPart.VISUAL_ID:
			return getBaner_3018IncomingLinks(view);
		case IconoRedSocialEditPart.VISUAL_ID:
			return getIconoRedSocial_3019IncomingLinks(view);
		case MenuDesplegableEditPart.VISUAL_ID:
			return getMenuDesplegable_3020IncomingLinks(view);
		case BarraDesplegableEditPart.VISUAL_ID:
			return getBarraDesplegable_3021IncomingLinks(view);
		case SliderEditPart.VISUAL_ID:
			return getSlider_3022IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getOutgoingLinks(View view) {
		switch (OpencmsVisualIDRegistry.getVisualID(view)) {
		case ComponenteEditPart.VISUAL_ID:
			return getComponente_2001OutgoingLinks(view);
		case UrlEditPart.VISUAL_ID:
			return getUrl_3001OutgoingLinks(view);
		case SelectorArchivosEditPart.VISUAL_ID:
			return getSelectorArchivos_3002OutgoingLinks(view);
		case TagEditPart.VISUAL_ID:
			return getTag_3003OutgoingLinks(view);
		case IdentificadorInternoEditPart.VISUAL_ID:
			return getIdentificadorInterno_3004OutgoingLinks(view);
		case FechaEditPart.VISUAL_ID:
			return getFecha_3005OutgoingLinks(view);
		case EntradillaEditPart.VISUAL_ID:
			return getEntradilla_3006OutgoingLinks(view);
		case BotonSeleccionEditPart.VISUAL_ID:
			return getBotonSeleccion_3007OutgoingLinks(view);
		case EnlaceEditPart.VISUAL_ID:
			return getEnlace_3008OutgoingLinks(view);
		case VideoEditPart.VISUAL_ID:
			return getVideo_3009OutgoingLinks(view);
		case TextoEditPart.VISUAL_ID:
			return getTexto_3010OutgoingLinks(view);
		case BotonEditPart.VISUAL_ID:
			return getBoton_3011OutgoingLinks(view);
		case TituloEditPart.VISUAL_ID:
			return getTitulo_3012OutgoingLinks(view);
		case EtiquetaEditPart.VISUAL_ID:
			return getEtiqueta_3013OutgoingLinks(view);
		case AudioEditPart.VISUAL_ID:
			return getAudio_3014OutgoingLinks(view);
		case SubtituloEditPart.VISUAL_ID:
			return getSubtitulo_3015OutgoingLinks(view);
		case EntradaTextoEditPart.VISUAL_ID:
			return getEntradaTexto_3016OutgoingLinks(view);
		case ImagenEditPart.VISUAL_ID:
			return getImagen_3017OutgoingLinks(view);
		case BanerEditPart.VISUAL_ID:
			return getBaner_3018OutgoingLinks(view);
		case IconoRedSocialEditPart.VISUAL_ID:
			return getIconoRedSocial_3019OutgoingLinks(view);
		case MenuDesplegableEditPart.VISUAL_ID:
			return getMenuDesplegable_3020OutgoingLinks(view);
		case BarraDesplegableEditPart.VISUAL_ID:
			return getBarraDesplegable_3021OutgoingLinks(view);
		case SliderEditPart.VISUAL_ID:
			return getSlider_3022OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getDiagrama_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getComponente_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getUrl_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getSelectorArchivos_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getTag_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getIdentificadorInterno_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getFecha_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getEntradilla_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getBotonSeleccion_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getEnlace_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getVideo_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getTexto_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getBoton_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getTitulo_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getEtiqueta_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getAudio_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getSubtitulo_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getEntradaTexto_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getImagen_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getBaner_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getIconoRedSocial_3019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getMenuDesplegable_3020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getBarraDesplegable_3021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getSlider_3022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getComponente_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getUrl_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getSelectorArchivos_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getTag_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getIdentificadorInterno_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getFecha_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getEntradilla_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getBotonSeleccion_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getEnlace_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getVideo_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getTexto_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getBoton_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getTitulo_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getEtiqueta_3013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getAudio_3014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getSubtitulo_3015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getEntradaTexto_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getImagen_3017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getBaner_3018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getIconoRedSocial_3019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getMenuDesplegable_3020IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getBarraDesplegable_3021IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getSlider_3022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getComponente_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getUrl_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getSelectorArchivos_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getTag_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getIdentificadorInterno_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getFecha_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getEntradilla_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getBotonSeleccion_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getEnlace_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getVideo_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getTexto_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getBoton_3011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getTitulo_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getEtiqueta_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getAudio_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getSubtitulo_3015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getEntradaTexto_3016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getImagen_3017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getBaner_3018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getIconoRedSocial_3019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getMenuDesplegable_3020OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getBarraDesplegable_3021OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OpencmsLinkDescriptor> getSlider_3022OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<OpencmsNodeDescriptor> getSemanticChildren(View view) {
			return OpencmsDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<OpencmsLinkDescriptor> getContainedLinks(View view) {
			return OpencmsDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<OpencmsLinkDescriptor> getIncomingLinks(View view) {
			return OpencmsDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<OpencmsLinkDescriptor> getOutgoingLinks(View view) {
			return OpencmsDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
