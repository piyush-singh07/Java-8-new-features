package com.demo.applications;

public class ServiceEmployee {

	private String name;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "ServiceEmployee [name=" + name + ", salary=" + salary + "]";
	}
	public ServiceEmployee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
}
