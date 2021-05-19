package com.scg.employeemanagement.mapper;

import org.mapstruct.Mapper;

import com.scg.employeemanagement.dao.entity.Employee;
import com.scg.employeemanagement.vo.EmployeeVO;

//@Mapper(componentModel = "spring")
@Mapper(
	    componentModel = "spring"
	)

public interface EmployeeMapper {
	
	
	EmployeeVO  toVO(Employee employee);
	
	Employee toEntity(EmployeeVO employeeVo);
}
