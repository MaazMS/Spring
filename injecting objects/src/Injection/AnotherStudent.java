package Injection;

public class AnotherStudent {
 
	private MathCheat Cheat; // = new MathCheat();  
	
	// create object mathCheat  and call the method mathCheat();
	public void setCheat(MathCheat Cheat) {
		this.Cheat = Cheat;
	} 
	
	public void startCheaingt() 
	{
		Cheat.mathCheat();
		
	}
	

}
