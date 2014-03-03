package com.sree.training;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {
	
	public static void main(String[] args) {  
	    Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();  
	      
	    Transaction t = session.beginTransaction();  
	      
	    Employee e1 = new Employee();  
	    e1.setId(1001);  
	    e1.setFirstName("SREE");  
	    e1.setLastName("Choudary");  
	      
	    Employee e2 = new Employee();  
	    e2.setId(1002);  
	    e2.setFirstName("Koti");  
	    e2.setLastName("Choudary");  
	      
	    session.persist(e1);  
	    session.persist(e2);  
	      
	    t.commit();  
	    session.close();  
	    System.out.println("successfully saved");  
	}
	
}
