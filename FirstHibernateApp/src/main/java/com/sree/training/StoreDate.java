package com.sree.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreDate {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee();
		employee.setId(101);
		employee.setFirstName("haque");
		employee.setLastName("haque");
		session.persist(employee);
		transaction.commit();
		session.close();
		System.out.println("Successfully saved.");

	}

}
