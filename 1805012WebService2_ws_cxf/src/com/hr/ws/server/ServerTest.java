package com.hr.ws.server;

import javax.xml.ws.Endpoint;

import com.hr.ws.ws.HelloWSImpl;

/**
 * 发布Web Service
 * @Name  : ServerTest
 * @Author : LH
 * @Date : 2018年5月12日 下午6:47:20
 * @Version : V1.0
 * 
 * @Description : 5.5.	使用CXF开发web service
 * 
 *    加入cxf的jar包即可，其它不需要改动
 */
public class ServerTest {
        
	            public static void main(String[] args) {
					      
	            	   String address ="http://192.168.0.100:8989/1805012WebService2_ws/hellows";
				       Endpoint.publish(address, new HelloWSImpl());
				       System.out.println("发布webservice成功");
	            }
}
