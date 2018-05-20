package com.hr.ws.interceptor;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;

/**
 * ����û���������
 * @Name  : CheckUserInterceptor
 * @Author : LH
 * @Date : 2018��5��19�� ����8:01:31
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
	                    		  System.out.println("Server ͨ��������....");
	                    		  return;
	                    	  }
                      }    
                    //����ͨ��
                      System.out.println("Server û��ͨ��������....");
                      throw new Fault(new RuntimeException("������Ҫһ����ȷ���û���������"));
	     
	     }
}
