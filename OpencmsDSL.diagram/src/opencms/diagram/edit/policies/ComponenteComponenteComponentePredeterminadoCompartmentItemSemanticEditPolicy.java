/*
 * 
 */
package opencms.diagram.edit.policies;

import opencms.diagram.edit.commands.BanerCreateCommand;
import opencms.diagram.edit.commands.BarraDesplegableCreateCommand;
import opencms.diagram.edit.commands.IconoRedSocialCreateCommand;
import opencms.diagram.edit.commands.MenuDesplegableCreateCommand;
import opencms.diagram.edit.commands.SliderCreateCommand;
import opencms.diagram.providers.OpencmsElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ComponenteComponenteComponentePredeterminadoCompartmentItemSemanticEditPolicy
		extends OpencmsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponenteComponenteComponentePredeterminadoCompartmentItemSemanticEditPolicy() {
		super(OpencmsElementTypes.Componente_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (OpencmsElementTypes.Baner_3018 == req.getElementType()) {
			return getGEFWrapper(new BanerCreateCommand(req));
		}
		if (OpencmsElementTypes.IconoRedSocial_3019 == req.getElementType()) {
			return getGEFWrapper(new IconoRedSocialCreateCommand(req));
		}
		if (OpencmsElementTypes.MenuDesplegable_3020 == req.getElementType()) {
			return getGEFWrapper(new MenuDesplegableCreateCommand(req));
		}
		if (OpencmsElementTypes.BarraDesplegable_3021 == req.getElementType()) {
			return getGEFWrapper(new BarraDesplegableCreateCommand(req));
		}
		if (OpencmsElementTypes.Slider_3022 == req.getElementType()) {
			return getGEFWrapper(new SliderCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
