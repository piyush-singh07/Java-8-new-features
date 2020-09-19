package com.demo.suppliers;

import java.util.function.Supplier;

public class Test1 {

	public static void main(String[] args) {

		Supplier<String> s = () -> {

			String[] arr = { "Hello", "ok", "not ok", "poppy" };
			int x = (int) (Math.random() * 4);
			// System.out.println(x);
			return arr[x];
		};

		System.out.println(s.get());

	}

}
