package com.home.mycafe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {

	@RequestMapping("/yourOrder")
	public String Home(Model model) {
	// sending to jsp page hardcord 
		String myName="Maaz";
		model.addAttribute("Dame",myName);
		model.addAttribute("Website","call by MyCafeController" );
		return "NewFile"; 
	}

}
