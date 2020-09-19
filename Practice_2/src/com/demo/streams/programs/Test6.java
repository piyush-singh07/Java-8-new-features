package com.demo.streams.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test6 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(90, 78, 45, 23, 87, 56);

		Integer[] arr = list.stream().sorted().toArray(Integer[]::new);
		/*
		 * for (Integer integer : arr) { System.out.println(integer); }
		 */
		
		Stream.of(arr).forEach(System.out::println);
		
		
	}

}
