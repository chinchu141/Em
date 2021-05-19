package com.scg.employeemanagement.vo;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuditVO {

	private String createdBy;

	private LocalDateTime createdTimestamp;

	private String lastUpdatedBy;

	private LocalDateTime lastUpdatedTimestamp;

	private Integer recordVersionNo;

}
