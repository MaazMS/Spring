package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired 
	private ProjectServices projectServices;
	public String find(Model model) {
		model.addAttribute("projects",this.projectServices.findAll());
		
		return "Projects";
	}

}
