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
		
		StudentDetails sd = new StudentDetails("mike@abc.com",4545454);
		Student s = new Student("mike","dubai",200);
		s.setStudentDetails(sd);
		
		
		session.save(s);
		//session.save(sd);
		
		
		t.commit();
		session.close();
		
		
	}

}
