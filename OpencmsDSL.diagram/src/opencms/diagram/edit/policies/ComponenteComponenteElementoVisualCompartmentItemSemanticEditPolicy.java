/*
 * 
 */
package opencms.diagram.edit.policies;

import opencms.diagram.edit.commands.AudioCreateCommand;
import opencms.diagram.edit.commands.BotonCreateCommand;
import opencms.diagram.edit.commands.BotonSeleccionCreateCommand;
import opencms.diagram.edit.commands.EnlaceCreateCommand;
import opencms.diagram.edit.commands.EntradaTextoCreateCommand;
import opencms.diagram.edit.commands.EntradillaCreateCommand;
import opencms.diagram.edit.commands.EtiquetaCreateCommand;
import opencms.diagram.edit.commands.FechaCreateCommand;
import opencms.diagram.edit.commands.ImagenCreateCommand;
import opencms.diagram.edit.commands.SubtituloCreateCommand;
import opencms.diagram.edit.commands.TextoCreateCommand;
import opencms.diagram.edit.commands.TituloCreateCommand;
import opencms.diagram.edit.commands.VideoCreateCommand;
import opencms.diagram.providers.OpencmsElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ComponenteComponenteElementoVisualCompartmentItemSemanticEditPolicy
		extends OpencmsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponenteComponenteElementoVisualCompartmentItemSemanticEditPolicy() {
		super(OpencmsElementTypes.Componente_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (OpencmsElementTypes.Fecha_3005 == req.getElementType()) {
			return getGEFWrapper(new FechaCreateCommand(req));
		}
		if (OpencmsElementTypes.Entradilla_3006 == req.getElementType()) {
			return getGEFWrapper(new EntradillaCreateCommand(req));
		}
		if (OpencmsElementTypes.BotonSeleccion_3007 == req.getElementType()) {
			return getGEFWrapper(new BotonSeleccionCreateCommand(req));
		}
		if (OpencmsElementTypes.Enlace_3008 == req.getElementType()) {
			return getGEFWrapper(new EnlaceCreateCommand(req));
		}
		if (OpencmsElementTypes.Video_3009 == req.getElementType()) {
			return getGEFWrapper(new VideoCreateCommand(req));
		}
		if (OpencmsElementTypes.Texto_3010 == req.getElementType()) {
			return getGEFWrapper(new TextoCreateCommand(req));
		}
		if (OpencmsElementTypes.Boton_3011 == req.getElementType()) {
			return getGEFWrapper(new BotonCreateCommand(req));
		}
		if (OpencmsElementTypes.Titulo_3012 == req.getElementType()) {
			return getGEFWrapper(new TituloCreateCommand(req));
		}
		if (OpencmsElementTypes.Etiqueta_3013 == req.getElementType()) {
			return getGEFWrapper(new EtiquetaCreateCommand(req));
		}
		if (OpencmsElementTypes.Audio_3014 == req.getElementType()) {
			return getGEFWrapper(new AudioCreateCommand(req));
		}
		if (OpencmsElementTypes.Subtitulo_3015 == req.getElementType()) {
			return getGEFWrapper(new SubtituloCreateCommand(req));
		}
		if (OpencmsElementTypes.EntradaTexto_3016 == req.getElementType()) {
			return getGEFWrapper(new EntradaTextoCreateCommand(req));
		}
		if (OpencmsElementTypes.Imagen_3017 == req.getElementType()) {
			return getGEFWrapper(new ImagenCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
