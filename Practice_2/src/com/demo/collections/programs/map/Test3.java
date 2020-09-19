package com.demo.collections.programs.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * 2.	WAP to sort a HashMap without using TreeMap. 
 * 		By Using LinkedHashMap
 */

public class Test3 {

	public static void main(String[] args) {

		HashMap<Integer, String> unsorted = new HashMap<Integer, String>();
		unsorted.put(90, "Ninty");
		unsorted.put(10, "Ten");
		unsorted.put(50, "Fifty");
		unsorted.put(20, "Twenty");
		unsorted.put(70, "Seventy");

		HashMap<Integer, String> sortedMap = sortMyMap(unsorted);
		//System.out.println(sortedMap);
		sortedMap.forEach((key,value) -> System.out.println(key+" ---- "+value));

	}

	private static HashMap<Integer, String> sortMyMap(HashMap<Integer, String> unSortedMap) {
		HashMap<Integer, String> hmap = new LinkedHashMap<>();
		ArrayList<Integer> list = new ArrayList<>(unSortedMap.keySet());
		Collections.sort(list, (l1, l2) -> -l1.compareTo(l2));
		for (Integer i : list) {
			hmap.put(i, unSortedMap.get(i));
		}
		return hmap;

	}

}
