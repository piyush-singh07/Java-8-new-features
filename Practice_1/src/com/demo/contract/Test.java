package com.demo.contract;

public final class Test {
	
	
	private int i;
	
	Test(int i)
	{
		this.i=i;
	}
	
	public Test modify(int i)
	{
		if(this.i==i)
		{
			return this;
		}
		else
		{
			return new Test(i);
		}
	}

	public static void main(String[] args) {

		
		Test t= new Test(10);
		System.out.println(t.hashCode());
		Test t1= t.modify(100);
		System.out.println(t1.hashCode());
		System.out.println(t==t1);
		System.out.println(t.equals(t1));
		Test t3= t.modify(10);
		System.out.println(t3.hashCode());
		System.out.println(t==t3);
		
	}

}
