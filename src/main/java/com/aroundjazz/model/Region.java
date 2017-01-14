package com.aroundjazz.model;

public class Region {

	
	String nation;
	String city;
	String local;

	

	public void setNation(String nation) {
		this.nation = nation;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	
	@Override
	public String toString() {
		return "Region [nation=" + nation + ", city=" + city + ", local=" + local + "]";
	}

}
