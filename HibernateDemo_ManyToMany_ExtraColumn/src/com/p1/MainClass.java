package com.p1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		/* Java Book Publisher A */
		Book java = new Book("Java Book");
		Publisher p1 = new Publisher("A Publisher");
		BookPublisherRelationship bookpublish_details_java = new BookPublisherRelationship(java, p1, new Date());
		java.getBookpublishers().add(bookpublish_details_java);
		
		/* Java Book Publisher B */
		Publisher p2 = new Publisher("B Publisher");
		BookPublisherRelationship bookpublish_details_java2 = new BookPublisherRelationship(java, p2, new Date());
		java.getBookpublishers().add(bookpublish_details_java2); // notice : same book 
		
			
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		System.out.println("1");
		session.save(java);
		session.save(p1);
		session.save(p2);
		
		System.out.println("2");
		t.commit();
		session.close();
		
		System.out.println("All Done");
		
	}//end main
	
	
	/*
	 
		Publisher p4 = new Publisher("D Publisher");
		
	  
	  
	 */
	
	
}//end class
