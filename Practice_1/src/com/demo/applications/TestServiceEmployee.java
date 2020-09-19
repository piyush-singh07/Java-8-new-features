package com.demo.applications;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestServiceEmployee {

	public static void main(String[] args) {

		ArrayList<ServiceEmployee> al= new ArrayList<ServiceEmployee>();
		Predicate<ServiceEmployee> p1= se->se.getSalary()<=3200.0;
		Function<ServiceEmployee, ServiceEmployee> f1= se->{
			se.setSalary(se.getSalary()+477);
			return se;
		};
		populate(al);
		System.out.println("Employees details :");
		System.out.println(al);
		
		ArrayList<ServiceEmployee> al2= new ArrayList<ServiceEmployee>();
		for(ServiceEmployee e: al)
		{
			if(p1.test(e))
			{
				al2.add(f1.apply(e));
			}
		}
		
		System.out.println("Employees details after increment :");
		System.out.println(al2);
	}

	private static void populate(ArrayList<ServiceEmployee> al) {
		
		al.add(new ServiceEmployee("Jack", 3200.0));
		al.add(new ServiceEmployee("Jones", 2200.0));
		al.add(new ServiceEmployee("Jonas", 4200.0));
		al.add(new ServiceEmployee("Mita", 5200.0));
		al.add(new ServiceEmployee("Nita", 1200.0));
		al.add(new ServiceEmployee("Shamita", 2800.0));
	}

}
