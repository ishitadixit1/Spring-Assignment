package com.springassignment.solution3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context= new  AnnotationConfigApplicationContext(TriangleConfig.class);
    	Triangle t=(Triangle) context.getBean("trType");
    	
    	if((t.getX() == t.getY() && t.getX() != t.getZ()) || (t.getY() == t.getX() && t.getY() != t.getZ()) || (t.getZ() == t.getX() && t.getZ() != t.getY()))
        System.out.println("This is an Isoceles Triangle");
    	else if(t.getX() == t.getY() && t.getX() == t.getZ())
    	System.out.println("This is an Equilateral Triangle");
    	else if(t.getX() != t.getY() && t.getY() != t.getZ())
    	System.out.println("This is an Scalene Triangle");
    }
}
