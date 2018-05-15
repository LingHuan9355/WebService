package com.hr.ws.server;

import java.util.List;

import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws22.EndpointImpl;
import org.apache.cxf.message.Message;

import com.hr.ws.ws.HelloWSImpl;

/**
 * ����Web Service
 * @Name  : ServerTest3
 * @Author : LH
 * @Date : 2018��5��15�� ����11:45:31
 * @Version : V1.0
 * 
 * @Description :
 */
public class ServerTest3 {
        
	            public static void main(String[] args) {
					      
	            	   String address ="http://192.168.0.100:8888/180515WebService3_ws_cxf/datatypews";
				       Endpoint endpoint  =  Endpoint.publish(address, new HelloWSImpl());
				       System.out.println(endpoint);
				       
				       EndpointImpl endpointImpl = (EndpointImpl) endpoint;
				       
				       	//����˵���־��������
				        List<Interceptor<? extends Message>> inInterceptors = endpointImpl.getInInterceptors();	
				        inInterceptors.add(new LoggingInInterceptor());
				        
				      //����˵���־��������
				        List<Interceptor<? extends Message>> outInterceptors = endpointImpl.getOutInterceptors();
				        outInterceptors.add(new LoggingOutInterceptor());
				        
				       System.out.println("����web service�ɹ�3");
	            }
}
