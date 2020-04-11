package com.hmkcode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hmkcode.vo.person;

@Controller
public class MyController {
	
	public class MyController{
		
		@ResuestMapping("/view")
		public @ResponseBody person getperson() {
			
			person person= new person (); 
			person.setId(1);
			person.setName("Maaz"); 
			return person; 
		}
		
	}

}
