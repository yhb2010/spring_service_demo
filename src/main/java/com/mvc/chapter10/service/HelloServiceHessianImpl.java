package com.mvc.chapter10.service;

import com.mvc.chapter10.domain.User;

public class HelloServiceHessianImpl implements HelloService {
	
	@Override
	public String sayHello(String name) {
		System.out.println("Hessian service Hello " + name);
		return "Hello " + name;
	}

	@Override
	public User sayHello2(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
