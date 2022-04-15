package com.example.demo.serviceImpl;

import java.net.http.HttpResponse;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeHealthInsurance;
import com.example.demo.service.OrganizationService;

@Service
public class OrganizationServiceImpl implements OrganizationService{
	
	@Autowired
	private EmployeeServiceImpl empService;
	
	@Autowired
	private HealthInsuranceServiceImpl healthService;

	@Override
	@Transactional
	public String joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) {
		
		empService.insertEmployee(employee);
		
		if(employee.getEmpId().equals("975639"))
		{
			throw new RuntimeException("Runtime Exception occurs");
		}

		healthService.registerEmployeeHealthInsurance(employeeHealthInsurance);
		
		return "Employee Data inserted";
		
		
	}

	@Override
	@Transactional
	public String leaveOrganization(String empId) {
		
		empService.deleteEmployeeById(empId);
		
		if(empId.equals("975637"))
		{
			throw new RuntimeException("Runtime Exception occurs");
		}
		
		healthService.deleteEmployeeHealthInsuranceById(empId);
		
		return "Record Successfully Deleted";
		
	}

}
