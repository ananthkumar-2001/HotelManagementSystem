package com.department.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "Departments")
public class Department {
	
	@Transient
	public static final String SEQUENCE_NAME = "user_sequence";

	@Id
	private int departmentId;
	
	private String departmentName;
	
	private float avgSalary;

	private int noOfEmployees;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	public float getAvgSalary() {
		return avgSalary;
	}

	public void setAvgSalary(float avgSalary) {
		this.avgSalary = avgSalary;
	}
	
	
}
