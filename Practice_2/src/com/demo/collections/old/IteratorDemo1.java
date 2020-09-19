package com.demo.collections.old;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo1 {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<>();

		for (int i = 1; i <= 10; i++) {
			ll.add(i);
		}

		System.out.println(ll);

		Iterator<Integer> itr = ll.iterator();
		while (itr.hasNext()) {
			if (itr.next() % 2 == 0) {
				itr.remove();
			}
		}

		System.out.println(ll);

	}

}
