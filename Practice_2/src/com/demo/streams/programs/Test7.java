package com.demo.streams.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Test7 {

	public static void main(String[] args) {

		List<Employee> al= createEmployeeList();
		al
			.stream()
			.filter(e->e.getAge()>20)
			.map(Employee::getName)
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		System.out.println("=========================");
		
		System.out.println("Number of Employees greater than 25 age :" + al.stream().filter(e->e.getAge()>25).count());
		
		Optional<Employee> o = al.stream().filter(e->e.getName().equalsIgnoreCase("Mary")).findAny();
		if(o.isPresent())
			System.out.println("Yes");
		else
			System.out.println("No");
		
		
		OptionalInt o1= al.stream().mapToInt(Employee::getAge).max();
		if(o1.isPresent())
			System.out.println(o1.getAsInt());
	}
	
	
	public static List<Employee> createEmployeeList()
	{
		List<Employee> employeeList=new ArrayList<>();
 
		Employee e1=new Employee("John",21);
		Employee e2=new Employee("Martin",19);
		Employee e3=new Employee("Mary",31);
		Employee e4=new Employee("Stephan",18);
		Employee e5=new Employee("Gary",26);
 
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
 
		return employeeList;
	}

}
