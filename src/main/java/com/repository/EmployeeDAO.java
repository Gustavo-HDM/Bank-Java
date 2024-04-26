package com.repository;

import com.model.Employee;

public interface EmployeeDAO {
	public void create(Employee employee);
	public Employee[] readAll();
	public void delete(String cpf);
	public void update(Employee employee, String cpf);
}
