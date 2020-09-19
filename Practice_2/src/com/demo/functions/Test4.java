package com.demo.functions;

import java.util.ArrayList;
import java.util.function.Function;

public class Test4 {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		populate(al);
		Function<Student, String> f = s -> {

			if (s.getTotal_marks() >= 90) {
				return "A";
			} else if (s.getTotal_marks() <= 80) {
				return "B";
			}
			return null;

		};

		for (Student student : al) {
			System.out.println("Student name :" + student.getSname() + "    Grade :" + f.apply(student));
		}

	}

	private static void populate(ArrayList<Student> al) {
		al.add(new Student("Ravi", 90));
		al.add(new Student("Natasha", 34));
		al.add(new Student("Misha", 73));
		al.add(new Student("Ravali", 50));

	}

}

class Student {

	private String sname;
	private int total_marks;

	public Student(String sname, int total_marks) {
		super();
		this.sname = sname;
		this.total_marks = total_marks;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getTotal_marks() {
		return total_marks;
	}

	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}

}
