package com.demo.primitive;

import java.util.function.ToIntFunction;

public class ToIntFunctionDemo {

	public static void main(String[] args) {

		ToIntFunction<Integer> f= s->s*s;
		System.out.println(f.applyAsInt(10));
		
		
		
	}

}
