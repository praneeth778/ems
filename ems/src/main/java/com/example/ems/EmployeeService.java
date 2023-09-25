package com.example.ems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	private List<Employee> employee=new ArrayList<>(Arrays.asList(
			new Employee("28166","K.Praneeth","Praneeth","Kothali","112","Santosh","12/8/2001","412","134","420"),
			new Employee("28167","K.Sanjay","Sanjay","Koth","234","Kumar","8/10/2000","413","133","419")
			)); 
	
	public List<Employee> getAllemployees(){
		return employee;
	}
	
	public Employee getEmployeebyid(String id) {
		return employee.stream().filter(e->e.getEid().equals(id)).findFirst().get();
		
	}
	
	public void addemployee(Employee emp) {
//		System.out.print("hiii");
		employee.add(emp);
//		Employee e1 = new Employee("1","K","ss","Koth","24","asd","8/10/2000","413","133","419");
//		employee.add(e1);
	}
	
	public void updateemployee(Employee emp,String id) {
		for(int i=0;i<employee.size();i++) {
			Employee e=employee.get(i);
			if(e.getEid().equals(id)) {
				employee.set(i, emp);
				return;
			}
			
		}
	}
	
	public void deleteemployee(String id) {
		employee.removeIf(e->e.getEid().equals(id));
	}

}
