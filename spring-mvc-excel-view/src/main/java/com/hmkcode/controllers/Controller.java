package com.hmkcode.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hmkcode.model.Link;

@RestController
public class Controller {
	
	@RequestMapping(value="/viewExcel",method=RequestMethod.GET)
	
	public ModelAndView getExcel() {
		
		System.out.println("getExcel");
		
		List<Link> links = new LinkedList<Link>();
		links.add(new Link("Androide","androide.com"));
		links.add(new Link("spring","spring.io"));
		links.add(new Link("Firebase","firbase.com"));
		
		return new ModelAndView("ExcelXlsxView","model",links);
		}
}