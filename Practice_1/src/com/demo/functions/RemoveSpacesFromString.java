package com.demo.functions;

import java.util.function.Function;

public class RemoveSpacesFromString {

	public static void main(String[] args) {
		
		Function<String, String> f= s->s.replaceAll(" ","");
		
		System.out.println(f.apply("   Hello how are you dear     ?"));
		//System.out.println(f.apply("ok    ok    ok    ok"));
		
		
		Function<String , Integer> f1= input->{
			int count=0;
			char[] x= input.toCharArray();
			for(char x1:x)
			{
				if(x1==' ')
					count++;
			}
			return count;
		};
		
		System.out.println(f1.apply("Hello  Ji "));

	}

}
  