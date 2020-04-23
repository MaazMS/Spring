package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import DTOAPI.RegistrationDTO;

@Controller
public class RegisterController { 
	
	@RequestMapping("/Register")
	public String showRegistration(@ModelAttribute("userReg") RegistrationDTO dto ) {
		
		return "showRegistration";
	}
	
	@RequestMapping("/processing_page")
	public String page(@ModelAttribute("Display") RegistrationDTO dto ) {
		
		return "processing_page";
	}
}