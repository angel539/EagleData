/*
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadescription.ui.tests;

import com.google.inject.Injector;
import eagledata.core.dsl.datadescription.ui.internal.DatadescriptionActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class DataDescriptionDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DatadescriptionActivator.getInstance().getInjector("eagledata.core.dsl.datadescription.DataDescriptionDsl");
	}

}