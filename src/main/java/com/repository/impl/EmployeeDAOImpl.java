package com.repository.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.model.Employee;
import com.repository.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO {

	private static Employee[] employeeList = new Employee[0];

	@Override
	public void create(Employee employee) {
		int newSize = employeeList.length + 1;
		employeeList = Arrays.copyOf(employeeList, newSize);
		employeeList[newSize - 1] = employee;
	}

	@Override
	public Employee[] readAll() {
		return employeeList;
	}

	// TODO tentar aplicar a busca binaria
	@Override
	public void delete(String key) {
		for (int i = 0; i < employeeList.length; i++) {
			if (employeeList[i].getCpf().equals(key)) {
				for (int j = i; j < employeeList.length - 1; i++) {
					employeeList[j] = employeeList[j - 1];
				}
				if (employeeList.length == 1) {
					employeeList = Arrays.copyOf(employeeList, 0);
				} else {
					employeeList = Arrays.copyOf(employeeList, employeeList.length);
				}
			}
		}
	}

	@Override
	public void update(Employee employee, String key) {
		for (int i = 0; i < employeeList.length; i++) {
			if (employeeList[i].getCpf().equals(key)) {
				employeeList[i] = employee;
			}
		}
	}

	@Override
	public Employee read(String key) {
		for (int i = 0; i < employeeList.length; i++) {
			if (employeeList[i].getCpf().equals(key)) {
				return employeeList[i];
			}
		}
		return null;
	}
}
