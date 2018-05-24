package com.hr.ws.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @Name  : HttpURLConnectionServlet
 * @Author : LH
 * @Date : 2018年5月24日 下午4:52:48
 * @Version : V1.0
 * 
 * @Description :  使用HttpURLConnection发送webservice请求
 */
public class HttpURLConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	          String name = request.getParameter("name");
	          System.out.println("doPost " + name);
	
	          String data = "<soap:Envelope xmlns:soap='http://schemas.xmlsoap.org/soap/envelope/'><soap:Body><ns2:sayHello xmlns:ns2='http://ws.ws.hr.com/'><arg0>" + name + "</arg0></ns2:sayHello></soap:Body></soap:Envelope>";
	          URL  url = new  URL("http://192.168.0.101:8888/180515WebService3_ws_cxf/datatypews"); 
	          
	          HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	          connection.setRequestMethod("POST");
	          connection.setDoOutput(true);
	          connection.setDoInput(true);
	          connection.setRequestProperty("Content-Type", "text/xml;charset=utf-8");
	          
	          OutputStream os = connection.getOutputStream();
	          os.write(data.getBytes("utf-8"));
	          
	          int responseCode = connection.getResponseCode();
	          if(responseCode == 200) {
	        	  InputStream is = connection.getInputStream(); //String xml
	        	  System.out.println("return " + is.available());
	        	  
	        	  response.setContentType("text/xml;charset=utf-8");
	        	  ServletOutputStream outputStream = response.getOutputStream();
	        	  
	        	  byte [] buffer = new byte[1024];
	        	  int len = 0;
	        	  while((len = is.read(buffer))>0) {
	        		  outputStream.write(buffer,0,len);
	        	  }
	        	  outputStream.flush();
	          }
	          
	}

}
