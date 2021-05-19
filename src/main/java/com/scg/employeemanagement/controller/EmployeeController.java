package com.scg.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.employeemanagement.dao.entity.Employee;
import com.scg.employeemanagement.service.EmployeeService;
import com.scg.employeemanagement.service.EmployeeServiceimpl;
import com.scg.employeemanagement.vo.DepartmentVO;
import com.scg.employeemanagement.vo.EmployeeVO;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	 
	@PostMapping
	public EmployeeVO addEmployee(@RequestBody final EmployeeVO employeeVO) {
		
		return employeeService.addEmployee(employeeVO);
	}
	
	
	
	@GetMapping("/list")
//	public List<Employee> getEmployee(){
	public void  getEmployee(){
		employeeService.getEmployees();
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable final int id) {
		employeeService.deleteEmployee(id);
	}
	
	@PutMapping
	public EmployeeVO updateEmployee(@RequestBody final EmployeeVO employeeVO) {
		return employeeService.updateEmployee(employeeVO);
	}

}
