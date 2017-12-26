package com.scp.onetomanycopy;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.scp.hibernate.SessionUtil;

public class TestDemo {
	
	public static void main(String[] args) {
		
		Teacher teacher=new Teacher("Pravin");
		Student s1=new Student("akshay");
		Student s2=new Student("mahesh");

		Session session=SessionUtil.genarateFacrory().openSession();
		Transaction t=session.beginTransaction();
		teacher.add(s1);
		teacher.add(s2);
		
		session.save(s1);
		session.save(s2);
		
		t.commit();
		
		session.close();
		
		
	}

}
