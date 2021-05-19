package com.scg.employeemanagement.vo;

import java.util.List;

import com.scg.employeemanagement.dao.entity.Account;
import com.scg.employeemanagement.dao.entity.Department;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Data
@Getter
@Setter
@ToString
public class EmployeeVO {

	private int employeeId;
	private String employeeName;
	private List<Account> accounts;

}
