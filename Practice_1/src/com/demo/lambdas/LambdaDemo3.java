package com.demo.lambdas;

import com.demo.interfaces.Interf3;

public class LambdaDemo3 {

	public static void main(String[] args) {
		
		Interf3 interf3 = x -> x*x;
		
		System.out.println("The square of the given value is :" + interf3.getSquare(16f));

	}

}
