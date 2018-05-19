package com.hr.ws_cxf_client.test;

import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;

import com.hr.ws.ws.HelloWS;
import com.hr.ws.ws.HelloWSImplService;
import com.hr.ws_cxf_client.test.interceptor.AddUserInterceptor;

/**
 *   �����Զ���������
 * @Name  : ClientTest
 * @Author : LH
 * @Date : 2018��5��12�� ����7:27:19
 * @Version : V1.0
 * 
 * @Description :
 */
public class ClientTest3 {

			/**
			 * @param args
			 */
			public static void main(String[] args) {
				HelloWSImplService factory = new HelloWSImplService();
		        HelloWS helloWS =factory.getHelloWSImplPort();
		        
		       //��������Ŀͻ��˶���
		       Client client = ClientProxy.getClient(helloWS);
		      //�ͻ��˵���־��������
		      List<Interceptor<? extends Message>> outInterceptors = client.getOutInterceptors();
		      outInterceptors.add(new AddUserInterceptor("carllh", "admin123"));
		      
		        String result = helloWS.sayHello("Jack");
		        System.out.println("cxf_client " +result);
			}

}
