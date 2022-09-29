package com.tutorial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tutorial.entity.Employee;
import com.tutorial.repo.AddressRepository;
import com.tutorial.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	private final EmployeeRepository employeeRepository;
	private final AddressRepository addressRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository, AddressRepository addressRepository) {
		this.employeeRepository = employeeRepository;
		this.addressRepository = addressRepository;
	}

	@Override
	public List<Employee> findAllEmployee() {
		return employeeRepository.findAll();
	}
	
	@Override
	public Optional<Employee> findById(Integer id) {
		return employeeRepository.findById(id);
	}
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@Override
	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
	}
}
