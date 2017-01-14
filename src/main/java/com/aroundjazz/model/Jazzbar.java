package com.aroundjazz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Jazzbar {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false, length = 20)
	private String name;
	private String enName;

	public void setEnName(String enName) {
		this.enName = enName;
	}

	private String local;
	private String city;
	private String nation;

	private String address;
	private String contactNumber;
	private String operationTime;
	private String timetable;

	private String menu;
	private String fee;

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public void setOperationTime(String operationTime) {
		this.operationTime = operationTime;
	}

	public void setTimetable(String timetable) {
		this.timetable = timetable;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Jazzbar [id=" + id + ", name=" + name + ", enName=" + enName + ", local=" + local + ", city=" + city
				+ ", nation=" + nation + ", address=" + address + ", contactNumber=" + contactNumber
				+ ", operationTime=" + operationTime + ", timetable=" + timetable + ", menu=" + menu + ", fee=" + fee
				+ "]";
	}

}
