package com.demo.biinterfaces;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		
		BiFunction<String, Integer, Student> bf=(i,j) -> new Student(i, j);
		
		ArrayList<Student> al= new ArrayList<Student>();
		al.add(bf.apply("Durga", 21));
		al.add(bf.apply("Hello", 22));
		al.add(bf.apply("Asha", 23));
		al.add(bf.apply("Jam", 24));
		
		System.out.println(al);
	}

}

class Student
{
	String name;
	int rollno;
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	
	
}
