package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive the bean
		Coach theCoach = context.getBean("theSillyCoach",Coach.class);
		
		
		//use the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		
		context.close();
		

	}

}
