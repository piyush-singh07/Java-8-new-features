package com.demo.collections.programs.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 4.	WAP to sort a HashMap using custom defined objects as keys. 
 **/

public class Test5 {

	public static void main(String[] args) {

		HashMap<Student, Address> hmap= new HashMap<Student, Address>();
		hmap.put(new Student(4, "Ramesh"), new Address(103, "Hyderabad"));
		hmap.put(new Student(1, "Suresh"), new Address(102, "Bangalore"));
		hmap.put(new Student(3, "Ankit"), new Address(104, "Delhi"));
		hmap.put(new Student(2, "Sehaj"), new Address(101, "Mumbai"));
		
		ArrayList<Map.Entry<Student, Address>> list = new ArrayList<Map.Entry<Student,Address>>(hmap.entrySet());
		Collections.sort(list, (e1,e2)-> e1.getKey().compareTo(e2.getKey()) );
		System.out.println(list);
		
		System.out.println("============");
		
		Collections.sort(list, (e1,e2)-> e1.getValue().compareTo(e2.getValue()) );
		System.out.println(list);
		
	}

}
