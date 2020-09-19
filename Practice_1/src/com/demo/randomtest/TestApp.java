package com.demo.randomtest;

import java.util.Random;
import java.util.function.IntSupplier;

public class TestApp {

	public static void main(String[] args) {

		IntSupplier s= ()-> 100000+ new Random().nextInt(900000);
		//System.out.println(s.getAsInt());
		
		
		IntSupplier s1= ()-> (int)(Math.random()*100);
		while(true)
		{
		System.out.println(s1.getAsInt());
		}
	}

}
