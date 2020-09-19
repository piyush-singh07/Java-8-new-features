package com.demo.collections.programs.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 2.	WAP to sort a HashMap without using TreeMap. 
 * 	By Using List
 */

public class Test2 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(90, "Ninty");
		map.put(10, "Ten");
		map.put(50, "Fifty");
		map.put(20, "Twenty");
		map.put(70, "Seventy");

		List<Map.Entry<Integer, String>> list = new ArrayList<Entry<Integer, String>>(map.entrySet());
		System.out.println(list);
		Collections.sort(list, (e1, e2) -> e1.getKey().compareTo(e2.getKey()));

		list.forEach(e -> System.out.println(e.getKey() + " ------ " + e.getValue()));
		
		
		

	}

}
