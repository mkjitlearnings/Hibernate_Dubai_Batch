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
		
		
		Student student = session.get(Student.class, 1100);
		
		System.out.println("------------ Session.get Called ----------");
		
		System.out.println("Student Name : - "+student.getName());
		
		t.commit();
		session.close();
		
		
	}

}
