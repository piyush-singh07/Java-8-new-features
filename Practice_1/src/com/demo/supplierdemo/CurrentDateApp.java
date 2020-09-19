package com.demo.supplierdemo;

import java.util.Date;
import java.util.function.Supplier;

public class CurrentDateApp {

	public static void main(String[] args) throws InterruptedException {
		
		Supplier<Date> sup = ()->new Date();
		System.out.println(sup.get());
		Thread.sleep(10000);
		System.out.println(sup.get());
		
		

	}

}
