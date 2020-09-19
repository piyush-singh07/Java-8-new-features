package com.demo.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {

		List<String> al = Arrays.asList("Jack", "Chiranjeevi", "Raviteja", "Shakuntalam", "PrakashJha", "MythriMurthi");

		Predicate<String> pred = s -> s.length() >= 9;

		ArrayList<String> l1 = (ArrayList<String>) al.stream().filter(pred).collect(Collectors.toList());
		ArrayList<String> l2 = (ArrayList<String>) al.stream().filter(s -> s.startsWith("M"))
				.collect(Collectors.toList());
		ArrayList<String> l3 = (ArrayList<String>) al.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		Function<List<String>, Long> func = l -> l.stream().filter(s -> s.length() >= 9).count();

		ArrayList<String> l4 = (ArrayList<String>) al.stream().filter(StreamDemo1::checkLength)
				.collect(Collectors.toList());

		Consumer<List<String>> c = System.out::println;
				//l -> System.out.println(l);
		c.accept(l1);
		c.accept(l2);
		c.accept(l3);

		System.out.println("Names length greater than 9 are : " + func.apply(al));
		c.accept(l4);

	}

	public static boolean checkLength(String name) {
		return name.length() >= 9;
	}

}
