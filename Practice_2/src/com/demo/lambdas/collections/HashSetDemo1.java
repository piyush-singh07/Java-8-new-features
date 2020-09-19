package com.demo.lambdas.collections;

import java.util.TreeSet;

public class HashSetDemo1 {

	public static void main(String[] args) {

		TreeSet<Integer> hs = new TreeSet<>();
		hs.add(30);
		hs.add(90);
		hs.add(67);
		hs.add(34);
		hs.add(87);
		System.out.println("TreeSet  :");
		System.out.println(hs);
		System.out.println("TreeSet after Customized Sorting  :");
		TreeSet<Integer> hs1 = new TreeSet<>((e1, e2) -> -e1.compareTo(e2));
		hs1.add(30);
		hs1.add(90);
		hs1.add(67);
		hs1.add(34);
		hs1.add(87);
		System.out.println(hs1);
	}

}
