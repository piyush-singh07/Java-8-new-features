package com.demo.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicityDemo {

	public static void main(String[] args) {

		/*
		 * new Thread(() -> {
		 * 
		 * System.out.println(Thread.currentThread().getName() + " got the value");
		 * System.out.println("The Value is :" + MyChange.x.get());
		 * System.out.println("Incrementing the value :"); MyChange.x.incrementAndGet();
		 * System.out.println("Incrementing done");
		 * 
		 * }
		 * 
		 * ).start();
		 * 
		 * new Thread(() -> {
		 * 
		 * System.out.println(Thread.currentThread().getName() + " got the value");
		 * System.out.println("The Value is :" + MyChange.x.get());
		 * System.out.println("Incrementing the value by  :" +
		 * Thread.currentThread().getName()); MyChange.x.incrementAndGet();
		 * System.out.println("Incrementing done" +MyChange.x.get() ); }
		 * 
		 * ).start();
		 * 
		 * new Thread(() -> {
		 * 
		 * System.out.println(MyChange.getValue() + "  " +
		 * Thread.currentThread().getName()); }
		 * 
		 * ).start();
		 */

		int cores=Runtime.getRuntime().availableProcessors();
		System.out.println(cores);
		ExecutorService service = Executors.newFixedThreadPool(10);

		/*
		 * service.in
		 * 
		 * IntStream.range(0, 10).forEach(i -> { Runnable task = () -> System.out
		 * .println("I am : " + Thread.currentThread().getName() + " and value is : " +
		 * i); service.submit(task); });
		 * 
		 * 
		 * IntStream.range(1, 11).forEach(i -> { Callable<Integer> task=()-> { int sum
		 * =0; for (int x = 1; x <= i; x++) { sum = sum + x; }
		 * 
		 * return sum;
		 * 
		 * }}).
		 */

	}
}

class MyChange {

	static volatile AtomicInteger x = new AtomicInteger(10);

	public static AtomicInteger getValue() {

		return x;

	}

}