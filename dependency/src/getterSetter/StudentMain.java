package getterSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String args[]) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Student.xml");  
	Student object = context.getBean("std",Student.class);
	object.dispaly();

	}
}
