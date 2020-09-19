package com.demo.functions;

import java.util.function.Function;

public class Test2 {

	public static void main(String[] args) {

		Function<String, String> removeSpaces= str->str.replaceAll(" " , "");
		System.out.println(removeSpaces.apply("Hello How are you          doing    "));
		
		
		
	}

}
