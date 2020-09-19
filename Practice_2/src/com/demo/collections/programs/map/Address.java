package com.demo.collections.programs.map;

public class Address implements Comparable<Address> {

	private int astreet_no;
	private String acity;

	public int getAstreet_no() {
		return astreet_no;
	}

	public void setAstreet_no(int astreet_no) {
		this.astreet_no = astreet_no;
	}

	public String getAcity() {
		return acity;
	}

	public void setAcity(String acity) {
		this.acity = acity;
	}

	public Address(int astreet_no, String acity) {
		super();
		this.astreet_no = astreet_no;
		this.acity = acity;
	}

	@Override
	public int compareTo(Address o) {
		return this.getAstreet_no() > o.getAstreet_no() ? 1 : (this.getAstreet_no() < o.getAstreet_no() ? -1 : 0);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acity == null) ? 0 : acity.hashCode());
		result = prime * result + astreet_no;
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
		Address other = (Address) obj;
		if (acity == null) {
			if (other.acity != null)
				return false;
		} else if (!acity.equals(other.acity))
			return false;
		if (astreet_no != other.astreet_no)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address [astreet_no=" + astreet_no + ", acity=" + acity + "]";
	}

}
