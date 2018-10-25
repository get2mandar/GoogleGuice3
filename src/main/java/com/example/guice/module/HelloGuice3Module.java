package com.example.guice.module;

import com.example.guice.service.HelloGuice3Service;
import com.example.guice.service.HelloGuice3ServiceImpl;
import com.google.inject.AbstractModule;

/**
 * @author MandarPandit
 */
public class HelloGuice3Module extends AbstractModule {
	@Override
	protected void configure() {
		bind(HelloGuice3Service.class).to(HelloGuice3ServiceImpl.class);
	}
}