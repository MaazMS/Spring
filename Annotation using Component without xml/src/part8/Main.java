package part8;


import java.io.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String args[]) { 
ApplicationContext context = new AnnotationConfigApplicationContex(CollegeConfig.class);
		College college = context.getBean("collegeBean", College.class); 
		System.out.println("xml file is lodded");
		System.out.println("object is created"+college);
	}
} 

