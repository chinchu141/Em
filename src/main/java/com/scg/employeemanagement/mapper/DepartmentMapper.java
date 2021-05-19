package com.scg.employeemanagement.mapper;

import org.mapstruct.Mapper;

import com.scg.employeemanagement.dao.entity.Department;
import com.scg.employeemanagement.vo.DepartmentVO;

	@Mapper(
		    componentModel = "spring"
		)
	
	public interface DepartmentMapper {
		
		Department toEntity (DepartmentVO departmentVO);
		
		DepartmentVO  toVO (Department department);

	}
