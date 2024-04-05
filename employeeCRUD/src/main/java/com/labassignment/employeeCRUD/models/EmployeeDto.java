package com.labassignment.employeeCRUD.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public class EmployeeDto {
	
	@NotEmpty(message="Name is required")
	private String name;
	
	@NotEmpty(message="Job role is required")
	private String jobRole;
	
	@Min(value = 0, message = "Salary must be greater than or equal to 0")
	private double salary;
	
	@Size(min = 10, max = 2000, message = "Description must be between 10 and 2000 characters")
	private String description;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}