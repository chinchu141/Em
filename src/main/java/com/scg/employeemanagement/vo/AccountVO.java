package com.scg.employeemanagement.vo;

import com.scg.employeemanagement.dao.entity.Employee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountVO {


	private String accountNumber;
	private String branch;
	private String ifsc;
	private Employee employee;

	
	
}


