package com.demo.fi.staticdefault;


@FunctionalInterface
interface A
{
  default void m1()
 {
	 System.out.println("I am a default method in A functional Interface");
 }
  
  static void m3()
  {
	  System.out.println("I am a static method in A functional Interface");
  }
  
  
  void m2();//SAM
  
}

public class DefaultTest {

	public static void main(String[] args) {
		A a = ()->System.out.println("I am abstract method implemetation");
		a.m1();
		a.m2();
		A.m3();

	}

}
