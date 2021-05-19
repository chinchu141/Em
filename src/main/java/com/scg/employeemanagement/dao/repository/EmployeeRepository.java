package com.scg.employeemanagement.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scg.employeemanagement.dao.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	//private List<Employee> getEmployeesByDepartment(Integer deptId);

}
