/**
 */
package ecarules.provider;

import ecarules.util.EcarulesAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EcarulesItemProviderAdapterFactory extends EcarulesAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcarulesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ecarules.EventSetManager} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventSetManagerItemProvider eventSetManagerItemProvider;

	/**
	 * This creates an adapter for a {@link ecarules.EventSetManager}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventSetManagerAdapter() {
		if (eventSetManagerItemProvider == null) {
			eventSetManagerItemProvider = new EventSetManagerItemProvider(this);
		}

		return eventSetManagerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ecarules.PatternEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternEventItemProvider patternEventItemProvider;

	/**
	 * This creates an adapter for a {@link ecarules.PatternEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPatternEventAdapter() {
		if (patternEventItemProvider == null) {
			patternEventItemProvider = new PatternEventItemProvider(this);
		}

		return patternEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ecarules.KeyConcept} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyConceptItemProvider keyConceptItemProvider;

	/**
	 * This creates an adapter for a {@link ecarules.KeyConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKeyConceptAdapter() {
		if (keyConceptItemProvider == null) {
			keyConceptItemProvider = new KeyConceptItemProvider(this);
		}

		return keyConceptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ecarules.RegexConcept} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegexConceptItemProvider regexConceptItemProvider;

	/**
	 * This creates an adapter for a {@link ecarules.RegexConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegexConceptAdapter() {
		if (regexConceptItemProvider == null) {
			regexConceptItemProvider = new RegexConceptItemProvider(this);
		}

		return regexConceptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ecarules.DataConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataConnectionItemProvider dataConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link ecarules.DataConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataConnectionAdapter() {
		if (dataConnectionItemProvider == null) {
			dataConnectionItemProvider = new DataConnectionItemProvider(this);
		}

		return dataConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ecarules.BinaryExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryExpressionItemProvider binaryExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link ecarules.BinaryExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryExpressionAdapter() {
		if (binaryExpressionItemProvider == null) {
			binaryExpressionItemProvider = new BinaryExpressionItemProvider(this);
		}

		return binaryExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ecarules.BooleanExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanExpressionItemProvider booleanExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link ecarules.BooleanExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanExpressionAdapter() {
		if (booleanExpressionItemProvider == null) {
			booleanExpressionItemProvider = new BooleanExpressionItemProvider(this);
		}

		return booleanExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ecarules.Literal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralItemProvider literalItemProvider;

	/**
	 * This creates an adapter for a {@link ecarules.Literal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLiteralAdapter() {
		if (literalItemProvider == null) {
			literalItemProvider = new LiteralItemProvider(this);
		}

		return literalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ecarules.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link ecarules.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (eventSetManagerItemProvider != null) eventSetManagerItemProvider.dispose();
		if (patternEventItemProvider != null) patternEventItemProvider.dispose();
		if (keyConceptItemProvider != null) keyConceptItemProvider.dispose();
		if (regexConceptItemProvider != null) regexConceptItemProvider.dispose();
		if (dataConnectionItemProvider != null) dataConnectionItemProvider.dispose();
		if (binaryExpressionItemProvider != null) binaryExpressionItemProvider.dispose();
		if (booleanExpressionItemProvider != null) booleanExpressionItemProvider.dispose();
		if (literalItemProvider != null) literalItemProvider.dispose();
		if (actionItemProvider != null) actionItemProvider.dispose();
	}

}
