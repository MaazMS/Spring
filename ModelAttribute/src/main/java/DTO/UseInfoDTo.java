package DTO;

public class UseInfoDTo {

	public String first_name = "first_name";
	public String last_name = "last_name";
	public String name = "name";

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getname() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UseInfoDTo [first_name=" + first_name + ", last_name=" + last_name + ", name=" + name + "]";
	}
}