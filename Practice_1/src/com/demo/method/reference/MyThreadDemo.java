package com.demo.method.reference;

public class MyThreadDemo {

	public static void main(String[] args) {
		
		new Thread(new MyThreadDemo()::m1).start();
		for(int i=1; i<=10;i++)
		{
			System.out.println("Main Thread");
		}
	}
	
	public void m1()
	{
		for(int i=1; i<=10;i++)
		{
			System.out.println("Child Thread");
		}
	}

}
