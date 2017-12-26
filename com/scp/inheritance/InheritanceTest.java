package com.scp.inheritance;

import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.scp.hibernate.SessionUtil;

public class InheritanceTest {

	public static void main(String[] args) {

		Session session=SessionUtil.genarateFacrory().openSession();
		Transaction t=session.beginTransaction();
		Student s=new Student(1, "pravin", "extc");
		Address ad=new Address(1,"chaitu", "comp", "pune", 411043);
		Record rd=new Record(1, "sonu", "mbbs", "bio",75);
		session.save(s);
		session.save(ad);
		session.save(rd);
		t.commit();
		session.close();
		
		
	}

}
