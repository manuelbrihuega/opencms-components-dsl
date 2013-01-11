/*
 * 
 */
package opencms.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import opencms.diagram.edit.parts.ComponenteComponenteComponentePredeterminadoCompartmentEditPart;
import opencms.diagram.edit.parts.ComponenteComponenteElementoOcultoCompartmentEditPart;
import opencms.diagram.edit.parts.ComponenteComponenteElementoVisualCompartmentEditPart;
import opencms.diagram.edit.parts.DiagramaEditPart;
import opencms.diagram.part.Messages;
import opencms.diagram.part.OpencmsDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class OpencmsModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof DiagramaEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(OpencmsElementTypes.Componente_2001);
			return types;
		}
		if (editPart instanceof ComponenteComponenteElementoOcultoCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(OpencmsElementTypes.Url_3001);
			types.add(OpencmsElementTypes.SelectorArchivos_3002);
			types.add(OpencmsElementTypes.Tag_3003);
			types.add(OpencmsElementTypes.IdentificadorInterno_3004);
			return types;
		}
		if (editPart instanceof ComponenteComponenteElementoVisualCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(13);
			types.add(OpencmsElementTypes.Fecha_3005);
			types.add(OpencmsElementTypes.Entradilla_3006);
			types.add(OpencmsElementTypes.BotonSeleccion_3007);
			types.add(OpencmsElementTypes.Enlace_3008);
			types.add(OpencmsElementTypes.Video_3009);
			types.add(OpencmsElementTypes.Texto_3010);
			types.add(OpencmsElementTypes.Boton_3011);
			types.add(OpencmsElementTypes.Titulo_3012);
			types.add(OpencmsElementTypes.Etiqueta_3013);
			types.add(OpencmsElementTypes.Audio_3014);
			types.add(OpencmsElementTypes.Subtitulo_3015);
			types.add(OpencmsElementTypes.EntradaTexto_3016);
			types.add(OpencmsElementTypes.Imagen_3017);
			return types;
		}
		if (editPart instanceof ComponenteComponenteComponentePredeterminadoCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(OpencmsElementTypes.Baner_3018);
			types.add(OpencmsElementTypes.IconoRedSocial_3019);
			types.add(OpencmsElementTypes.MenuDesplegable_3020);
			types.add(OpencmsElementTypes.BarraDesplegable_3021);
			types.add(OpencmsElementTypes.Slider_3022);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				OpencmsDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.OpencmsModelingAssistantProviderMessage);
		dialog.setTitle(Messages.OpencmsModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
