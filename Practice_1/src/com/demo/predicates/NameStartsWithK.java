package com.demo.predicates;

import java.util.function.Predicate;

public class NameStartsWithK {

	public static void main(String[] args) {

		Predicate<String> p = (i)-> i.startsWith("K")||i.startsWith("k");
		String[] x= {"kate",
				"kelly",
				"Ram",
				"kalliapan",
				"Raji"};
		
		for(String x1:x)
		{
			if(p.test(x1)) System.out.println(x1);
		}
		
	}

}
