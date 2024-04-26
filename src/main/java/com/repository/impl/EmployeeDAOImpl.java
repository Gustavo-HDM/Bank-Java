package com.repository.impl;

import com.model.Employee;
import com.repository.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private static Employee[] employeeList = new Employee[150];

	@Override
	public void create(Employee employee) {
		
	}

	@Override
	public Employee[] readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employee employee, String cpf) {
		// TODO Auto-generated method stub
		
	}

}
