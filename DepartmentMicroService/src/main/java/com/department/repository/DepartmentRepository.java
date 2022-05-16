package com.department.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.department.models.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, Integer> {

}
