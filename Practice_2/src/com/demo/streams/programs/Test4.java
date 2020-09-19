package com.demo.streams.programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {

		 Arrays
		 	   .asList(49, 23, 90, 43, 12, 92, 34)
		 	   .stream()
		 	   .filter(i->i%2==0)
		 	   .map(i->i*2)
		 	   .sorted((i1,i2)->i1.compareTo(i2))
		 	   .collect(Collectors.toList())
		 	   .forEach(System.out::println);
		
		 System.out.println("========================");
		 
		Arrays
			  .asList("Sunny","Bunny","Teunny","Tunny","Hunny")
			  .stream()
			  .filter(s->s.length()>4)
			  .map(s->s.substring(0,3))
			  .sorted((s1,s2)->-s1.compareTo(s2))
			  .collect(Collectors.toList())
			  .forEach(System.out::println);
	}

}
