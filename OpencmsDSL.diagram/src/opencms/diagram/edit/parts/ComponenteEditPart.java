/*
 * 
 */
package opencms.diagram.edit.parts;

import opencms.diagram.edit.policies.ComponenteItemSemanticEditPolicy;
import opencms.diagram.edit.policies.OpenDiagramEditPolicy;
import opencms.diagram.part.OpencmsVisualIDRegistry;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ComponenteEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ComponenteEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ComponenteItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ComponenteFigure();
	}

	/**
	 * @generated
	 */
	public ComponenteFigure getPrimaryShape() {
		return (ComponenteFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComponenteNameEditPart) {
			((ComponenteNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureComponenteLabelFigure());
			return true;
		}
		if (childEditPart instanceof ComponenteComponenteElementoOcultoCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getComponenteElementoOcultoCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ComponenteComponenteElementoOcultoCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ComponenteComponenteElementoVisualCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getComponenteElementoVisualCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ComponenteComponenteElementoVisualCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ComponenteComponenteComponentePredeterminadoCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getComponenteComponentePredeterminadoCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ComponenteComponenteComponentePredeterminadoCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComponenteNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ComponenteComponenteElementoOcultoCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getComponenteElementoOcultoCompartmentFigure();
			pane.remove(((ComponenteComponenteElementoOcultoCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ComponenteComponenteElementoVisualCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getComponenteElementoVisualCompartmentFigure();
			pane.remove(((ComponenteComponenteElementoVisualCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ComponenteComponenteComponentePredeterminadoCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getComponenteComponentePredeterminadoCompartmentFigure();
			pane.remove(((ComponenteComponenteComponentePredeterminadoCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof ComponenteComponenteElementoOcultoCompartmentEditPart) {
			return getPrimaryShape()
					.getComponenteElementoOcultoCompartmentFigure();
		}
		if (editPart instanceof ComponenteComponenteElementoVisualCompartmentEditPart) {
			return getPrimaryShape()
					.getComponenteElementoVisualCompartmentFigure();
		}
		if (editPart instanceof ComponenteComponenteComponentePredeterminadoCompartmentEditPart) {
			return getPrimaryShape()
					.getComponenteComponentePredeterminadoCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(OpencmsVisualIDRegistry
				.getType(ComponenteNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class ComponenteFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureComponenteLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fComponenteElementoOcultoCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fComponenteElementoVisualCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fComponenteComponentePredeterminadoCompartmentFigure;

		/**
		 * @generated
		 */
		public ComponenteFigure() {
			this.setBackgroundColor(THIS_BACK);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureComponenteLabelFigure = new WrappingLabel();

			fFigureComponenteLabelFigure.setText("Componente");
			fFigureComponenteLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureComponenteLabelFigure);

			fComponenteElementoOcultoCompartmentFigure = new RectangleFigure();

			fComponenteElementoOcultoCompartmentFigure.setOutline(false);

			this.add(fComponenteElementoOcultoCompartmentFigure);

			fComponenteElementoVisualCompartmentFigure = new RectangleFigure();

			fComponenteElementoVisualCompartmentFigure.setOutline(false);

			this.add(fComponenteElementoVisualCompartmentFigure);

			fComponenteComponentePredeterminadoCompartmentFigure = new RectangleFigure();

			fComponenteComponentePredeterminadoCompartmentFigure
					.setOutline(false);

			this.add(fComponenteComponentePredeterminadoCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureComponenteLabelFigure() {
			return fFigureComponenteLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getComponenteElementoOcultoCompartmentFigure() {
			return fComponenteElementoOcultoCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getComponenteElementoVisualCompartmentFigure() {
			return fComponenteElementoVisualCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getComponenteComponentePredeterminadoCompartmentFigure() {
			return fComponenteComponentePredeterminadoCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 135, 35, 35);

}
