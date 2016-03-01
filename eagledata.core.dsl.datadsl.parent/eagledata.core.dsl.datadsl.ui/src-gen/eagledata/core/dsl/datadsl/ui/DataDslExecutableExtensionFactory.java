/*
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadsl.ui;

import com.google.inject.Injector;
import eagledata.core.dsl.datadsl.ui.internal.DatadslActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DataDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DatadslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DatadslActivator.getInstance().getInjector(DatadslActivator.EAGLEDATA_CORE_DSL_DATADSL_DATADSL);
	}
	
}
