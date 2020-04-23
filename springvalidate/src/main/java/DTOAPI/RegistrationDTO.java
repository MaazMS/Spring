package DTOAPI;

import java.util.Arrays;

public class RegistrationDTO { 
	
	private String name;
	private char[] password;  // password in char ?? 
	private String country;   // value give for checkbob
	private String[] hobbies; // reference give their for use JSTL Library and tag // multiple values string array
	private String gender; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}