package com.demo.fi.inheritance;

@FunctionalInterface
interface A {

	void sayHello();

}

@FunctionalInterface
interface B extends A {
}

@FunctionalInterface
interface C extends A {
	void sayHello();
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
