package com.employee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.employee.models.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer>{

	
}
