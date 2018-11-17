package blog.panditmandar.code.googleguice.service;

/**
 * @author MandarPandit
 */
public class HelloGuice3ServiceImpl implements HelloGuice3Service {
	@Override
	public String helloGuice3(String message) {
		return "Hello Guice 3, " + message;
	}
}