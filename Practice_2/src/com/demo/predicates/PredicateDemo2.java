package com.demo.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {

		List<Integer> l= Arrays.asList(10,20,2,90,200,43);
		Predicate<Integer> p1=p->p>50;
		Predicate<Integer> p2= p->p%2==0;
		
		
		
		
	}

}
