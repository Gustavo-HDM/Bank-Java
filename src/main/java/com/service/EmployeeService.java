package com.service;

import com.model.Employee;

public interface EmployeeService {
	public void create(Employee employee);
	public Employee[] readAll();
	public void delete(String cpf);
	public void update(Employee employee, String cpf);
}
