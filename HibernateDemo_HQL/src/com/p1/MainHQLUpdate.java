package com.p1;



import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class MainHQLUpdate {

	public static void main(String[] args) {
		

			
		Session session = SessionFactoryUtil.getFactory().openSession();
		
		
		Query<Student> q = session.createQuery("update Student set address = :newaddress where id = :filterid");
		q.setParameter("newaddress","Updated Address - 123");
		q.setParameter("filterid",1);
		
		
		Transaction t = session.beginTransaction();
		
		int id = q.executeUpdate();
		
		t.commit();
		session.close();
		
	}

}
