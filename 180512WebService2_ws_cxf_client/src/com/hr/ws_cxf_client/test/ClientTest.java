package com.hr.ws_cxf_client.test;

import com.hr.ws.ws.HelloWS;
import com.hr.ws.ws.HelloWSImplService;

/**
 *   ʹ��CXF��������web service �ͻ���
 * @Name  : ClientTest
 * @Author : LH
 * @Date : 2018��5��12�� ����7:27:19
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
