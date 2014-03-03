package com.sree.training;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="regularemployee103")
@PrimaryKeyJoinColumn(name="ID")
public class RegularEmployee extends Employee {
	      
	@Column(name="salary")    
	private float salary;  
	  
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Column(name="bonus")     
	private int bonus;
	
}
