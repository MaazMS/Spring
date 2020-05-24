package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class home {  
	
	@RequestMapping("/project")
	public String frontpage(Model model) {
	
		
		Project project = new Project(); 
		project.setProjectid("First project");
		project.setName("Spring Model ");
		project.setDescription("This project is show how model is working");
		project.setAuthorizedHours("24 hours");
		project.setAnthorizedFound("New person");
		project.setSponsor("Maaz Shaikh");
		project.setType("level one ");
		project.setYear("2020");
		project.setSpecial(true);
	
		model.addAttribute("CurrentProject",project);
		
		return "home"; 
	} 

}
