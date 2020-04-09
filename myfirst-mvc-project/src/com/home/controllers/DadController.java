package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DadController {  
	
	// It is access the file inside the  /WEB-INF/view/ by controller 
	@RequestMapping("/cash")
	public String getMoney() {
		
		return "/WEB-INF/view/JSP.jsp"; //JSP webpage 
	}

}
