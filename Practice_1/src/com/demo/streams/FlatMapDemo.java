package com.demo.streams;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Jack is a good boy", "Jones is a bad boy", "I am happy",
				"Jack and Jones are happy boy", "I Jack and Jones are bad boys");
		// names.stream().map(String::length).forEach(System.out::println);
		
		//names.stream().map(s->s.split("\\s")).forEach(System.out::println);
		
		System.out.println("==================");
		  names.stream().map(s -> s.split("\\s")).flatMap(Arrays::stream).distinct().forEach(System.out::println);
		System.out.println("==================");
		names.stream().flatMap(s -> {
			String[] x = s.split(" ");
			return Arrays.asList(x).stream();
		  
		  }).distinct().forEach(System.out::println);
		 
	}

}
