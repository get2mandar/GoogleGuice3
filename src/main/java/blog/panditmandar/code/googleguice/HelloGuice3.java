package blog.panditmandar.code.googleguice;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;

import blog.panditmandar.code.googleguice.module.HelloGuice3Module;
import blog.panditmandar.code.googleguice.service.HelloGuice3Service;

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
