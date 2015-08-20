package com.netbuilder.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		return allCustomers;
	}
	
	@RequestMapping(value="/addcustomer", method = RequestMethod.GET)
	public String addCustomer(@RequestParam(value = "customerName", required = true) String customerName,
			@RequestParam(value = "customerId", required = true) Integer customerId){
		Customer customer = new Customer(customerName, customerId);
		allCustomers.add(customer);
		return "forward:customerListView";
	}
	
	@RequestMapping(value="/")
	public String toCustomerList(){
		return "forward:customerList.jsp";
	}
	
	@ModelAttribute("customerliststuff")
	public ArrayList<Customer> customerListStuff(){
		ArrayList<Customer> customerListStuff = new ArrayList<Customer>();	
		for (Customer customer : allCustomers){

			customerListStuff.add(customer);
		}
		return customerListStuff;
	}
	
//	public String toPage() {
//		return "forward:customerListView";
//	}
}
