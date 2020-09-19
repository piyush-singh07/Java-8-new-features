package com.demo.primitive;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

public class IntPrimitiveDemo {

	public static void main(String[] args) {

		IntPredicate p = i-> i%2==0;
		int[] x= {0,5,10,15,20};
		
		for(int x1: x)
		{
			if(p.test(x1))
			System.out.println(x1);
		}
		BiFunction<Integer,Integer, Integer> bif= (i,j) ->  i*j;
		System.out.println(bif.apply(10, 20));
		
	}

}
