package com.springassignment.solution3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	
	@Before("execution(* com.springassignment.solution3.Triangle.*(..))")
	public void beforeExecute(JoinPoint join)
	{
		System.out.println("Execution started for : " + join.getSignature());
	}
	
	@Around("execution(* com.springassignment.solution3.Triangle.*(..))")
	public Object showAll(ProceedingJoinPoint p) throws Throwable {
		long start = System.currentTimeMillis();
		Object res = p.proceed();
		long end = System.currentTimeMillis();
		System.out.println("Total execution time : " + (start - end) + " ms");
		return res;
	}
	
	@After("execution(* com.springassignment.solution3.Triangle.*(..))")
	public void afterExecute(JoinPoint join)
	{
		System.out.println("Execution ended for : " + join.getSignature());
	}

}
