package com.demo.predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo3 {

	public static void main(String[] args) {

		List<Integer> al = Arrays.asList(10, 87, 56, 98, 45, 23, 65);
		Predicate<Integer> p1 = i -> i > 50;
		Predicate<Integer> p2 = i -> i < 50;
		Predicate<Integer> p3 = i -> i % 2 == 0;
		Predicate<Integer> p4 = i -> i % 2 == 1;

		System.out.println("Number greater than 50 are :");
		System.out.println(m1(p1, al));
		System.out.println("Number less than 50 are :");
		System.out.println(m1(p2, al));
		System.out.println("Numbers that are even :");
		System.out.println(m1(p3, al));
		System.out.println("Numbers that are odd :");
		System.out.println(m1(p4, al));
		System.out.println("Numbers that are even and greater than 50 :");
		System.out.println(m1(p1.and(p3), al));
		System.out.println("Numbers that are even and less than 50 :");
		System.out.println(m1(p2.and(p3), al));
		System.out.println("Numbers that are not even using negate Function :");
		System.out.println(m1(p3.negate(), al));
		System.out.println("Numbers that are not odd using negate Function :");
		System.out.println(m1(p4.negate(), al));

	}

	private static ArrayList<Integer> m1(Predicate<Integer> p1, List<Integer> al) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (Integer integer : al) {
			if (p1.test(integer))
				l.add(integer);
		}

		return l;

	}

}
