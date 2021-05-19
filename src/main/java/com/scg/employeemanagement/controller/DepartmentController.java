package com.scg.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.employeemanagement.service.DepartmentService;
import com.scg.employeemanagement.service.EmployeeService;
import com.scg.employeemanagement.vo.DepartmentVO;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	 
	@PostMapping
	public void addDepartment(@RequestBody final DepartmentVO departmentVO) {
		
		departmentService.addDepartment(departmentVO);
	}
	
}
