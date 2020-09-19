package com.demo.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

	public static void main(String[] args) {
		DisplayClass1 d = new DisplayClass1();
		// DisplayClass1 d1 = new DisplayClass1();
		MyThread11 t1 = new MyThread11(d);
		MyThread22 t2 = new MyThread22(d);
		t1.start();
		t2.start();

	}

}

class DisplayClass1 {

	ReentrantLock l = new ReentrantLock();

	public void numberDisplay() {
		/*
		 * synchronized (DisplayClass1.class) {
		 * 
		 * for (int i = 0; i < 10; i++) { System.out.println(i); } }
		 */

		l.lock();
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		l.unlock();

	}

}

class MyThread11 extends Thread {
	DisplayClass1 d;

	public MyThread11(DisplayClass1 d) {
		this.d = d;
	}

	@Override
	public void run() {
		d.numberDisplay();
	}

}

class MyThread22 extends Thread {
	DisplayClass1 d;

	public MyThread22(DisplayClass1 d) {
		super();
		this.d = d;
	}

	@Override
	public void run() {
		d.numberDisplay();
	}

}
