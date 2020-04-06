package part7;

public class Student {

	private String name; 
	private String course; 
	private String hobby; 

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void display() {
		
		System.out.println("Student name" + name);
		System.out.println("Student course" + course);
		System.out.println("Student hobby" + hobby); 
	}
	
}
