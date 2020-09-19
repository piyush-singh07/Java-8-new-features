package com.demo.streams.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {

		Optional<Employee> o1 = findEmployee("Adam", createEmployeeList());
		if (o1.isPresent())
			System.out.println("Is Present");
		else
			System.out.println("Not Present");

	}

	public static Optional<Employee> findEmployee(String name, List<Employee> list) {

		for (Employee employee : list) {
			if (employee.getName().equalsIgnoreCase(name))
				return Optional.of(employee);
		}
		return Optional.empty();
	}

	public static List<Employee> createEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();

		Employee e1 = new Employee("John", 21);
		Employee e2 = new Employee("Martin", 19);
		Employee e3 = new Employee("Mary", 31);
		Employee e4 = new Employee("Stephan", 18);
		Employee e5 = new Employee("Gary", 26);

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);

		return employeeList;
	}
}
