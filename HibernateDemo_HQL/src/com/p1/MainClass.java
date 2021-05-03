package com.p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		
		
		
		System.out.println("1");
		
		Session session = SessionFactoryUtil.getFactory().openSession();
		Transaction t = session.beginTransaction();
		
		System.out.println(" 2");
		
		
		Student s1 = new Student("frahan","riyadh",45);
		Student s2 = new Student("abdul","riyadh",45);
		Student s3 = new Student("amir","dubai",45);
		Student s4 = new Student("sofia","dubai",45);
		Student s5 = new Student("ashish","delhi",45);
		Student s6 = new Student("roshan","abu dhabi",45);
		Student s7 = new Student("mike","new york",45);
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		session.save(s5);
		session.save(s6);
		session.save(s7);
		
		
		t.commit();
		session.close();
		System.out.println("All Done");
		
	}
	
	

}
