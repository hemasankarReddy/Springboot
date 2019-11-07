package com.mkyong.services;

import com.mkyong.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {


	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> list = new ArrayList<>();
		for(int i=0;i<20;i++){
			Employee e= new Employee();
			e.setId(i);
			e.setActive(true);
			e.setEmail("mail:"+i);
			e.setName("Name:"+i);
			e.setLastName("LAstName:"+i);
			e.setPhone("123456789"+i);
			list.add(e);
		}

		return list;

	}

	@Override
	public Employee getEmployeeById(long id) {
		return new Employee();
	}

}
