/*
 * 
 */
package opencms.diagram.part;

import opencms.Diagrama;
import opencms.OpencmsPackage;
import opencms.diagram.edit.parts.AudioEditPart;
import opencms.diagram.edit.parts.AudioNameOrdenEditPart;
import opencms.diagram.edit.parts.BanerEditPart;
import opencms.diagram.edit.parts.BanerNameOrdenEditPart;
import opencms.diagram.edit.parts.BarraDesplegableEditPart;
import opencms.diagram.edit.parts.BarraDesplegableNameOrdenEditPart;
import opencms.diagram.edit.parts.BotonEditPart;
import opencms.diagram.edit.parts.BotonNameOrdenEditPart;
import opencms.diagram.edit.parts.BotonSeleccionEditPart;
import opencms.diagram.edit.parts.BotonSeleccionNameOrdenEditPart;
import opencms.diagram.edit.parts.ComponenteComponenteComponentePredeterminadoCompartmentEditPart;
import opencms.diagram.edit.parts.ComponenteComponenteElementoOcultoCompartmentEditPart;
import opencms.diagram.edit.parts.ComponenteComponenteElementoVisualCompartmentEditPart;
import opencms.diagram.edit.parts.ComponenteEditPart;
import opencms.diagram.edit.parts.ComponenteNameEditPart;
import opencms.diagram.edit.parts.DiagramaEditPart;
import opencms.diagram.edit.parts.EnlaceEditPart;
import opencms.diagram.edit.parts.EnlaceNameOrdenEditPart;
import opencms.diagram.edit.parts.EntradaTextoEditPart;
import opencms.diagram.edit.parts.EntradaTextoNameOrdenEditPart;
import opencms.diagram.edit.parts.EntradillaEditPart;
import opencms.diagram.edit.parts.EntradillaNameOrdenEditPart;
import opencms.diagram.edit.parts.EtiquetaEditPart;
import opencms.diagram.edit.parts.EtiquetaNameOrdenEditPart;
import opencms.diagram.edit.parts.FechaEditPart;
import opencms.diagram.edit.parts.FechaNameOrdenEditPart;
import opencms.diagram.edit.parts.IconoRedSocialEditPart;
import opencms.diagram.edit.parts.IconoRedSocialNameOrdenEditPart;
import opencms.diagram.edit.parts.IdentificadorInternoEditPart;
import opencms.diagram.edit.parts.IdentificadorInternoNameOrdenEditPart;
import opencms.diagram.edit.parts.ImagenAltoEditPart;
import opencms.diagram.edit.parts.ImagenAnchoEditPart;
import opencms.diagram.edit.parts.ImagenEditPart;
import opencms.diagram.edit.parts.ImagenNameOrdenEditPart;
import opencms.diagram.edit.parts.MenuDesplegableEditPart;
import opencms.diagram.edit.parts.MenuDesplegableNameOrdenEditPart;
import opencms.diagram.edit.parts.SelectorArchivosEditPart;
import opencms.diagram.edit.parts.SelectorArchivosNameOrdenEditPart;
import opencms.diagram.edit.parts.SliderEditPart;
import opencms.diagram.edit.parts.SliderNameOrdenEditPart;
import opencms.diagram.edit.parts.SubtituloEditPart;
import opencms.diagram.edit.parts.SubtituloEnlaceEditPart;
import opencms.diagram.edit.parts.SubtituloNameOrdenEditPart;
import opencms.diagram.edit.parts.TagEditPart;
import opencms.diagram.edit.parts.TagNameOrdenEditPart;
import opencms.diagram.edit.parts.TextoEditPart;
import opencms.diagram.edit.parts.TextoNameOrdenEditPart;
import opencms.diagram.edit.parts.TituloEditPart;
import opencms.diagram.edit.parts.TituloEnlaceEditPart;
import opencms.diagram.edit.parts.TituloNameOrdenEditPart;
import opencms.diagram.edit.parts.UrlEditPart;
import opencms.diagram.edit.parts.UrlNameOrdenEditPart;
import opencms.diagram.edit.parts.VideoEditPart;
import opencms.diagram.edit.parts.VideoNameOrdenEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class OpencmsVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "OpencmsDSL.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DiagramaEditPart.MODEL_ID.equals(view.getType())) {
				return DiagramaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return opencms.diagram.part.OpencmsVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				OpencmsDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (OpencmsPackage.eINSTANCE.getDiagrama().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Diagrama) domainElement)) {
			return DiagramaEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = opencms.diagram.part.OpencmsVisualIDRegistry
				.getModelID(containerView);
		if (!DiagramaEditPart.MODEL_ID.equals(containerModelID)
				&& !"opencms".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (DiagramaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = opencms.diagram.part.OpencmsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DiagramaEditPart.VISUAL_ID:
			if (OpencmsPackage.eINSTANCE.getComponente().isSuperTypeOf(
					domainElement.eClass())) {
				return ComponenteEditPart.VISUAL_ID;
			}
			break;
		case ComponenteComponenteElementoOcultoCompartmentEditPart.VISUAL_ID:
			if (OpencmsPackage.eINSTANCE.getUrl().isSuperTypeOf(
					domainElement.eClass())) {
				return UrlEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getSelectorArchivos().isSuperTypeOf(
					domainElement.eClass())) {
				return SelectorArchivosEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getTag().isSuperTypeOf(
					domainElement.eClass())) {
				return TagEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getIdentificadorInterno()
					.isSuperTypeOf(domainElement.eClass())) {
				return IdentificadorInternoEditPart.VISUAL_ID;
			}
			break;
		case ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID:
			if (OpencmsPackage.eINSTANCE.getFecha().isSuperTypeOf(
					domainElement.eClass())) {
				return FechaEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getEntradilla().isSuperTypeOf(
					domainElement.eClass())) {
				return EntradillaEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getBotonSeleccion().isSuperTypeOf(
					domainElement.eClass())) {
				return BotonSeleccionEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getEnlace().isSuperTypeOf(
					domainElement.eClass())) {
				return EnlaceEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getVideo().isSuperTypeOf(
					domainElement.eClass())) {
				return VideoEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getTexto().isSuperTypeOf(
					domainElement.eClass())) {
				return TextoEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getBoton().isSuperTypeOf(
					domainElement.eClass())) {
				return BotonEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getTitulo().isSuperTypeOf(
					domainElement.eClass())) {
				return TituloEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getEtiqueta().isSuperTypeOf(
					domainElement.eClass())) {
				return EtiquetaEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getAudio().isSuperTypeOf(
					domainElement.eClass())) {
				return AudioEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getSubtitulo().isSuperTypeOf(
					domainElement.eClass())) {
				return SubtituloEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getEntradaTexto().isSuperTypeOf(
					domainElement.eClass())) {
				return EntradaTextoEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getImagen().isSuperTypeOf(
					domainElement.eClass())) {
				return ImagenEditPart.VISUAL_ID;
			}
			break;
		case ComponenteComponenteComponentePredeterminadoCompartmentEditPart.VISUAL_ID:
			if (OpencmsPackage.eINSTANCE.getBaner().isSuperTypeOf(
					domainElement.eClass())) {
				return BanerEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getIconoRedSocial().isSuperTypeOf(
					domainElement.eClass())) {
				return IconoRedSocialEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getMenuDesplegable().isSuperTypeOf(
					domainElement.eClass())) {
				return MenuDesplegableEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getBarraDesplegable().isSuperTypeOf(
					domainElement.eClass())) {
				return BarraDesplegableEditPart.VISUAL_ID;
			}
			if (OpencmsPackage.eINSTANCE.getSlider().isSuperTypeOf(
					domainElement.eClass())) {
				return SliderEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = opencms.diagram.part.OpencmsVisualIDRegistry
				.getModelID(containerView);
		if (!DiagramaEditPart.MODEL_ID.equals(containerModelID)
				&& !"opencms".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (DiagramaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = opencms.diagram.part.OpencmsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramaEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DiagramaEditPart.VISUAL_ID:
			if (ComponenteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponenteEditPart.VISUAL_ID:
			if (ComponenteNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponenteComponenteElementoOcultoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponenteComponenteComponentePredeterminadoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UrlEditPart.VISUAL_ID:
			if (UrlNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SelectorArchivosEditPart.VISUAL_ID:
			if (SelectorArchivosNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TagEditPart.VISUAL_ID:
			if (TagNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IdentificadorInternoEditPart.VISUAL_ID:
			if (IdentificadorInternoNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FechaEditPart.VISUAL_ID:
			if (FechaNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntradillaEditPart.VISUAL_ID:
			if (EntradillaNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BotonSeleccionEditPart.VISUAL_ID:
			if (BotonSeleccionNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnlaceEditPart.VISUAL_ID:
			if (EnlaceNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VideoEditPart.VISUAL_ID:
			if (VideoNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextoEditPart.VISUAL_ID:
			if (TextoNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BotonEditPart.VISUAL_ID:
			if (BotonNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TituloEditPart.VISUAL_ID:
			if (TituloNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TituloEnlaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EtiquetaEditPart.VISUAL_ID:
			if (EtiquetaNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AudioEditPart.VISUAL_ID:
			if (AudioNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SubtituloEditPart.VISUAL_ID:
			if (SubtituloNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubtituloEnlaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntradaTextoEditPart.VISUAL_ID:
			if (EntradaTextoNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImagenEditPart.VISUAL_ID:
			if (ImagenNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImagenAltoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImagenAnchoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BanerEditPart.VISUAL_ID:
			if (BanerNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IconoRedSocialEditPart.VISUAL_ID:
			if (IconoRedSocialNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MenuDesplegableEditPart.VISUAL_ID:
			if (MenuDesplegableNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BarraDesplegableEditPart.VISUAL_ID:
			if (BarraDesplegableNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SliderEditPart.VISUAL_ID:
			if (SliderNameOrdenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponenteComponenteElementoOcultoCompartmentEditPart.VISUAL_ID:
			if (UrlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectorArchivosEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IdentificadorInternoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID:
			if (FechaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntradillaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BotonSeleccionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnlaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (VideoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BotonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TituloEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EtiquetaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AudioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubtituloEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntradaTextoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImagenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponenteComponenteComponentePredeterminadoCompartmentEditPart.VISUAL_ID:
			if (BanerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IconoRedSocialEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuDesplegableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BarraDesplegableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SliderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Diagrama element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case ComponenteComponenteElementoOcultoCompartmentEditPart.VISUAL_ID:
		case ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID:
		case ComponenteComponenteComponentePredeterminadoCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case DiagramaEditPart.VISUAL_ID:
			return false;
		case UrlEditPart.VISUAL_ID:
		case SelectorArchivosEditPart.VISUAL_ID:
		case TagEditPart.VISUAL_ID:
		case IdentificadorInternoEditPart.VISUAL_ID:
		case FechaEditPart.VISUAL_ID:
		case EntradillaEditPart.VISUAL_ID:
		case BotonSeleccionEditPart.VISUAL_ID:
		case EnlaceEditPart.VISUAL_ID:
		case VideoEditPart.VISUAL_ID:
		case TextoEditPart.VISUAL_ID:
		case BotonEditPart.VISUAL_ID:
		case TituloEditPart.VISUAL_ID:
		case EtiquetaEditPart.VISUAL_ID:
		case AudioEditPart.VISUAL_ID:
		case SubtituloEditPart.VISUAL_ID:
		case EntradaTextoEditPart.VISUAL_ID:
		case ImagenEditPart.VISUAL_ID:
		case BanerEditPart.VISUAL_ID:
		case IconoRedSocialEditPart.VISUAL_ID:
		case MenuDesplegableEditPart.VISUAL_ID:
		case BarraDesplegableEditPart.VISUAL_ID:
		case SliderEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return opencms.diagram.part.OpencmsVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return opencms.diagram.part.OpencmsVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return opencms.diagram.part.OpencmsVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return opencms.diagram.part.OpencmsVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return opencms.diagram.part.OpencmsVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return opencms.diagram.part.OpencmsVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
