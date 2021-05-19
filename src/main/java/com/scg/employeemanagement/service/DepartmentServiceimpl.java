package com.scg.employeemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scg.employeemanagement.dao.DepartmentDao;
import com.scg.employeemanagement.vo.DepartmentVO;

@Service
public class DepartmentServiceimpl implements DepartmentService{
	
	@Autowired
	private DepartmentDao departmentDao;
	@Override
	public void addDepartment(DepartmentVO departmentVO) {
	System.out.println("namement ="+ departmentVO.getDepartmentName());
		System.out.println( departmentDao.addDepartment(departmentVO));
		//return employeeDao.addDepartment(departmentVO);
	}
	

}
