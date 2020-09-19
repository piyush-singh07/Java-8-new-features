package com.demo.consumers;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilmInfo {

	public static void main(String[] args) {
		
		Consumer<Film> c1= f->System.out.println("Movie :"+f.getName()+ "is going to release on 10 jan");
		Consumer<Film> c2= f->System.out.println("Result of the film is : "+f.getResult());
		Consumer<Film> c3= f-> System.out.println("The record is saved in the database!!!");
		Consumer<Film> chain= c1.andThen(c2).andThen(c3);
		Film movie1= new Film("Baahubali", "Super Hit");
		Film movie2 = new Film("Tubelight","Super Flop");
		chain.accept(movie1);
		System.out.println("==========");
		chain.accept(movie2);
		
	}

}
