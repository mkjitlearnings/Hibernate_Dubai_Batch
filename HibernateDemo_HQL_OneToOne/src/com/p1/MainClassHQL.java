package com.p1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class MainClassHQL {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		
		System.out.println("1");
		
		Session session = factory.openSession();
		
		
		// i want to fetch student and student details from student table 
		
		String hql = "select stu.name,stu.address,sd.email,sd.phoneNumber from Student as stu left join stu.studentDetails sd "
				+ "where stu.id = :filterid";
		
		Query<Object> q= session.createQuery(hql);
		q.setParameter("filterid", 1);
		
		List<Object> lists = q.list();
		
		System.out.println("Size --->> "+lists.size());
		
		for (Object object : lists) {
			System.out.println("Inside for ");
			if(object instanceof Student)
				System.out.println("Student ===>> "+((Student)object).toString());
			if(object instanceof StudentDetails)
				System.out.println("Student Details ===>> "+((StudentDetails)object).toString());
			
			
		}
		
		
		session.close();
		
		
	}

}
