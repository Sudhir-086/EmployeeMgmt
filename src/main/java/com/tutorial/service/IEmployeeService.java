package com.tutorial.service;

import java.util.List;
import java.util.Optional;

import com.tutorial.entity.Employee;

public interface IEmployeeService {

	List<Employee> findAllEmployee();
	Optional<Employee> findById(Integer id);
	Employee saveEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	void deleteEmployee(Integer id);
	
}
