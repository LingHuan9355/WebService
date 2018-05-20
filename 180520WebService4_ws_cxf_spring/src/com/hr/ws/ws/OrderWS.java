package com.hr.ws.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.hr.ws.bean.Order;
/**
 * SEI(Service Enpoint Interface)
 * @Name  : OrderWS
 * @Author : LH
 * @Date : 2018��5��20�� ����3:08:36
 * @Version : V1.0
 * 
 * @Description :
 */
@WebService
public interface OrderWS {

			@WebMethod
	   		public Order getOrderById(int id);
}
