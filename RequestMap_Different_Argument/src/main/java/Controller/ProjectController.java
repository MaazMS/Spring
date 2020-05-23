package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/project")
public class ProjectController {

	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addProject(){
		System.out.println(" Add project Get method call");
		return "project_add";
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String saveProject(){
		System.out.println(" save project Post method call");
		return "project_add";
	}
	@RequestMapping(value="/add",method=RequestMethod.POST,params= {"type=single"})
	public String savsingleProject(){
		System.out.println(" save single Project Post method call");
		return "project_add";
	}
	@RequestMapping(value="/add",method=RequestMethod.POST,params= {"type=multiple","special"})
	public String savemultipleProject(){
		System.out.println(" save special Project Post method call");
		return "project_add";
	}
}
