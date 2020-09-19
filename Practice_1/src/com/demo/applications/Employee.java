package com.demo.applications;

public class Employee {

	private String enumber;
	private String ename;
	private float salary;
	@Override
	public String toString() {
		return "Employee [enumber=" + enumber + ", ename=" + ename + ", salary=" +  salary + ", designation="
				+ designation + ", location=" + location + "]";
	}
	private String designation;
	private String location;
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEnumber() {
		return enumber;
	}
	public void setEnumber(String enumber) {
		this.enumber = enumber;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Employee(String enumber, String ename, float salary, String designation, String location) {
		super();
		this.enumber = enumber;
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
		this.location = location;
	}

	

}
