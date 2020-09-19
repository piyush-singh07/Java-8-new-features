package com.demo.collections.old;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo1 {

	public static void main(String[] args) {

		Vector<Integer> v= new Vector<>();
		for (int i = 1; i <=10; i++) {
			v.addElement(i);
		}
		
		System.out.println(v);
		
		
		Enumeration<Integer>  e= v.elements();
		
		while (e.hasMoreElements()) {
			Integer integer = (Integer) e.nextElement();
			System.out.println(integer);
			
		}
		
		
	}

}
