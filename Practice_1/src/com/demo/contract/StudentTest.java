package com.demo.contract;

import java.util.HashMap;
import java.util.Map;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1= new Student(10,"Rohit");
		Student s2= new Student(10,"Rohit");
		Student s3= new Student(10,"Rohit");
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Map<Student, String> map= new HashMap<Student, String>();
		map.put(s1, "hello");
		map.put(s2, "bye");
		map.put(s3, "ok");
		
		System.out.println(map);
		System.out.println(map.size());
		
		
		
	}

}
