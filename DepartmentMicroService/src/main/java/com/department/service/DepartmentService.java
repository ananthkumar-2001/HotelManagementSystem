package com.department.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.models.Department;
import com.department.repository.DepartmentRepository;


@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public void addDepartment(Department department) {
		// TODO Auto-generated method stub
		try {
			departmentRepository.save(department);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateDepartment(Department department, int departmentId) {
		try {
			departmentRepository.insert(department);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteDepartment( int departmentId) {
		try {
			departmentRepository.deleteById(departmentId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Department> getAllDepartments() {
		List<Department> list = departmentRepository.findAll();
		return list;
	}

	public Optional<Department> getDepartmentById(int departmentId) {
		return departmentRepository.findById(departmentId);
	}
}
