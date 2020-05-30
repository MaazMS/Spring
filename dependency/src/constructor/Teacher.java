package constructor;

public class Teacher {

	int id;
	String name;

	public Teacher(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int dispaly() {

		System.out.println("Teacher id	" + id + "	Student name	" + name);
		return 0;
	}
}
