package com.demo.strings;

import java.lang.reflect.Method;

public class GetClassDemo {

	public static void main(String[] args) {

		String s = new String("Hello");
		Object o = (Object)s;
		
		System.out.println(o.getClass().getName());
		
		Method[] m= o.getClass().getDeclaredMethods();
		int count =0;
		for(Method m1 : m)
		{
			count++;
			System.out.println(m1);
		}
		
		System.out.println("Total number of methods :"+ count);
		
	}

}
