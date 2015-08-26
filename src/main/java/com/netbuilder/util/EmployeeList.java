package com.netbuilder.util;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netbuilder.entities.Employee;

@Controller
public class EmployeeList {

	public static ArrayList<Employee> allEmployees = new ArrayList<Employee>();
	
	//requestmapping maps types to the page value, these can also be mapped to form actions.
	@RequestMapping(value="/employeeListView", method = RequestMethod.GET)
	//responsebody tells spring that the return is to be pushed to the body of the page that the method is mapped to.
	@ResponseBody	
	public ArrayList<Employee> allEmployees() {		
		return allEmployees;
	}
	
	
	
}
