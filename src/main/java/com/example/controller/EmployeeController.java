package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EmployeeRepository;
import com.example.entity.Employee;
import com.example.exception.EmployeeException;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository repository;
	@Autowired
	private EmployeeService empService;

	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee) {
		repository.save(employee);
		return "Employee saved..";
	}

	@GetMapping("/getAllEmployees")
	public List<Employee> getAll() {
		return empService.getAllEmployee();
	}
	
	@GetMapping("/getEmployee/{name}")
	public double getEmployeesSalary(@PathVariable String name) throws EmployeeException {
		return empService.getSalary(name);
	}

	

}
