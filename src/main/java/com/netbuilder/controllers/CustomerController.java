package com.netbuilder.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netbuilder.entities.Customer;

@Controller
public class CustomerController {
	
//	@Inject
	private ArrayList<Customer> allCustomers = new ArrayList<Customer>();
		
	
	@RequestMapping(value="/customerListView", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<Customer> allCustomers() {
		
		Customer customer = new Customer("Steve", 1);
		allCustomers.add(customer);
		return allCustomers;
	}
	
	@RequestMapping(value="/addcustomer", method = RequestMethod.GET)
	@ResponseBody
	public void addCustomer(@RequestParam(value = "customerName", required = true) String customerName,
			@RequestParam(value = "customerId", required = true) Integer customerId){
		Customer customer = new Customer(customerName, customerId);
		allCustomers.add(customer);
		toPage();
	}
	
	@RequestMapping(value="/")
	public String toCustomerList(){
		return "forward:customerList.jsp";
	}
	
	public String toPage(){
		return "forward:customerList.jsp";
	}
}
