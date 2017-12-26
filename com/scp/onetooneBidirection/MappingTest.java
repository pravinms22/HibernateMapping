package com.scp.onetooneBidirection;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.scp.hibernate.SessionUtil;

public class MappingTest {

	public static void main(String[] args) {
		
		Student s1=new Student("pravin");
		Student s2=new Student("sonu");
		
		Address ad1=new Address("Mumbai", 15,s1);
		Address ad2=new Address("Satara", 20,s2);
		
		
	Session session=SessionUtil.genarateFacrory().openSession();
	Transaction t=session.beginTransaction();
	session.save(ad1);
	session.save(ad2);
	
	
	Address ad3=session.get(Address.class,2);
	System.out.println("address:"+ad3);
	System.out.println("assosciated Student:"+ad3.getStudent());
	t.commit();
	
	session.close();
	
	
	}
}
