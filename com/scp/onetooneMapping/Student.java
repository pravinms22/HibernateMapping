package com.scp.onetooneMapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.NotFound;

@Entity

public class Student {

	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	//@JoinColumn
	//@JoinTable(name="JOIN_TABLE", joinColumns = @JoinColumn(name="id"),
	//inverseJoinColumns = @JoinColumn(name="addid"))
	Address ad;
	public Student(int id, String name, Address ad) {
		super();
		this.id = id;
		this.name = name;
		this.ad = ad;
	}
	
	public Student(String name, Address ad) {
		super();
		this.name = name;
		this.ad = ad;
	}
	
}
