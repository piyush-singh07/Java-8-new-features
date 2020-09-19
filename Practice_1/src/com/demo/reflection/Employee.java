package com.demo.reflection;

import java.io.Serializable;

public class Employee implements Serializable,Cloneable {

	public int eno;
	public static String ename;
	public final String eaddr = "Hyderabad";
	
	
	public Employee(int eno) {
		super();
		this.eno = eno;
	}

	public Employee() {
		super();
	}

	public void add()
	{}
	
	public int getPop()
	{
		return 10;
	}
	
	
}
