package com.hr.ws.server;

import javax.xml.ws.Endpoint;

import com.hr.ws.HelloWSImpl;

/**
 *  发布Web Service
 * @author LH
 *
 */
public class ServerTest {
        
	            public static void main(String[] args) {
					      
	            	    String address ="http://192.168.0.101:8989/180509WebService1_ws/hellows";
				       Endpoint.publish(address, new HelloWSImpl());
				       System.out.println("发布webservice成功");
	            }
}
