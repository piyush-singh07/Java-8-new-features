package com.demo.functions;

import java.util.function.Function;

public class FunctionDemo1 {

	public static void main(String[] args) {

		Function<String, Integer> f= s->s.length();
		
		System.out.println(f.apply("durga"));
		System.out.println(f.apply("Durgasoft"));
		
		
		Function<Integer, Integer> f2= i->i*i;
		System.out.println(f2.apply(10));
		System.out.println(f2.apply(5));
		}

}
