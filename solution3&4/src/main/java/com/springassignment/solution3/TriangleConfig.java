package com.springassignment.solution3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="com.springassignment")
@EnableAspectJAutoProxy
public class TriangleConfig {

	    @Bean(name = "trType")
		public Triangle type() {
			Triangle t = new Triangle(4, 7, 8);
			return t;
		}
	    
}
