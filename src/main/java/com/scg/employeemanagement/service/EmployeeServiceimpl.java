package com.scg.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scg.employeemanagement.dao.EmployeeDao;
import com.scg.employeemanagement.dao.entity.Employee;
import com.scg.employeemanagement.vo.AccountVO;
import com.scg.employeemanagement.vo.DepartmentVO;
import com.scg.employeemanagement.vo.EmployeeVO;

@Service
public class EmployeeServiceimpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;

	
	@Override
	public EmployeeVO addEmployee(EmployeeVO employeeVO) {
		
		return employeeDao.addEmployee(employeeVO);
	}
	
	@Override
//	public List<Employee> getEmployees() {
	public void getEmployees() {

		System.out.println(employeeDao.getEmployees());
	}

	@Override
	public void deleteEmployee(int id) {
		
		System.out.println(employeeDao.deleteEmployee(id));
		
	}
	
    @Override
	public EmployeeVO updateEmployee(EmployeeVO employeeVO) {
		
		return employeeDao.updateEmployee(employeeVO);
	}


	
   
}
