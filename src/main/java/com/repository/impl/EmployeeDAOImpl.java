package com.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.model.Employee;
import com.repository.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private static List<Employee> employeeList = new ArrayList<>();

	@Override
	public void create(Employee employee) {
		employeeList.add(employee);
	}

	@Override
	public List<Employee> readAll() {
		return employeeList;
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
