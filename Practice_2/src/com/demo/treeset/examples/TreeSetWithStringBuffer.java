package com.demo.treeset.examples;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithStringBuffer {

	public static void main(String[] args) {

		TreeSet<StringBuffer> ts = new TreeSet<StringBuffer>(new MyComparator());
		ts.add(new StringBuffer("Hello"));
		ts.add(new StringBuffer("Bye"));
		ts.add(new StringBuffer("SSS"));
		ts.add(new StringBuffer("Z"));
		System.out.println(ts);
		
	}

}

class MyComparator implements Comparator<Object>
{
	@Override
	public int compare(Object o1, Object o2) {
		String s1= (String)o1;
		String s2= (String) o2;
		return s1.compareTo(s2);
		
	}

}
