package com.demo.biinterfaces;

import java.util.function.BiPredicate;

public class BiPredicateDemo1 {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> bi= (a,b)->(a+b)%2==0;
		System.out.println(bi.test(11, 20));
		System.out.println(bi.test(11, 13));
	}

}
