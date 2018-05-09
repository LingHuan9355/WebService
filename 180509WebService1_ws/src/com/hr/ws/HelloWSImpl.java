package com.hr.ws;

import javax.jws.WebService;

/**
 * SEIµÄÊµÏÖ
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
