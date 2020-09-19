package com.demo.maps;

import java.util.HashMap;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		map.put("Hello", "Welcome Message");
		map.put("Hi", "Greet Message");
		map.put("Hey", "Greet Message");
		map.put("Hello", "Greet Message");

		System.out.println(map);

		TreeMap<Student, Integer> map1 = new TreeMap<Student, Integer>();
		map1.put(new Student(101, "Ram"), 1);
		map1.put(new Student(102, "Raheem"), 1);
		map1.put(new Student(101, "Ram"), 2);
		map1.put(new Student(99, "Allah"), 1);
		map1.put(new Student(199, "Zainab"), 1);

		System.out.println(map1);

		TreeMap<Student, Integer> map2 = new TreeMap<Student, Integer>(
				(student1, student2) -> student1.getSname().compareTo(student2.getSname()));
		map2.put(new Student(101, "Ram"), 1);
		map2.put(new Student(102, "Raheem"), 1);
		map2.put(new Student(101, "Ram"), 1);
		map2.put(new Student(99, "Allah"), 1);
		map2.put(new Student(199, "Zainab"), 1);

		System.out.println(map2);

	}

}

class Student implements Comparable<Student> {
	int eid;
	String sname;

	public Student(int eid, String sname) {
		super();
		this.eid = eid;
		this.sname = sname;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [eid=" + eid + ", sname=" + sname + "]";
	}

	@Override
	public int compareTo(Student student) {

		if (this.getEid() > student.getEid())
			return +1;
		else if (this.getEid() < student.getEid())
			return -1;
		else
			return +1;

	}

}
