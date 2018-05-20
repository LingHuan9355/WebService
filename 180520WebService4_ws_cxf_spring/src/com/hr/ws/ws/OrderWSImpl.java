package com.hr.ws.ws;

import javax.jws.WebService;

import com.hr.ws.bean.Order;

/**
 * SEI(Service Enpoint Interface)的实现
 * @Name  : OrderWSImpl
 * @Author : LH
 * @Date : 2018年5月20日 下午3:07:14
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
			return new Order(id, "灰机", 10000000);
	}

}
