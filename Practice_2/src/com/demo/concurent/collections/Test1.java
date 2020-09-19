package com.demo.concurent.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test1 extends Thread {

	static ArrayList<Integer> al = new ArrayList<>();

	@Override
	public void run() {

		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}
		System.out.println("Child Thread Updating arrayList");
		al.add(90);

	}

	public static void main(String[] args) throws InterruptedException {

		al.add(10);
		al.add(80);
		al.add(67);
		al.add(89);

		new Test1().start();

		ListIterator<Integer> l = al.listIterator();
		while (l.hasNext()) {
			System.out.println("Main thread iterating the list");
			System.out.println(l.next());
			Thread.sleep(3000);
		}
	}

}
