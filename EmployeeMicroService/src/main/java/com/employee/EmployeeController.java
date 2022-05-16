package com.employee;

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

import com.employee.models.Employee;
import com.employee.service.EmployeeService;
import com.employee.service.SequenceGeneratorservice;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/employee")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private SequenceGeneratorservice sequenceGeneratorservice;

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public ResponseEntity<Void> addEmployee(@RequestBody Employee employee) {
		try {
			employee.setEmployeeId(sequenceGeneratorservice.getSequenceNumber(employee.SEQUENCE_NAME));
			employeeService.addEmployee(employee);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update/{employeeId}")
	public ResponseEntity<Void> updateEmployee(@RequestBody Employee employee, @PathVariable(value = "employeeId") int employeeId) {
		try {
			employeeService.updateEmployee(employee,employeeId);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{employeeId}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable(value = "employeeId") int employeeId) {
		try {
			employeeService.deleteEmployee(employeeId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		try {
			List<Employee> list = employeeService.getAllEmployee();
			if(list.size()<=0) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			return ResponseEntity.of(Optional.of(list));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GetMapping("/get/{employeeId}")
	public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable(value = "employeeId") int employeeId){
		
		try {
			Optional<Employee> employee = employeeService.getEmployeeById(employeeId);
			if(employee==null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			else {
				return ResponseEntity.of(Optional.of(employee));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
