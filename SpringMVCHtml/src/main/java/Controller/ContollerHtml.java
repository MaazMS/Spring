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
	public String HTML(Model model) {

		// read the existing property by fetching DTO
		UseInfoDTo DisDTO = new UseInfoDTo();
		model.addAttribute("display", DisDTO);

		return "Details";
	}

	@RequestMapping("/processing-page")
	public String page(UseInfoDTo useDTo, Model model) {

		System.out.println("first name" + useDTo.getFirst_name());
		System.out.println("last name" + useDTo.getLast_name());
		System.out.println("last name" + useDTo.getname());
		
		// write the value to the property by fetching from url
		model.addAttribute("userInfo", useDTo); // Attribute name ,Attribute value

		return "Htmlinfo";
	}
}