package com.repository.impl;

import com.model.Employee;
import com.repository.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private static Employee[] employeeList = new Employee[150];

	@Override
	public void create(Employee employee) {
		for (int i = 0; i < employeeList.length; i++) {
			if(employeeList[i] == null) {
				employeeList[i] = employee;
				break;
			}
		}
	}

	@Override
	public Employee[] readAll() {
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
