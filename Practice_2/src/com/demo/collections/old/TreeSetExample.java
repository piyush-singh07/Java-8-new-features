package com.demo.collections.old;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(11);
		ts.add(9);
		System.out.println(ts);

		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.add("Rohit");
		ts1.add("Raaj");
		ts1.add("Ankit");
		ts1.add("Lokesnder");
		ts1.add("Rohit");

		System.out.println(ts1);

//		TreeSet<StringBuffer> ts3 = new TreeSet<>();
//		ts3.add(new StringBuffer("Hello"));
//		ts3.add(new StringBuffer("PLLL"));
		// System.out.println(ts3);

	}

}
