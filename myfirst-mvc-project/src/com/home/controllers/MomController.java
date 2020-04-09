package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// @component same you create objectfor me. 
@Controller
public class MomController { 
	/// all controller register in webApplicationContext
//  @Responsebody	
	@ResponseBody // sugar
	@RequestMapping("/sugar")
	public String giveSuger() {
		
		return "Mom";
	}

}
