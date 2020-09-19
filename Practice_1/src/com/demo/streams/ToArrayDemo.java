package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ToArrayDemo {

	public static void main(String[] args) {
		
		/*
		 * List<Integer> l= Arrays.asList(10,8,6,90,34); System.out.println(l); //here
		 * arr is the reference to the newly created array to which we are copying the
		 * elements
		 * 
		 * Object[] arr= l.stream().toArray(); for(Object a:arr) {
		 * System.out.println(a); }
		 */
		
		
		List<String> li=Arrays.asList("Neeta","Meeta","Geeta","Sunita");
		Stream<String> s= li.stream();
		String[] ar= s.toArray(String[]::new);
		for (String f: ar) {
			System.out.println(f);
			
		}
		

	}

}
