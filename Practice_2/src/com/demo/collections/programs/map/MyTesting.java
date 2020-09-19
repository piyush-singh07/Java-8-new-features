package com.demo.collections.programs.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyTesting {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(90, "Ninty");
		map.put(10, "Ten");
		map.put(50, "Fifty");
		map.put(20, "Twenty");
		map.put(70, "Seventy");
		
		//List<Map.Entry<Integer, String>> list= new ArrayList<Map.Entry<Integer,String>>(map.entrySet());
		
		/*
		 * Collections.sort(list, (e1, e2) -> e1.getValue().compareTo(e2.getValue()));
		 * LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
		 * 
		 * for (Map.Entry<Integer, String> e : list) { lmap.put(e.getKey(),
		 * e.getValue()); }
		 * 
		 * lmap.forEach((k, v) -> System.out.println(k + " " + v));
		 */
		 
		
		
		
		List<Map.Entry<Integer, String>> list1=	map
													.entrySet()
													.stream()
													.sorted((e1,e2)->e1.getKey().compareTo(e2.getKey()))
													.collect(Collectors.toList());
		
		
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();

		for (Map.Entry<Integer, String> e : list1) {
			lmap.put(e.getKey(), e.getValue());
		}

		lmap.forEach((k, v) -> System.out.println(k + " !!! " + v));
		
		
		
		
		
		
	}

}
