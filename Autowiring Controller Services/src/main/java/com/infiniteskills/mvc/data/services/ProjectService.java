package com.infiniteskills.mvc.data.services;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.infiniteskills.mvc.data.entities.Project;

public class ProjectService {

	private List<Project> projects = new LinkedList<>(); 
	
	public ProjectService() {
		Project javaProject = this.createProject("java Project","This is java Project");
		Project javaScriptProject = this.createProject("javaScript Project","This is javaScript Project");
		Project htmlProject = this.createProject("html Project","This is html Project");
		this.projects.addAll(Arrays.asList(new Project[] {javaProject,javaScriptProject,htmlProject}));
	}
	public List<Project>findAll(){
		return this.projects;
	}
	
	public Project find(Long projectId) {
		return this.projects.stream().filter(p ->{
			return p.getProjectid().equals(projectId);
		}).collect(Collectors.toList()).get(0);
	}
	private Project createProject(String title,String description) {
		Project project = new Project(); 
		project.setName(title);
		project.setAnthorizedFound(new BigDecimal("100000"));
		project.setAuthorizedHours(new BigDecimal("10000"));
		project.setSpecial(false);
		project.setSponsor("Maaz");
		project.setType("single");
		project.setYear("2020");
		project.setDescription(description);
		
		return project;
	}
}
