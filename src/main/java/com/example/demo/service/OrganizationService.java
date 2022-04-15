package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeHealthInsurance;

public interface OrganizationService {
	
	public String joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

	public String leaveOrganization(String empid);


}
