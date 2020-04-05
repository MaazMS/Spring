package part6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	private Heart heart;

	public void startPumping() {

		if (heart != null) {
			heart.pump();

			System.out.println("name of the animal is " + heart.getNameOfAnimal());
			System.out.println("No of heart " + heart.getNoOfHeart());

		} else {
			System.out.println("You are dead");
		}
	}

	@Autowired
	@Qualifier("octpousheart") 
	// @Qualifier("huamnheart") // It is access byName
	   
	
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
}
