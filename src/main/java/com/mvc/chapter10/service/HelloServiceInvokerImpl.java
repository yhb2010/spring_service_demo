package com.mvc.chapter10.service;

import com.mvc.chapter10.domain.User;

public class HelloServiceInvokerImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User sayHello2(String name) {
		System.out.println("Invoker service Hello " + name);
		return new User(100, name, "12341234");
	}

}
