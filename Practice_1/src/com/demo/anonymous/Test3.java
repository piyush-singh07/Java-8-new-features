package com.demo.anonymous;

import com.demo.interfaces.Interf3;

public class Test3 {

	public static void main(String[] args) {
		
		Interf3 interf3= new Interf3() {
			
			@Override
			public Float getSquare(Float x) {
				return x*x;
			}
		};
		
		
		System.out.println("The square of given value is :"+ interf3.getSquare(2.3f));

	}

}
