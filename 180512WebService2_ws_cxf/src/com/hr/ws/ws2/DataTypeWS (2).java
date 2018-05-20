package com.hr.ws.ws2;

import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.hr.ws.bean.Student;

@WebService
public interface DataTypeWS {

	   @WebMethod
	   public boolean addStudent(Student stu);
	   
	   @WebMethod
	   public Student getStudentById(int id);

	   @WebMethod
       public List<Student> getStudentsByPrice(float price);

	   @WebMethod
       public Map<Integer,Student> getAllStudentMap();
}
