package com.demo.collections;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author singhpi
 *
 */
public class TreeSetNew {

	
	public static void main(String[] args) {
		
		Comparator<Integer> comp= new Comparator<Integer>() {
			
			@Override
			public int compare(Integer i1, Integer i2) {
				
				return ((i1>i2)?-99:(i1<i2)?99:0);
			}
		};

		TreeSet<Integer> treeSet = new TreeSet<>(comp);
		treeSet.add(10);
		treeSet.add(0);
		treeSet.add(13);
		treeSet.add(99);
		treeSet.add(87);
		
		System.out.println(treeSet);
		
	}

}
