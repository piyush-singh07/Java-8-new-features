package com.demo.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemoWithCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newFixedThreadPool(2);
		SumUp[] sums = new SumUp[] { new SumUp(100), new SumUp(200), new SumUp(300), new SumUp(400), new SumUp(500),
				new SumUp(600)};
		
		for(SumUp sumup:sums)
		{
			Future<Integer> f= service.submit(sumup);
			System.out.println(f.get());
		}

	}

}

class SumUp implements Callable<Integer> {

	private int i;
	int sum = 0;

	public SumUp(int i) {
		super();
		this.i = i;
	}

	@Override
	public Integer call() throws Exception {
		
		System.out.println("job started by " + Thread.currentThread().getName());
		//Thread.sleep(1000);

		for (int x = 1; x <= this.i; x++) {
			sum = sum + x;
		}
		System.out.println("job completed by " + Thread.currentThread().getName());
		return sum;

	}
}
