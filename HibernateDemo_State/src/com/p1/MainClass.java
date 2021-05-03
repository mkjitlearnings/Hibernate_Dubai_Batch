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
		
		// ------------- To Save Data -------------
		Student student = new Student("Mr XYZ","Abu Dhabi", 90);
		session.save(student);  // hibernate method . persist (JPA)
		student.setAddress("New Delhi");
		
		student.setAddress("Dubai");
		
		t.commit();
		session.evict(student);
		System.out.println("3");
		student.setAddress("erger");
		session.close();
		
		System.out.println("All Done");
		
	}

}
