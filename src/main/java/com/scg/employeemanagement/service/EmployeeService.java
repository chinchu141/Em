package com.scg.employeemanagement.service;

import java.util.List;

import com.scg.employeemanagement.dao.entity.Employee;
import com.scg.employeemanagement.vo.DepartmentVO;
import com.scg.employeemanagement.vo.EmployeeVO;

public interface EmployeeService {
	EmployeeVO addEmployee(final EmployeeVO employeeVO);
	
	//List<Employee> getEmployees();
	void getEmployees();
	void deleteEmployee(final int id);
	EmployeeVO updateEmployee(EmployeeVO employeeVO);

	
	
	
	    
}
