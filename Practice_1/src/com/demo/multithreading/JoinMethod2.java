package com.demo.multithreading;


/*
 * child waiting for main to complete and main waiting for another child to complete
 * 
 * */

public class JoinMethod2 {
	
	static Thread mainThread;

	public static void main(String[] args) throws InterruptedException {

		mainThread= Thread.currentThread();
		
		Thread t1=new Thread(()->{
			try {
				mainThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName()+"  "+i);
			}
		}, "Thread t1");
		
		
		Thread t2= new Thread(()->{
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName()+"  "+i);
		}
		}, "Thread t2");
		
		t1.start();
		t2.start();
		t2.join();
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+"  "+i);
		}
		
		
		
		
		
	}

}
