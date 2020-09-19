package com.demo.collections.programs.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 5. WAP to sort a HM using streams and sort by key. 
 * 6. WAP to sort a HM using streams and sort by values.
 */

public class Test6 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(90, "Ninty");
		map.put(40, "Forty");
		map.put(100, "Hundred");
		map.put(190, "One Ninty");
		map.put(23, "Twenty Three");
		System.out.println("Display entries with streams");
		map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " ---- " + e.getValue()));
		System.out.println("----Sorted map with streams based on keys--------");
		map.entrySet().stream().sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
				.forEach(e -> System.out.println(e.getKey() + " ---- " + e.getValue()));
		System.out.println("----Sorted map with streams based on values--------");
		map.entrySet().stream().sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
				.forEach(e -> System.out.println(e.getKey() + " ---- " + e.getValue()));
		System.out.println("----Sorted map with streams based on keys using builtin method--------");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(e -> System.out.println(e.getKey() + " ---- " + e.getValue()));
		System.out.println("----Sorted map with streams based on values using builtin method--------");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEach(e -> System.out.println(e.getKey() + " ---- " + e.getValue()));

	}
}
