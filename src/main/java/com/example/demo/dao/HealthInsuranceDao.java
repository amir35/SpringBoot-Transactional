package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.EmployeeHealthInsurance;

public interface HealthInsuranceDao extends JpaRepository<EmployeeHealthInsurance, String> {

}
