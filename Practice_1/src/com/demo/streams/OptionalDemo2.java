package com.demo.streams;

import java.util.Optional;

public class OptionalDemo2 {

	public static void main(String[] args) {

		String arr[] = new String[10];
		
		arr[8]="Hello";
		arr[4]="ok";

		Optional<String> o1 = Optional.ofNullable(arr[4]);

		if (o1.isPresent())
			System.out.println(o1.get());
		else
			System.out.println("none is present");

		/*
		 * String p= arr[9].toLowerCase(); System.out.println(p);
		 */

	}

}
