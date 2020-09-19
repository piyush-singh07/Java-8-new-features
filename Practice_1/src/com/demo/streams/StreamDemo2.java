package com.demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(9);
		al.add(1);
		al.add(0);
		al.add(15);
		al.add(78);

		List<Integer> asec = al.stream().sorted().collect(Collectors.toList());
		asec.stream().forEach(System.out::println);
		
		
		String[] names= {"Hello","Hii","Pop","MOP"};
		Stream<String> s= Stream.of(names);
		s.forEach(System.out::println);
		
		
		  Integer I1= al.stream().max((i,j)->(i > j ? 1 : i < j ? -1 : 0 )).get();
		  System.out.println("MAX VALUE IS :"+I1);
		  
		  Integer I3 = al.stream().min((i,j)->(i > j ? 1 : i < j ? -1 : 0 )).get();
		  System.out.println("MIN VALUE IS :"+I3);
		  
		  List<Integer> desc = al.stream().sorted((i, j) -> (i > j ? -1 : i < j ? 1 :
		  0)).collect(Collectors.toList()); System.out.println(desc);
		  
		  Integer I2= al.stream().max((i,j)->(i > j ? -1 : i < j ? 1 : 0 )).get();
		  System.out.println("MAX VALUE IS :"+I2);
		  
		  Integer I4= al.stream().min((i,j)->(i > j ? -1 : i < j ? 1 : 0 )).get();
		  System.out.println("MIN VALUE IS :"+I4);
		 
		
		
	}

}
