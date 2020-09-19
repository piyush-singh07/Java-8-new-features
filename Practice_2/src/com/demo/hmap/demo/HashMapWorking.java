package com.demo.hmap.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapWorking {

	public static void main(String[] args) {

		HashMap<Test, String> map = new HashMap<>();
		map.put(new Test(10), "A");
		map.put(new Test(11), "B");
		map.put(new Test(9), "C");
		map.put(new Test(7), "D");
		map.put(new Test(8), "E");
		map.put(new Test(12), "F");
		map.put(new Test(22), "G");
		System.out.println(map);
		System.out.println("==============================");

		for (Iterator<Entry<Test, String>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
			Entry<Test, String> e = iterator.next();
			System.out.println(e.getKey() + "    " + e.getValue());

		}
		// Using EntrySet
		System.out.println("==============================");
		for (Map.Entry<Test, String> entry : map.entrySet()) {

			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}
		// Using Iterator
		Iterator<Entry<Test, String>> iter1 = map.entrySet().iterator();
		while (iter1.hasNext()) {
			Entry<Test, String> e = iter1.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

		// Using KeySet
		System.out.println("=============AAAA=================");
		for (Test t1 : map.keySet()) {
			System.out.println(t1);
			System.out.println(map.get(t1));
		}

		// Using Streams
		System.out.println("==============Streams================");
		map.entrySet().stream().forEach(e -> {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		});

		// Using forEach Java 8
		System.out.println("============== ForEach Java 8================");
		map.forEach((k, v) -> {

			System.out.println(k);
			System.out.println(v);

		});

		List<Integer> l = Arrays.asList(10, 20, 90, 34, 67);
		l.stream().forEach(e -> System.out.println(e));

	}

}

class Test {

	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "[i=" + i + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (i != other.i)
			return false;
		return true;
	}

	public Test(int i) {
		super();
		this.i = i;
	}

	@Override
	public int hashCode() {
		return i;
	}

}
