package com.hr.ws;

import javax.jws.WebService;

/**
 * SEI��ʵ��
 * @author LH
 *
 */
@WebService
public class HelloWSImpl implements HelloWS {

	@Override
	public String sayHello(String name) {
		System.out.println("server sayHello()" + name);
		return "Hello " + name;
	}

}
