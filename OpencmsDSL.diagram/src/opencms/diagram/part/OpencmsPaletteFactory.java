/*
 * 
 */
package opencms.diagram.part;

import java.util.Collections;
import java.util.List;

import opencms.diagram.providers.OpencmsElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class OpencmsPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createComponentePredeterminado2Group());
		paletteRoot.add(createElementosVisuales3Group());
		paletteRoot.add(createElementosOcultos4Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createComponente1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Componente Predeterminado" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponentePredeterminado2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.ComponentePredeterminado2Group_title);
		paletteContainer.setId("createComponentePredeterminado2Group"); //$NON-NLS-1$
		paletteContainer.add(createBaner1CreationTool());
		paletteContainer.add(createIconoRedSocial2CreationTool());
		paletteContainer.add(createSlider3CreationTool());
		paletteContainer.add(createBarraDesplegable4CreationTool());
		paletteContainer.add(createMenuDesplegable5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Elementos Visuales" palette tool group
	 * @generated
	 */
	private PaletteContainer createElementosVisuales3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.ElementosVisuales3Group_title);
		paletteContainer.setId("createElementosVisuales3Group"); //$NON-NLS-1$
		paletteContainer.add(createFecha1CreationTool());
		paletteContainer.add(createEntradilla2CreationTool());
		paletteContainer.add(createBotonSeleccion3CreationTool());
		paletteContainer.add(createEnlace4CreationTool());
		paletteContainer.add(createVideo5CreationTool());
		paletteContainer.add(createTexto6CreationTool());
		paletteContainer.add(createBoton7CreationTool());
		paletteContainer.add(createTitulo8CreationTool());
		paletteContainer.add(createEtiqueta9CreationTool());
		paletteContainer.add(createAudio10CreationTool());
		paletteContainer.add(createSubtitulo11CreationTool());
		paletteContainer.add(createEntradaTexto12CreationTool());
		paletteContainer.add(createImagen13CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Elementos Ocultos" palette tool group
	 * @generated
	 */
	private PaletteContainer createElementosOcultos4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.ElementosOcultos4Group_title);
		paletteContainer.setId("createElementosOcultos4Group"); //$NON-NLS-1$
		paletteContainer.add(createSelectorArchivos1CreationTool());
		paletteContainer.add(createUrl2CreationTool());
		paletteContainer.add(createTag3CreationTool());
		paletteContainer.add(createIdentificadorInterno4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponente1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Componente1CreationTool_title,
				Messages.Componente1CreationTool_desc,
				Collections.singletonList(OpencmsElementTypes.Componente_2001));
		entry.setId("createComponente1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_componente.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_componente.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBaner1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Baner1CreationTool_title,
				Messages.Baner1CreationTool_desc,
				Collections.singletonList(OpencmsElementTypes.Baner_3018));
		entry.setId("createBaner1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_componente_predeterminado.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_componente_predeterminado.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIconoRedSocial2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IconoRedSocial2CreationTool_title,
				Messages.IconoRedSocial2CreationTool_desc,
				Collections
						.singletonList(OpencmsElementTypes.IconoRedSocial_3019));
		entry.setId("createIconoRedSocial2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_componente_predeterminado.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_componente_predeterminado.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSlider3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Slider3CreationTool_title,
				Messages.Slider3CreationTool_desc,
				Collections.singletonList(OpencmsElementTypes.Slider_3022));
		entry.setId("createSlider3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_componente_predeterminado.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_componente_predeterminado.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBarraDesplegable4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BarraDesplegable4CreationTool_title,
				Messages.BarraDesplegable4CreationTool_desc,
				Collections
						.singletonList(OpencmsElementTypes.BarraDesplegable_3021));
		entry.setId("createBarraDesplegable4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_componente_predeterminado.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_componente_predeterminado.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMenuDesplegable5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MenuDesplegable5CreationTool_title,
				Messages.MenuDesplegable5CreationTool_desc,
				Collections
						.singletonList(OpencmsElementTypes.MenuDesplegable_3020));
		entry.setId("createMenuDesplegable5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_componente_predeterminado.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_componente_predeterminado.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFecha1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Fecha1CreationTool_title,
				Messages.Fecha1CreationTool_desc,
				Collections.singletonList(OpencmsElementTypes.Fecha_3005));
		entry.setId("createFecha1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_ojo.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_ojo.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntradilla2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Entradilla2CreationTool_title,
				Messages.Entradilla2CreationTool_desc,
				Collections.singletonList(OpencmsElementTypes.Entradilla_3006));
		entry.setId("createEntradilla2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_ojo.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_ojo.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBotonSeleccion3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BotonSeleccion3CreationTool_title,
				Messages.BotonSeleccion3CreationTool_desc,
				Collections
						.singletonList(OpencmsElementTypes.BotonSeleccion_3007));
		entry.setId("createBotonSeleccion3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_ojo.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_ojo.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnlace4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Enlace4CreationTool_title,
				Messages.Enlace4CreationTool_desc,
				Collections.singletonList(OpencmsElementTypes.Enlace_3008));
		entry.setId("createEnlace4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_ojo.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_ojo.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVideo5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Video5CreationTool_title,
				Messages.Video5CreationTool_desc,
				Collections.singletonList(OpencmsElementTypes.Video_3009));
		entry.setId("createVideo5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_ojo.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_ojo.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTexto6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Texto6CreationTool_title,
				Messages.Texto6CreationTool_desc,
				Collections.singletonList(OpencmsElementTypes.Texto_3010));
		entry.setId("createTexto6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_ojo.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_ojo.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBoton7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Boton7CreationTool_title,
				Messages.Boton7CreationTool_desc,
				Collections.singletonList(OpencmsElementTypes.Boton_3011));
		entry.setId("createBoton7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_ojo.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_ojo.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTitulo8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Titulo8CreationTool_title,
				Messages.Titulo8CreationTool_desc,
				Collections.singletonList(OpencmsElementTypes.Titulo_3012));
		entry.setId("createTitulo8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_ojo.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_ojo.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEtiqueta9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Etiqueta9CreationTool_title,
				Messages.Etiqueta9CreationTool_desc,
				Collections.singletonList(OpencmsElementTypes.Etiqueta_3013));
		entry.setId("createEtiqueta9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_ojo.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_ojo.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAudio10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Audio10CreationTool_title,
				Messages.Audio10CreationTool_desc,
				Collections.singletonList(OpencmsElementTypes.Audio_3014));
		entry.setId("createAudio10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_ojo.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_ojo.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubtitulo11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Subtitulo11CreationTool_title,
				Messages.Subtitulo11CreationTool_desc,
				Collections.singletonList(OpencmsElementTypes.Subtitulo_3015));
		entry.setId("createSubtitulo11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_ojo.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_ojo.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntradaTexto12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EntradaTexto12CreationTool_title,
				Messages.EntradaTexto12CreationTool_desc,
				Collections
						.singletonList(OpencmsElementTypes.EntradaTexto_3016));
		entry.setId("createEntradaTexto12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_ojo.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_ojo.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImagen13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Imagen13CreationTool_title,
				Messages.Imagen13CreationTool_desc,
				Collections.singletonList(OpencmsElementTypes.Imagen_3017));
		entry.setId("createImagen13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_ojo.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_ojo.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSelectorArchivos1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SelectorArchivos1CreationTool_title,
				Messages.SelectorArchivos1CreationTool_desc,
				Collections
						.singletonList(OpencmsElementTypes.SelectorArchivos_3002));
		entry.setId("createSelectorArchivos1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_ojo_oculto.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_ojo_oculto.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUrl2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Url2CreationTool_title,
				Messages.Url2CreationTool_desc,
				Collections.singletonList(OpencmsElementTypes.Url_3001));
		entry.setId("createUrl2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_ojo_oculto.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_ojo_oculto.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTag3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Tag3CreationTool_title,
				Messages.Tag3CreationTool_desc,
				Collections.singletonList(OpencmsElementTypes.Tag_3003));
		entry.setId("createTag3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_ojo_oculto.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_ojo_oculto.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIdentificadorInterno4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IdentificadorInterno4CreationTool_title,
				Messages.IdentificadorInterno4CreationTool_desc,
				Collections
						.singletonList(OpencmsElementTypes.IdentificadorInterno_3004));
		entry.setId("createIdentificadorInterno4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("/OpencmsDSL/resources/icono_ojo_oculto.gif")); //$NON-NLS-1$
		entry.setLargeIcon(OpencmsDiagramEditorPlugin
				.findImageDescriptor("resources/icono_ojo_oculto.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
