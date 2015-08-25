package com.netbuilder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.netbuilder.entities.Customer;
import com.netbuilder.util.CustomerList;

@Controller
public class CustomerDisplayController {

	
	@RequestMapping(value="/checkCustomer", method = RequestMethod.GET)
	public Customer getCustomer(@RequestParam(value="uId", required=true)int uId){

		for(Customer c: CustomerList.allCustomers){
			
		}
		
		return null;
	}
}
