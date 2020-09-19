package com.demo.lambdas;

import com.demo.interfaces.Interf1;

public class ThisKeywordDemo {
	
	private int x= 888;
	
	
	public void m2()
	{
		Interf1 interf1= ()->
		{
			int x= 999;
			System.out.println("The value of x is :"+ x);
			System.out.println("The value of x is :"+ this.x);
			
		};
		
		interf1.m1();
	}

	public static void main(String[] args) {
		
		
		new ThisKeywordDemo().m2();
		


	}

}
