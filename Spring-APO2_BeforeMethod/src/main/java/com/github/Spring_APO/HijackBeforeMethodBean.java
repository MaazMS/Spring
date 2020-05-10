package com.github.Spring_APO;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class HijackBeforeMethodBean implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("HijeckBeforeMethod :Before method hijacked !");
		
	}

	}
