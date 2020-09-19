package com.demo.lambdas;

import java.util.function.Consumer;

public class LambdaDemo2 {

	public static void main(String[] args) {
		
//		Interf2 interf2 = (x,y)-> System.out.println("The sum of given values is : " + (x+y));
//		interf2.m1(1000, 100);
		
		
		Consumer<String> ok= System.out::println;
		ok.accept("Durga");

	}

}
