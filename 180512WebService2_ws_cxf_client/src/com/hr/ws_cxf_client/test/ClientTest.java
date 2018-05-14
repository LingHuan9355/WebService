package com.hr.ws_cxf_client.test;

import com.hr.ws.ws.HelloWS;
import com.hr.ws.ws.HelloWSImplService;

/**
 *   使用CXF开发调用web service 客户端
 * @Name  : ClientTest
 * @Author : LH
 * @Date : 2018年5月12日 下午7:27:19
 * @Version : V1.0
 * 
 * @Description :
 */
public class ClientTest {

			public static void main(String[] args) {
				HelloWSImplService factory = new HelloWSImplService();
		        HelloWS helloWS =factory.getHelloWSImplPort();
		        String result = helloWS.sayHello("BIBli");
		        System.out.println("cxf_client " +result);
			}

}
