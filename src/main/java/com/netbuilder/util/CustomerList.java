package com.netbuilder.util;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netbuilder.entities.Customer;

@Controller
public class CustomerList {

	public static ArrayList<Customer> allCustomers = new ArrayList<Customer>();
	
	//requestmapping maps types to the page value, these can also be mapped to form actions.
	@RequestMapping(value="/customerListView", method = RequestMethod.GET)
	//responsebody tells spring that the return is to be pushed to the body of the page that the method is mapped to.
	@ResponseBody	
	public ArrayList<Customer> allCustomers() {		
		return allCustomers;
	}
	
	
	
}
