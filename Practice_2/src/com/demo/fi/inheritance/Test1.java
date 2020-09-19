package com.demo.fi.inheritance;

@FunctionalInterface
interface Interf1 {
	void m1();
}

public class Test1 {
	
	int x= 10;
	
	
	void m2()
	{
		
		Interf1 i= ()->{
			int x=100;
			System.out.println(x);
			System.out.println(this.x);
		};
		
		i.m1();
		
		
		
		Interf1 i1 = new Interf1() {
			
			int x= 1000;
			
			@Override
			public void m1() {
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(new Test1().x);
			}
		};
		
		i1.m1();
		
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.m2();
	
		

	}

}
