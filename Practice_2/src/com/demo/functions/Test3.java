package com.demo.functions;

import java.util.function.Function;

public class Test3 {

	public static void main(String[] args) {

		Function<String, Integer> countSpaces = str -> str.length() - str.replaceAll(" ", "").length();
		System.out.println(countSpaces.apply("Hello How are you     Doing    "));

	}

}
