package com.netbuilder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.netbuilder.entities.Employee;
import com.netbuilder.enums.EmployeeDepartment;
import com.netbuilder.enums.EmployeePermissions;
import com.netbuilder.util.EmployeeList;

/**
 * 
 * @author ngilbert
 *
 */

@Controller
public class EmployeeController {

	@RequestMapping(value="/registeremployee")
	public String registerEmployee(@RequestParam(value="fName", required = true) String fName,
			@RequestParam(value = "lname", required = true) String lName, 
			@RequestParam(value="employeeDepartment", required = true) EmployeeDepartment employeeDepartment,
			@RequestParam(value="employeePermissions", required = true) EmployeePermissions employeePermissions){
		Employee employee = new Employee(fName, lName, employeeDepartment, employeePermissions);
		EmployeeList.allEmployees.add(employee);
		return "forward:registrationvalidation";
	}
}
