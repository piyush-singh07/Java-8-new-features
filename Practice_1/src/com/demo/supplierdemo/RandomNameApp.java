package com.demo.supplierdemo;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class RandomNameApp {

	public static void main(String[] args) {

		Supplier<String> sup = ()->{
			String[] names = {"Sunny","Bunny","Hunny","Tinny"};
			int random= (int) (Math.random()*4);
			return names[random];
		};
		
		Consumer<String> cons=s->System.out.println(s);
		
		cons.accept(sup.get());
		
	}

}
