package com.github.Spring_APO;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Track {
	
	@Pointcut("execution(* Operation.method2*(..))")
	public void method3() {}   // pointcut name 
	
	@After("method3()")//Applying pointcut on After advice 
	public void myadvice(JoinPoint jp )// it's advice
		{
			System.out.println("Addtional concern ");
					}	
}
/*
 Calling Message
msg method invoked 
Calling method2 before invkoed method2
 method2 invoked After calling 
Addtional concern 
Calling method3 before invkoed method3
 method3 invoked after calling 

 */