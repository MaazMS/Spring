package getterSetter;

public class Student { 
	
	int rollNumber; 
	String name; 
	
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int dispaly() {
		
		System.out.println("Student roll number	"+rollNumber+"	Student name	"+name);
		return 0;
	}
}
