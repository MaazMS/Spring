package LooseCoupling;

public class Student {

	private Cheat copy;  // interface reference

	public void setCheat(Cheat copy) { 
		this.copy = copy; 
	}

	public void cheating() {
		copy.copy();
	}
}