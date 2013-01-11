/*
 * 
 */
package opencms.diagram.navigator;

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
import opencms.diagram.edit.parts.ImagenEditPart;
import opencms.diagram.edit.parts.ImagenNameOrdenEditPart;
import opencms.diagram.edit.parts.MenuDesplegableEditPart;
import opencms.diagram.edit.parts.MenuDesplegableNameOrdenEditPart;
import opencms.diagram.edit.parts.SelectorArchivosEditPart;
import opencms.diagram.edit.parts.SelectorArchivosNameOrdenEditPart;
import opencms.diagram.edit.parts.SliderEditPart;
import opencms.diagram.edit.parts.SliderNameOrdenEditPart;
import opencms.diagram.edit.parts.SubtituloEditPart;
import opencms.diagram.edit.parts.SubtituloNameOrdenEditPart;
import opencms.diagram.edit.parts.TagEditPart;
import opencms.diagram.edit.parts.TagNameOrdenEditPart;
import opencms.diagram.edit.parts.TextoEditPart;
import opencms.diagram.edit.parts.TextoNameOrdenEditPart;
import opencms.diagram.edit.parts.TituloEditPart;
import opencms.diagram.edit.parts.TituloNameOrdenEditPart;
import opencms.diagram.edit.parts.UrlEditPart;
import opencms.diagram.edit.parts.UrlNameOrdenEditPart;
import opencms.diagram.edit.parts.VideoEditPart;
import opencms.diagram.edit.parts.VideoNameOrdenEditPart;
import opencms.diagram.part.OpencmsDiagramEditorPlugin;
import opencms.diagram.part.OpencmsVisualIDRegistry;
import opencms.diagram.providers.OpencmsElementTypes;
import opencms.diagram.providers.OpencmsParserProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class OpencmsNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		OpencmsDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		OpencmsDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof OpencmsNavigatorItem
				&& !isOwnView(((OpencmsNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof OpencmsNavigatorGroup) {
			OpencmsNavigatorGroup group = (OpencmsNavigatorGroup) element;
			return OpencmsDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof OpencmsNavigatorItem) {
			OpencmsNavigatorItem navigatorItem = (OpencmsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (OpencmsVisualIDRegistry.getVisualID(view)) {
		case DiagramaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://OpenCMS/1.0?Diagrama", OpencmsElementTypes.Diagrama_1000); //$NON-NLS-1$
		case ComponenteEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://OpenCMS/1.0?Componente", OpencmsElementTypes.Componente_2001); //$NON-NLS-1$
		case UrlEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?Url", OpencmsElementTypes.Url_3001); //$NON-NLS-1$
		case SelectorArchivosEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?SelectorArchivos", OpencmsElementTypes.SelectorArchivos_3002); //$NON-NLS-1$
		case TagEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?Tag", OpencmsElementTypes.Tag_3003); //$NON-NLS-1$
		case IdentificadorInternoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?IdentificadorInterno", OpencmsElementTypes.IdentificadorInterno_3004); //$NON-NLS-1$
		case FechaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?Fecha", OpencmsElementTypes.Fecha_3005); //$NON-NLS-1$
		case EntradillaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?Entradilla", OpencmsElementTypes.Entradilla_3006); //$NON-NLS-1$
		case BotonSeleccionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?BotonSeleccion", OpencmsElementTypes.BotonSeleccion_3007); //$NON-NLS-1$
		case EnlaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?Enlace", OpencmsElementTypes.Enlace_3008); //$NON-NLS-1$
		case VideoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?Video", OpencmsElementTypes.Video_3009); //$NON-NLS-1$
		case TextoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?Texto", OpencmsElementTypes.Texto_3010); //$NON-NLS-1$
		case BotonEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?Boton", OpencmsElementTypes.Boton_3011); //$NON-NLS-1$
		case TituloEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?Titulo", OpencmsElementTypes.Titulo_3012); //$NON-NLS-1$
		case EtiquetaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?Etiqueta", OpencmsElementTypes.Etiqueta_3013); //$NON-NLS-1$
		case AudioEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?Audio", OpencmsElementTypes.Audio_3014); //$NON-NLS-1$
		case SubtituloEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?Subtitulo", OpencmsElementTypes.Subtitulo_3015); //$NON-NLS-1$
		case EntradaTextoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?EntradaTexto", OpencmsElementTypes.EntradaTexto_3016); //$NON-NLS-1$
		case ImagenEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?Imagen", OpencmsElementTypes.Imagen_3017); //$NON-NLS-1$
		case BanerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?Baner", OpencmsElementTypes.Baner_3018); //$NON-NLS-1$
		case IconoRedSocialEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?IconoRedSocial", OpencmsElementTypes.IconoRedSocial_3019); //$NON-NLS-1$
		case MenuDesplegableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?MenuDesplegable", OpencmsElementTypes.MenuDesplegable_3020); //$NON-NLS-1$
		case BarraDesplegableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?BarraDesplegable", OpencmsElementTypes.BarraDesplegable_3021); //$NON-NLS-1$
		case SliderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://OpenCMS/1.0?Slider", OpencmsElementTypes.Slider_3022); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = OpencmsDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& OpencmsElementTypes.isKnownElementType(elementType)) {
			image = OpencmsElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof OpencmsNavigatorGroup) {
			OpencmsNavigatorGroup group = (OpencmsNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof OpencmsNavigatorItem) {
			OpencmsNavigatorItem navigatorItem = (OpencmsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (OpencmsVisualIDRegistry.getVisualID(view)) {
		case DiagramaEditPart.VISUAL_ID:
			return getDiagrama_1000Text(view);
		case ComponenteEditPart.VISUAL_ID:
			return getComponente_2001Text(view);
		case UrlEditPart.VISUAL_ID:
			return getUrl_3001Text(view);
		case SelectorArchivosEditPart.VISUAL_ID:
			return getSelectorArchivos_3002Text(view);
		case TagEditPart.VISUAL_ID:
			return getTag_3003Text(view);
		case IdentificadorInternoEditPart.VISUAL_ID:
			return getIdentificadorInterno_3004Text(view);
		case FechaEditPart.VISUAL_ID:
			return getFecha_3005Text(view);
		case EntradillaEditPart.VISUAL_ID:
			return getEntradilla_3006Text(view);
		case BotonSeleccionEditPart.VISUAL_ID:
			return getBotonSeleccion_3007Text(view);
		case EnlaceEditPart.VISUAL_ID:
			return getEnlace_3008Text(view);
		case VideoEditPart.VISUAL_ID:
			return getVideo_3009Text(view);
		case TextoEditPart.VISUAL_ID:
			return getTexto_3010Text(view);
		case BotonEditPart.VISUAL_ID:
			return getBoton_3011Text(view);
		case TituloEditPart.VISUAL_ID:
			return getTitulo_3012Text(view);
		case EtiquetaEditPart.VISUAL_ID:
			return getEtiqueta_3013Text(view);
		case AudioEditPart.VISUAL_ID:
			return getAudio_3014Text(view);
		case SubtituloEditPart.VISUAL_ID:
			return getSubtitulo_3015Text(view);
		case EntradaTextoEditPart.VISUAL_ID:
			return getEntradaTexto_3016Text(view);
		case ImagenEditPart.VISUAL_ID:
			return getImagen_3017Text(view);
		case BanerEditPart.VISUAL_ID:
			return getBaner_3018Text(view);
		case IconoRedSocialEditPart.VISUAL_ID:
			return getIconoRedSocial_3019Text(view);
		case MenuDesplegableEditPart.VISUAL_ID:
			return getMenuDesplegable_3020Text(view);
		case BarraDesplegableEditPart.VISUAL_ID:
			return getBarraDesplegable_3021Text(view);
		case SliderEditPart.VISUAL_ID:
			return getSlider_3022Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDiagrama_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getComponente_2001Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.Componente_2001,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(ComponenteNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUrl_3001Text(View view) {
		IParser parser = OpencmsParserProvider
				.getParser(OpencmsElementTypes.Url_3001,
						view.getElement() != null ? view.getElement() : view,
						OpencmsVisualIDRegistry
								.getType(UrlNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSelectorArchivos_3002Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.SelectorArchivos_3002,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(SelectorArchivosNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTag_3003Text(View view) {
		IParser parser = OpencmsParserProvider
				.getParser(OpencmsElementTypes.Tag_3003,
						view.getElement() != null ? view.getElement() : view,
						OpencmsVisualIDRegistry
								.getType(TagNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIdentificadorInterno_3004Text(View view) {
		IParser parser = OpencmsParserProvider
				.getParser(
						OpencmsElementTypes.IdentificadorInterno_3004,
						view.getElement() != null ? view.getElement() : view,
						OpencmsVisualIDRegistry
								.getType(IdentificadorInternoNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFecha_3005Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.Fecha_3005,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(FechaNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntradilla_3006Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.Entradilla_3006,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(EntradillaNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBotonSeleccion_3007Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.BotonSeleccion_3007,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(BotonSeleccionNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnlace_3008Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.Enlace_3008,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(EnlaceNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVideo_3009Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.Video_3009,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(VideoNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTexto_3010Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.Texto_3010,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(TextoNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBoton_3011Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.Boton_3011,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(BotonNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTitulo_3012Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.Titulo_3012,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(TituloNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEtiqueta_3013Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.Etiqueta_3013,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(EtiquetaNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAudio_3014Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.Audio_3014,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(AudioNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSubtitulo_3015Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.Subtitulo_3015,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(SubtituloNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntradaTexto_3016Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.EntradaTexto_3016,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(EntradaTextoNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getImagen_3017Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.Imagen_3017,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(ImagenNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBaner_3018Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.Baner_3018,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(BanerNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIconoRedSocial_3019Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.IconoRedSocial_3019,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(IconoRedSocialNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMenuDesplegable_3020Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.MenuDesplegable_3020,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(MenuDesplegableNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBarraDesplegable_3021Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.BarraDesplegable_3021,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(BarraDesplegableNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSlider_3022Text(View view) {
		IParser parser = OpencmsParserProvider.getParser(
				OpencmsElementTypes.Slider_3022,
				view.getElement() != null ? view.getElement() : view,
				OpencmsVisualIDRegistry
						.getType(SliderNameOrdenEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OpencmsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DiagramaEditPart.MODEL_ID.equals(OpencmsVisualIDRegistry
				.getModelID(view));
	}

}
