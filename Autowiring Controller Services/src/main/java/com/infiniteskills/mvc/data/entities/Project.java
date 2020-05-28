package com.infiniteskills.mvc.data.entities;

import java.math.BigDecimal;

public class Project { 
	
	private Long projectid; 
	private String name; 
	private String description; 
	private String sponsor;
	private BigDecimal authorizedHours;
	private BigDecimal anthorizedFound; 
	private String year; 
	private String type; 
	private boolean special;
	
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSponsor() {
		return sponsor;
	}
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isSpecial() {
		return special;
	}
	public void setSpecial(boolean special) {
		this.special = special;
	}
	public BigDecimal getAuthorizedHours() {
		return authorizedHours;
	}
	public void setAuthorizedHours(BigDecimal authorizedHours) {
		this.authorizedHours = authorizedHours;
	}
	public BigDecimal getAnthorizedFound() {
		return anthorizedFound;
	}
	public void setAnthorizedFound(BigDecimal anthorizedFound) {
		this.anthorizedFound = anthorizedFound;
	}
	public Long getProjectid() {
		return projectid;
	}
	public void setProjectid(Long projectid) {
		this.projectid = projectid;
	}  
}