package com.hr.ws.interceptor;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;

/**
 * 查检用户的拦截器
 * @Name  : CheckUserInterceptor
 * @Author : LH
 * @Date : 2018年5月19日 下午8:01:31
 * @Version : V1.0
 * 
 * @Description :
 */
public class CheckUserInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

	       public CheckUserInterceptor() {
                    super(Phase.PRE_PROTOCOL);
                    System.out.println("CheckUserInterceptor()");
	       }
	       
	   	/*
	    	<Envelope>
	    		<head>
	    			<hr>
	    				<name>xfzhang</name>
	    				<password>123456</password>
	    			</hr>
	    			<hr2>
	    				<name>xfzhang</name>
	    				<password>123456</password>
	    			</hr2>
	    		<head>
	    		<Body>
	    			<sayHello>
	    				<arg0>Jack</arg0>
	    			<sayHello>
	    		</Body>
	    	</Envelope>
	    */  
	     @Override
	    public void handleMessage(SoapMessage message) throws Fault {
                      Header header = message.getHeader(new QName("hr"));
                      if(header != null) {
	                    	  Element hrEle = (Element) header.getObject();
	                    	  String name = hrEle.getElementsByTagName("name").item(0).getTextContent();
	                    	  String password = hrEle.getElementsByTagName("password").item(0).getTextContent();
	                    	  
	                    	  if("carlling".equals(name) && "admin1008".equals(password)) {
	                    		  System.out.println("Server 通过拦截器....");
	                    		  return;
	                    	  }
                      }    
                    //不能通过
                      System.out.println("Server 没有通过拦截器....");
                      throw new Fault(new RuntimeException("请求需要一个正确的用户名和密码"));
	     
	     }
}
