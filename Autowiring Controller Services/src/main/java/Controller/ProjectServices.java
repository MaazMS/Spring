package Controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

import entities.Project;

public class ProjectServices {

	private List<Project> projects = new LinkedList<>(); 
	
	public ProjectServices() {
		Project javaProject = this.CreateProject("java Project","This is java Project");
		Project javaScriptProject = this.CreateProject("javaScript Project","This is javaScript Project");
		Project htmlProject = this.CreateProject("html Project","This is html Project");
		this.projects.addAll(Arrays.asList(new Project[] {javaProject,javaScriptProject,htmlProject}));
	}
	publicList<Project>findAll(){
		return this.projects;
	}
	
	publicProject finf(Long projectId) {
		return this.projects.stream().filter(p ->{
			return p.getProjectId().equals(ProjectId);
		}).collect(Collectors.toList().get(0));
	}
	private Project createProject(String title,String description) {
		Project project = new Project(); 
		project.setProjectid("101");
		project.setName(title);
		project.setAnthorizedFound(new BigDecimal("100000"));
		project.setAuthorizedHours((new BigDecimal("10000"));
		project.setSpecial(false);
		project.setSponsor("Maaz");
		project.setType("single");
		project.setYear("2020");
		project.setDescription(description);
		
		return project;
	}
}
