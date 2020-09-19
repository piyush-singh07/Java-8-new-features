package com.demo.operators;

import java.util.function.IntUnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		
//		UnaryOperator<Integer> f= s->s*s;
//		System.out.println(f.apply(10));
//		
//		UnaryOperator<String> f1= s-> s+" Hello";
//		System.out.println(f1.apply("Sudha"));
		
		IntUnaryOperator f3= s->s*s*s;
		//System.out.println(f3.applyAsInt(10));
		
		IntUnaryOperator f4= s->s+s;
		//System.out.println(f4.applyAsInt(2));
		
		System.out.println(f3.andThen(f4).applyAsInt(10));
		System.out.println(f3.compose(f4).applyAsInt(10));
		
		
	}

}
