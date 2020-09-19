package com.demo.concurent.collections;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWALTest {

	static CopyOnWriteArrayList<Integer> cowal = new CopyOnWriteArrayList<>();

	public static void main(String[] args) throws InterruptedException {

		cowal.add(10);
		cowal.add(3);

		new Thread(()->{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Updation By the Child Thread");
			cowal.add(90);
		}).start();

		ListIterator<Integer> itr = cowal.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		//	itr.remove();
			Thread.sleep(3000);
		}

		System.out.println(cowal);

	}

}
