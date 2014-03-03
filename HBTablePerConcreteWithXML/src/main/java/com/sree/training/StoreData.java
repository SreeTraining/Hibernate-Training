/**
 * 
 */
package com.sree.training;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author SREECHOUDARY
 *
 */
public class StoreData {

	public static void main(String args[]){
		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setName("Sree");
		
		RegularEmployee regularEmp = new RegularEmployee();
		regularEmp.setName("Vivek");
		regularEmp.setSalary(50000);
		regularEmp.setBonus(5);
		
		ContractEmployee contractEmp = new ContractEmployee();
		contractEmp.setName("Arjun");
		contractEmp.setPay_per_hour(1000);
		contractEmp.setContract_duration("15 hours");
		
		session.persist(emp);
		session.persist(regularEmp);
		session.persist(contractEmp);
		
		transaction.commit();
		session.close();
		System.out.println("Success");
	}
	
}
