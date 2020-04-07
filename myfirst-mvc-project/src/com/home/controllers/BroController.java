package com.home.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
	
	
	// @component same you create objectfor me. 
	@Controller
	public class BroController { 
		
		@ResponseBody
		@RequestMapping("/Cricketbat")
		public String giveCricketBat() {
			
			return " ok . take my bat";
		}

	}
