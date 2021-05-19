package com.scg.employeemanagement.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scg.employeemanagement.dao.DepartmentDao;
import com.scg.employeemanagement.dao.entity.Department;
import com.scg.employeemanagement.dao.repository.DepartmentRepository;
import com.scg.employeemanagement.mapper.DepartmentMapper;
import com.scg.employeemanagement.vo.DepartmentVO;

@Component
public class DepartmentDaoimpl implements DepartmentDao {
    
	@Autowired
    private DepartmentRepository departmentRepository;
	
	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Override
	public String addDepartment(DepartmentVO departmentVO) {
        
			Department department;
			Department department1;
			DepartmentVO departmentVO1;
			department = departmentMapper.toEntity(departmentVO);
			department1 = departmentRepository.save(department);
			departmentVO1 = departmentMapper.toVO(department1);
			return "name = " +departmentVO1.getDepartmentName();
			
		}
	}


