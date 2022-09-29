package com.tutorial.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.entity.Employee;
import com.tutorial.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private final IEmployeeService iEmployeeService;

	public EmployeeController(IEmployeeService iEmployeeService) {
		this.iEmployeeService = iEmployeeService;
	}
	
	@GetMapping
	public List<Employee> findAllEmployees() {
		return iEmployeeService.findAllEmployee();
	}
	
	@GetMapping("/{id}")
	public Optional<Employee> findEmployeeById(@PathVariable("id") Integer id) {
		return iEmployeeService.findById(id);
	}
	
	@PostMapping
	public Employee savEmployee(@RequestBody Employee employee) {
		return iEmployeeService.saveEmployee(employee);
	}
	
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee employee) {
		return iEmployeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id") Integer id) {
		iEmployeeService.deleteEmployee(id);
	}
}
