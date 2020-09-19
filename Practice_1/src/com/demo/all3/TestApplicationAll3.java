package com.demo.all3;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestApplicationAll3 {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		populate(al);
		
		Predicate<Student> p= s-> s.getMarks()>=55;
		Function<Student, String> f= s->{
			int marks = s.getMarks();
			if(marks>=90)
				return "A";
			else if(marks>=70)
				return "B";
			else if(marks>=60)
				return "C";
			else if(marks>=40)
				return "D";
			else 
				return "E";
			
		};
		Consumer<Student> c= s->{
			System.out.println("Name " + s.getName());
			System.out.println("Marks "+ s.getMarks());
			System.out.println("Grade " + f.apply(s));
		};
		
		for(Student s : al)
		{
			if(p.test(s))
				c.accept(s);
		}
		
		
		

	}

	private static void populate(ArrayList<Student> al) {
		al.add(new Student("Sunny", 45));
		al.add(new Student("Money", 35));
		al.add(new Student("Bunny", 55));
		al.add(new Student("Hunny", 25));
		al.add(new Student("Funny", 75));
		al.add(new Student("Tinny", 85));
		
	}

}
