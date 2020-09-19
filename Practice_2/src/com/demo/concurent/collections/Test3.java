package com.demo.concurent.collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Test3 extends Thread {

	static ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();

	@Override
	public void run() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		map.put(3, "C");
		System.out.println("Child Thread updating the map");
	}

	public static void main(String[] args) throws InterruptedException {

		map.put(1, "A");
		map.put(2, "B");

		new Test3().start();

		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println("Main Thread iterating the map");
			System.out.println(itr.next().getKey());
			Thread.sleep(3000);
		}

	}
}
