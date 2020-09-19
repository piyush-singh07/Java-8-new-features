package com.demo.multithreading;

public class Test {

	public static void main(String[] args) {

		Display d1 = new Display();
		// Display d2 = new Display();
		ThreadDemo demo1 = new ThreadDemo(d1, "Jack");
		ThreadDemo demo2 = new ThreadDemo(d1, "Henry");
		demo1.start();
		demo2.start();

	}

}

class Display {

	public synchronized void wish(String name) {

		for (int i = 1; i <= 5; i++) {

			System.out.println("Helllo " + name);

		}

	}
}

class ThreadDemo extends Thread {

	Display d;
	String name;

	public ThreadDemo(Display d, String name) {
		this.name = name;
		this.d = d;
	}

	@Override
	public void run() {

		d.wish(name);

	}

}
