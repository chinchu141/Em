package com.scg.employeemanagement.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scg.employeemanagement.dao.EmployeeDao;
import com.scg.employeemanagement.dao.entity.Department;
import com.scg.employeemanagement.dao.entity.Employee;
import com.scg.employeemanagement.dao.repository.AccountRepository;
import com.scg.employeemanagement.dao.repository.DepartmentRepository;
import com.scg.employeemanagement.dao.repository.EmployeeRepository;
import com.scg.employeemanagement.mapper.DepartmentMapper;
import com.scg.employeemanagement.mapper.EmployeeMapper;
import com.scg.employeemanagement.vo.AccountVO;
import com.scg.employeemanagement.vo.DepartmentVO;
import com.scg.employeemanagement.vo.EmployeeVO;

@Component
public class EmployeeDaoimpl implements EmployeeDao {
    
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//@Autowired
   // private AccountRepository accountRepository;
	
	
	@Autowired
    private EmployeeMapper employeeMapper;
	
	
	
    
    

	@Override
	public EmployeeVO addEmployee(EmployeeVO employeeVO) {
		Employee employee;
		employee = employeeMapper.toEntity(employeeVO);
		employee = employeeRepository.save(employee);
		employeeVO = employeeMapper.toVO(employee);
		return employeeVO;
	}



	@Override
	public List<Employee> getEmployees() {
		
		return employeeRepository.findAll();
	}


	@Override
	public String deleteEmployee(int id) {
		
		employeeRepository.deleteById(id);
		return "Employee id : " + id + " Removed";
	}



	@Override
	public EmployeeVO updateEmployee(EmployeeVO employeeVO) {
		Employee employee;
		employee = employeeMapper.toEntity(employeeVO);
		final Employee existingEmployee = employeeRepository.findById(employee.getEmployeeId()).orElse(null);
		existingEmployee.setEmployeeName(employee.getEmployeeName());
		employee = employeeRepository.save(existingEmployee);
		employeeVO = employeeMapper.toVO(employee);
		return employeeVO;
		
	}




	




	


	

}
