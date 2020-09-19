package com.demo.multithreading;

class DisplayClass {

	public synchronized void numberDisplay() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}

	public synchronized void characterDisplay() {
		for (int i = 65; i < 75; i++) {
			System.out.println((char) i);
		}

	}

}

class MyThread1 extends Thread {
	DisplayClass d;

	public MyThread1(DisplayClass d) {
		this.d = d;
	}

	@Override
	public void run() {
		d.numberDisplay();
	}

}

class MyThread2 extends Thread {
	DisplayClass d;

	public MyThread2(DisplayClass d) {
		super();
		this.d = d;
	}

	@Override
	public void run() {
		d.characterDisplay();
	}

}

public class LockTest {

	public static void main(String[] args) {
		DisplayClass d = new DisplayClass();
		MyThread1 t1 = new MyThread1(d);
		MyThread2 t2 = new MyThread2(d);
		t1.start();
		t2.start();

	}

}
