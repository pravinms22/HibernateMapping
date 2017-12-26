package com.scp.inheritance;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
//import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	int id;
	
	String name;
	String department;
	public Student(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
}

@Entity
@AttributeOverrides({
    @AttributeOverride(name="name", column=@Column(name="name")),
    @AttributeOverride(name="department", column=@Column(name="department"))
})
class Address extends Student{
	String city;
	int pincode;
	public Address(int id, String name, String department, String city, int pincode) {
		super(id, name, department);
		this.city = city;
		this.pincode = pincode;
	}
	
}
@Entity
@AttributeOverrides({
    @AttributeOverride(name="name", column=@Column(name="name")),
    @AttributeOverride(name="department", column=@Column(name="department"))
})
class Record extends Student{
	String Sub;
	public Record(int id, String name, String department, String sub, int marks) {
		super(id, name, department);
		Sub = sub;
		this.marks = marks;
	}
	int marks;
}