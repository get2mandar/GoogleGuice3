package blog.panditmandar.code.googleguice.module;

import com.google.inject.AbstractModule;

import blog.panditmandar.code.googleguice.service.HelloGuice3Service;
import blog.panditmandar.code.googleguice.service.HelloGuice3ServiceImpl;

/**
 * @author MandarPandit
 */
public class HelloGuice3Module extends AbstractModule {
	@Override
	protected void configure() {
		bind(HelloGuice3Service.class).to(HelloGuice3ServiceImpl.class);
	}
}