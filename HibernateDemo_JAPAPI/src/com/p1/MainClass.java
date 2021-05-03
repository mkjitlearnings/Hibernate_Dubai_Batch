package com.p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		
		System.out.println("1");
		
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		System.out.println(" 2");
		
		Student student = new Student("Mr XYZ","Abu Dhabi", 90);
		int tid = (int)session.save(student);  
		
		System.out.println("3 - Student Saved "+tid);
		
		//session.evict(student);
		
		tid = (int)session.save(student);  
		
		System.out.println("4 - Student Saved "+tid);
		
		
		t.commit();
		session.close();
		
		
	}

}
