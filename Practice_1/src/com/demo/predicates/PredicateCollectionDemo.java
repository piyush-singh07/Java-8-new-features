package com.demo.predicates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateCollectionDemo {

	public static void main(String[] args) {
		ArrayList<Character> al= new ArrayList<Character>();
		al.add('c');
		ArrayList<String> al2 = new ArrayList<String> ();
		Predicate<Collection> p= c->c.isEmpty();
		System.out.println(p.test(al));
		System.out.println(p.test(al2));

	}

}
