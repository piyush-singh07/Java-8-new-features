package com.demo.anonymous;

import com.demo.interfaces.Interf2;

public class Test2 {

	public static void main(String[] args) {
		Interf2 interf2= new Interf2() {
			
			@Override
			public void m1(int x, int y) {
				
				System.out.println("The sum is :"+ (x+y));
				
			}
		};
		
		interf2.m1(100, 200);
	}

}
