package com.demo.maps;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapInt {

	public static void main(String[] args) {

		TreeMap<Integer, String> tmap1 = new TreeMap<>();
		tmap1.put(101, "Radha");
		tmap1.put(66, "Ganesh");
		tmap1.put(90, "Seeta");
		tmap1.put(9000, "Rama");
		System.out.println("======DNSO=======");
		System.out.println(tmap1);

		TreeMap<Integer, String> tmap2 = new TreeMap<>(new MyComp1());
		tmap2.put(101, "Radha");
		tmap2.put(66, "Ganesh");
		tmap2.put(90, "Seeta");
		tmap2.put(9000, "Rama");
		
		System.out.println("======CSO=======");
		System.out.println(tmap2);
		
		
	}

}

class MyComp1 implements Comparator<Integer> {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		return -arg0.compareTo(arg1);
	}

}
