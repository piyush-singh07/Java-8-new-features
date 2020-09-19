package com.demo.lambdas;

import com.demo.interfaces.Interf1;

public class LambdaDemo1 {

	public static void main(String[] args) {
		
		Interf1 interf1=()->System.out.println("Hello World from Lambda !!!");
		
		interf1.m1();

	}

}
