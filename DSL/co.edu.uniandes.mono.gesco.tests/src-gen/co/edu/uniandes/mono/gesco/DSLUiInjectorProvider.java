/*
* generated by Xtext
*/
package co.edu.uniandes.mono.gesco;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class DSLUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return co.edu.uniandes.mono.gesco.ui.internal.DSLActivator.getInstance().getInjector("co.edu.uniandes.mono.gesco.DSL");
	}
	
}
