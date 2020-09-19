package com.demo.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInteger {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(0);
		al.add(13);
		al.add(99);
		al.add(87);
		System.out.println("Before Sorting :" + al);
		Collections.sort(al);
		System.out.println("After Sorting :" + al);
		Collections.sort(al, (i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
		System.out.println("After Custom Sorting :" + al);
	}

}
