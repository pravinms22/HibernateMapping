package com.scp.manytomany;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.scp.hibernate.SessionUtil;

public class TestDemo {
	
	public static void main(String[] args) {
		
		Course c1=new Course("java");
		Course c2=new Course("php");
		Course c3=new Course("sql");
		Course c4=new Course("c");
		
		Teacher t1=new Teacher("yogesh");
		Teacher t2=new Teacher("ashsih");
		Teacher t3=new Teacher("sangram");
		
		t1.add(c1);
		t1.add(c2);
		t2.add(c3);
		t2.add(c4);
		t3.add(c1);
		t3.add(c3);
		
		c1.add(t1);
		c1.add(t3);
		c2.add(t3);
		c3.add(t2);
		c4.add(t2);
		c4.add(t3);


		Session session=SessionUtil.genarateFacrory().openSession();
		Transaction t=session.beginTransaction();
		
		session.save(t1);
		session.save(t2);
		session.save(t3);
		
		
		
		
		t.commit();
		
		session.close();
		
		
	}

}
