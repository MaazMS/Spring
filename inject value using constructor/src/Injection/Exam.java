package Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Exam {

	public static void main(String[] args) { 
		// inject value using parameter constructor and xml file
		  ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");  	 
		  Student obj = context.getBean("Shaikh",Student.class);
		  obj.Dislapy();
		   	 
		  Student obj1 = context.getBean("EnterValue",Student.class);
		  obj1.Dislapy();

	}

}
