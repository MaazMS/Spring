package com.home.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// @component same you create object for me. 
@Controller
@RequestMapping("/sis")
//RequestMapping sis is help not access the makeup and Book RequestMapping 
// It is access by home.come/sis/Book or home.com/sis/makeup
public class Siscontroller {
	
	
	@ResponseBody
	@RequestMapping("/makeup")
	public String getMakeupKit() {
		
		return "ok. take makep kit"; 
	}
	
	@ResponseBody
	@RequestMapping("/Book")

	public String getBooks() {
		
		return  "This is my book"; 
	}

}
