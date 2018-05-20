package com.hr.ws.ws;

import javax.jws.WebService;

import com.hr.ws.bean.Order;

/**
 * SEI(Service Enpoint Interface)��ʵ��
 * @Name  : OrderWSImpl
 * @Author : LH
 * @Date : 2018��5��20�� ����3:07:14
 * @Version : V1.0
 * 
 * @Description :
 */
@WebService
public class OrderWSImpl implements OrderWS {

	     public OrderWSImpl() {
	    	 System.out.println("OrderWSImpl()");
		}
	
		@Override
		public Order getOrderById(int id) {
		    System.out.println("server getOrderById() " + id);
			return new Order(id, "�һ�", 10000000);
	}

}
