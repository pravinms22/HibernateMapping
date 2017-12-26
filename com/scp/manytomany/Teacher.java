package com.scp.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Teacher {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToMany(cascade=CascadeType.ALL)
	//@JoinColumn
	/*@JoinTable(name="Joint_account", joinColumns = @JoinColumn(name="id"),
	inverseJoinColumns = @JoinColumn(name="cid"))*/
	private List<Course> courses;
	public Teacher(String name) {
		super();
		this.name = name;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void add(Course tempCourses)
	{
		if(courses==null) {
			courses=new ArrayList<>();
		}
		
		courses.add(tempCourses);
		//tempCourses.setTeachers(this);
	
		}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	}

