package com.demo.anonymous;

public class AnonyThread {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {

				for(int i=1; i<=10;i++)
				{
					System.out.println( Thread.currentThread().getName()+"- "+ i);
				}
				
			}
		});
		
		thread.setName("The worker Child Thread");
		thread.start();
		
		for(int i=1; i<=10;i++)
		{
			System.out.println("Main Thread - "+ i);
		} 

	}

}
