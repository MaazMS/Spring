package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContollerHtml {

	@RequestMapping("/html")
	public String HTML() {
		return "Details";
	}

	@RequestMapping("/processing-page")
	public String page(@RequestParam String first_name, @RequestParam String last_name) {

		System.out.println("My first name" + first_name);
		System.out.println("My last name" + last_name);
		return "Htmlinfo";

	}
}