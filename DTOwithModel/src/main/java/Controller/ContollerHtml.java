package Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import DTO.UseInfoDTo;

@Controller
public class ContollerHtml {

	@RequestMapping("/html")
	public String HTML() {
		return "Details";
	}

	@RequestMapping("/processing-page")
	public String page(UseInfoDTo useDTo, Model model) {

		System.out.println("first name" + useDTo.getFirst_name());
		System.out.println("last name" + useDTo.getLast_name());
		System.out.println("last name" + useDTo.getname());

		model.addAttribute("ModelInfo", useDTo); // Attribute name ,Attribute value

		return "Htmlinfo";
	}
}