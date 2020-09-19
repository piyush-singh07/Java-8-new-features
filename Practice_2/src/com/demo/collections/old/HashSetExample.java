package com.demo.collections.old;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<Object> hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add("A");
		hs.add(null);
		hs.add("Z");
		System.out.println(hs);
		System.out.println(hs.add("P"));
		System.out.println(hs);
		System.out.println(hs.add("P"));

	}

}
