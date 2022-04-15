package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Organization;
import com.example.demo.service.OrganizationService;

@RestController
@RequestMapping("/tcs")
public class OrganizationController {
	
	@Autowired
	private OrganizationService osi;
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Organization orgz)
	{
		
		System.out.println(orgz);
		
		return osi.joinOrganization(orgz.getEmp(), orgz.getEmpHealth());
		
		
	}
	
	@DeleteMapping("delete/{empid}")
	public String deleteEmployee(@PathVariable String empid)
	//public String deleteEmployee(@RequestParam String empid)
	{
		return osi.leaveOrganization(empid);
	}

}
