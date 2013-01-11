/*
 * 
 */
package opencms.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import opencms.diagram.edit.parts.AudioEditPart;
import opencms.diagram.edit.parts.BanerEditPart;
import opencms.diagram.edit.parts.BarraDesplegableEditPart;
import opencms.diagram.edit.parts.BotonEditPart;
import opencms.diagram.edit.parts.BotonSeleccionEditPart;
import opencms.diagram.edit.parts.ComponenteComponenteComponentePredeterminadoCompartmentEditPart;
import opencms.diagram.edit.parts.ComponenteComponenteElementoOcultoCompartmentEditPart;
import opencms.diagram.edit.parts.ComponenteComponenteElementoVisualCompartmentEditPart;
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
import opencms.diagram.part.OpencmsVisualIDRegistry;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class OpencmsNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public OpencmsNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<OpencmsNavigatorItem> result = new ArrayList<OpencmsNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, DiagramaEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof OpencmsNavigatorGroup) {
			OpencmsNavigatorGroup group = (OpencmsNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof OpencmsNavigatorItem) {
			OpencmsNavigatorItem navigatorItem = (OpencmsNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (OpencmsVisualIDRegistry.getVisualID(view)) {

		case DiagramaEditPart.VISUAL_ID: {
			LinkedList<OpencmsAbstractNavigatorItem> result = new LinkedList<OpencmsAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ComponenteEditPart.VISUAL_ID: {
			LinkedList<OpencmsAbstractNavigatorItem> result = new LinkedList<OpencmsAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteElementoOcultoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry.getType(UrlEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteElementoOcultoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry
							.getType(SelectorArchivosEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteElementoOcultoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry.getType(TagEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteElementoOcultoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry
							.getType(IdentificadorInternoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry.getType(FechaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry
							.getType(EntradillaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry
							.getType(BotonSeleccionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry.getType(EnlaceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry.getType(VideoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry.getType(TextoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry.getType(BotonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry.getType(TituloEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry.getType(EtiquetaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry.getType(AudioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry
							.getType(SubtituloEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry
							.getType(EntradaTextoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteElementoVisualCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry.getType(ImagenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteComponentePredeterminadoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry.getType(BanerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteComponentePredeterminadoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry
							.getType(IconoRedSocialEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteComponentePredeterminadoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry
							.getType(MenuDesplegableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteComponentePredeterminadoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry
							.getType(BarraDesplegableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OpencmsVisualIDRegistry
							.getType(ComponenteComponenteComponentePredeterminadoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OpencmsVisualIDRegistry.getType(SliderEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DiagramaEditPart.MODEL_ID.equals(OpencmsVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<OpencmsNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<OpencmsNavigatorItem> result = new ArrayList<OpencmsNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new OpencmsNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<OpencmsNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof OpencmsAbstractNavigatorItem) {
			OpencmsAbstractNavigatorItem abstractNavigatorItem = (OpencmsAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
