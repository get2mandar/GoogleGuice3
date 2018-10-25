package com.example.guice.main;

import com.example.guice.module.HelloGuice3Module;
import com.example.guice.service.HelloGuice3Service;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 * @author MandarPandit
 */
public class HelloGuice3 {

	@Inject
	HelloGuice3Service helloService;

	public static void main(String[] args) {
		HelloGuice3 hello = new HelloGuice3();

		// Recommended to put this code in a separate reusable method
		Module guiceModule = new HelloGuice3Module();
		Injector injector = Guice.createInjector(guiceModule);
		injector.injectMembers(hello);

		// Testing the service
		hello.testHelloGuice3Service();
	}

	private void testHelloGuice3Service() {
		String testStr = helloService.helloGuice3("This is my First Google Guice Code");
		System.out.println(testStr);
	}
}
