package com.example.guice.service;

import com.google.inject.ImplementedBy;

/**
 * @author MandarPandit
 */
@ImplementedBy(HelloGuice3ServiceImpl.class)
public interface HelloGuice3Service {
	public String helloGuice3(String message);
}