package com.demo.collections.old;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo1 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 1; i < 11; i++) {
			al.add(i);
		}

		ListIterator<Integer> itr = al.listIterator(10);

		
		while (itr.hasNext()) {
			if (itr.next() % 5 == 0) {
				itr.remove();
			}
		}
		
		System.out.println(al);
		 

		while (itr.hasPrevious()) {
			if (itr.previous() == 7) {
				itr.remove();
			}
			System.out.println(itr.previous());
		}

		System.out.println(al);

	}

}
