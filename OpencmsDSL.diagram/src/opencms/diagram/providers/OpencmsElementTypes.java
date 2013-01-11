/*
 * 
 */
package opencms.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import opencms.OpencmsPackage;
import opencms.diagram.edit.parts.AudioEditPart;
import opencms.diagram.edit.parts.BanerEditPart;
import opencms.diagram.edit.parts.BarraDesplegableEditPart;
import opencms.diagram.edit.parts.BotonEditPart;
import opencms.diagram.edit.parts.BotonSeleccionEditPart;
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
import opencms.diagram.part.OpencmsDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class OpencmsElementTypes {

	/**
	 * @generated
	 */
	private OpencmsElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Diagrama_1000 = getElementType("OpencmsDSL.diagram.Diagrama_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Componente_2001 = getElementType("OpencmsDSL.diagram.Componente_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Url_3001 = getElementType("OpencmsDSL.diagram.Url_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SelectorArchivos_3002 = getElementType("OpencmsDSL.diagram.SelectorArchivos_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Tag_3003 = getElementType("OpencmsDSL.diagram.Tag_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IdentificadorInterno_3004 = getElementType("OpencmsDSL.diagram.IdentificadorInterno_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Fecha_3005 = getElementType("OpencmsDSL.diagram.Fecha_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Entradilla_3006 = getElementType("OpencmsDSL.diagram.Entradilla_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BotonSeleccion_3007 = getElementType("OpencmsDSL.diagram.BotonSeleccion_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Enlace_3008 = getElementType("OpencmsDSL.diagram.Enlace_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Video_3009 = getElementType("OpencmsDSL.diagram.Video_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Texto_3010 = getElementType("OpencmsDSL.diagram.Texto_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Boton_3011 = getElementType("OpencmsDSL.diagram.Boton_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Titulo_3012 = getElementType("OpencmsDSL.diagram.Titulo_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Etiqueta_3013 = getElementType("OpencmsDSL.diagram.Etiqueta_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Audio_3014 = getElementType("OpencmsDSL.diagram.Audio_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Subtitulo_3015 = getElementType("OpencmsDSL.diagram.Subtitulo_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntradaTexto_3016 = getElementType("OpencmsDSL.diagram.EntradaTexto_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Imagen_3017 = getElementType("OpencmsDSL.diagram.Imagen_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Baner_3018 = getElementType("OpencmsDSL.diagram.Baner_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IconoRedSocial_3019 = getElementType("OpencmsDSL.diagram.IconoRedSocial_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MenuDesplegable_3020 = getElementType("OpencmsDSL.diagram.MenuDesplegable_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BarraDesplegable_3021 = getElementType("OpencmsDSL.diagram.BarraDesplegable_3021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Slider_3022 = getElementType("OpencmsDSL.diagram.Slider_3022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return OpencmsDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Diagrama_1000, OpencmsPackage.eINSTANCE.getDiagrama());

			elements.put(Componente_2001,
					OpencmsPackage.eINSTANCE.getComponente());

			elements.put(Url_3001, OpencmsPackage.eINSTANCE.getUrl());

			elements.put(SelectorArchivos_3002,
					OpencmsPackage.eINSTANCE.getSelectorArchivos());

			elements.put(Tag_3003, OpencmsPackage.eINSTANCE.getTag());

			elements.put(IdentificadorInterno_3004,
					OpencmsPackage.eINSTANCE.getIdentificadorInterno());

			elements.put(Fecha_3005, OpencmsPackage.eINSTANCE.getFecha());

			elements.put(Entradilla_3006,
					OpencmsPackage.eINSTANCE.getEntradilla());

			elements.put(BotonSeleccion_3007,
					OpencmsPackage.eINSTANCE.getBotonSeleccion());

			elements.put(Enlace_3008, OpencmsPackage.eINSTANCE.getEnlace());

			elements.put(Video_3009, OpencmsPackage.eINSTANCE.getVideo());

			elements.put(Texto_3010, OpencmsPackage.eINSTANCE.getTexto());

			elements.put(Boton_3011, OpencmsPackage.eINSTANCE.getBoton());

			elements.put(Titulo_3012, OpencmsPackage.eINSTANCE.getTitulo());

			elements.put(Etiqueta_3013, OpencmsPackage.eINSTANCE.getEtiqueta());

			elements.put(Audio_3014, OpencmsPackage.eINSTANCE.getAudio());

			elements.put(Subtitulo_3015,
					OpencmsPackage.eINSTANCE.getSubtitulo());

			elements.put(EntradaTexto_3016,
					OpencmsPackage.eINSTANCE.getEntradaTexto());

			elements.put(Imagen_3017, OpencmsPackage.eINSTANCE.getImagen());

			elements.put(Baner_3018, OpencmsPackage.eINSTANCE.getBaner());

			elements.put(IconoRedSocial_3019,
					OpencmsPackage.eINSTANCE.getIconoRedSocial());

			elements.put(MenuDesplegable_3020,
					OpencmsPackage.eINSTANCE.getMenuDesplegable());

			elements.put(BarraDesplegable_3021,
					OpencmsPackage.eINSTANCE.getBarraDesplegable());

			elements.put(Slider_3022, OpencmsPackage.eINSTANCE.getSlider());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Diagrama_1000);
			KNOWN_ELEMENT_TYPES.add(Componente_2001);
			KNOWN_ELEMENT_TYPES.add(Url_3001);
			KNOWN_ELEMENT_TYPES.add(SelectorArchivos_3002);
			KNOWN_ELEMENT_TYPES.add(Tag_3003);
			KNOWN_ELEMENT_TYPES.add(IdentificadorInterno_3004);
			KNOWN_ELEMENT_TYPES.add(Fecha_3005);
			KNOWN_ELEMENT_TYPES.add(Entradilla_3006);
			KNOWN_ELEMENT_TYPES.add(BotonSeleccion_3007);
			KNOWN_ELEMENT_TYPES.add(Enlace_3008);
			KNOWN_ELEMENT_TYPES.add(Video_3009);
			KNOWN_ELEMENT_TYPES.add(Texto_3010);
			KNOWN_ELEMENT_TYPES.add(Boton_3011);
			KNOWN_ELEMENT_TYPES.add(Titulo_3012);
			KNOWN_ELEMENT_TYPES.add(Etiqueta_3013);
			KNOWN_ELEMENT_TYPES.add(Audio_3014);
			KNOWN_ELEMENT_TYPES.add(Subtitulo_3015);
			KNOWN_ELEMENT_TYPES.add(EntradaTexto_3016);
			KNOWN_ELEMENT_TYPES.add(Imagen_3017);
			KNOWN_ELEMENT_TYPES.add(Baner_3018);
			KNOWN_ELEMENT_TYPES.add(IconoRedSocial_3019);
			KNOWN_ELEMENT_TYPES.add(MenuDesplegable_3020);
			KNOWN_ELEMENT_TYPES.add(BarraDesplegable_3021);
			KNOWN_ELEMENT_TYPES.add(Slider_3022);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DiagramaEditPart.VISUAL_ID:
			return Diagrama_1000;
		case ComponenteEditPart.VISUAL_ID:
			return Componente_2001;
		case UrlEditPart.VISUAL_ID:
			return Url_3001;
		case SelectorArchivosEditPart.VISUAL_ID:
			return SelectorArchivos_3002;
		case TagEditPart.VISUAL_ID:
			return Tag_3003;
		case IdentificadorInternoEditPart.VISUAL_ID:
			return IdentificadorInterno_3004;
		case FechaEditPart.VISUAL_ID:
			return Fecha_3005;
		case EntradillaEditPart.VISUAL_ID:
			return Entradilla_3006;
		case BotonSeleccionEditPart.VISUAL_ID:
			return BotonSeleccion_3007;
		case EnlaceEditPart.VISUAL_ID:
			return Enlace_3008;
		case VideoEditPart.VISUAL_ID:
			return Video_3009;
		case TextoEditPart.VISUAL_ID:
			return Texto_3010;
		case BotonEditPart.VISUAL_ID:
			return Boton_3011;
		case TituloEditPart.VISUAL_ID:
			return Titulo_3012;
		case EtiquetaEditPart.VISUAL_ID:
			return Etiqueta_3013;
		case AudioEditPart.VISUAL_ID:
			return Audio_3014;
		case SubtituloEditPart.VISUAL_ID:
			return Subtitulo_3015;
		case EntradaTextoEditPart.VISUAL_ID:
			return EntradaTexto_3016;
		case ImagenEditPart.VISUAL_ID:
			return Imagen_3017;
		case BanerEditPart.VISUAL_ID:
			return Baner_3018;
		case IconoRedSocialEditPart.VISUAL_ID:
			return IconoRedSocial_3019;
		case MenuDesplegableEditPart.VISUAL_ID:
			return MenuDesplegable_3020;
		case BarraDesplegableEditPart.VISUAL_ID:
			return BarraDesplegable_3021;
		case SliderEditPart.VISUAL_ID:
			return Slider_3022;
		}
		return null;
	}

}
