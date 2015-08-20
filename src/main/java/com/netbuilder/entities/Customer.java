package com.netbuilder.entities;

/**
 * 
 * @author ngilbert
 *
 */

public class Customer {
	
	private String fName;
	private String lName;
	private String contactNumber;	

	public Customer(String fName, String lName, String contactNumber) {
		this.fName = fName;
		this.lName = lName;
		this.contactNumber = contactNumber;
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	
}
