package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConytollerHtml {

	@RequestMapping("/html")
	public String HTML()
	{
		return "Details";
	} 
	@RequestMapping("/processing-page")
	public String page(@RequestParam("first_name") String first_name1 , @RequestParam("last_name") String last_name1 ) {
		
		System.out.println("My first name  "+first_name1);
		System.out.println("My last name  "+last_name1);
		return "Htmlinfo";
	}
	/* mathod 1
	@RequestMapping("/processing-page")
	public String page(@RequestParam String  first_name, @RequestParam String  last_name) {
		
		System.out.println("My first name"+first_name);
		System.out.println("My last name"+last_name);
		return "Htmlinfo";
		
	}
	*/
	
}

