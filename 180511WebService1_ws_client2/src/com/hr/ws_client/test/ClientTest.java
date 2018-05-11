package com.hr.ws_client.test;

import com.hr.ws.HelloWSImpl;
import com.hr.ws.HelloWSImplService;

/**
 * µ÷ÓÃwebService
 * @author LH
 *
 */
public class ClientTest {

			public static void main(String[] args) {
				   HelloWSImplService factory = new HelloWSImplService();
				   HelloWSImpl helloWS = factory.getHelloWSImplPort();
				   System.out.println(helloWS.getClass());
				   
				   String result = helloWS.sayHello("Carl2");
				   System.out.println("client2 " +result);
			}
}
