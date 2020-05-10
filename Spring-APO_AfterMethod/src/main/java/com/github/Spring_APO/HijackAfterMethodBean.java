package com.github.Spring_APO;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class HijackAfterMethodBean implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("HijeckAfterMethod :After method hijacked !");
		
	}

}
// hijackAfterMethodBean