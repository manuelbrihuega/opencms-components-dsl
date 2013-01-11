/*
 * 
 */
package opencms.diagram.providers;

import opencms.OpencmsPackage;
import opencms.diagram.edit.parts.AudioNameOrdenEditPart;
import opencms.diagram.edit.parts.BanerNameOrdenEditPart;
import opencms.diagram.edit.parts.BarraDesplegableNameOrdenEditPart;
import opencms.diagram.edit.parts.BotonNameOrdenEditPart;
import opencms.diagram.edit.parts.BotonSeleccionNameOrdenEditPart;
import opencms.diagram.edit.parts.ComponenteNameEditPart;
import opencms.diagram.edit.parts.EnlaceNameOrdenEditPart;
import opencms.diagram.edit.parts.EntradaTextoNameOrdenEditPart;
import opencms.diagram.edit.parts.EntradillaNameOrdenEditPart;
import opencms.diagram.edit.parts.EtiquetaNameOrdenEditPart;
import opencms.diagram.edit.parts.FechaNameOrdenEditPart;
import opencms.diagram.edit.parts.IconoRedSocialNameOrdenEditPart;
import opencms.diagram.edit.parts.IdentificadorInternoNameOrdenEditPart;
import opencms.diagram.edit.parts.ImagenAltoEditPart;
import opencms.diagram.edit.parts.ImagenAnchoEditPart;
import opencms.diagram.edit.parts.ImagenNameOrdenEditPart;
import opencms.diagram.edit.parts.MenuDesplegableNameOrdenEditPart;
import opencms.diagram.edit.parts.SelectorArchivosNameOrdenEditPart;
import opencms.diagram.edit.parts.SliderNameOrdenEditPart;
import opencms.diagram.edit.parts.SubtituloEnlaceEditPart;
import opencms.diagram.edit.parts.SubtituloNameOrdenEditPart;
import opencms.diagram.edit.parts.TagNameOrdenEditPart;
import opencms.diagram.edit.parts.TextoNameOrdenEditPart;
import opencms.diagram.edit.parts.TituloEnlaceEditPart;
import opencms.diagram.edit.parts.TituloNameOrdenEditPart;
import opencms.diagram.edit.parts.UrlNameOrdenEditPart;
import opencms.diagram.edit.parts.VideoNameOrdenEditPart;
import opencms.diagram.parsers.MessageFormatParser;
import opencms.diagram.part.OpencmsVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class OpencmsParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser componenteName_5027Parser;

	/**
	 * @generated
	 */
	private IParser getComponenteName_5027Parser() {
		if (componenteName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { OpencmsPackage.eINSTANCE
					.getComponente_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			componenteName_5027Parser = parser;
		}
		return componenteName_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser urlNameOrden_5001Parser;

	/**
	 * @generated
	 */
	private IParser getUrlNameOrden_5001Parser() {
		if (urlNameOrden_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getElementoOculto_Name(),
					OpencmsPackage.eINSTANCE.getElementoOculto_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			urlNameOrden_5001Parser = parser;
		}
		return urlNameOrden_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser selectorArchivosNameOrden_5002Parser;

	/**
	 * @generated
	 */
	private IParser getSelectorArchivosNameOrden_5002Parser() {
		if (selectorArchivosNameOrden_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getElementoOculto_Name(),
					OpencmsPackage.eINSTANCE.getElementoOculto_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			selectorArchivosNameOrden_5002Parser = parser;
		}
		return selectorArchivosNameOrden_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser tagNameOrden_5003Parser;

	/**
	 * @generated
	 */
	private IParser getTagNameOrden_5003Parser() {
		if (tagNameOrden_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getElementoOculto_Name(),
					OpencmsPackage.eINSTANCE.getElementoOculto_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			tagNameOrden_5003Parser = parser;
		}
		return tagNameOrden_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser identificadorInternoNameOrden_5004Parser;

	/**
	 * @generated
	 */
	private IParser getIdentificadorInternoNameOrden_5004Parser() {
		if (identificadorInternoNameOrden_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getElementoOculto_Name(),
					OpencmsPackage.eINSTANCE.getElementoOculto_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			identificadorInternoNameOrden_5004Parser = parser;
		}
		return identificadorInternoNameOrden_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser fechaNameOrden_5005Parser;

	/**
	 * @generated
	 */
	private IParser getFechaNameOrden_5005Parser() {
		if (fechaNameOrden_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getElementoVisual_Name(),
					OpencmsPackage.eINSTANCE.getElementoVisual_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			fechaNameOrden_5005Parser = parser;
		}
		return fechaNameOrden_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser entradillaNameOrden_5006Parser;

	/**
	 * @generated
	 */
	private IParser getEntradillaNameOrden_5006Parser() {
		if (entradillaNameOrden_5006Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getElementoVisual_Name(),
					OpencmsPackage.eINSTANCE.getElementoVisual_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			entradillaNameOrden_5006Parser = parser;
		}
		return entradillaNameOrden_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser botonSeleccionNameOrden_5007Parser;

	/**
	 * @generated
	 */
	private IParser getBotonSeleccionNameOrden_5007Parser() {
		if (botonSeleccionNameOrden_5007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getElementoVisual_Name(),
					OpencmsPackage.eINSTANCE.getElementoVisual_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			botonSeleccionNameOrden_5007Parser = parser;
		}
		return botonSeleccionNameOrden_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser enlaceNameOrden_5008Parser;

	/**
	 * @generated
	 */
	private IParser getEnlaceNameOrden_5008Parser() {
		if (enlaceNameOrden_5008Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getElementoVisual_Name(),
					OpencmsPackage.eINSTANCE.getElementoVisual_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			enlaceNameOrden_5008Parser = parser;
		}
		return enlaceNameOrden_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser videoNameOrden_5009Parser;

	/**
	 * @generated
	 */
	private IParser getVideoNameOrden_5009Parser() {
		if (videoNameOrden_5009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getElementoVisual_Name(),
					OpencmsPackage.eINSTANCE.getElementoVisual_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			videoNameOrden_5009Parser = parser;
		}
		return videoNameOrden_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser textoNameOrden_5010Parser;

	/**
	 * @generated
	 */
	private IParser getTextoNameOrden_5010Parser() {
		if (textoNameOrden_5010Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getElementoVisual_Name(),
					OpencmsPackage.eINSTANCE.getElementoVisual_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			textoNameOrden_5010Parser = parser;
		}
		return textoNameOrden_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser botonNameOrden_5011Parser;

	/**
	 * @generated
	 */
	private IParser getBotonNameOrden_5011Parser() {
		if (botonNameOrden_5011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getElementoVisual_Name(),
					OpencmsPackage.eINSTANCE.getElementoVisual_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			botonNameOrden_5011Parser = parser;
		}
		return botonNameOrden_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser tituloNameOrden_5012Parser;

	/**
	 * @generated
	 */
	private IParser getTituloNameOrden_5012Parser() {
		if (tituloNameOrden_5012Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getElementoVisual_Name(),
					OpencmsPackage.eINSTANCE.getElementoVisual_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			tituloNameOrden_5012Parser = parser;
		}
		return tituloNameOrden_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser tituloEnlace_5013Parser;

	/**
	 * @generated
	 */
	private IParser getTituloEnlace_5013Parser() {
		if (tituloEnlace_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { OpencmsPackage.eINSTANCE
					.getTitulo_Enlace() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tituloEnlace_5013Parser = parser;
		}
		return tituloEnlace_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser etiquetaNameOrden_5014Parser;

	/**
	 * @generated
	 */
	private IParser getEtiquetaNameOrden_5014Parser() {
		if (etiquetaNameOrden_5014Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getElementoVisual_Name(),
					OpencmsPackage.eINSTANCE.getElementoVisual_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			etiquetaNameOrden_5014Parser = parser;
		}
		return etiquetaNameOrden_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser audioNameOrden_5015Parser;

	/**
	 * @generated
	 */
	private IParser getAudioNameOrden_5015Parser() {
		if (audioNameOrden_5015Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getElementoVisual_Name(),
					OpencmsPackage.eINSTANCE.getElementoVisual_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			audioNameOrden_5015Parser = parser;
		}
		return audioNameOrden_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser subtituloNameOrden_5016Parser;

	/**
	 * @generated
	 */
	private IParser getSubtituloNameOrden_5016Parser() {
		if (subtituloNameOrden_5016Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getElementoVisual_Name(),
					OpencmsPackage.eINSTANCE.getElementoVisual_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			subtituloNameOrden_5016Parser = parser;
		}
		return subtituloNameOrden_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser subtituloEnlace_5017Parser;

	/**
	 * @generated
	 */
	private IParser getSubtituloEnlace_5017Parser() {
		if (subtituloEnlace_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { OpencmsPackage.eINSTANCE
					.getSubtitulo_Enlace() };
			MessageFormatParser parser = new MessageFormatParser(features);
			subtituloEnlace_5017Parser = parser;
		}
		return subtituloEnlace_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser entradaTextoNameOrden_5018Parser;

	/**
	 * @generated
	 */
	private IParser getEntradaTextoNameOrden_5018Parser() {
		if (entradaTextoNameOrden_5018Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getElementoVisual_Name(),
					OpencmsPackage.eINSTANCE.getElementoVisual_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			entradaTextoNameOrden_5018Parser = parser;
		}
		return entradaTextoNameOrden_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser imagenNameOrden_5019Parser;

	/**
	 * @generated
	 */
	private IParser getImagenNameOrden_5019Parser() {
		if (imagenNameOrden_5019Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getElementoVisual_Name(),
					OpencmsPackage.eINSTANCE.getElementoVisual_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			imagenNameOrden_5019Parser = parser;
		}
		return imagenNameOrden_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser imagenAlto_5020Parser;

	/**
	 * @generated
	 */
	private IParser getImagenAlto_5020Parser() {
		if (imagenAlto_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { OpencmsPackage.eINSTANCE
					.getImagen_Alto() };
			MessageFormatParser parser = new MessageFormatParser(features);
			imagenAlto_5020Parser = parser;
		}
		return imagenAlto_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser imagenAncho_5021Parser;

	/**
	 * @generated
	 */
	private IParser getImagenAncho_5021Parser() {
		if (imagenAncho_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { OpencmsPackage.eINSTANCE
					.getImagen_Ancho() };
			MessageFormatParser parser = new MessageFormatParser(features);
			imagenAncho_5021Parser = parser;
		}
		return imagenAncho_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser banerNameOrden_5022Parser;

	/**
	 * @generated
	 */
	private IParser getBanerNameOrden_5022Parser() {
		if (banerNameOrden_5022Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getComponentePredeterminado_Name(),
					OpencmsPackage.eINSTANCE
							.getComponentePredeterminado_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			banerNameOrden_5022Parser = parser;
		}
		return banerNameOrden_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser iconoRedSocialNameOrden_5023Parser;

	/**
	 * @generated
	 */
	private IParser getIconoRedSocialNameOrden_5023Parser() {
		if (iconoRedSocialNameOrden_5023Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getComponentePredeterminado_Name(),
					OpencmsPackage.eINSTANCE
							.getComponentePredeterminado_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			iconoRedSocialNameOrden_5023Parser = parser;
		}
		return iconoRedSocialNameOrden_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser menuDesplegableNameOrden_5024Parser;

	/**
	 * @generated
	 */
	private IParser getMenuDesplegableNameOrden_5024Parser() {
		if (menuDesplegableNameOrden_5024Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getComponentePredeterminado_Name(),
					OpencmsPackage.eINSTANCE
							.getComponentePredeterminado_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			menuDesplegableNameOrden_5024Parser = parser;
		}
		return menuDesplegableNameOrden_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser barraDesplegableNameOrden_5025Parser;

	/**
	 * @generated
	 */
	private IParser getBarraDesplegableNameOrden_5025Parser() {
		if (barraDesplegableNameOrden_5025Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getComponentePredeterminado_Name(),
					OpencmsPackage.eINSTANCE
							.getComponentePredeterminado_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			barraDesplegableNameOrden_5025Parser = parser;
		}
		return barraDesplegableNameOrden_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser sliderNameOrden_5026Parser;

	/**
	 * @generated
	 */
	private IParser getSliderNameOrden_5026Parser() {
		if (sliderNameOrden_5026Parser == null) {
			EAttribute[] features = new EAttribute[] {
					OpencmsPackage.eINSTANCE.getComponentePredeterminado_Name(),
					OpencmsPackage.eINSTANCE
							.getComponentePredeterminado_Orden() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			sliderNameOrden_5026Parser = parser;
		}
		return sliderNameOrden_5026Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ComponenteNameEditPart.VISUAL_ID:
			return getComponenteName_5027Parser();
		case UrlNameOrdenEditPart.VISUAL_ID:
			return getUrlNameOrden_5001Parser();
		case SelectorArchivosNameOrdenEditPart.VISUAL_ID:
			return getSelectorArchivosNameOrden_5002Parser();
		case TagNameOrdenEditPart.VISUAL_ID:
			return getTagNameOrden_5003Parser();
		case IdentificadorInternoNameOrdenEditPart.VISUAL_ID:
			return getIdentificadorInternoNameOrden_5004Parser();
		case FechaNameOrdenEditPart.VISUAL_ID:
			return getFechaNameOrden_5005Parser();
		case EntradillaNameOrdenEditPart.VISUAL_ID:
			return getEntradillaNameOrden_5006Parser();
		case BotonSeleccionNameOrdenEditPart.VISUAL_ID:
			return getBotonSeleccionNameOrden_5007Parser();
		case EnlaceNameOrdenEditPart.VISUAL_ID:
			return getEnlaceNameOrden_5008Parser();
		case VideoNameOrdenEditPart.VISUAL_ID:
			return getVideoNameOrden_5009Parser();
		case TextoNameOrdenEditPart.VISUAL_ID:
			return getTextoNameOrden_5010Parser();
		case BotonNameOrdenEditPart.VISUAL_ID:
			return getBotonNameOrden_5011Parser();
		case TituloNameOrdenEditPart.VISUAL_ID:
			return getTituloNameOrden_5012Parser();
		case TituloEnlaceEditPart.VISUAL_ID:
			return getTituloEnlace_5013Parser();
		case EtiquetaNameOrdenEditPart.VISUAL_ID:
			return getEtiquetaNameOrden_5014Parser();
		case AudioNameOrdenEditPart.VISUAL_ID:
			return getAudioNameOrden_5015Parser();
		case SubtituloNameOrdenEditPart.VISUAL_ID:
			return getSubtituloNameOrden_5016Parser();
		case SubtituloEnlaceEditPart.VISUAL_ID:
			return getSubtituloEnlace_5017Parser();
		case EntradaTextoNameOrdenEditPart.VISUAL_ID:
			return getEntradaTextoNameOrden_5018Parser();
		case ImagenNameOrdenEditPart.VISUAL_ID:
			return getImagenNameOrden_5019Parser();
		case ImagenAltoEditPart.VISUAL_ID:
			return getImagenAlto_5020Parser();
		case ImagenAnchoEditPart.VISUAL_ID:
			return getImagenAncho_5021Parser();
		case BanerNameOrdenEditPart.VISUAL_ID:
			return getBanerNameOrden_5022Parser();
		case IconoRedSocialNameOrdenEditPart.VISUAL_ID:
			return getIconoRedSocialNameOrden_5023Parser();
		case MenuDesplegableNameOrdenEditPart.VISUAL_ID:
			return getMenuDesplegableNameOrden_5024Parser();
		case BarraDesplegableNameOrdenEditPart.VISUAL_ID:
			return getBarraDesplegableNameOrden_5025Parser();
		case SliderNameOrdenEditPart.VISUAL_ID:
			return getSliderNameOrden_5026Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(OpencmsVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(OpencmsVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (OpencmsElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
