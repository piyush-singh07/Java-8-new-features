package com.demo.multithreading;

public class FirstMethod {

	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Parent Thread");
		}
		
		
		
	}

}


class MyThread extends Thread{
	
	
	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
	}
	
	public void run()
	{
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
	
	
}
