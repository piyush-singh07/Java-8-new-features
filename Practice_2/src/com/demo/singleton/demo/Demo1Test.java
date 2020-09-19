package com.demo.singleton.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Demo1Test {

	public static void main(String[] args) {

		new Thread(() -> {
			SingletonClass s = SingletonClass.getInstance();
			System.out.println(Thread.currentThread().getName() + "------>" + s.hashCode());
		}, "Thread - 1").start();

		new Thread(() -> {
			SingletonClass s = SingletonClass.getInstance();
			System.out.println(Thread.currentThread().getName() + "------>" + s.hashCode());
		}, "Thread - 2").start();

		ExecutorService service = Executors.newFixedThreadPool(2);

		IntStream.range(0, 10).forEach(i -> {
			Runnable r = () -> {
				SingletonClass s = SingletonClass.getInstance();
				System.out.println(Thread.currentThread().getName() + "------>" + s.hashCode());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			};
			service.execute(r);
		});

	}

}
