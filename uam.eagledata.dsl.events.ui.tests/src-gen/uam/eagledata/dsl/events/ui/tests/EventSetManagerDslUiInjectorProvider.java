/*
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.events.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import uam.eagledata.dsl.events.ui.internal.EventsActivator;

public class EventSetManagerDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return EventsActivator.getInstance().getInjector("uam.eagledata.dsl.events.EventSetManagerDsl");
	}

}