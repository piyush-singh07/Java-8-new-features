package com.demo.consumers;

import java.util.function.Consumer;

public class ConsumerDemo1 {

	public static void main(String[] args) {

		Consumer<String> c1= s->System.out.println(s);
		
		c1.accept("Durga");
		c1.accept("Hello");
		
	}

}
