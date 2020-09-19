package com.demo.hashtable;

import java.util.Hashtable;

public class HTDemo {

	public static void main(String[] args) {

		Hashtable<Test, String> ht = new Hashtable<>();
		ht.put(new Test(2), "C");
		ht.put(new Test(5), "F");
		ht.put(new Test(15), "H");
		ht.put(new Test(23), "I");
		ht.put(new Test(16), "J");
		ht.put(new Test(10), "K");
		System.out.println(ht);

	}

}

class Test {
	int i;

	Test(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return i + "";
	}

	@Override
	public int hashCode() {
		// return i%7;
		return i;
	}

}
