package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeRepository;
import com.example.entity.Employee;
import com.example.exception.EmployeeException;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;

	public List<Employee> getAllEmployee() {
		List<Employee> emp = repository.findAll();
		emp.stream().forEach(p->System.out.println(p.getName()));
		return emp;
		
	}
	@Cacheable("employee")
	public double getSalary(String name) throws EmployeeException {
		
		Employee emp = null;
		double salary =0;
		try {
			System.out.println("fetch from db::::::");
			emp = repository.findByName(name);
			salary = emp.getSalary();
		} catch (Exception e) {
			throw new EmployeeException("employee not found : " + name);
		}
		return salary;
		
	}

}
