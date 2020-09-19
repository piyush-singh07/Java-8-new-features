package com.demo.functions;

import java.util.function.Function;

public class Test1 {

	public static void main(String[] args) {

		Function<String, Integer> f = str -> str.length();
		System.out.println(f.apply("Hello"));
		System.out.println(f.apply("njknfwenfwl"));

	}

}
