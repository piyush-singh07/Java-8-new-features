package com.demo.immutable;

public class TestImmutable {

	public static void main(String[] args) {

		StudentImmutable s1 = new StudentImmutable("101", "Henry");
		StudentImmutable s2 = s1.modify("101", "Henry");

		System.out.println("s1 ---->" + s1.hashCode());
		System.out.println("s2 ---->" + s2.hashCode());

	}

}

final class StudentImmutable {

	public String getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	private final String sid;
	private final String sname;

	public StudentImmutable(String sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}

	public StudentImmutable modify(String sid, String sname) {
		if (this.sid == sid && this.sname == sname) {
			return this;
		} else
			return new StudentImmutable(sid, sname);

	}

}
