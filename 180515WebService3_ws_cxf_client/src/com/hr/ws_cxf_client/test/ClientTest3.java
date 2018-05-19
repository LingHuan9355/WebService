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
 *   测试自定义拦截器
 * @Name  : ClientTest
 * @Author : LH
 * @Date : 2018年5月12日 下午7:27:19
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
		        
		       //发送请求的客户端对象
		       Client client = ClientProxy.getClient(helloWS);
		      //客户端的日志出拦截器
		      List<Interceptor<? extends Message>> outInterceptors = client.getOutInterceptors();
		      outInterceptors.add(new AddUserInterceptor("carllh", "admin123"));
		      
		        String result = helloWS.sayHello("Jack");
		        System.out.println("cxf_client " +result);
			}

}
