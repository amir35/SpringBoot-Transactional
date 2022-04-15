package com.example.demo.serviceImpl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao empDao;

	@Override
	public void insertEmployee(Employee emp) {
		
		empDao.save(emp);
		
		
	}

	@Override
	public void deleteEmployeeById(String empid) {
		
		empDao.deleteById(empid);
		
	}

}
