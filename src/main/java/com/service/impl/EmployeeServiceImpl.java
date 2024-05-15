package com.service.impl;

import com.model.Employee;
import com.repository.EmployeeDAO;
import com.repository.impl.EmployeeDAOImpl;
import com.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	
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
		this.employeeDAO.delete(cpf);
	}

	@Override
	public void update(Employee employee, String cpf) {
		this.employeeDAO.update(employee, cpf);
	}

	@Override
	public Employee read(String key) {
		// TODO Auto-generated method stub
		return null;
	}
}
