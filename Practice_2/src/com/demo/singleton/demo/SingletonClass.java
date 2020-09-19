package com.demo.singleton.demo;

import java.util.concurrent.locks.ReentrantLock;

public class SingletonClass {

	private static volatile SingletonClass singleton = null;

	private static ReentrantLock lock = new ReentrantLock();
	
	static {
		System.out.println("Static Block Executing!!!");
		singleton=getInstance();
		System.out.println("from static block --->"+singleton.hashCode());
	}

	private SingletonClass() {
//		if (singleton != null)
//			throw new IllegalStateException("This function can not be done");
	}

	public static SingletonClass getInstance() {

		if (singleton == null)
			try {
				lock.lock();
				if (singleton == null) {
					singleton = new SingletonClass();
				}
			} finally {
				lock.unlock();
			}
		return singleton;

	}

}
