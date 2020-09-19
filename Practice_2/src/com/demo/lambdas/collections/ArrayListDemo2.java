package com.demo.lambdas.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		List<String> al= Arrays.asList("Pinny","Binny","Chinny","Rinny","Vinny");
		System.out.println("Before Sorting : ");
		System.out.println(al);
		System.out.println("After Sorting : ");
		Collections.sort(al);
		System.out.println(al);
		System.out.println("After Customized sorting using compareTo Method : ");
		Collections.sort(al, (e1,e2)-> -e1.compareTo(e2));
		System.out.println(al);
	}

}
