package com.service.impl;

import com.model.Employee;
import com.repository.EmployeeDAO;
import com.repository.impl.EmployeeDAOImpl;
import com.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	
	@Override
	public void create(Employee employee) {
		employeeDAO.create(employee);
	}

	@Override
	public Employee[] readAll() {
		return employeeDAO.readAll();
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