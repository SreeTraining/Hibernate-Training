package com.sree.training;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class StoreData {

	public static void main(String[] args) {
		
		AnnotationConfiguration config = new AnnotationConfiguration();
		Session session = config.configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee emp = new Employee();  
		emp.setName("Sree");  
	      
	    RegularEmployee regEmp = new RegularEmployee();  
	    regEmp.setName("Vivek Kumar");  
	    regEmp.setSalary(50000);  
	    regEmp.setBonus(5);  
	      
	    ContractEmployee conEmp = new ContractEmployee();  
	    conEmp.setName("Arjun Kumar");  
	    conEmp.setPay_per_hour(1000);  
	    conEmp.setContract_duration("15 hours");  
	      
	    session.persist(emp);  
	    session.persist(regEmp);  
	    session.persist(conEmp);  
	      
	    transaction.commit();  
	    session.close();  
	    System.out.println("success");

	}

}
