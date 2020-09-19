package com.demo.collections.programs.map;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * 4.	WAP to sort a HashMap using custom defined objects as keys using TreeMap
 **/

public class Test7 {

	public static void main(String[] args) {
		HashMap<Student, Address> hmap = new HashMap<Student, Address>();
		hmap.put(new Student(4, "Ramesh"), new Address(103, "Hyderabad"));
		hmap.put(new Student(1, "Suresh"), new Address(102, "Bangalore"));
		hmap.put(new Student(3, "Ankit"), new Address(104, "Delhi"));
		hmap.put(new Student(2, "Sehaj"), new Address(101, "Mumbai"));

		TreeMap<Student, Address> tmap = new TreeMap<>(hmap);
		//tmap.entrySet().forEach(e -> System.out.println(e.getKey() + "----" + e.getValue()));
		tmap.entrySet().forEach(System.out::println);

	}

}
