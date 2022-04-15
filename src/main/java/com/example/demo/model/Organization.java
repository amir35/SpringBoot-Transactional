package com.example.demo.model;

public class Organization {
	
	Employee emp;
	EmployeeHealthInsurance empHealth;
	
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public EmployeeHealthInsurance getEmpHealth() {
		return empHealth;
	}
	public void setEmpHealth(EmployeeHealthInsurance empHealth) {
		this.empHealth = empHealth;
	}
	
	
	@Override
	public String toString() {
		return "Organization [emp=" + emp + ", empHealth=" + empHealth + "]";
	}
	
	

}
