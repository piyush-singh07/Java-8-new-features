package com.demo.consumers;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test1 {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<>();
		Consumer<ArrayList<Student>> c1 = new Consumer<ArrayList<Student>>() {

			@Override
			public void accept(ArrayList<Student> al) {
				al.add(new Student("Ravi", 90));
				al.add(new Student("Natasha", 84));
				al.add(new Student("Misha", 73));
				al.add(new Student("Ravali", 80));
			}
		};

		Function<Student, String> f = s -> {

			if (s.getStotal() >= 90) {
				return "A";
			} else if (s.getStotal() <= 80) {
				return "B";
			}
			return null;

		};

		Predicate<Student> p = s -> s.getStotal() > 75;
		c1.accept(al);

		Consumer<Student> c = s -> {
			System.out.println("Student name :" + s.getSname());
			System.out.println("Student Total :" + s.getStotal());
			System.out.println("Student Grade :" + f.apply(s));
			System.out.println("++++++++++++++++++++++++++++++++");
		};

		for (Student student : al) {
			if (p.test(student)) {
				c.accept(student);
			}
		}

	}

}

class Student {
	private String sname;
	private int stotal;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getStotal() {
		return stotal;
	}

	public void setStotal(int stotal) {
		this.stotal = stotal;
	}

	public Student(String sname, int stotal) {
		super();
		this.sname = sname;
		this.stotal = stotal;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", stotal=" + stotal + "]";
	}

}
