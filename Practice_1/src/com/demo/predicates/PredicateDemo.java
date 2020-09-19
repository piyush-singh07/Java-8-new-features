package com.demo.predicates;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<String> p =I -> I.length()>=5;
		System.out.println(p.test("Helloji"));
		System.out.println(p.test("Hello"));
		System.out.println(p.test("ok"));
	}

}
