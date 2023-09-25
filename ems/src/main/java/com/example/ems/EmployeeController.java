package com.example.ems;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	@RequestMapping("/employees")
	public List<Employee> getAllemployees(){
		return employeeservice.getAllemployees();
		
	}
	@RequestMapping("/employees/{eid}")
	public Employee getEmployeebyid(@PathVariable String eid) {
		return employeeservice.getEmployeebyid(eid);
	}
	@RequestMapping(method=RequestMethod.POST,value="/employees")
	public void addemployee(@RequestBody Employee emp) {
		employeeservice.addemployee(emp);
	}
	@RequestMapping(method=RequestMethod.PUT,value="employees/{id}")
	public void updateemployee(@RequestBody Employee emp,@PathVariable String id) {
		employeeservice.updateemployee(emp, id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="employees/{id}")
	public void deleteemployee(@PathVariable String id) {
		employeeservice.deleteemployee(id);
	}

}
