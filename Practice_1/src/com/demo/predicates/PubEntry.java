package com.demo.predicates;

import java.util.function.Predicate;

public class PubEntry {

	public static void main(String[] args) {
		SoftwareEngineer[] x= {
				new SoftwareEngineer("Yash", 24, true),
				new SoftwareEngineer("Raju", 11, true),
				new SoftwareEngineer("Rahul", 29, false),
				new SoftwareEngineer("Chakri", 32, true),
				new SoftwareEngineer("Piyush", 26, true)
							};
		Predicate<SoftwareEngineer> p= (se)-> se.age>18 && se.ishavingGf==true;
		
		for (SoftwareEngineer e: x)
		{
			if(p.test(e))
				System.out.println(e);
		}
	}

}

class SoftwareEngineer
{
	String name;
	int age;
	boolean ishavingGf;
	public SoftwareEngineer(String name, int age, boolean ishavingGf) {
		this.name = name;
		this.age = age;
		this.ishavingGf = ishavingGf;
	}
	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + "]";
	}
	

}
