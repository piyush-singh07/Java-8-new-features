package com.demo.concurent.collections;

import java.util.HashSet;
import java.util.Iterator;

public class COWASTest extends Thread {
	/**
	 * If uncommented then CME will be raised
	 */

	 static HashSet<Integer> set = new HashSet<>();
	//static CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();

	public static void main(String[] args) throws InterruptedException {

		set.add(1000);
		set.add(100);

		new Thread(() -> {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Child Thread - 1 Updating the set ");
			set.add(10);

		}).start();

		new Thread(() -> {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Child Thread - 2 Updating the set ");
			set.add(1);

		}).start();

		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println("Iterator iterating over the set");
			System.out.println("Iterator got the value as : " + itr.next());
			Thread.sleep(3000);

		}

		System.out.println(set);

	}

}
