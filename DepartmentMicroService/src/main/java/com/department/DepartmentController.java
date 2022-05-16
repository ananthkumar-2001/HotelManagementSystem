package com.department;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.department.service.SequenceGeneratorservice;
import com.department.models.Department;
import com.department.service.DepartmentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private SequenceGeneratorservice sequenceGeneratorservice;

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public ResponseEntity<Void> addDepartment(@RequestBody Department department) {
		try {
			department.setDepartmentId(sequenceGeneratorservice.getSequenceNumber(department.SEQUENCE_NAME));
			departmentService.addDepartment(department);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update/{departmentId}")
	public ResponseEntity<Void> updateDepartment(@RequestBody Department department, @PathVariable(value = "departmentId") int departmentId) {
		try {
			departmentService.updateDepartment(department,departmentId);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{departmentId}")
	public ResponseEntity<Void> deleteDepartment( @PathVariable(value = "departmentId") int departmentId) {
		try {
			departmentService.deleteDepartment(departmentId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Department>> getAllDepartments(){
		List<Department> list = departmentService.getAllDepartments();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	@GetMapping("/get/{departmentId}")
	public ResponseEntity<Optional<Department>> getDepartmentById(@PathVariable(value = "departmentId") int departmentId){
		
		try {
			Optional<Department> department = departmentService.getDepartmentById(departmentId);
			if(department==null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			else {
				return ResponseEntity.of(Optional.of(department));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
