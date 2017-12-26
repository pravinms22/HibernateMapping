package com.scp.onetooneMapping;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.scp.hibernate.SessionUtil;

public class MappingTest {

	public static void main(String[] args) {
		Address ad1=new Address("Mumbai", 15);
		Address ad2=new Address("Satara", 20);

		Student s1=new Student("pravin", ad1);
		Student s2=new Student("sonu", ad2);
	Session session=SessionUtil.genarateFacrory().openSession();
	Transaction t=session.beginTransaction();
	session.save(s1);
	session.save(s2);
	t.commit();
	session.close();
	
	
	}
}
