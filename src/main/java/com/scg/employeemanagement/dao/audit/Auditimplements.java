package com.scg.employeemanagement.dao.audit;


import java.time.LocalDateTime;

import javax.persistence.PrePersist;

import org.springframework.stereotype.Component;

import com.scg.employeemanagement.dao.entity.Audit;

@Component
public class Auditimplements{
	
   public void setCreate(Audit audit) {
	   LocalDateTime now = LocalDateTime.now();
	   audit.setCreatedBy("");
	    audit.setCreatedTimestamp(now); 
	     
	      audit.setLastUpdatedBy("");
	   audit.setLastUpdatedTimestamp(now);
	   audit.setRecordVersionNo(5);
	   System.out.println(System.getProperties());
   }
}
