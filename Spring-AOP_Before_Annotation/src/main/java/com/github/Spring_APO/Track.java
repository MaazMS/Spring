package com.github.Spring_APO;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Track {
	
	@Pointcut("execution(* Operation.method2*(..))")
	public void method3() {}   // pointcut name 
	
	@Before("method3()")//Applying pointcut on before advice 
	public void myadvice(JoinPoint jp )// it's advice (before advice)
		{
			System.out.println("Addtional concern ");
			//System.out.println("Method signature  "+ jp.);
		}	
}
/*
 Calling Message
msg method invoked 
Calling method2 before invkoed method2
Addtional concern 
 method2 invoked After calling 
Calling method3 before invkoed method3
 method3 invoked after calling 

 */