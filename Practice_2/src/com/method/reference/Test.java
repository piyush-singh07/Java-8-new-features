package com.method.reference;

public class Test {

	public static void main(String[] args) {

		Interf1 i1 = Demo::demoStaticMethod;
		i1.m1();

		Interf1 i2 = new Demo()::demoInstanceMethod;
		i2.m1();

		Interf2 ia = Demo::demoStaticMethod;
		ia.m2();

		Interf2 ib = new Demo()::demoInstanceMethod;
		ib.m2();

	}

}

class Demo {

	public static void demoStaticMethod() {
		System.out.println("demoStaticMethod executed...");
	}

	public void demoInstanceMethod() {
		System.out.println("demoInstanceMethod executed...");
	}

}

@FunctionalInterface
interface Interf1 {
	void m1();
}

@FunctionalInterface
interface Interf2 {
	void m2();
}
