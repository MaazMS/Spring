package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class DadController {


	//@ResponseBody //is not use if we working on view Resolver
	@RequestMapping("/view")
	public String giveSuger() {
		
		return "/WEB-INF/view/NewFile.jsp" ;
		
	}

}
/*  
 
<!DOCTYPE html>
<html>

<body bgcolor="yellow">
<h1> This call by dadController</h1>
</body>
</html> 
*/

