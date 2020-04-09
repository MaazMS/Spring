package com.home.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class order {
// return welcome page 
	@RequestMapping("/cafe")
	public String Home(Model model) {
		return "food";  
	}  
	
	
	@RequestMapping("processOrder")// action name 
	public String processOrder(HttpServletRequest request,Model model ) // accept the http request in this method
	{
		// handle data  recevie form user
	String UerEnteredValue =	request.getParameter("foodType"); // foodType is the name of textbox
	
	model.addAttribute("userInput",UerEnteredValue);
		return "process-Order";
	}
	
	
	}
