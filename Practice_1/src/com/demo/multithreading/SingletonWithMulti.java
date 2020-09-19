package com.demo.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class SingletonWithMulti {

	public static void main(String[] args) {
		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo2 t2 = new ThreadDemo2();
		t1.start();
		t2.start();

	}

}

class ThreadDemo1 extends Thread {
	@Override
	public void run() {
		Singleton s1 = Singleton.getInstance();
		System.out.println("s1= " + s1.hashCode());
	}

}

class ThreadDemo2 extends Thread {
	@Override
	public void run() {
		Singleton s2 = Singleton.getInstance();
		System.out.println("s1= " + s2.hashCode());
	}

}

class Singleton {

	private static volatile Singleton singleton = null;
	
	//private static ReentrantLock lock = new ReentrantLock();
//lock.lock()
	//lock.unlock() in finally block
	private Singleton() {

	}

	public static Singleton getInstance() {

		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}

		}

		return singleton;

	}

}
