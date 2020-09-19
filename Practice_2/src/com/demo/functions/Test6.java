package com.demo.functions;

import java.util.function.Consumer;
import java.util.function.Function;

public class Test6 {

	public static void main(String[] args) {

		Function<Integer, Integer> f1 = i -> i * i;
		Function<Integer, Integer> f2 = i -> i + i;

	//	System.out.println(f1.apply(10));
		/*
		 * System.out.println(f2.apply(10));
		 * System.out.println(f1.andThen(f2).apply(10));
		 * System.out.println(f1.compose(f2).apply(10));
		 * System.out.println(Function.identity());
		 */
		
		
		
		Consumer<Integer> c= i->System.out.println(i);
		c.accept(f1.apply(10));
		c.accept(f2.apply(10));
	}

}
