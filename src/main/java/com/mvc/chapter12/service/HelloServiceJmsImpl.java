package com.mvc.chapter12.service;

import org.springframework.stereotype.Service;

import com.mvc.chapter10.domain.User;

@Service
public class HelloServiceJmsImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User sayHello2(String name) {
		System.out.println("jms service Hello " + name);
		return new User(100, name, "11111");
	}

}
