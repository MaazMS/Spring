package Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContollerHtml {

	@RequestMapping("/html")
	public String HTML() {
		return "Details";
	}

	@RequestMapping("/processing-page")
	public String page(@RequestParam("first_name") String first_name1, @RequestParam("last_name") String last_name1,
			@RequestParam String name, Model model) {

		System.out.println("first name" + first_name1);
		System.out.println("last name" + last_name1);

		model.addAttribute("first_name", first_name1); // Attribute name ,Attribute value
		model.addAttribute("last_name", last_name1); // Attribute name ,Attribute value
		model.addAttribute("name", name); // Attribute name ,Attribute value

		return "Htmlinfo";
	}
	// mathod 2
	/*
	 * @RequestMapping("/processing-page") public String page(@RequestParam String
	 * first_name, @RequestParam String last_name ,Model model) {
	 * 
	 * model.addAttribute("first_name "+first_name);
	 * model.addAttribute("last_name"+last_name); return "Htmlinfo";
	 * 
	 * }
	 */
}