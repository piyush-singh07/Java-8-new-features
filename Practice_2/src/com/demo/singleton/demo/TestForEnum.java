package com.demo.singleton.demo;

public class TestForEnum {

	public static void main(String[] args) {

		SingletonEnum e = SingletonEnum.INSTANCE;
		SingletonEnum e1 = SingletonEnum.INSTANCE;
		SingletonEnum e2 = SingletonEnum.INSTANCE;

		System.out.println(e.getClass().getName());

		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

}
