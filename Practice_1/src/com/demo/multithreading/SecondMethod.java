package com.demo.multithreading;

public class SecondMethod {

	public static void main(String[] args) {
		
		new Thread(new MyRunnable()).start();
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Parent Thread");
		}
	

	}

}


class MyRunnable implements Runnable
{

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Child Thread");
			
			
		}

		
		
	}

}
