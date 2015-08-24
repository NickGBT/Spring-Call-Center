package com.netbuilder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author JustinMabbutt llew
 *
 */
@Controller
public class LoginController 
{
	private String username;
	
	@RequestMapping(value="/employeelogin", method = RequestMethod.GET)
	public String login(@RequestParam(value = "username", required = true) String username,
						@RequestParam(value = "password", required = true) String password)
	{
		if(username.equals("JSmith") && password.equals("password"))
		{
			return "forward:customerList.jsp";
		}
		return "";
	}
	
	@RequestMapping(value="/customerregistration")
	public String toCustomerRegistration()
	{
		return "forward:customerList.jsp";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}