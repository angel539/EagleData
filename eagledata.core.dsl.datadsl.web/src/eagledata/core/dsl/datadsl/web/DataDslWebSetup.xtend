/*
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadsl.web

import com.google.inject.Guice
import com.google.inject.Injector
import com.google.inject.Provider
import com.google.inject.util.Modules
import eagledata.core.dsl.datadsl.DataDslRuntimeModule
import eagledata.core.dsl.datadsl.DataDslStandaloneSetup
import java.util.concurrent.ExecutorService
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

/**
 * Initialization support for running Xtext languages in web applications.
 */
@FinalFieldsConstructor
class DataDslWebSetup extends DataDslStandaloneSetup {
	
	val Provider<ExecutorService> executorServiceProvider;
	
	override Injector createInjector() {
		val runtimeModule = new DataDslRuntimeModule()
		val webModule = new DataDslWebModule(executorServiceProvider)
		return Guice.createInjector(Modules.override(runtimeModule).with(webModule))
	}
	
}
