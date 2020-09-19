package com.demo.streams.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {

		List<Integer> al = Arrays.asList(90, 20, 80, 6, 87, 45);

		/*
		 * al.forEach(e -> System.out.print(e + " ")); System.out.println();
		 * System.out.println("================="); Stream<Integer> s = al.stream();
		 * 
		 * s.sorted().forEach(e -> System.out.println(e)); s.close();
		 * System.out.println("================="); Stream<Integer> s1 = al.stream();
		 * 
		 * s1.sorted().map(i -> i * 2).collect(Collectors.toList()).forEach(e ->
		 * System.out.println(e));
		 */

		al.stream().sorted((e1, e2) -> e1 > e2 ? -1 : e1 < e2 ? 1 : 0).collect(Collectors.toList())
				.forEach(System.out::println);

	}

}
