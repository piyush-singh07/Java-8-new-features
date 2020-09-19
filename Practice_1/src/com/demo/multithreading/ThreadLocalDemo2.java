package com.demo.multithreading;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalDemo2 {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(3);
		CustomThread[] custs = new CustomThread[] { new CustomThread(), new CustomThread(), new CustomThread(),
				new CustomThread(), new CustomThread(), new CustomThread()

		};

		for (CustomThread cust : custs) {
			service.submit(cust);
		}

	}

}

class CustomThread implements Runnable {

	static String customerId;

	ThreadLocal<String> tl = new ThreadLocal<String>() {

		protected String initialValue() {
			customerId = UUID.randomUUID().toString();
			return customerId;

		};

	};

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " thread executing with customerId as : " + tl.get());

	}
}
