package com.demo.contract;

public class StringTest {

	public static void main(String[] args) {

		/*
		 * String s1= new String("Hello"); String s2 = s1.intern(); String s3= "Hello";
		 * 
		 * System.out.println(s2); System.out.println(s1==s2);
		 * System.out.println(s3==s2);
		 */
		
		
		StringBuffer sb = new StringBuffer("oK Ji");
		System.out.println(sb.hashCode());
		sb.append("oooookljllljln ndndnnnd");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		
		
	}

}
