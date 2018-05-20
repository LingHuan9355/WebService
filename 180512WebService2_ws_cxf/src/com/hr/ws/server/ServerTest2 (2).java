package com.hr.ws.server;

import javax.xml.ws.Endpoint;

import com.hr.ws.ws2.DataTypeWSImpl;

/**
 * 发布Web Service
 * @Name  : ServerTest
 * @Author : LH
 * @Date : 2018年5月12日 下午6:47:20
 * @Version : V1.0
 * 
 * @Description :
 * 
 */
public class ServerTest2 {
        
	            public static void main(String[] args) {
					      
	            	   String address ="http://192.168.0.100:8888/180512WebService2_ws_cxf/datatypews";
				       Endpoint.publish(address, new DataTypeWSImpl());
				       System.out.println("发布web service成功2");
	            }
}
