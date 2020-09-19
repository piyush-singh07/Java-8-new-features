package com.demo.waitnotify;

public class MethodsDemo {

	public static void main(String[] args) throws InterruptedException {

		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			System.out.println("Entered main thread");
			System.out.println("Entering into wait state for b's updation");
			b.wait();
			System.out.println("Main thread got the notification");
		}

		System.out.println(ThreadB.count);
	}

}

class ThreadB extends Thread {

 static	int count = 0;

	@Override
	public void run() {

		synchronized (this) {

			for (int i = 1; i <= 100; i++) {
				count = count + i;

			}
			System.out.println("notifying waiting threads");
			this.notify();

		}

	}

}
