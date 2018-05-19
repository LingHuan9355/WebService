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
		      outInterceptors.add(new LoggingOutInterceptor());
		      
		      //�ͻ��˵���־��������
		      List<Interceptor<? extends Message>> inInterceptors = client.getInInterceptors();
		      inInterceptors.add(new LoggingInInterceptor());
		        
		        String result = helloWS.sayHello("BIBli");
		        System.out.println("cxf_client " +result);
			}

}