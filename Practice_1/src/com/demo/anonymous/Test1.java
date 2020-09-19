package com.demo.anonymous;

import com.demo.interfaces.Interf1;

public class Test1 {

	public static void main(String[] args) {
		
		Interf1 interf1= new Interf1() {
			
			@Override
			public void m1() {
				System.out.println("Hello World!!!!");
				
			}
		};
		
		
		interf1.m1();
	}

}
