package com.scg.employeemanagement.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.scg.employeemanagement.dao.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepartmentVO {

	private int departmentId;
	private String departmentName;
	private List<Employee> employee;
	
	
	
}
