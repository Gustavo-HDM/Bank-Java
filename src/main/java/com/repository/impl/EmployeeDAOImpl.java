package com.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.model.Employee;
import com.repository.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO {

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
	public void delete(String key) {
		for (Employee employee : employeeList) {
			if (employee.getCpf().equals(key)) {
				employeeList.remove(employee);
			}
		}
	}

	@Override
	public void update(Employee employee, String key) {
		for (int i = 0; i < employeeList.size(); i++) {
			Employee employeeListed = employeeList.get(i);
			if (employeeListed.getCpf().equals(key)) {
				employeeList.set(i, employee);
			}
		}
	}
}
