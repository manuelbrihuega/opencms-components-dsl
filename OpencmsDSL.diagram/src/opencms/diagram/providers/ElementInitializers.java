/*
 * 
 */
package opencms.diagram.providers;

import opencms.diagram.part.OpencmsDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = OpencmsDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			OpencmsDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
