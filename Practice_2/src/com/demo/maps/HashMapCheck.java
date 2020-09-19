package com.demo.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCheck {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(10, "Hello");
		map.put(20, "Hi");
		map.put(30, "Bye");
		map.put(40, "Chow");
		map.put(50, "Namaste");
		System.out.println(map);

		System.out.println("SET OF KEYS");
		Set<Integer> keys = map.keySet();
		Iterator<Integer> itr1 = keys.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());

		}
		System.out.println("COLLECTION OF VALUES");
		Collection<String> coll = map.values();
		for (String s : coll) {
			System.out.println(s);
		}
		System.out.println("KEYS AND VALUES");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> itr2 = entrySet.iterator();
		while (itr2.hasNext()) {
			Map.Entry<Integer, String> m = itr2.next();
			System.out.println(m.getKey() + "---------" + m.getValue());

		}

	}

}
