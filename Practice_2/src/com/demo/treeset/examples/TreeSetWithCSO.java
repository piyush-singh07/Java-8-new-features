package com.demo.treeset.examples;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithCSO {

	public static void main(String[] args) {

		TreeSet<String> tstr = new TreeSet<>(new MyComparator1());
		tstr.add("Hello");
		tstr.add("Bye");
		tstr.add("Hi");
		tstr.add("Going");

		System.out.println(tstr);

		TreeSet<Integer> ti = new TreeSet<Integer>(new MyComparator2());
		ti.add(10);
		ti.add(20);
		ti.add(2);
		ti.add(90);

		System.out.println(ti);

	}

}

class MyComparator1 implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
}

class MyComparator2 implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return -o1.compareTo(o2);
	}
}
