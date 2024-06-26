package com.controller;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.impl.EmployeeServiceImpl;

public class EmployeeController {

	private EmployeeService employeeService = new EmployeeServiceImpl();
	
	public void create(Employee employee) {
		employeeService.create(employee);
	}

	public Employee[] readAll() {
		return employeeService.readAll();
	}
	
	public void update (Employee employee, String key) {
		employeeService.update(employee, key);
	}
	
	public void delete (String key) {
		employeeService.delete(key);
	}
	
	public void read (String key) {
		employeeService.read(key);
	}
	
}
