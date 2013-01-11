/*
 * 
 */
package opencms.diagram.edit.parts;

import opencms.diagram.part.OpencmsVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class OpencmsEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (OpencmsVisualIDRegistry.getVisualID(view)) {

			case DiagramaEditPart.VISUAL_ID:
				return new DiagramaEditPart(view);

			case ComponenteEditPart.VISUAL_ID:
				return new ComponenteEditPart(view);

			case ComponenteNameEditPart.VISUAL_ID:
				return new ComponenteNameEditPart(view);

			case UrlEditPart.VISUAL_ID:
				return new UrlEditPart(view);

			case UrlNameOrdenEditPart.VISUAL_ID:
				return new UrlNameOrdenEditPart(view);

			case SelectorArchivosEditPart.VISUAL_ID:
				return new SelectorArchivosEditPart(view);

			case SelectorArchivosNameOrdenEditPart.VISUAL_ID:
				return new SelectorArchivosNameOrdenEditPart(view);

			case TagEditPart.VISUAL_ID:
				return new TagEditPart(view);

			case TagNameOrdenEditPart.VISUAL_ID:
				return new TagNameOrdenEditPart(view);

			case IdentificadorInternoEditPart.VISUAL_ID:
				return new IdentificadorInternoEditPart(view);

			case IdentificadorInternoNameOrdenEditPart.VISUAL_ID:
				return new IdentificadorInternoNameOrdenEditPart(view);

			case FechaEditPart.VISUAL_ID:
				return new FechaEditPart(view);

			case FechaNameOrdenEditPart.VISUAL_ID:
				return new FechaNameOrdenEditPart(view);

			case EntradillaEditPart.VISUAL_ID:
				return new EntradillaEditPart(view);

			case EntradillaNameOrdenEditPart.VISUAL_ID:
				return new EntradillaNameOrdenEditPart(view);

			case BotonSeleccionEditPart.VISUAL_ID:
				return new BotonSeleccionEditPart(view);

			case BotonSeleccionNameOrdenEditPart.VISUAL_ID:
				return new BotonSeleccionNameOrdenEditPart(view);

			case EnlaceEditPart.VISUAL_ID:
				return new EnlaceEditPart(view);

			case EnlaceNameOrdenEditPart.VISUAL_ID:
				return new EnlaceNameOrdenEditPart(view);

			case VideoEditPart.VISUAL_ID:
				return new VideoEditPart(view);

			case VideoNameOrdenEditPart.VISUAL_ID:
				return new VideoNameOrdenEditPart(view);

			case TextoEditPart.VISUAL_ID:
				return new TextoEditPart(view);

			case TextoNameOrdenEditPart.VISUAL_ID:
				return new TextoNameOrdenEditPart(view);

			case BotonEditPart.VISUAL_ID:
				return new BotonEditPart(view);

			case BotonNameOrdenEditPart.VISUAL_ID:
				return new BotonNameOrdenEditPart(view);

			case TituloEditPart.VISUAL_ID:
				return new TituloEditPart(view);

			case TituloNameOrdenEditPart.VISUAL_ID:
				return new TituloNameOrdenEditPart(view);

			case TituloEnlaceEditPart.VISUAL_ID:
				return new TituloEnlaceEditPart(view);

			case EtiquetaEditPart.VISUAL_ID:
				return new EtiquetaEditPart(view);

			case EtiquetaNameOrdenEditPart.VISUAL_ID:
				return new EtiquetaNameOrdenEditPart(view);

			case AudioEditPart.VISUAL_ID:
				return new AudioEditPart(view);

			case AudioNameOrdenEditPart.VISUAL_ID:
				return new AudioNameOrdenEditPart(view);

			case SubtituloEditPart.VISUAL_ID:
				return new SubtituloEditPart(view);

			case SubtituloNameOrdenEditPart.VISUAL_ID:
				return new SubtituloNameOrdenEditPart(view);

			case SubtituloEnlaceEditPart.VISUAL_ID:
				return new SubtituloEnlaceEditPart(view);

			case EntradaTextoEditPart.VISUAL_ID:
				return new EntradaTextoEditPart(view);

			case EntradaTextoNameOrdenEditPart.VISUAL_ID:
				return new EntradaTextoNameOrdenEditPart(view);

			case ImagenEditPart.VISUAL_ID:
				return new ImagenEditPart(view);

			case ImagenNameOrdenEditPart.VISUAL_ID:
				return new ImagenNameOrdenEditPart(view);

			case ImagenAltoEditPart.VISUAL_ID:
				return new ImagenAltoEditPart(view);

			case ImagenAnchoEditPart.VISUAL_ID:
				return new ImagenAnchoEditPart(view);

			case BanerEditPart.VISUAL_ID:
				return new BanerEditPart(view);

			case BanerNameOrdenEditPart.VISUAL_ID:
				return new BanerNameOrdenEditPart(view);

			case IconoRedSocialEditPart.VISUAL_ID:
				return new IconoRedSocialEditPart(view);

			case IconoRedSocialNameOrdenEditPart.VISUAL_ID:
				return new IconoRedSocialNameOrdenEditPart(view);

			case MenuDesplegableEditPart.VISUAL_ID:
				return new MenuDesplegableEditPart(view);

			case MenuDesplegableNameOrdenEditPart.VISUAL_ID:
				return new MenuDesplegableNameOrdenEditPart(view);

			case BarraDesplegableEditPart.VISUAL_ID:
				return new BarraDesplegableEditPart(view);

			case BarraDesplegableNameOrdenEditPart.VISUAL_ID:
				return new BarraDesplegableNameOrdenEditPart(view);

			case SliderEditPart.VISUAL_ID:
				return new SliderEditPart(view);

			case SliderNameOrdenEditPart.VISUAL_ID:
				return new SliderNameOrdenEditPart(view);

			case ComponenteComponenteElementoOcultoCompartmentEditPart.VISUAL_ID:
				return new ComponenteComponenteElementoOcultoCompartmentEditPart(
						view);

			case ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID:
				return new ComponenteComponenteElementoVisualCompartmentEditPart(
						view);

			case ComponenteComponenteComponentePredeterminadoCompartmentEditPart.VISUAL_ID:
				return new ComponenteComponenteComponentePredeterminadoCompartmentEditPart(
						view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
