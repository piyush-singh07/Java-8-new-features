package com.demo.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {

		Class c= Class.forName("com.demo.reflection.Employee");
		
		
		System.out.println(c.getName());
		
		System.out.println("***************************");
		
		System.out.println(c.getSuperclass().getName());
		
		Class<com.demo.reflection.Employee>[] cs= c.getClasses();
		for(Class ce:cs)
		{
			System.out.println(ce);
		}
		System.out.println("***************************");
	//	System.out.println("Name of the class is:" + c.getClass());
		
		Method[] methods= c.getDeclaredMethods();
		for(Method m : methods)
		{
			System.out.println(m);
		}
		System.out.println("***************************");
		Constructor<com.demo.reflection.Employee>[] cons= c.getDeclaredConstructors();
		for(Constructor<com.demo.reflection.Employee> con:cons)
		{
			System.out.println(con);
		}
		System.out.println("***************************");
		Field[] fields= c.getDeclaredFields();
		for(Field field:fields)
		{
			System.out.println(field);
		}
		
		
		int i = c.getModifiers();
		System.out.println(Modifier.toString(i));
	
	}

}
