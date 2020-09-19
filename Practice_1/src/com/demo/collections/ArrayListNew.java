package com.demo.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNew {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Sunny");
		al.add("Bunny");
		al.add("Rinne");
		al.add("Tinny");
		System.out.println("Before Sorting :" + al);
		Collections.sort(al);
		System.out.println("After Sorting :" + al);
		Collections.sort(al,(str1,str2)-> -str1.compareTo(str2));
		System.out.println("After Custom Sorting :" + al);
		

	}

}
