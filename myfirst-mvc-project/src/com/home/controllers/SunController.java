package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SunController {
// it is acces by home.com/Sun after the url and display string NewFile 
	@ResponseBody
	@RequestMapping("/Sun")
	public String followTime() {
		
		return "NewFile";
	}
}
