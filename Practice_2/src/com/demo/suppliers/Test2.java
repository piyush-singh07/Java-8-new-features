package com.demo.suppliers;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test2 {

	public static void main(String[] args) {

		Supplier<String> passWord = () -> {
			String password = "";
			Supplier<Integer> intSup = () -> (int) (Math.random() * 10);
			Supplier<Character> charSup = () -> {
				String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
				return symbols.charAt((int) (Math.random() * 29));
			};
			Predicate<Integer> p1 = i -> i % 2 == 0;

			for (int i = 0; i < 8; i++) {
				if (p1.test(i))
					password = password + charSup.get();
				else
					password = password + intSup.get();

			}

			return password;

		};

		Consumer<Supplier<String>> c = s -> System.out.println(s.get());
		for (int j = 0; j < 10; j++) {
			c.accept(passWord);

		}

	}

}
