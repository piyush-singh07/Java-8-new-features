package com.demo.anonymous;

import com.demo.interfaces.Interf1;

public class ThisKeywordDemoForAnonymousClass {

	private int x= 888;
	
	public void m2()
	{
		Interf1 interf1 = new Interf1() {
			int x= 999;
			@Override
			public void m1() {
				
				System.out.println("The value of x is :"+ (this.x));
				System.out.println("The value of x is :"+ ThisKeywordDemoForAnonymousClass.this.x);
				
			}
		};
		interf1.m1();
	}
	
	
	public static void main(String[] args) {
		
		new ThisKeywordDemoForAnonymousClass().m2();
	}

}
