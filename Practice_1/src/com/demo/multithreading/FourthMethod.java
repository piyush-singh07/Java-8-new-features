package com.demo.multithreading;

public class FourthMethod {

	public static void main(String[] args) throws InterruptedException {
		new Thread(()-> 
		{
			for (int i = 1; i <=10; i++) {
				System.out.println("Child Thread--"+i);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}).start();
		
		for (int i = 1; i <=10; i++) {
			System.out.println("Parent Thread--"+i);
			Thread.sleep(100);
		}

	}

}
