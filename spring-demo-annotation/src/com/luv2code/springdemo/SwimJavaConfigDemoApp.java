package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
	
		//read spring  java config file and loading
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrive the bean
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		
		
		//use the bean
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("Email And Team : "+theCoach.getEmailAddress()+" : "+theCoach.getTeam());
		
		//close the context
		
		context.close();
		

	}

}
