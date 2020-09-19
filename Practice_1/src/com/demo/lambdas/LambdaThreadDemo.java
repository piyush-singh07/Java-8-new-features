package com.demo.lambdas;

public class LambdaThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		new Thread(()->{
			for(int i=1; i<=10;i++)
			{
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Child Thread - "+ i);
			}
		}).start();
		
		for(int i=1; i<=10;i++)
		{
			Thread.sleep(5000);
			System.out.println("Main Thread - "+ i);
		} 


	}

}
