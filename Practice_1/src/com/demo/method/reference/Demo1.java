package com.demo.method.reference;

public class Demo1 {
	
	public static void m2()
	{
		System.out.println("Hello By Method Reference.... all wellll from static");
	}
	
	public void m4()
	{
		System.out.println("Hello By Method Reference.... from instance method");
	}
	
	

	public static void main(String[] args) {
		
		InterfDemo f1= Demo1::m2;
		f1.m1();
		InterfDemo1 f2= new Demo1()::m4;
		f2.m3();

	}
	
}

@FunctionalInterface
interface InterfDemo
{

	void m1();
 	
}

@FunctionalInterface
interface InterfDemo1
{

	void m3();
 	
}
