package com.demo.supplierdemo;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class RandomPassword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Supplier<String> passsup = () -> {
			String pass = "";
			Supplier<Integer> intsup = () -> (int) (Math.random() * 10);

			Supplier<Character> charsup = () -> {
				String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
				return symbols.charAt((int) (Math.random() * 29));
			};
			for (int i = 1; i <= 8; i++) {
				if (i % 2 == 0)
					pass = pass + charsup.get();
				else
					pass = pass + intsup.get();
			}
			return pass;
		};

		Consumer<Supplier<String>> cons = s -> System.out.println("Random password is :" + s.get());
		cons.accept(passsup);
		cons.accept(passsup);
		cons.accept(passsup);
		cons.accept(passsup);
	}
}
