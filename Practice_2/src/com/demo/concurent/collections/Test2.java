package com.demo.concurent.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Test2 extends Thread {

	static HashMap<Integer, String> map = new HashMap<Integer, String>();

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

		new Test2().start();

		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println("Main Thread iterating the map");
			System.out.println(itr.next().getKey());
			Thread.sleep(3000);

		}

	}

}
