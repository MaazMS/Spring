package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SunController {
// Working of prefix and suffix
	@RequestMapping("/Sun")
	public String followTime() {
		
		return "NewFile";
	}
}
