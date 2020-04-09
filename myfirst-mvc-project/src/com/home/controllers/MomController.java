package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// @component same you create objectfor me. 
@Controller
public class MomController { 
	// all controller register in webApplicationContext
	// The Rule is the the File has unique name with extension in the folder
	// It is acces the Resolver folder file NewFile.jsp by InternalResourceViewResolver in bean.xml
	@RequestMapping("/sugar")
	public String giveSuger() {
		
		return "NewFile";
	}
}
