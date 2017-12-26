package com.scp.onetooneBidirection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int addid;
	private String city;
	private int pincode;
	@OneToOne(mappedBy="ad",cascade=CascadeType.ALL)
	private Student student;
	@Override
	public String toString() {
		return "Address [addid=" + addid + ", city=" + city + ", pincode=" + pincode + "]";
	}

	public Student getStudent() {
		return student;
	}

	public int getAddid() {
		return addid;
	}

	public void setAddid(int addid) {
		this.addid = addid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Address(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}
		
	public Address(String city, int pincode, Student student) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.student = student;
	}

	public Address(int addid, String city, int pincode) {
		super();
		this.addid = addid;
		this.city = city;
		this.pincode = pincode;
	}
	}

