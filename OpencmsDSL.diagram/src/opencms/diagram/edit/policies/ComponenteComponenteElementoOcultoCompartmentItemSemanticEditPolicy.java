/*
 * 
 */
package opencms.diagram.edit.policies;

import opencms.diagram.edit.commands.IdentificadorInternoCreateCommand;
import opencms.diagram.edit.commands.SelectorArchivosCreateCommand;
import opencms.diagram.edit.commands.TagCreateCommand;
import opencms.diagram.edit.commands.UrlCreateCommand;
import opencms.diagram.providers.OpencmsElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ComponenteComponenteElementoOcultoCompartmentItemSemanticEditPolicy
		extends OpencmsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponenteComponenteElementoOcultoCompartmentItemSemanticEditPolicy() {
		super(OpencmsElementTypes.Componente_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (OpencmsElementTypes.Url_3001 == req.getElementType()) {
			return getGEFWrapper(new UrlCreateCommand(req));
		}
		if (OpencmsElementTypes.SelectorArchivos_3002 == req.getElementType()) {
			return getGEFWrapper(new SelectorArchivosCreateCommand(req));
		}
		if (OpencmsElementTypes.Tag_3003 == req.getElementType()) {
			return getGEFWrapper(new TagCreateCommand(req));
		}
		if (OpencmsElementTypes.IdentificadorInterno_3004 == req
				.getElementType()) {
			return getGEFWrapper(new IdentificadorInternoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
