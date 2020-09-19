package com.demo.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemoWithRunnable {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(6);

		PrintJob[] jobs = new PrintJob[] { new PrintJob("Jack"), new PrintJob("Henry"), new PrintJob("Jonas"),
				new PrintJob("Jeffery"), new PrintJob("Tommy"), new PrintJob("Mike") };

		for (PrintJob job : jobs) {
			service.execute(job);
		}

	}

}

class PrintJob implements Runnable {

	private String name;

	public PrintJob(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {

		System.out.println(this.name + "..... job started by " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.name + "..... job completed by " + Thread.currentThread().getName());

	}

}
