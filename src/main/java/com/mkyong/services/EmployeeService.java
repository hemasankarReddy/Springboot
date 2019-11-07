package com.mkyong.services;


import com.mkyong.model.Employee;

import java.util.List;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(long id);
	
}
