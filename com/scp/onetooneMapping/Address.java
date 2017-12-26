package com.scp.onetooneMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int addid;
	private String city;
	private int pincode;
	public Address(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}
		
	public Address(int addid, String city, int pincode) {
		super();
		this.addid = addid;
		this.city = city;
		this.pincode = pincode;
	}
	}

