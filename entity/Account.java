package com.scg.employeemanagement.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "account_details")
@Getter
@Setter
//@EntityListeners(Auditimplements.class)
public class Account {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer accountId;
	
	@Column(name = "acc_number", unique = true, nullable = false, length = 100)
    private String accountNumber;
	
	
	
	
	/*@Embedded
	private Audit audit;*/
	
	
    
}