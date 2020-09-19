package com.demo.treeset.examples;

import java.util.Comparator;
import java.util.TreeSet;

public class CustomTest {

	public static void main(String[] args) {

		TreeSet<Student> ts1 = new TreeSet<>();
		ts1.add(new Student(111, "Piyush"));
		ts1.add(new Student(112, "Ankit"));
		ts1.add(new Student(99, "Hello"));
		ts1.add(new Student(10, "Zainab"));

		System.out.println(ts1);

		TreeSet<Student> ts2 = new TreeSet<>(new MyComp());
		ts2.add(new Student(111, "Piyush"));
		ts2.add(new Student(112, "Ankit"));
		ts2.add(new Student(99, "Hello"));
		ts2.add(new Student(10, "Zainab"));

		System.out.println(ts2);

	}

}

class Student implements Comparable<Student> {
	private int sid;
	private String sname;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	@Override
	public int compareTo(Student o) {

		if (this.getSid() > o.getSid())
			return +1;
		else if (this.getSid() < o.getSid())
			return -1;
		else
			return 0;

	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}

}

class MyComp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getSname().compareTo(o2.getSname());
		// return o1.compareTo(o2);
	}

}
