package com.demo.consumers;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MovieDisplay {

	public static void main(String[] args) {

			Consumer<Movie> c1= m->{
										System.out.println("Movie Name :" + m.getName());
										System.out.println("Hero in the movie :" + m.getHero());
										System.out.println("Heroine in the movie :"+ m.getHeroine());
										System.out.println();
										System.out.println();
									};
		ArrayList<Movie> al = new ArrayList<Movie>();
		populate(al);
		for(Movie m : al)
		{
			c1.accept(m);
		}
	}

	private static void populate(ArrayList<Movie> al) {
		al.add(new Movie("Baahubali", "Prabhas", "anushka"));
		al.add(new Movie("Raees", "Sharukh", "anushka"));
		al.add(new Movie("KNPH", "hrithik", "amisha"));
		al.add(new Movie("Tooh", "irfan", "kareena"));
		al.add(new Movie("Chappak", "ranveer", "deepika"));
		
		
	}
}

class Movie
{
	private String name;
	private String hero;
	private String heroine;
	public Movie(String name, String hero, String heroine) {
		super();
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getHeroine() {
		return heroine;
	}
	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}
	
	
	
	
}
