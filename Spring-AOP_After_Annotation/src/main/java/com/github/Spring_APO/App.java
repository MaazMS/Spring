package com.github.Spring_APO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		

		ApplicationContext context = new ClassPathXmlApplicationContext("Aspect.xml");
		Operation e = (Operation) context.getBean("opBean"); 
		System.out.println("Calling Message");
		e.msg();
		
		System.out.println("Calling method2 before invkoed method2");
		e.method2();
		
		
		System.out.println("Calling method3 before invkoed method3");
		e.method3();
	}
}
