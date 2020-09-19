package com.demo.supplierdemo;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class RandomOtp {

	public static void main(String[] args) {

		Supplier<Integer> sup = () -> 100000 + new Random().nextInt(900000);

		Consumer<Supplier<Integer>> cons = s -> {
			System.out.println(s.get());
			System.out.println(s.get());
			System.out.println(s.get());
			System.out.println(s.get());
		};
		cons.accept(sup);

	}

}
