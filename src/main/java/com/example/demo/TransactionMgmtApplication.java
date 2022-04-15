package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeHealthInsurance;
import com.example.demo.service.OrganizationService;

@SpringBootApplication
public class TransactionMgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionMgmtApplication.class, args);
		
		
		/*
		Employee emp = new Employee();
		emp.setEmpId("975639");
		emp.setEmpName("Amir");

		EmployeeHealthInsurance employeeHealthInsurance = new EmployeeHealthInsurance();
		employeeHealthInsurance.setEmpId("975639");
		employeeHealthInsurance.setHealthInsuranceSchemeName("Premium");
		employeeHealthInsurance.setCoverageAmount(20000);
		*/
	}

}
