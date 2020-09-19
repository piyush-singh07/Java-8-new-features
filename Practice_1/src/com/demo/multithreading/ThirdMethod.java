package com.demo.multithreading;

public class ThirdMethod {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread--"+i);
				}
				
			}
		}).start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Parent Thread--"+i);
		}
		
		

	}

}
