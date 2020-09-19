package com.demo.multithreading;

public class JavaInterruptDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1= new Thread(()->{
			try {
				for (int i = 1; i <= 1000; i++) {
					System.out.println("Lazy thread " + i);
					if(i==500) {
						Thread.sleep(20);
						}
					if(Thread.currentThread().isInterrupted())
					{
						System.out.println("I am interrupted at :" + i);
						System.out.println("Setting the interrupt flag to false");
						//throw new InterruptedException();
						Thread.interrupted();
					}
				
				}
			} catch (InterruptedException e) {
				System.out.println("I got interrupted plz help");
			}
		 

		});
		
		
		t1.start();
		Thread.sleep(10);
		t1.interrupt();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main thread " + i);
		}
		

	}

}
