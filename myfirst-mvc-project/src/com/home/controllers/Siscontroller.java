package com.home.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// @component same you create objectfor me. 
@Controller
@RequestMapping("/sis")
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
