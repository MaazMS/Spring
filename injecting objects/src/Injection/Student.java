package Injection;

public class Student {

	private int id;

	private MathCheat mathCheat; // = new MathCheat();

	// setter method of mathCheat object

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void Cheaingt() {
		mathCheat.mathCheat();
		System.out.println("Student Id " + id);
	}

	public void setId(int id) {
		this.id = id;
	}
}
