package com.p1;



import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class MainForHQL {

	public static void main(String[] args) {
		

		System.out.println("1");
		
		Session session = SessionFactoryUtil.getFactory().openSession();
		
		
		System.out.println(" 2");
		Query<Student> q = session.createQuery("select marks,address from Student");
		List<Student> list = q.list();
		System.out.println(list.size());

	}

}
