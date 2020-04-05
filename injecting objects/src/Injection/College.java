package Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class College {

	public static void main(String[] args) {
					
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
		
		
		
		Student student=context.getBean("stu",Student.class);
		student.Cheaingt();
		
		
		AnotherStudent anotherStudent=context.getBean("AnotherStudent",AnotherStudent.class);
		anotherStudent.startCheaingt();
			
		/*
		
	 	Student student = new Student();    // call method Cheating();
         	 		 	
		MathCheat cheat = new  MathCheat();  // object pass student
		
		student.setMathCheat(cheat);  
		
		student.Cheaingt();   // null pointerException MathCheat mathCheat
		 
// Solve null pointerException With the help of setter method to inject value  
	  
 */
		
	}

}
