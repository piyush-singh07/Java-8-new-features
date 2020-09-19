package com.demo.contract;

public class Student {
	
	private int sid;
	private String sname;
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sid;
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (sid != other.sid)
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}
	 
	
	

}
