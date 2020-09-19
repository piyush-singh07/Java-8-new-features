package com.demo.multithreading;

/*
 * Main method waiting for child to complete
 * 
 * */

public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new Thread(()->{
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
		t1.join(1000);
		t2.join(1000);
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+"  "+i);
		}
		
		
	}
	
}
