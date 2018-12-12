package com.mvc.chapter10.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import com.mvc.chapter10.domain.User;

@WebService
public interface JaxWsService {

	@WebMethod
	String sayHello(String name);

	@WebMethod
	User sayHello2(String name);

}
