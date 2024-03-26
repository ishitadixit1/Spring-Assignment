package com.springassignment.solution2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("The details of Drawing are as below : ");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Drawing d=(Drawing) context.getBean("draw");
        System.out.println("Type is - "+ d.getType());
        System.out.println("Color is - "+ d.getColor());
    }
}
