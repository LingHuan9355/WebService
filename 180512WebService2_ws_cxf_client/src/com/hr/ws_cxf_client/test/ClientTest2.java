package com.hr.ws_cxf_client.test;

import java.util.List;

import com.hr.ws.ws2.DataTypeWS;
import com.hr.ws.ws2.DataTypeWSImplService;
import com.hr.ws.ws2.GetAllStudentMapResponse.Return;
import com.hr.ws.ws2.GetAllStudentMapResponse.Return.Entry;
import com.hr.ws.ws2.Student;

/**
 *   使用CXF开发调用web service 客户端
 * @Name  : ClientTest
 * @Author : LH
 * @Date : 2018年5月12日 下午7:27:19
 * @Version : V1.0
 * 
 * @Description :
 */
public class ClientTest2 {

			public static void main(String[] args) {
				DataTypeWSImplService factory = new DataTypeWSImplService();
		        DataTypeWS datatypeWS =factory.getDataTypeWSImplPort();
		        
		       boolean flag = datatypeWS.addStudent(new Student(5, "Cat", 1243));
		       //System.out.println("client " +flag);
		        
		      List<Student> list = datatypeWS.getStudentsByPrice(1243) ;
			    System.out.println(list);
			    
			    Return r = datatypeWS.getAllStudentMap();
			    List<Entry> entrys = r.getEntry();
			    for(Entry entry : entrys) {
			    	Integer id = entry.getKey();
			    	Student student = entry.getValue();
			    	System.out.println(id + "_" + student);
			    }
			
			}

}
