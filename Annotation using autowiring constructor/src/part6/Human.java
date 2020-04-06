package part6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	private Heart heart;

	public void startPumping() {

		if (heart != null) {
			heart.pump();

		} else {
			System.out.println("You are dead");
		}
	}

	public Human(Heart heart) {
		this.heart = heart;
	}	
	
}
