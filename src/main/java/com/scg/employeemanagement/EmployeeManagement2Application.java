package com.scg.employeemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class EmployeeManagement2Application {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagement2Application.class, args);
	}

}
