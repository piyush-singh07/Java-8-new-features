package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalDemo {

	public static void main(String[] args) {
		
		List<String> al= Arrays.asList("Mike","Jones","Jack","Tom","Harry");
		Stream<String> s= al.stream();
	//	s.findAny().ifPresent(System.out::println);
		
	//	al.stream().findFirst().ifPresent(System.out::println);
		
		al.stream().distinct().limit(2).forEach(System.out::println);
		
//		boolean b = al.stream().noneMatch(input->input.startsWith("J"));
//		System.out.println(b);
		
		/*
		 * Optional<String> o= al.stream().findFirst(); if(o.isPresent())
		 * System.out.println(o.get());
		 */
		
	}

}
