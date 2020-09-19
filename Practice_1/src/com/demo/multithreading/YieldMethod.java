package com.demo.multithreading;

public class YieldMethod {

	public static void main(String[] args) {

		new Thread(()->
		{
			Thread.yield();
			for (int i = 1; i <=5; i++) {
				System.out.println(Thread.currentThread().getName() +" "+ i);
			}
		},"My Child Thread").start();
		
		Thread.currentThread().setName("My Main Thread");
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() +" "+i);
			
		}
	}

}
