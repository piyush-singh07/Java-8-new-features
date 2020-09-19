package com.demo.multithreading;

public class ThreadLocalDemo3 {

	public static void main(String[] args) {

		new ParentTL().start();

	}

}

class ParentTL extends Thread {
	// static ThreadLocal<String> tl = new ThreadLocal<>();
	static InheritableThreadLocal<String> tl = new InheritableThreadLocal<String>() {
		protected String childValue(String arg0) {
			return "Spring";
		};

	};

	@Override
	public void run() {
		tl.set("Java");
		System.out.println("Parent class ThreadLocal value is :" + ParentTL.tl.get());
		ChildTL c = new ChildTL();
		c.start();
	}

}

class ChildTL extends Thread {

	@Override
	public void run() {

		System.out.println("Child class ThreadLocal value is :" + ParentTL.tl.get());
	}

}