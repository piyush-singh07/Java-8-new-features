package com.demo.method.reference;

public class ConstructorReference {

	public static void main(String[] args) {

		InterfRemo i = Sample::new;
		Sample s = i.get();
		s.hello();
	}
}

class Sample {

	Sample() {
		System.out.println("Sample Class Constructor Invoked");
	}

	public void hello() {
		System.out.println("Hello I am method in Sample Class");
	}
}

@FunctionalInterface
interface InterfRemo {
	Sample get();
}