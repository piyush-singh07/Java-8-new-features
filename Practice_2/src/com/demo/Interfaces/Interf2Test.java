package com.demo.Interfaces;

public class Interf2Test {

	public static void main(String[] args) {

		Interf2 i2 = (x, y) -> {
			return x + y;
		};
		
		System.out.println("Sum is :" + i2.getSum(100, 2));
		
		Interf2 i2i= (x,y)->x+y;
		System.out.println("Other Sum is :" + i2i.getSum(11, 23));
		
		
		
	}

}
