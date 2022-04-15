package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.HealthInsuranceDao;
import com.example.demo.model.EmployeeHealthInsurance;
import com.example.demo.service.HealthInsuranceService;

@Service
public class HealthInsuranceServiceImpl implements HealthInsuranceService{
	
	@Autowired
	private HealthInsuranceDao healthDao;

	@Override
	public void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance) {
		
		healthDao.save(employeeHealthInsurance);
		
	}

	@Override
	public void deleteEmployeeHealthInsuranceById(String empid) {


		healthDao.deleteById(empid);
		
	}

}
