package Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import DTO.UseInfoDTo;

@Controller
public class ContollerHtml {

	@RequestMapping("/html")
	public String HTML(@ModelAttribute("userInfo") UseInfoDTo useDTo) {
		return "Details";
	}

	@RequestMapping("/processing-page")
	public String page(@ModelAttribute("userInfo") UseInfoDTo useDTo) {

		return "Htmlinfo";
	}
}