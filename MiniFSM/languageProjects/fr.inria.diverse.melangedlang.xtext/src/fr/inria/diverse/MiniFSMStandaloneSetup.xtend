/*
 * generated by Xtext 2.9.2
 */
package fr.inria.diverse


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MiniFSMStandaloneSetup extends MiniFSMStandaloneSetupGenerated {

	def static void doSetup() {
		new MiniFSMStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
