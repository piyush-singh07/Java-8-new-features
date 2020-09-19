package com.demo.functions;

import java.util.function.Function;

public class Test5 {

	public static void main(String[] args) {

		Function<String, String> f1= s->s.toUpperCase();
		Function<String , String> f2= s->s.substring(0,7);
		
		System.out.println("For 1st function :");
		System.out.println(f1.apply("HelloSirHowareyou"));
		System.out.println("For 2nd function :");
		System.out.println(f2.apply("HelloSirHowareyou"));
		System.out.println("andthen function :");
		System.out.println(f1.andThen(f2).apply("HelloSirHowareyou"));
		System.out.println("andthen function :");
		System.out.println(f2.andThen(f1).apply("HelloSirHowareyou"));
		
		
	}

}
