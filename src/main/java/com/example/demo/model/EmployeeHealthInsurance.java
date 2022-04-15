package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeeHealthInsurance")
public class EmployeeHealthInsurance {

	@Id
	private String empId;
	private String healthInsuranceSchemeName;
	private int coverageAmount;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getHealthInsuranceSchemeName() {
		return healthInsuranceSchemeName;
	}

	public void setHealthInsuranceSchemeName(String healthInsuranceSchemeName) {
		this.healthInsuranceSchemeName = healthInsuranceSchemeName;
	}

	public int getCoverageAmount() {
		return coverageAmount;
	}

	public void setCoverageAmount(int coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

	@Override
	public String toString() {
		return "EmployeeHealthInsurance [empId=" + empId + ", healthInsuranceSchemeName=" + healthInsuranceSchemeName
				+ ", coverageAmount=" + coverageAmount + "]";
	}
	
	

}
