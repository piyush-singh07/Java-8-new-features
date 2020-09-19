package com.demo.biinterfaces;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {

		BiFunction<String, Integer, Student> bf1 = (str, init) -> new Student(str, init);
		ArrayList<Student> al = new ArrayList<>();
		al.add(bf1.apply("Ranky", 10));
		al.add(bf1.apply("Raja", 20));
		al.add(bf1.apply("Rocky", 30));
		al.add(bf1.apply("Ranjit", 40));
		System.out.println(al);

	}

}

class Student {
	
	private String sname;
	private int sroll;

	public Student(String sname, int sroll) {
		super();
		this.sname = sname;
		this.sroll = sroll;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sroll=" + sroll + "]";
	}

}
