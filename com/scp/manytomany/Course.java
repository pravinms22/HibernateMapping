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

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	private String cname;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn
	/*@JoinTable(name="Joint_account", joinColumns = @JoinColumn(name="cid"),
	inverseJoinColumns = @JoinColumn(name="id"))*/
	private List<Teacher> teachers;
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}


	public Course(String cname) {
		super();
		this.cname = cname;
	}
	
	public void add(Teacher tempTeacher)
	{
		if(teachers==null) {
			teachers=new ArrayList<>();
		}
		
		teachers.add(tempTeacher);
		//tempTeacher.setCourses(this);
	
		}
	

}
