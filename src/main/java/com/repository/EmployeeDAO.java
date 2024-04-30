package com.repository;

import java.util.List;

import com.model.Employee;

public interface EmployeeDAO extends GenericDAO<Employee, String, List<Employee>>{}