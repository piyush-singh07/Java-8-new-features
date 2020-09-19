package com.demo.collections.programs.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1.	WAP to sort a HashMap (Use TreeMap)
 */
public class Test1 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(90, "A");
		map.put(10, "B");
		map.put(50, "C");
		map.put(20, "D");
		map.put(70, "E");
		map.entrySet().forEach(e->System.out.println(e.getKey() + "-----"+e.getValue()));
		
		System.out.println("=========");
		/*
		 * System.out.println(map);
		 * 
		 * TreeMap<Integer, String> tmap = new TreeMap<>(map); System.out.println(tmap);
		 * 
		 * map.entrySet().stream() .sorted((i1,i2)-> i1.getKey().compareTo(i2.getKey())
		 * ) .forEach(s->System.out.println(s));
		 */
		
		
		Map<Integer, String> map1=map.entrySet()
									 .stream()
									 .sorted((e1,e2)->-e1.getKey().compareTo(e2.getKey()))
									 .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		map1.entrySet().forEach(e->System.out.println(e.getKey() + "-----"+e.getValue()));
		
	}

}
