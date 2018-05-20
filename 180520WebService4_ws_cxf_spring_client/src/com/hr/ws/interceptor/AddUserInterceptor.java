package com.hr.ws.interceptor;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.xml.utils.DOMHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * –	客户端的out拦截器
 * @Name  : AddUserInterceptor
 * @Author : LH
 * @Date : 2018年5月19日 下午7:09:12
 * @Version : V1.0
 * 
 * @Description :
 */
public class AddUserInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

	       
	         private String name;
	         private String password;
	
			public AddUserInterceptor(String name,String password) {
				//准备协议化时拦截
				super(Phase.PRE_PROTOCOL);
				this.name = name;
				this.password = password;
				System.out.println("AddUserInterceptor()....");
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
		 				<arg0>BOB</arg0>
		 			<sayHello>
		 		</Body>
		 	</Envelope>
		 */
			
			@SuppressWarnings("deprecation")
			@Override
			public void handleMessage(SoapMessage msg) throws Fault {
				 	  List<Header> headers = msg.getHeaders();
				 	  /*
				 		 <atguigu>
				 			<name>xfzhang</name>
				 				<password>123456</password>
				 			</atguigu>
				 	 */
				 	Document document = DOMHelper.createDocument();
				 	Element rootEle = document.createElement("hr");
				 	Element nameEle = document.createElement("name");
				 	nameEle.setTextContent(name);
				 	rootEle.appendChild(nameEle);

				 	Element passwordELe = document.createElement("password");
				 	passwordELe.setTextContent(password);
				 	rootEle.appendChild(passwordELe);			 	
				 	
				  headers.add(new Header(new QName("hr"), rootEle));
				  System.out.println("client handleMessage()....");				 	  
			}
}
