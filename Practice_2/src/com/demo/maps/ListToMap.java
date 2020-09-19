package com.demo.maps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {

		List<MyStudent> list = Arrays.asList(new MyStudent(101, "Ramesh"), new MyStudent(103, "Suresh"));
		list.stream().collect(Collectors.toMap(MyStudent::getSid, MyStudent::getSname))
			.forEach((k,v)->System.out.println(k + "=" +v));

	}

}

class MyStudent {
	private int sid;
	private String sname;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public MyStudent(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "MyStudent [sid=" + sid + ", sname=" + sname + "]";
	}

}
