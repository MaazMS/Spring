package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// @component same you create objectfor me. 
@Controller
public class BroController {

		@RequestMapping("/Cricketbat")
	public String giveCricketBat() {
	// 	return "mybat"; // extension and path name is add ed in bean.xml33
		return	"/META-INF/view/mybat.jsp";
	}

}

/*
 * 
 * //@ResponseBody it required // return "String .....";
 * 
 * return "/META-INF/view/mybat.html"; //return "/META-INF/view/mybat.jsp"; if
 * view is jsp //it is bade for working is /filename/ view Resolver // location
 * with their extension prefix and suffix mybat to give dispatcher // it work
 * the viewResolver more 20 resolver internalResourceviewResolver

 */