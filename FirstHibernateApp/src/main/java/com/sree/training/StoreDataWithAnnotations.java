package com.sree.training;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class StoreDataWithAnnotations {

	public static void main(String[] args) {
		
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee = new Employee();
		employee.setId(100);
		employee.setFirstName("Sree");
		employee.setLastName("Choudary");
		
		Employee employee1 = new Employee();
		employee1.setId(101);
		employee1.setFirstName("haque");
		employee1.setLastName("haque");
		
		session.persist(employee);
		session.persist(employee1);
		
		transaction.commit();
		session.close();
		
		System.out.println("Successfully saved.");

	}

}
