package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//load the context file
		ClassPathXmlApplicationContext  context = 
				new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		//retrive the beabn
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean isTrue = theCoach == alphaCoach;
		
		System.out.println("if Same " + isTrue +" : "+theCoach +" : "+alphaCoach);
		
		
		context.close();
		
		
		
		

	}

}
