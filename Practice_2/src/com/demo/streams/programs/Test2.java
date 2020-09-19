package com.demo.streams.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {

		List<String> al= Arrays.asList("Pinny","Chinny","Ginny","Binny","Rinny");
		al.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList())
				.forEach(s -> System.out.println(s));
		
		
	}

}
