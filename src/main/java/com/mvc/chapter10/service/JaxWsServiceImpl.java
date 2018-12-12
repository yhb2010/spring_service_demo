package com.mvc.chapter10.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import org.springframework.stereotype.Service;
import com.mvc.chapter10.domain.User;

@WebService(serviceName = "jaxwebservice")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@Service
public class JaxWsServiceImpl implements JaxWsService {

	@Override
	public String sayHello(String name) {
		System.out.println("service Hello " + name);
		return "Hello " + name;
	}

	@Override
	public User sayHello2(String name) {
		System.out.println("JaxWs service Hello " + name);
		return new User(100, name, "12341234");
	}

}
