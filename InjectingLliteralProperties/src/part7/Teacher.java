package part7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teacher {


	public static void main(String args[]) { 
		
		ApplicationContext context= new ClassPathXmlApplicationContext("NewFile.xml"); 
		Student student = context.getBean("student",Student.class);
		student.display();
		
	}
}

