package com.hr.ws.server;

import javax.xml.ws.Endpoint;

import com.hr.ws.ws.HelloWSImpl;

/**
 * ����Web Service
 * @Name  : ServerTest
 * @Author : LH
 * @Date : 2018��5��12�� ����6:47:20
 * @Version : V1.0
 * 
 * @Description : 5.5.	ʹ��CXF����web service
 * 
 *    ����cxf��jar�����ɣ���������Ҫ�Ķ�
 */
public class ServerTest {
        
	            public static void main(String[] args) {
					      
	            	   String address ="http://192.168.0.100:8989/1805012WebService2_ws/hellows";
				       Endpoint.publish(address, new HelloWSImpl());
				       System.out.println("����webservice�ɹ�");
	            }
}
