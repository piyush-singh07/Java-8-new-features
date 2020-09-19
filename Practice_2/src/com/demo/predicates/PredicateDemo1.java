package com.demo.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {

//		Predicate<Integer> p1= i->i>0;
//		System.out.println(p1.test(10));
//		
//		List<Integer> al= new ArrayList<Integer>();
//		Predicate<Collection<Integer>> p2= a->a.isEmpty();
//		System.out.println(p2.test(al));

		List<String> al1 = Arrays.asList("Kate", "Harry", "Kelvin", "Kaushik", "Peppy");
		Predicate<String> p3 = str -> str.charAt(0) == 'K';
		for (String string : al1) {
			if (p3.test(string)) {
				System.out.println(string);
			}
		}

	}
	


}
