package com.demo.biinterfaces;

import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateDemo {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> p1= (i,j)-> ((i+j)/2)%2==0;
		Consumer<BiPredicate<Integer, Integer>> c= p->{
			if(p1.test(20,20))
				System.out.println("Yes average is even");
			else
				System.out.println("No average is not even");
		
		};
		c.accept(p1);
		
		
	}

}
