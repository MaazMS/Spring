package LooseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teacher {

	public static void main(String[] args) { 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
		Student  student= context.getBean("stu",Student.class);
		student.cheating();
	}

}
