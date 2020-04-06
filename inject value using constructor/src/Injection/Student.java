package Injection;

public class Student {

	private String Name;
	private int id;

	public Student(int id, String Name) {
		this.id = id;
		this.Name = Name;

	}

	
	public void Dislapy() {
		System.out.println("Name of student " + Name);
		System.out.println("id of student " + id);
	}
	
	/*	
	public void setId(int id) {
		this.id = id; 
		System.out.println("id of student setter");
	}
	public void setName(String name) {
		Name = name; 
		System.out.println("Name of student setter");
	}   
	*/ 
}
