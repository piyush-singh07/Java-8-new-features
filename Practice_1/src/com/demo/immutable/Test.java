package com.demo.immutable;

public class Test {

	public static void main(String[] args) {

		String s1= new String("Hello");
		s1.concat("Hi");
		String s2= new String("Hello");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		s1=s2;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		
	}

}
