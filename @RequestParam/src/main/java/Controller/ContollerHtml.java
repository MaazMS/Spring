package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConytollerHtml {

	@RequestMapping("/html")
	public String HTML()
	{
		return "Details";
	}
	@RequestMapping("/processing-page")
	public String page()
	{
		return "Htmlinfo";
	}
}
