package com.demo.streams.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test5 {

	public static void main(String[] args) {

		List<Integer> al = Arrays.asList(90, 67, 45, 65, 33);

		Integer i = al.stream().min((e1, e2) -> e1.compareTo(e2)).get();
		System.out.println(i);
		Integer i2 = al.stream().max((e1, e2) -> e1.compareTo(e2)).get();
		System.out.println(i2);

	//	Integer[] arr = al.stream().toArray(Integer[]::new);
		Optional<Integer> oo = Stream
									 .of(90, 67, 45, 65, 33,900)
									 .max(((e1, e2) -> e1.compareTo(e2)));
		System.out.println(oo.get());
	}

}
