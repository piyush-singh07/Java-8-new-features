package com.demo.singleton.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletonUsingReflection {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		SingletonClass instance1 = SingletonClass.getInstance();
		SingletonClass instance2 = null;
		SingletonClass instance3 = null;

		Constructor[] constructors = SingletonClass.class.getDeclaredConstructors();
		for (Constructor c1 : constructors) {
			c1.setAccessible(true);
			instance2 = (SingletonClass) c1.newInstance();
			instance3 = (SingletonClass) c1.newInstance();
			break;
		}

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println(instance3.hashCode());
	}

}
