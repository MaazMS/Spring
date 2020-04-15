package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@ResponseBody
	@RequestMapping("/Hello")
	public String SayHellow() {
		
		return "Hello servlet ";
	}
}
