package com.demo.multithreading;

public class ThreadLocalDemo {

	public static void main(String[] args) {

		ThreadLocal<String> tl= new ThreadLocal<String>() {
			
			@Override
			protected String initialValue() {
				return "default value";
			}
			
			@Override
			public String get() {
				// TODO Auto-generated method stub
				return super.get() +" ok  " ;
			}
			
			
		};
		System.out.println(tl.get());
		tl.set("Hello");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
		
		
		
	}

}
