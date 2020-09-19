package com.demo.streams.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(49, 23, 90, 43, 12, 92, 34);
		list.stream().filter(i -> i / 1 == i).sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList())
				.forEach(i -> System.out.println(i));

	}

}
