package com.netbuilder.entities;

import com.netbuilder.enums.EmployeeDepartment;
import com.netbuilder.enums.EmployeePermissions;

/**
 * 
 * @author ngilbert
 *
 */

public class Employee {

	private EmployeeDepartment employeeDepartment;
	private String fName;
	private String lName;
	private EmployeePermissions employeePermission;
	
	public Employee(String lName, String fName,
			EmployeeDepartment employeeDepartment, EmployeePermissions employeePermission) {
		this.employeeDepartment = employeeDepartment;
		this.fName = fName;
		this.lName = lName;
		this.employeePermission = employeePermission;
	}

	public EmployeeDepartment getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(EmployeeDepartment employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public EmployeePermissions getEmployeePermission() {
		return employeePermission;
	}

	public void setEmployeePermission(EmployeePermissions employeePermission) {
		this.employeePermission = employeePermission;
	}
		
}

