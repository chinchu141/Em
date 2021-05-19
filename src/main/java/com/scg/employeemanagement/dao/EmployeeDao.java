package com.scg.employeemanagement.dao;

import java.util.List;

import com.scg.employeemanagement.dao.entity.Employee;
import com.scg.employeemanagement.vo.AccountVO;
import com.scg.employeemanagement.vo.DepartmentVO;
import com.scg.employeemanagement.vo.EmployeeVO;

public interface EmployeeDao {

	EmployeeVO addEmployee(final EmployeeVO employeeVO);
	List<Employee> getEmployees(); 
	String deleteEmployee(int id);
	EmployeeVO updateEmployee(EmployeeVO employeeVO);
	
}