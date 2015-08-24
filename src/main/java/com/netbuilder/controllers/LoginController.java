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
	@RequestMapping(value="employeeLogin", method = RequestMethod.GET)
	public String login(@RequestParam(value = "username", required = true) String username,
						@RequestParam(value = "password", required = true) String password)
	{
		if(username.equals("JSmith") && password.equals("password"))
		{
			return "forward:customerList.jsp";
		}
		return "";
	}
	
	@RequestMapping(value="/")
	public String toCustomerRegistration()
	{
		return "forward:customerList.jsp";
	}
}