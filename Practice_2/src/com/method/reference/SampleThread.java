package com.method.reference;

public class SampleThread {

	public static void main(String[] args) {
		new Thread(new Demo1()::m1).start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Parent Thread -- " + i);
		}
	}

}

class Demo1 {

	public void m1() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Child Thread -- " + i);
		}

	}

}
