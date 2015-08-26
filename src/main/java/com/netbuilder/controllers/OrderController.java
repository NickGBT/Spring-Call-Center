package com.netbuilder.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netbuilder.entities.Address;
import com.netbuilder.entities.Customer;

/**
 * @author jtaylor
 */

@Controller
public class OrderController {
	ArrayList<Address> allAddresses = new ArrayList<Address>();
	
	@RequestMapping(value="/addressListView", method = RequestMethod.GET)
	@ResponseBody	
	public ArrayList<Address> allCustomers() {		
		return allAddresses;
	}
	
	@RequestMapping(value="/orderform")
	public String loadOrderForm(){
		return "forward:orderform.jsp";
	}
	
	@RequestMapping(value="/submitorder", method = RequestMethod.GET)
	public String submitOrder(@RequestParam(value = "addressLine1", required = true) String addressLine1,
			@RequestParam(value = "addressLine2", required = true) String addressLine2, @RequestParam(value = "addressLine3", required = true) String addressLine3, @RequestParam(value = "city", required = true) String city,
			@RequestParam(value = "county", required = true) String county, @RequestParam(value = "postcode", required = true) String postcode, @RequestParam(value = "billingAddress", required = false) boolean isBillingAddress, @RequestParam(value = "orderId", required = true) String orderId, @RequestParam(value = "userId", required = true) String userId){
		Address address = new Address (orderId, addressLine1, addressLine2, addressLine3, city, county, postcode, isBillingAddress);
		allAddresses.add(address);
		return "forward:orderform.jsp";
	}

	
	@ModelAttribute("fulladdresslist")
	public ArrayList<Address> customerListStuff(){
		return allAddresses;
	}
	
	
}
