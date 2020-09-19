package com.demo.applications;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeApplication {

	public static void main(String[] args) {
		
		ArrayList<Employee> al= new ArrayList<Employee>();
		populate(al);
		
		/*
		 * predicate for salary >= 20000
		 * */
		Predicate<Employee> p1= e->e.getSalary()>=20000F;
		
		//predicate for location = hyderabad
		Predicate<Employee> p2= e->e.getLocation()=="Hyderabad";
		
		//predicate for designation = manager
		Predicate<Employee> p3= e->e.getDesignation()=="Manager";
		
		Function<ArrayList<Employee>, Float > f1= l->
									{
										float sum=0.0f;
										for(Employee e :al)
										{
											sum=sum+e.getSalary();
										}
										return sum;
									};
		
		System.out.println("Employees whose salary is less than 20000");
		display(al, p1);
		System.out.println("=============================================");
		System.out.println("Employees whose working location is Hyderabad");
		display(al, p2);
		System.out.println("=============================================");
		System.out.println("Employees whose designation is Manager");
		display(al, p3);
		System.out.println("=============================================");
		System.out.println("Employees whose designation is not Manager");
		display(al, p3.negate());
		System.out.println("=============================================");
		System.out.println("Employees whose designation is  Manager and working location as Hyderabad");
		display(al, p2.and(p3));
		System.out.println("=============================================");
		System.out.println("Employees whose designation is  Manager or salary greater than 20000 or equal");
		display(al, p2.or(p1));
		System.out.println("=============================================");
		System.out.print("Total Salary of all the Employees :");
		System.out.println(f1.apply(al));
		
		
	}



	private static void display(ArrayList<Employee> al, Predicate<Employee> p2) {
		for(Employee e : al )
		{
			if(p2.test(e))
				System.out.println(e);
		}
	}
	
	
	
	public static void populate(ArrayList<Employee> al)
	{
		al.add(new Employee("E-101", "Jack", 30000F,"Manager", "Hyderabad"));
		al.add(new Employee("E-102", "Jones", 20000F,"Developer", "Bangalore"));
		al.add(new Employee("E-103", "Ram", 10000F,"Developer","Hyderabad"));
		al.add(new Employee("E-104", "Natasha", 40000F,"Manager","Bangalore"));
		al.add(new Employee("E-105", "Mina", 15000F,"Developer","Hyderabad"));
		al.add(new Employee("E-106", "Michael", 20000F,"Manager","Bangalore"));
		al.add(new Employee("E-107", "Lincoln", 25000F,"Developer","Hyderabad"));
	}

}



