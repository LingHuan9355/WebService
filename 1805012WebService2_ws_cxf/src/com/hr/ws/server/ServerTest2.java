package com.hr.ws.server;

import javax.xml.ws.Endpoint;

import com.hr.ws.ws2.DataTypeWSImpl;

/**
 * ����Web Service
 * @Name  : ServerTest
 * @Author : LH
 * @Date : 2018��5��12�� ����6:47:20
 * @Version : V1.0
 * 
 * @Description :
 * 
 */
public class ServerTest2 {
        
	            public static void main(String[] args) {
					      
	            	   String address ="http://192.168.0.100:8888/180512WebService2_ws_cxf/datatypews";
				       Endpoint.publish(address, new DataTypeWSImpl());
				       System.out.println("����web service�ɹ�2");
	            }
}
