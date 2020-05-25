package entities;

public class Project { 
	
	private String projectid; 
	private String name; 
	private String description; 
	private String sponsor;
	private String authorizedHours;
	private String anthorizedFound; 
	private String year; 
	private String type; 
	private boolean special;
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
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
	public String getAuthorizedHours() {
		return authorizedHours;
	}
	public void setAuthorizedHours(String authorizedHours) {
		this.authorizedHours = authorizedHours;
	}
	public String getAnthorizedFound() {
		return anthorizedFound;
	}
	public void setAnthorizedFound(String anthorizedFound) {
		this.anthorizedFound = anthorizedFound;
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
}