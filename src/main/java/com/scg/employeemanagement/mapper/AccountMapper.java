package com.scg.employeemanagement.mapper;

import org.mapstruct.Mapper;

import com.scg.employeemanagement.dao.entity.Account;
import com.scg.employeemanagement.vo.AccountVO;

@Mapper(
	    componentModel = "spring"
	)
public interface AccountMapper {
	
	Account toEntity (AccountVO accountVO);
	
	AccountVO  toVO (Account account);

}
