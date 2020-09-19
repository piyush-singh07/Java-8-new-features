package com.demo.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMethodsCheck {
	static Map<Integer, String> map;

	public static void main(String[] args) {

		System.out.println(map == null);
		map = new HashMap<Integer, String>();
		System.out.println(map.size());
		System.out.println(map == null);
		System.out.println(map.put(101, "Hi"));
		System.out.println(map.put(102, "Bye"));
		System.out.println(map.put(101, "Hello"));
		System.out.println(map.put(103, "Ok"));
		System.out.println(map.put(null, "Null"));
		System.out.println(map.put(null, "not null"));
		System.out.println(map);

		Set<Integer> s = map.keySet();
		System.out.println(s);

		Collection<String> coll = map.values();
		System.out.println(coll);

		Set<Entry<Integer, String>> set = map.entrySet();
		System.out.println("========================");
		for (Map.Entry<Integer, String> etr : set) {
			System.out.println(etr.getKey());
			System.out.println(etr.getValue());

		}
		System.out.println("========================");

		map.clear();

		System.out.println(map.isEmpty());

		System.out.println(map.size());

	}

}
