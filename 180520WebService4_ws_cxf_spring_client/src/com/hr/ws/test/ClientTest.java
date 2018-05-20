package com.hr.ws.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hr.ws.ws.Order;
import com.hr.ws.ws.OrderWS;

/**
 * 
 * @Name  : ClientTest
 * @Author : LH
 * @Date : 2018年5月20日 下午4:33:30
 * @Version : V1.0
 * 
 * @Description :
 */
public class ClientTest {
			
				public static void main(String[] args) {
					
					ClassPathXmlApplicationContext context	= 
							new ClassPathXmlApplicationContext(new String[]{"client-beans.xml"});
					OrderWS orderWS = (OrderWS) context.getBean("orderClient");
					Order order = orderWS.getOrderById(25);
					System.out.println(order);
				}
	
}
