package com.hr.ws.ws2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.hr.ws.bean.Student;

/**
 *    Student类的业务操作
 * @Name  : DataTypeWSImpl
 * @Author : LH
 * @Date : 2018年5月14日 下午5:56:43
 * @Version : V1.0
 * 
 * @Description :
 */
@WebService
public class DataTypeWSImpl implements DataTypeWS {

			@Override
			public boolean addStudent(Student stu) {
		       System.out.println("server addStudent() " +  stu);
				return true;
			}
		
			@Override
			public Student getStudentById(int id) {
		       System.out.println("server getStudentById() " +id );
				return new Student(id, "Carl", 1000);
			}
		
			@Override
			public List<Student> getStudentsByPrice(float price) {
                System.out.println("server getStudentsByPrice() " + price);
                List<Student> list = new ArrayList<>();
                list.add(new Student(1, "Tom1", price+1));
                list.add(new Student(2, "Tom2", price+2));
                list.add(new Student(3, "Tom3", price+3));
                list.add(new Student(4, "Tom4", price+4));
                
				return list;
			}
		
			@Override
			public Map<Integer, Student> getAllStudentMap() {
                     System.out.println("server getAllStudentMap()");
                     Map<Integer,Student> map = new HashMap<>();
                     map.put(1, new Student(1, "Jack1", 1243));
                     map.put(3, new Student(3, "Jack3", 1234));
                     map.put(1, new Student(2, "Jack2", 1423));
                     
				return map;
			}

}
