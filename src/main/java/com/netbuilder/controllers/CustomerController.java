package com.netbuilder.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.netbuilder.entities.Customer;
import com.netbuilder.util.CustomerList;

/**
 * 
 * @author ngilbert
 *
 */

//controller annotation tells spring that this is a controller class, do not use restcontroller unless you want every method to be annotated with responsebody.
@Controller
public class CustomerController {
	
	@RequestMapping(value="/addcustomer", method = RequestMethod.GET)

	public String addCustomer(@RequestParam(value = "fName", required = true) String fName,
			@RequestParam(value = "lName", required = true) String lName, @RequestParam(value = "contactNumber", required = true) String contactNumber){
		Customer customer = new Customer(fName, lName, contactNumber);
		CustomerList.allCustomers.add(customer);
		//return must be a string for forwarding to work, if responsebody is annotated on the method, forwarding and redirecting will not work, the string itself will be returned.
		return "forward:customerListView";
	}
	
	//simple forwarding method.
	@RequestMapping(value="/")
	public String toCustomerList(){
		return "forward:customerList.jsp";
	}
	
	//modelattribute is used to map a type to a string name
	@ModelAttribute("customerliststuff")
	public ArrayList<Customer> customerListStuff(){
		ArrayList<Customer> customerListStuff = new ArrayList<Customer>();	
		for (Customer customer : CustomerList.allCustomers){

			customerListStuff.add(customer);
		}
		return customerListStuff;
	}
	
}
