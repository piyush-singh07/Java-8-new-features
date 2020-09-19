package com.demo.fi.staticdefault;


interface Left
{
	default void m1()
	{
		System.out.println("I am default method from Left Interface");
	}
}

interface Right
{
	default void m1()
	{
		System.out.println("I am default method from Right Interface");
	}
}


public class TestInheritance implements Left, Right {

	public static void main(String[] args) {
		TestInheritance t= new TestInheritance();
		t.m1();

	}

	@Override
	public void m1() {
		Left.super.m1();
	}

}
