package com.demo.lambdas.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		List<Integer> al = Arrays.asList(90, 29, 45, 9, 66, 34);
		System.out.println("Before Sorting : ");
		System.out.println(al);
		System.out.println("After Sorting : ");
		Collections.sort(al);
		System.out.println(al);
		System.out.println("After Customized sorting using compareTo Method : ");
		Collections.sort(al, (e1,e2)-> -e1.compareTo(e2));
		System.out.println(al);
		System.out.println("After Customized sorting using lambda and unary operator");
		Collections.sort(al, (e1,e2)->(e1>e2)?-1:((e1<e2)?1:0));
		System.out.println(al);
	}

}
